package com.bitget.openapi.dto.response.uta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Asset entry in account assets response.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtaAccountAsset {
    /**
     * Coin name.
     */
    private String coin;
    /**
     * Coin equity.
     */
    private String equity;
    /**
     * Coin equity (USD).
     */
    private String usdValue;
    /**
     * Coin balance.
     */
    private String balance;
    /**
     * Debt (applicable when placing margin orders).
     */
    private String debt;
    /**
     * Available balance.
     */
    private String available;
    /**
     * Locked amount (applicable when placing spot orders).
     */
    private String locked;
}
