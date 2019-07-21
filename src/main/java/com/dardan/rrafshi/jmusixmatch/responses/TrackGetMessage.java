package com.dardan.rrafshi.jmusixmatch.responses;

import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName("message")
public final class TrackGetMessage
{
	private Header header;
	private TrackGetBody body;


	public Header getHeader()
	{
		return this.header;
	}

	public void setHeader(final Header header)
	{
		this.header = header;
	}

	public TrackGetBody getBody()
	{
		return this.body;
	}

	public void setBody(final TrackGetBody body)
	{
		this.body = body;
	}
}
