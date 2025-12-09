package com.bitget.openapi.dto.request.uta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtaCancelOrderReq {

    private String symbol;

    private String marginCoin;

    private String orderId;

    private String clientOid;
}
