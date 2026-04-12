package com.bitget.openapi.dto.ws;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class WsOrder {

    @JsonProperty("category")
    private String category;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("orderId")
    private String orderId;

    @JsonProperty("clientOid")
    private String clientOid;

    @JsonProperty("price")
    private String price;

    @JsonProperty("qty")
    private String qty;

    @JsonProperty("holdMode")
    private String holdMode;

    @JsonProperty("holdSide")
    private String holdSide;

    @JsonProperty("tradeSide")
    private String tradeSide;

    @JsonProperty("orderType")
    private String orderType;

    @JsonProperty("timeInForce")
    private String timeInForce;

    @JsonProperty("side")
    private String side;

    @JsonProperty("marginMode")
    private String marginMode;

    @JsonProperty("marginCoin")
    private String marginCoin;

    @JsonProperty("reduceOnly")
    private String reduceOnly;

    @JsonProperty("cumExecQty")
    private String cumExecQty;

    @JsonProperty("cumExecValue")
    private String cumExecValue;

    @JsonProperty("avgPrice")
    private String avgPrice;

    @JsonProperty("totalProfit")
    private String totalProfit;

    @JsonProperty("orderStatus")
    private String orderStatus;

    @JsonProperty("cancelReason")
    private String cancelReason;

    @JsonProperty("leverage")
    private String leverage;

    @JsonProperty("feeDetail")
    private List<?> feeDetail;

    @JsonProperty("createdTime")
    private String createdTime;

    @JsonProperty("updatedTime")
    private String updatedTime;

    @JsonProperty("stpMode")
    private String stpMode;

    @JsonProperty("tpTriggerBy")
    private String tpTriggerBy;

    @JsonProperty("slTriggerBy")
    private String slTriggerBy;

    @JsonProperty("takeprofit")
    private String takeprofit;

    @JsonProperty("stoploss")
    private String stoploss;

    @JsonProperty("tpOrderType")
    private String tpOrderType;

    @JsonProperty("slOrderType")
    private String slOrderType;

    @JsonProperty("tpLimitPrice")
    private String tpLimitPrice;

    @JsonProperty("slLimitPrice")
    private String slLimitPrice;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("delegateType")
    private String delegateType;

}
