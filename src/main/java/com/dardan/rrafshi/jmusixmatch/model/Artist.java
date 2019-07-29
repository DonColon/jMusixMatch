package com.dardan.rrafshi.jmusixmatch.model;

import java.util.List;

import com.dardan.rrafshi.jmusixmatch.configuration.NumericBooleanDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonIgnoreProperties(ignoreUnknown = true)
public final class Artist
{
	@JsonProperty("artist_id")
	private int artistID;

	@JsonProperty("artist_name")
	private String artistName;

	@JsonProperty("artist_comment")
	private String artistDescription;

	@JsonProperty("artist_country")
	private String artistCountry;

	@JsonProperty("artist_rating")
	private int artistRating;

	@JsonProperty("artist_twitter_url")
	private String artistTwitterUrl;

	@JsonProperty("artist_name_translation_list")
	private List<ArtistNameTranslation> artistNameTranslations;

	@JsonProperty("artist_alias_list")
	private List<ArtistAlias> artistAliases;

	@JsonProperty("artist_credits")
	private ArtistCredits artistCredits;

	@JsonProperty("restricted")
	@JsonDeserialize(using=NumericBooleanDeserializer.class)
	private boolean isRestricted;

	@JsonProperty("updated_time")
	private String lastModification;


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

	public String getArtistDescription()
	{
		return this.artistDescription;
	}

	public void setArtistDescription(final String artistDescription)
	{
		this.artistDescription = artistDescription;
	}

	public String getArtistCountry()
	{
		return this.artistCountry;
	}

	public void setArtistCountry(final String artistCountry)
	{
		this.artistCountry = artistCountry;
	}

	public int getArtistRating()
	{
		return this.artistRating;
	}

	public void setArtistRating(final int artistRating)
	{
		this.artistRating = artistRating;
	}

	public String getArtistTwitterUrl()
	{
		return this.artistTwitterUrl;
	}

	public void setArtistTwitterUrl(final String artistTwitterUrl)
	{
		this.artistTwitterUrl = artistTwitterUrl;
	}

	public List<ArtistNameTranslation> getArtistNameTranslations()
	{
		return this.artistNameTranslations;
	}

	public void setArtistNameTranslations(final List<ArtistNameTranslation> artistNameTranslations)
	{
		this.artistNameTranslations = artistNameTranslations;
	}

	public List<ArtistAlias> getArtistAliases()
	{
		return this.artistAliases;
	}

	public void setArtistAliases(final List<ArtistAlias> artistAliases)
	{
		this.artistAliases = artistAliases;
	}

	public ArtistCredits getArtistCredits()
	{
		return this.artistCredits;
	}

	public void setArtistCredits(final ArtistCredits artistCredits)
	{
		this.artistCredits = artistCredits;
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
