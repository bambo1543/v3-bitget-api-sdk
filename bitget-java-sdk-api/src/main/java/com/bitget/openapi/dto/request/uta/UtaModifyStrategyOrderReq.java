package com.bitget.openapi.dto.request.uta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Request payload for /api/v3/trade/modify-strategy-order.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtaModifyStrategyOrderReq {
    private String orderId;
    private String clientOid;
    private String qty;
    private String tpTriggerBy;
    private String slTriggerBy;
    private String takeProfit;
    private String stopLoss;
    private String tpOrderType;
    private String slOrderType;
    private String tpLimitPrice;
    private String slLimitPrice;
}
