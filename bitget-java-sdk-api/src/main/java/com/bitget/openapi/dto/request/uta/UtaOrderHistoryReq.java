package com.bitget.openapi.dto.request.uta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Request params for /api/v3/trade/history-orders.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtaOrderHistoryReq {

    /**
     * Product type. SPOT/MARGIN/USDT-FUTURES/COIN-FUTURES/USDC-FUTURES.
     */
    private String category;

    /**
     * Symbol name, e.g. BTCUSDT.
     */
    private String symbol;

    /**
     * Start timestamp in milliseconds.
     */
    private String startTime;

    /**
     * End timestamp in milliseconds.
     */
    private String endTime;

    /**
     * Page size, default 100, max 100.
     */
    private String limit;

    /**
     * Cursor for pagination.
     */
    private String cursor;
}
