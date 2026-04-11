package com.bitget.openapi.dto.request.uta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Request payload for /api/v3/trade/cancel-strategy-order.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtaCancelStrategyOrderReq {
    private String orderId;
    private String clientOid;
}
