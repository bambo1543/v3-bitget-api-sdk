package com.bitget.openapi.dto.response.uta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Funding account asset entry for /api/v3/account/funding-assets.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtaFundingAsset {
    /**
     * Coin name.
     */
    private String coin;
    /**
     * Available amount.
     */
    private String available;
    /**
     * Frozen amount.
     */
    private String frozen;
    /**
     * Total balance.
     */
    private String balance;
}
