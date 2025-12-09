package com.bitget.openapi.dto.request.uta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtaCancelOrderReq {

    private String symbol;

    private String marginCoin;

    private String orderId;

    private String clientOid;

    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder()
                .symbol(symbol)
                .marginCoin(marginCoin)
                .orderId(orderId)
                .clientOid(clientOid);
    }

    public static final class Builder {
        private String symbol;
        private String marginCoin;
        private String orderId;
        private String clientOid;

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

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder clientOid(String clientOid) {
            this.clientOid = clientOid;
            return this;
        }

        public UtaCancelOrderReq build() {
            return new UtaCancelOrderReq(symbol, marginCoin, orderId, clientOid);
        }
    }
}
