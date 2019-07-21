package com.dardan.rrafshi.jmusixmatch.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public final class Header
{
	@JsonProperty("status_code")
	private int statusCode;

	@JsonProperty("execute_time")
	private double executeTime;


	public int getStatusCode()
	{
		return this.statusCode;
	}

	public double getExecuteTime()
	{
		return this.executeTime;
	}
}
