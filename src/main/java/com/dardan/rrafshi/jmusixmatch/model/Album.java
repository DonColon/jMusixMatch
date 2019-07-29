package com.dardan.rrafshi.jmusixmatch.model;

import com.dardan.rrafshi.jmusixmatch.configuration.NumericBooleanDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonIgnoreProperties(ignoreUnknown = true)
public final class Album
{
	@JsonProperty("album_id")
	private int albumID;

	@JsonProperty("album_mbid")
	private String albumMBID;

	@JsonProperty("album_name")
	private String albumName;

	@JsonProperty("album_release_date")
	private String albumReleaseDate;

	@JsonProperty("album_rating")
	private int albumRating;

	@JsonProperty("album_label")
	private String albumLabel;

	@JsonProperty("album_copyright")
	private String albumCopyright;

	@JsonProperty("album_pline")
	private String albumPLine;

	@JsonProperty("artist_id")
	private int artistID;

	@JsonProperty("artist_name")
	private String artistName;

	@JsonProperty("primary_genres")
	private MusicGenres primaryGenres;

	@JsonProperty("secondary_genres")
	private MusicGenres secondaryGenres;

	@JsonProperty("restricted")
	@JsonDeserialize(using=NumericBooleanDeserializer.class)
	private boolean isRestricted;

	@JsonProperty("updated_time")
	private String lastModification;


	public int getAlbumID()
	{
		return this.albumID;
	}

	public void setAlbumID(final int albumID)
	{
		this.albumID = albumID;
	}

	public String getAlbumMBID()
	{
		return this.albumMBID;
	}

	public void setAlbumMBID(final String albumMBID)
	{
		this.albumMBID = albumMBID;
	}

	public String getAlbumName()
	{
		return this.albumName;
	}

	public void setAlbumName(final String albumName)
	{
		this.albumName = albumName;
	}

	public String getAlbumReleaseDate()
	{
		return this.albumReleaseDate;
	}

	public void setAlbumReleaseDate(final String albumReleaseDate)
	{
		this.albumReleaseDate = albumReleaseDate;
	}

	public int getAlbumRating()
	{
		return this.albumRating;
	}

	public void setAlbumRating(final int albumRating)
	{
		this.albumRating = albumRating;
	}

	public String getAlbumLabel()
	{
		return this.albumLabel;
	}

	public void setAlbumLabel(final String albumLabel)
	{
		this.albumLabel = albumLabel;
	}

	public String getAlbumCopyright()
	{
		return this.albumCopyright;
	}

	public void setAlbumCopyright(final String albumCopyright)
	{
		this.albumCopyright = albumCopyright;
	}

	public String getAlbumPLine()
	{
		return this.albumPLine;
	}

	public void setAlbumPLine(final String albumPLine)
	{
		this.albumPLine = albumPLine;
	}

	public int getArtistID()
	{
		return this.artistID;
	}

	public void setArtistID(final int artistID)
	{
		this.artistID = artistID;
	}

	public String getArtistName() {
		return this.artistName;
	}

	public void setArtistName(final String artistName)
	{
		this.artistName = artistName;
	}

	public MusicGenres getPrimaryGenres()
	{
		return this.primaryGenres;
	}

	public void setPrimaryGenres(final MusicGenres primaryGenres)
	{
		this.primaryGenres = primaryGenres;
	}

	public MusicGenres getSecondaryGenres()
	{
		return this.secondaryGenres;
	}

	public void setSecondaryGenres(final MusicGenres secondaryGenres)
	{
		this.secondaryGenres = secondaryGenres;
	}

	public boolean isRestricted()
	{
		return this.isRestricted;
	}

	public void setRestricted(final boolean isRestricted)
	{
		this.isRestricted = isRestricted;
	}

	public String getLastModification()
	{
		return this.lastModification;
	}

	public void setLastModification(final String lastModification)
	{
		this.lastModification = lastModification;
	}
}
