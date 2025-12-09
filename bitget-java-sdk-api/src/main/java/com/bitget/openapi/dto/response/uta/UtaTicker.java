package com.bitget.openapi.dto.response.uta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Ticker entry returned by /api/v3/market/tickers.
 * Fields follow doc/www.bitget.com/api-doc/uta/public/Tickers.html response parameters.
 */
@Data
@AllArgsConstructor
public class UtaTicker {
    /**
     * Symbol name (e.g., BTCUSDT).
     */
    private String symbol;
    /**
     * Product type: SPOT / USDT-FUTURES / COIN-FUTURES / USDC-FUTURES.
     */
    private String category;
    /**
     * Latest price.
     */
    private String lastPrice;
    /**
     * Market price 24 hours ago.
     */
    private String openPrice24h;
    /**
     * Lowest price in the last 24 hours.
     */
    private String lowPrice24h;
    /**
     * Highest price in the last 24 hours.
     */
    private String highPrice24h;
    /**
     * Best ask price.
     */
    private String ask1Price;
    /**
     * Best bid price.
     */
    private String bid1Price;
    /**
     * Best bid quantity.
     */
    private String bid1Size;
    /**
     * Best ask quantity.
     */
    private String ask1Size;
    /**
     * 24-hour price change percentage.
     */
    private String price24hPcnt;
    /**
     * 24-hour turnover.
     */
    private String turnover24h;
    /**
     * 24-hour volume.
     */
    private String volume24h;
    /**
     * Index price (futures only).
     */
    private String indexPrice;
    /**
     * Mark price (futures only).
     */
    private String markPrice;
    /**
     * Funding rate (futures only).
     */
    private String fundingRate;
    /**
     * Open interest (futures only).
     */
    private String openInterest;
    /**
     * Delivery start time (deliveries only).
     */
    private String deliveryStartTime;
    /**
     * Delivery time (deliveries only).
     */
    private String deliveryTime;
    /**
     * Delivery status (deliveries only).
     */
    private String deliveryStatus;
    /**
     * Timestamp the system generated the ticker (milliseconds).
     */
    private String ts;
}
