package com.bitget.openapi.dto.ws;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class WsPosition {

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("marginCoin")
    private String marginCoin;

    @JsonProperty("marginSize")
    private String marginSize;

    @JsonProperty("marginMode")
    private String marginMode;

    @JsonProperty("holdMode")
    private String holdMode;

    @JsonProperty("posSide")
    private String posSide;

    @JsonProperty("size")
    private String size;

    @JsonProperty("available")
    private String available;

    @JsonProperty("frozen")
    private String frozen;

    @JsonProperty("avgPrice")
    private String avgPrice;

    @JsonProperty("leverage")
    private String leverage;

    @JsonProperty("curRealisedPnl")
    private String curRealisedPnl;

    @JsonProperty("unrealisedPnl")
    private String unrealisedPnl;

    @JsonProperty("liqPrice")
    private String liqPrice;

    @JsonProperty("mmr")
    private String mmr;

    @JsonProperty("markPrice")
    private String markPrice;

    @JsonProperty("breakEvenPrice")
    private String breakEvenPrice;

    @JsonProperty("profitRate")
    private String profitRate;

    @JsonProperty("totalFundingFee")
    private String totalFundingFee;

    @JsonProperty("openFeeTotal")
    private String openFeeTotal;

    @JsonProperty("closeFeeTotal")
    private String closeFeeTotal;

    @JsonProperty("positionStatus")
    private String positionStatus;

    @JsonProperty("createdTime")
    private String createdTime;

    @JsonProperty("updatedTime")
    private String updatedTime;

}
