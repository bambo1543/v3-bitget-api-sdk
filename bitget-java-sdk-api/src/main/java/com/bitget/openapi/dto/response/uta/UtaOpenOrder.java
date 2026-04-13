package com.bitget.openapi.dto.response.uta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UtaOpenOrder {

    private String orderId;
    private String clientOid;
    private String category;
    private String symbol;
    private String orderType;
    private String side;
    private String price;
    private String qty;
    private String amount;
    private String cumExecQty;
    private String cumExecValue;
    private String avgPrice;
    private String timeInForce;
    private String orderStatus;
    private String posSide;
    private String holdMode;
    private String stpMode;
    private String reduceOnly;
    private List<UtaOrderFeeDetail> feeDetail;
    private String createdTime;
    private String updatedTime;

    private String holdSide;
    private String marginMode;
    private String marginCoin;
    private String totalProfit;
    private String leverage;
    private String tpTriggerBy;
    private String slTriggerBy;
    private String takeprofit;
    private String stoploss;
    private String tpOrderType;
    private String slOrderType;
    private String tpLimitPrice;
    private String slLimitPrice;
    private String delegateType;
}
