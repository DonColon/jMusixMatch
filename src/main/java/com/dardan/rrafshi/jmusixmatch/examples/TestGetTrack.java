package com.dardan.rrafshi.jmusixmatch.examples;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dardan.rrafshi.commons.Systems;
import com.dardan.rrafshi.jmusixmatch.MusixMatch;
import com.dardan.rrafshi.jmusixmatch.MusixMatchException;
import com.dardan.rrafshi.jmusixmatch.model.Track;


public final class TestGetTrack
{
	private static final Logger LOGGER = LoggerFactory.getLogger(TestGetTrack.class);


	public static void main(final String[] args)
	{
		final String apiKey = Systems.getEnvironmentVariable("MUSIX_MATCH_API_KEY");

		try {
			final MusixMatch musixMatch = new MusixMatch(apiKey);
			final Track track = musixMatch.getTrack(78294762);

			LOGGER.info(track.getArtistName() + " - " + track.getTrackName());

		} catch (final MusixMatchException.RequestFailed exception) {

			LOGGER.error("Retrieve failed", exception);
		}

		LOGGER.info("Finished at " + LocalDateTime.now());
	}
}
