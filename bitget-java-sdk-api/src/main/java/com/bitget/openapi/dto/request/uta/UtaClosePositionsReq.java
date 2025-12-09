package com.bitget.openapi.dto.request.uta;

import lombok.*;

/**
 * Request for closing positions by category/symbol/side.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtaClosePositionsReq {

    /**
     * Product type (Required). USDT-FUTURES / COIN-FUTURES / USDC-FUTURES.
     */
    @NonNull
    private String category;

    /**
     * Symbol name, e.g. BTCUSDT. If omitted, closes all symbols in the category.
     */
    private String symbol;

    /**
     * Position side to close: long/short. Optional.
     */
    private String posSide;
}
