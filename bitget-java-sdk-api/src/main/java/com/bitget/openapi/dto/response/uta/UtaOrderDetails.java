package com.bitget.openapi.dto.response.uta;

import lombok.Data;

@Data
public class UtaOrderDetails extends UtaOrderHistory {
    private String tradeSide;
}
