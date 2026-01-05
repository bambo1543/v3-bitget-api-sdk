package com.bitget.openapi.dto.response.uta;

import lombok.Data;

@Data
public class UtaOrderHistory extends UtaOpenOrder {
    private String cancelReason;
    private String execType;
}
