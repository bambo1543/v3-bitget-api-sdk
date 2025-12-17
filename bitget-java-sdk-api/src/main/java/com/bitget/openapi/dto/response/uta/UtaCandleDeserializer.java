package com.bitget.openapi.dto.response.uta;

import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * Parses array-form candle entries into {@link UtaCandle}.
 */
public class UtaCandleDeserializer implements JsonDeserializer<UtaCandle> {
    private static final int EXPECTED_SIZE = 7;

    @Override
    public UtaCandle deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if (!json.isJsonArray()) {
            throw new JsonParseException("Candle entry is not an array");
        }

        JsonArray array = json.getAsJsonArray();
        if (array.size() < EXPECTED_SIZE) {
            throw new JsonParseException("Candle entry must contain at least " + EXPECTED_SIZE + " elements");
        }

        return new UtaCandle(
                array.get(0).getAsString(),
                array.get(1).getAsString(),
                array.get(2).getAsString(),
                array.get(3).getAsString(),
                array.get(4).getAsString(),
                array.get(5).getAsString(),
                array.get(6).getAsString()
        );
    }
}
