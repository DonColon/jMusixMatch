package com.dardan.rrafshi.jmusixmatch;

import com.dardan.rrafshi.commons.exceptions.ApplicationException;


public final class MusixMatchException
{
	private MusixMatchException() {}


	public static class RequestFailed extends ApplicationException
	{
		private static final long serialVersionUID = 1L;


		public RequestFailed(final String message, final Throwable cause)
		{
			super(message, cause);
		}

		public RequestFailed(final String message)
		{
			super(message);
		}
	}

	public static class MappingFailed extends ApplicationException
	{
		private static final long serialVersionUID = 1L;


		public MappingFailed(final String message, final Throwable cause)
		{
			super(message, cause);
		}

		public MappingFailed(final String message)
		{
			super(message);
		}
	}
}
