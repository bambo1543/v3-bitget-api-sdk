package com.bitget.openapi.dto.request.uta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UtaCancelOrderReq {

    private String symbol;

    private String marginCoin;

    private String orderId;

    private String clientOid;
}
