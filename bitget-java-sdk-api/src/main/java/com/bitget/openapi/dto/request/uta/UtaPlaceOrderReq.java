package com.bitget.openapi.dto.request.uta;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtaPlaceOrderReq {

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
     * Order quantity (Required). Spot/Margin: market buy uses quote coin; limit/market sell uses base coin. Futures: base coin.
     */
    @NonNull
    private String qty;

    /**
     * Order price. Required when orderType is limit.
     */
    private String price;

    /**
     * Order side (Required). buy/sell.
     */
    @NonNull
    private String side;

    /**
     * Order type (Required). limit/market.
     */
    @NonNull
    private String orderType;

    /**
     * Time in force. Required for limit orders. ioc/fok/gtc/post_only.
     */
    private String timeInForce;

    /**
     * Position side. Required in hedge mode; available only for futures. long/short.
     */
    private String posSide;

    /**
     * Client order ID.
     */
    private String clientOid;

    /**
     * Reduce-only identifier. yes/no, default no.
     */
    private String reduceOnly;

    /**
     * Self-trade prevention mode. none (default)/cancel_taker/cancel_maker/cancel_both.
     */
    private String stpMode;

    /**
     * Preset take-profit trigger type. market (default)/mark. Futures only.
     */
    private String tpTriggerBy;

    /**
     * Preset stop-loss trigger type. market (default)/mark. Futures only.
     */
    private String slTriggerBy;

    /**
     * Preset take-profit trigger price.
     */
    private String takeProfit;

    /**
     * Preset stop-loss trigger price.
     */
    private String stopLoss;

    /**
     * Take-profit trigger strategy order type. limit/market.
     */
    private String tpOrderType;

    /**
     * Stop-loss trigger strategy order type. limit/market.
     */
    private String slOrderType;

    /**
     * Take-profit strategy order execution price (only valid when tpOrderType=limit).
     */
    private String tpLimitPrice;

    /**
     * Stop-loss strategy order execution price (only valid when slOrderType=limit).
     */
    private String slLimitPrice;
}
