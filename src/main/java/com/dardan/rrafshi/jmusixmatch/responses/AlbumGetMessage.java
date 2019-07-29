package com.dardan.rrafshi.jmusixmatch.responses;

import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName("message")
public final class AlbumGetMessage
{
	private Header header;
	private AlbumGetBody body;


	public Header getHeader()
	{
		return this.header;
	}

	public void setHeader(final Header header)
	{
		this.header = header;
	}

	public AlbumGetBody getBody()
	{
		return this.body;
	}

	public void setBody(final AlbumGetBody body)
	{
		this.body = body;
	}
}
