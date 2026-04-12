package com.bitget.openapi.dto.request.uta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Request params for /api/v3/trade/order-info.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtaGetOrderDetailsReq {

    /**
     * Product type. SPOT/MARGIN/USDT-FUTURES/COIN-FUTURES/USDC-FUTURES.
     */
    private String category;

    /**
     * Order ID. Either orderId or clientOid must be provided.
     */
    private String orderId;

    /**
     * Client order ID. Either clientOid or orderId must be provided.
     */
    private String clientOid;
}
