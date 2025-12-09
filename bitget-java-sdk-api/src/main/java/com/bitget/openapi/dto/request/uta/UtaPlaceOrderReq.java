package com.bitget.openapi.dto.request.uta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtaPlaceOrderReq {

    private String symbol;

    private String marginCoin;

    private String marginMode;

    private String size;

    private String price;

    private String side;

    private String orderType;

    private String timeInForceValue;

    private String clientOid;

    private String reduceOnly;

    private String presetTakeProfitPrice;

    private String presetStopLossPrice;
}
