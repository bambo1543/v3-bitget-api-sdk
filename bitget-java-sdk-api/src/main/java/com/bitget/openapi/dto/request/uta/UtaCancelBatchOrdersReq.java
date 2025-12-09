package com.bitget.openapi.dto.request.uta;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtaCancelBatchOrdersReq {

    private String symbol;

    private String marginCoin;

    private List<String> orderIds;

    private List<String> clientOids;

    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder()
                .symbol(symbol)
                .marginCoin(marginCoin)
                .orderIds(orderIds)
                .clientOids(clientOids);
    }

    public static final class Builder {
        private String symbol;
        private String marginCoin;
        private List<String> orderIds;
        private List<String> clientOids;

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

        public Builder orderIds(List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }

        public Builder clientOids(List<String> clientOids) {
            this.clientOids = clientOids;
            return this;
        }

        public UtaCancelBatchOrdersReq build() {
            return new UtaCancelBatchOrdersReq(symbol, marginCoin, orderIds, clientOids);
        }
    }
}
