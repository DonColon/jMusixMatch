package com.dardan.rrafshi.jmusixmatch.responses;

import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName("message")
public class ArtistGetMessage
{
	private Header header;
	private ArtistGetBody body;


	public Header getHeader()
	{
		return this.header;
	}

	public void setHeader(final Header header)
	{
		this.header = header;
	}

	public ArtistGetBody getBody()
	{
		return this.body;
	}

	public void setBody(final ArtistGetBody body)
	{
		this.body = body;
	}
}
