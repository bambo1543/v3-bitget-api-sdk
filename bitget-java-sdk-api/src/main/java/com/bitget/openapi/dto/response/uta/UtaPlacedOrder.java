package com.bitget.openapi.dto.response.uta;

import lombok.Data;

/**
 * Single order creation result entry.
 */
@Data
public class UtaPlacedOrder {
    private String orderId;
    private String clientOid;
}
