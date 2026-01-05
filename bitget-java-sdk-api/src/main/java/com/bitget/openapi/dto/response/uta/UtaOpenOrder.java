package com.bitget.openapi.dto.response.uta;

import lombok.Data;

import java.util.List;

@Data
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
}
