package com.bitget.openapi.dto.response.uta;

import com.google.gson.annotations.JsonAdapter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * One kline/candlestick entry from /api/v3/market/candles.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonAdapter(UtaCandleDeserializer.class)
public class UtaCandle {
    /**
     * The timestamp that the system generated the data (milliseconds).
     */
    private String timestamp;
    /**
     * Open price.
     */
    private String openPrice;
    /**
     * Highest price.
     */
    private String highPrice;
    /**
     * Lowest price.
     */
    private String lowPrice;
    /**
     * Close price.
     */
    private String closePrice;
    /**
     * Trade volume (base coin).
     */
    private String volume;
    /**
     * Turnover (quote coin).
     */
    private String turnover;
}
