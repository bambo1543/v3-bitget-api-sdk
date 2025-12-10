package com.bitget.openapi.dto.response.uta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Account assets snapshot returned by /api/v3/account/assets.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtaAccountInfo {
    /**
     * Account equity (USD).
     */
    private String accountEquity;
    /**
     * Account equity (USDT).
     */
    private String usdtEquity;
    /**
     * Account equity (BTC).
     */
    private String btcEquity;
    /**
     * Unrealised profit and loss (USD).
     */
    private String unrealisedPnl;
    /**
     * Unrealised profit and loss (USDT).
     */
    private String usdtUnrealisedPnl;
    /**
     * Unrealised profit and loss (BTC).
     */
    private String btcUnrealizedPnl;
    /**
     * Effective equity (USD) available for margin under cross margin.
     */
    private String effEquity;
    /**
     * Maintenance margin (USD).
     */
    private String mmr;
    /**
     * Initial margin (USD).
     */
    private String imr;
    /**
     * Margin ratio.
     */
    private String mgnRatio;
    /**
     * Position maintenance margin rate.
     */
    private String positionMgnRatio;
    /**
     * Asset list.
     */
    private List<UtaAccountAsset> assets;
}
