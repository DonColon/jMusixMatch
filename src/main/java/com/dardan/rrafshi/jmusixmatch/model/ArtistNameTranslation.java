package com.dardan.rrafshi.jmusixmatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName("artist_name_translation")
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ArtistNameTranslation
{
	private String language;
	private String translation;


	public String getLanguage()
	{
		return this.language;
	}

	public void setLanguage(final String language)
	{
		this.language = language;
	}

	public String getTranslation()
	{
		return this.translation;
	}

	public void setTranslation(final String translation)
	{
		this.translation = translation;
	}
}
