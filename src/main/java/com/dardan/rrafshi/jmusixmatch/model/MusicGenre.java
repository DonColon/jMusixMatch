package com.dardan.rrafshi.jmusixmatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName("music_genre")
@JsonIgnoreProperties(ignoreUnknown = true)
public final class MusicGenre
{
	@JsonProperty("music_genre_id")
	private int genreID;

	@JsonProperty("music_genre_parent_id")
	private int genreParentID;

	@JsonProperty("music_genre_name")
	private String genreName;

	@JsonProperty("music_genre_name_extended")
	private String extendedGenreName;

	@JsonProperty("music_genre_vanity")
	private String genreVanity;


	public int getGenreID()
	{
		return this.genreID;
	}

	public void setGenreID(final int genreID)
	{
		this.genreID = genreID;
	}

	public int getGenreParentID()
	{
		return this.genreParentID;
	}

	public void setGenreParentID(final int genreParentID)
	{
		this.genreParentID = genreParentID;
	}

	public String getGenreName()
	{
		return this.genreName;
	}

	public void setGenreName(final String genreName)
	{
		this.genreName = genreName;
	}

	public String getExtendedGenreName()
	{
		return this.extendedGenreName;
	}

	public void setExtendedGenreName(final String extendedGenreName)
	{
		this.extendedGenreName = extendedGenreName;
	}

	public String getGenreVanity()
	{
		return this.genreVanity;
	}

	public void setGenreVanity(final String genreVanity)
	{
		this.genreVanity = genreVanity;
	}
}
