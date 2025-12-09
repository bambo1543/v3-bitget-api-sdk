package com.bitget.openapi.dto.request.uta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Request for modifying a single order.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtaModifyOrderReq {

    /**
     * Order ID. Either orderId or clientOid must be provided (orderId has priority).
     */
    private String orderId;

    /**
     * Client order ID. Either clientOid or orderId must be provided (orderId has priority).
     */
    private String clientOid;

    /**
     * New quantity (base coin). Either qty or price must be provided.
     */
    private String qty;

    /**
     * New price. Either price or qty must be provided.
     */
    private String price;

    /**
     * Whether to cancel original order when modification fails. yes/no (default no).
     */
    private String autoCancel;

    /**
     * Symbol name, e.g. BTCUSDT.
     */
    private String symbol;

    /**
     * Product type. SPOT/MARGIN/USDT-FUTURES/COIN-FUTURES/USDC-FUTURES.
     */
    private String category;
}
