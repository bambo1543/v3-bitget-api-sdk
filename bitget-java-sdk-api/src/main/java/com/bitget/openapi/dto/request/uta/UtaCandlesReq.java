package com.bitget.openapi.dto.request.uta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * Request parameters for /api/v3/market/candles.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtaCandlesReq {

    /**
     * Product type (Required). One of SPOT, MARGIN, USDT-FUTURES, COIN-FUTURES, USDC-FUTURES.
     */
    @NonNull
    private String category;

    /**
     * Symbol name (Required), e.g., BTCUSDT.
     */
    @NonNull
    private String symbol;

    /**
     * Granularity (Required). Supported values: 1m,3m,5m,15m,30m,1H,4H,6H,12H,1D.
     */
    @NonNull
    private String interval;

    /**
     * Start timestamp in milliseconds.
     */
    private String startTime;

    /**
     * End timestamp in milliseconds.
     */
    private String endTime;

    /**
     * Candlestick type. market (default)/mark/index/premium.
     */
    private String type;

    /**
     * Limit per page. Default 1000, maximum 1000.
     */
    private String limit;
}
