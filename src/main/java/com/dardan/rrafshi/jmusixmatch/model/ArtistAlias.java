package com.dardan.rrafshi.jmusixmatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public final class ArtistAlias
{
	@JsonProperty("artist_alias")
	private String alias;


	public String getAlias() {
		return this.alias;
	}

	public void setAlias(final String alias) {
		this.alias = alias;
	}
}
