package com.bitget.openapi.dto.request.uta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtaCancelBatchOrdersReq {

    /**
     * Order ID. Either clientOid or orderId must be provided.
     * If both are present, orderId takes priority.
     */
    private String orderId;

    /**
     * Client order ID. Either clientOid or orderId must be provided.
     * If both are present, orderId takes priority.
     */
    private String clientOid;

    /**
     * Product type. All orders in one request must have the same category.
     */
    private String category;

    /**
     * Symbol name, e.g. BTCUSDT.
     */
    private String symbol;
}
