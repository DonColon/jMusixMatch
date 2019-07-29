package com.dardan.rrafshi.jmusixmatch.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public final class ArtistCredits
{
	@JsonProperty("artist_list")
	private List<String> artists;


	public List<String> getArtists()
	{
		return this.artists;
	}

	public void setArtists(final List<String> artists)
	{
		this.artists = artists;
	}
}
