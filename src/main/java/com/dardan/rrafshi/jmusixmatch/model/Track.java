package com.dardan.rrafshi.jmusixmatch.model;

import java.util.List;

import com.dardan.rrafshi.jmusixmatch.configuration.NumericBooleanDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonIgnoreProperties(ignoreUnknown = true)
public final class Track
{
	@JsonProperty("track_id")
	private int trackID;

	@JsonProperty("track_name")
	private String trackName;

	@JsonProperty("track_name_translation_list")
	private List<String> trackNameTranslations;

	@JsonProperty("track_rating")
	private int trackRating;

	@JsonProperty("commontrack_id")
	private int commontrackID;

	@JsonProperty("instrumental")
	@JsonDeserialize(using=NumericBooleanDeserializer.class)
	private boolean isInstrumental;

	@JsonProperty("explicit")
	@JsonDeserialize(using=NumericBooleanDeserializer.class)
	private boolean isExplicit;

	@JsonProperty("has_lyrics")
	@JsonDeserialize(using=NumericBooleanDeserializer.class)
	private boolean hasLyrics;

	@JsonProperty("has_subtitles")
	@JsonDeserialize(using=NumericBooleanDeserializer.class)
	private boolean hasSubtitles;

	@JsonProperty("has_richsync")
	@JsonDeserialize(using=NumericBooleanDeserializer.class)
	private boolean hasRichSync;

	@JsonProperty("num_favourite")
	private int placement;

	@JsonProperty("album_id")
	private int albumID;

	@JsonProperty("album_name")
	private String albumName;

	@JsonProperty("artist_id")
	private int artistID;

	@JsonProperty("artist_name")
	private String artistName;

	@JsonProperty("track_share_url")
	private String shareUrl;

	@JsonProperty("track_edit_url")
	private String editUrl;

	@JsonProperty("restricted")
	@JsonDeserialize(using=NumericBooleanDeserializer.class)
	private boolean isRestricted;

	@JsonProperty("updated_time")
	private String lastModification;

	@JsonProperty("primary_genres")
	private MusicGenres primaryGenres;

	@JsonProperty("secondary_genres")
	private MusicGenres secondaryGenres;


	public int getTrackID()
	{
		return this.trackID;
	}

	public void setTrackID(final int trackID)
	{
		this.trackID = trackID;
	}

	public String getTrackName()
	{
		return this.trackName;
	}

	public void setTrackName(final String trackName)
	{
		this.trackName = trackName;
	}

	public List<String> getTrackNameTranslations()
	{
		return this.trackNameTranslations;
	}

	public void setTrackNameTranslations(final List<String> trackNameTranslations)
	{
		this.trackNameTranslations = trackNameTranslations;
	}

	public int getTrackRating()
	{
		return this.trackRating;
	}

	public void setTrackRating(final int trackRating)
	{
		this.trackRating = trackRating;
	}

	public int getCommontrackID()
	{
		return this.commontrackID;
	}

	public void setCommontrackID(final int commontrackID)
	{
		this.commontrackID = commontrackID;
	}

	public boolean isInstrumental()
	{
		return this.isInstrumental;
	}

	public void setInstrumental(final boolean isInstrumental)
	{
		this.isInstrumental = isInstrumental;
	}

	public boolean isExplicit()
	{
		return this.isExplicit;
	}

	public void setExplicit(final boolean isExplicit)
	{
		this.isExplicit = isExplicit;
	}

	public boolean hasLyrics()
	{
		return this.hasLyrics;
	}

	public void setHasLyrics(final boolean hasLyrics)
	{
		this.hasLyrics = hasLyrics;
	}

	public boolean hasSubtitles()
	{
		return this.hasSubtitles;
	}

	public void setHasSubtitles(final boolean hasSubtitles)
	{
		this.hasSubtitles = hasSubtitles;
	}

	public boolean hasRichSync()
	{
		return this.hasRichSync;
	}

	public void setHasRichSync(final boolean hasRichSync)
	{
		this.hasRichSync = hasRichSync;
	}

	public int getPlacement()
	{
		return this.placement;
	}

	public void setPlacement(final int placement)
	{
		this.placement = placement;
	}

	public int getAlbumID()
	{
		return this.albumID;
	}

	public void setAlbumID(final int albumID)
	{
		this.albumID = albumID;
	}

	public String getAlbumName()
	{
		return this.albumName;
	}

	public void setAlbumName(final String albumName)
	{
		this.albumName = albumName;
	}

	public int getArtistID()
	{
		return this.artistID;
	}

	public void setArtistID(final int artistID)
	{
		this.artistID = artistID;
	}

	public String getArtistName()
	{
		return this.artistName;
	}

	public void setArtistName(final String artistName)
	{
		this.artistName = artistName;
	}

	public String getShareUrl()
	{
		return this.shareUrl;
	}

	public void setShareUrl(final String shareUrl)
	{
		this.shareUrl = shareUrl;
	}

	public String getEditUrl()
	{
		return this.editUrl;
	}

	public void setEditUrl(final String editUrl)
	{
		this.editUrl = editUrl;
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
}
