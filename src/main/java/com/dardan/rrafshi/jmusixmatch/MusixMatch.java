package com.dardan.rrafshi.jmusixmatch;

import java.io.IOException;

import com.dardan.rrafshi.jmusixmatch.model.Album;
import com.dardan.rrafshi.jmusixmatch.model.Artist;
import com.dardan.rrafshi.jmusixmatch.model.Track;
import com.dardan.rrafshi.jmusixmatch.responses.AlbumGetMessage;
import com.dardan.rrafshi.jmusixmatch.responses.ArtistGetMessage;
import com.dardan.rrafshi.jmusixmatch.responses.TrackGetMessage;
import com.fasterxml.jackson.databind.DeserializationFeature;
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
		this.objectMapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);

		this.client = new OkHttpClient();

		this.apiKey = apiKey;
	}


	public Track getTrack(final int trackID)
		throws MusixMatchException.RequestFailed
	{
		final HttpUrl url = HttpUrl.parse(Constants.API_URL)
				.newBuilder()
				.addPathSegment(Constants.API_VERSION)
				.addPathSegment(Endpoints.TRACK_GET)
				.addQueryParameter(Constants.FORMAT, Constants.JSON)
				.addQueryParameter(Constants.API_KEY, this.apiKey)
				.addQueryParameter(Constants.TRACK_ID, String.valueOf(trackID))
				.build();

		try {
			final TrackGetMessage message = this.get(url, TrackGetMessage.class);
			return message.getBody().getTrack();

		} catch (MusixMatchException.RequestFailed | MusixMatchException.MappingFailed exception) {

			throw new MusixMatchException.RequestFailed("Failed to get track with the ID '" + trackID + "'", exception);
		}
	}

	public Track getMatchingTrack(final String trackName, final String artistName)
		throws MusixMatchException.RequestFailed
	{
		final HttpUrl url = HttpUrl.parse(Constants.API_URL)
				.newBuilder()
				.addPathSegment(Constants.API_VERSION)
				.addPathSegment(Endpoints.MATCHER_TRACK_GET)
				.addQueryParameter(Constants.FORMAT, Constants.JSON)
				.addQueryParameter(Constants.API_KEY, this.apiKey)
				.addQueryParameter(Constants.QUERY_TRACK, trackName)
				.addQueryParameter(Constants.QUERY_ARTIST, artistName)
				.build();

		try {
			final TrackGetMessage message = this.get(url, TrackGetMessage.class);
			return message.getBody().getTrack();

		} catch (MusixMatchException.RequestFailed | MusixMatchException.MappingFailed exception) {

			throw new MusixMatchException.RequestFailed("Failed to get track '" + trackName + "' of artist '" + artistName + "'", exception);
		}
	}

	public Album getAlbum(final int albumID)
		throws MusixMatchException.RequestFailed
	{
		final HttpUrl url = HttpUrl.parse(Constants.API_URL)
				.newBuilder()
				.addPathSegment(Constants.API_VERSION)
				.addPathSegment(Endpoints.ALBUM_GET)
				.addQueryParameter(Constants.FORMAT, Constants.JSON)
				.addQueryParameter(Constants.API_KEY, this.apiKey)
				.addQueryParameter(Constants.ALBUM_ID, String.valueOf(albumID))
				.build();

		try {
			final AlbumGetMessage message = this.get(url, AlbumGetMessage.class);
			return message.getBody().getAlbum();

		} catch (MusixMatchException.RequestFailed | MusixMatchException.MappingFailed exception) {

			throw new MusixMatchException.RequestFailed("Failed to get album with the ID '" + albumID + "'", exception);
		}
	}

	public Artist getArtist(final int artistID)
		throws MusixMatchException.RequestFailed
	{
		final HttpUrl url = HttpUrl.parse(Constants.API_URL)
				.newBuilder()
				.addPathSegment(Constants.API_VERSION)
				.addPathSegment(Endpoints.ARTIST_GET)
				.addQueryParameter(Constants.FORMAT, Constants.JSON)
				.addQueryParameter(Constants.API_KEY, this.apiKey)
				.addQueryParameter(Constants.ARTIST_ID, String.valueOf(artistID))
				.build();

		try {
			final ArtistGetMessage message = this.get(url, ArtistGetMessage.class);
			return message.getBody().getArtist();

		} catch (MusixMatchException.RequestFailed | MusixMatchException.MappingFailed exception) {

			throw new MusixMatchException.RequestFailed("Failed to get artist with the ID'" + artistID + "'", exception);
		}
	}


	private <R> R get(final HttpUrl url, final Class<R> valueType)
		throws MusixMatchException.RequestFailed, MusixMatchException.MappingFailed
	{
		final Request request = new Request.Builder()
				.url(url)
				.build();

		try(Response response = this.client.newCall(request).execute()) {
			final String content = response.body().string();
			return this.objectMapper.readValue(content, valueType);

		} catch (final JsonMappingException exception) {
			throw new MusixMatchException.MappingFailed("Failed to map response to object of type '" + valueType + "'", exception);

		} catch (final IOException exception) {
			throw new MusixMatchException.RequestFailed("Failed to get the element from '" + url + "'", exception);
		}
	}
}
