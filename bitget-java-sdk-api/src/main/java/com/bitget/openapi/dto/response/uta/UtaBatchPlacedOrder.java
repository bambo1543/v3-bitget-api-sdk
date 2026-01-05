package com.bitget.openapi.dto.response.uta;

import lombok.Data;

/**
 * Entry returned from batch place-order endpoint.
 * If an order fails, code/msg are populated.
 */
@Data
public class UtaBatchPlacedOrder {
    private String orderId;
    private String clientOid;
    private String code;
    private String msg;
}
