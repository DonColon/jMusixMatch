package com.dardan.rrafshi.jmusixmatch.examples;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dardan.rrafshi.commons.Systems;
import com.dardan.rrafshi.jmusixmatch.MusixMatch;
import com.dardan.rrafshi.jmusixmatch.MusixMatchException;
import com.dardan.rrafshi.jmusixmatch.model.Artist;


public final class TestGetArtist
{
	private static final Logger LOGGER = LoggerFactory.getLogger(TestGetArtist.class);


	public static void main(final String[] args)
	{
		final String apiKey = Systems.getEnvironmentVariable("MUSIX_MATCH_API_KEY");

		try {
			final MusixMatch musixMatch = new MusixMatch(apiKey);
			final Artist artist = musixMatch.getArtist(128171);

			LOGGER.info(artist.getArtistName() + " - " + artist.getArtistRating());

		} catch (final MusixMatchException.RequestFailed exception) {

			LOGGER.error("Retrieve failed", exception);
		}

		LOGGER.info("Finished at " + LocalDateTime.now());
	}
}
