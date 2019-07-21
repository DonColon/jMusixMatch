package com.dardan.rrafshi.jmusixmatch.configuration;

import java.io.IOException;

import com.dardan.rrafshi.commons.Strings;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;


public final class NumericBooleanDeserializer extends JsonDeserializer<Boolean>
{
	@Override
	public Boolean deserialize(final JsonParser parser, final DeserializationContext context)
		throws IOException, JsonProcessingException
	{
		return Strings.equals(parser.getText(), "1");
	}
}
