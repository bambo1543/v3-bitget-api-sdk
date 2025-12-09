package com.bitget.openapi.dto.request.uta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtaCancelAllOrdersReq {

    private String symbol;

    private String marginCoin;

    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder()
                .symbol(symbol)
                .marginCoin(marginCoin);
    }

    public static final class Builder {
        private String symbol;
        private String marginCoin;

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

        public UtaCancelAllOrdersReq build() {
            return new UtaCancelAllOrdersReq(symbol, marginCoin);
        }
    }
}
