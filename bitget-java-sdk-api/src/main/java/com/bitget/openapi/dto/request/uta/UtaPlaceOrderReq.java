package com.bitget.openapi.dto.request.uta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
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

    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder()
                .symbol(symbol)
                .marginCoin(marginCoin)
                .marginMode(marginMode)
                .size(size)
                .price(price)
                .side(side)
                .orderType(orderType)
                .timeInForceValue(timeInForceValue)
                .clientOid(clientOid)
                .reduceOnly(reduceOnly)
                .presetTakeProfitPrice(presetTakeProfitPrice)
                .presetStopLossPrice(presetStopLossPrice);
    }

    public static final class Builder {
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

        private Builder() {
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder marginCoin(String marginCoin) {
            this.marginCoin = marginCoin;
            return this;
        }

        public Builder marginMode(String marginMode) {
            this.marginMode = marginMode;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder side(String side) {
            this.side = side;
            return this;
        }

        public Builder orderType(String orderType) {
            this.orderType = orderType;
            return this;
        }

        public Builder timeInForceValue(String timeInForceValue) {
            this.timeInForceValue = timeInForceValue;
            return this;
        }

        public Builder clientOid(String clientOid) {
            this.clientOid = clientOid;
            return this;
        }

        public Builder reduceOnly(String reduceOnly) {
            this.reduceOnly = reduceOnly;
            return this;
        }

        public Builder presetTakeProfitPrice(String presetTakeProfitPrice) {
            this.presetTakeProfitPrice = presetTakeProfitPrice;
            return this;
        }

        public Builder presetStopLossPrice(String presetStopLossPrice) {
            this.presetStopLossPrice = presetStopLossPrice;
            return this;
        }

        public UtaPlaceOrderReq build() {
            return new UtaPlaceOrderReq(symbol, marginCoin, marginMode, size, price, side, orderType,
                    timeInForceValue, clientOid, reduceOnly, presetTakeProfitPrice, presetStopLossPrice);
        }
    }
}
