package com.dardan.rrafshi.jmusixmatch.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public final class MusicGenres
{
	@JsonProperty("music_genre_list")
	private List<MusicGenre> musicGenreList;


	public List<MusicGenre> getMusicGenreList()
	{
		return this.musicGenreList;
	}

	public void setMusicGenreList(final List<MusicGenre> musicGenreList)
	{
		this.musicGenreList = musicGenreList;
	}
}
