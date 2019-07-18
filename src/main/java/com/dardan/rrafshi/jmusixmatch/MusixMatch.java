package com.dardan.rrafshi.jmusixmatch;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public final class MusixMatch
{
	private final ObjectMapper objectMapper;
	private final OkHttpClient client;
	private final String apiKey;


	public MusixMatch(final String apiKey)
	{
		this.objectMapper = new ObjectMapper();

		this.client = new OkHttpClient();

		this.apiKey = apiKey;
	}


	private <R> R get(final HttpUrl url, final Class<R> valueType)
		throws MusixMatchException.RequestFailed, MusixMatchException.MappingFailed
	{
		final Request request = new Request.Builder()
				.url(url)
				.build();

		try(Response response = this.client.newCall(request).execute()) {
			final String message = response.message();
			final int code = response.code();

			if(code != HttpStatus.OK)
				throw new MusixMatchException.RequestFailed("Failed to get the element from '" + url + "' with status " + code + ": " + message);

			final String content = response.body().string();
			return this.objectMapper.readValue(content, valueType);

		} catch (final JsonMappingException exception) {
			throw new MusixMatchException.MappingFailed("Failed to map response to object of type '" + valueType + "'", exception);

		} catch (final IOException exception) {
			throw new MusixMatchException.RequestFailed("Failed to get the element from '" + url + "'", exception);
		}
	}
}
