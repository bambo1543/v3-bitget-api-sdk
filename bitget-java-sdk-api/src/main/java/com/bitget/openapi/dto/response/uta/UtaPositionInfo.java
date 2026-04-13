package com.bitget.openapi.dto.response.uta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Position info entry for getPositionInfo response.
 * Fields mirror doc/www.bitget.com/api-doc/uta/trade/Get-Position.html response parameters.
 * Units: amount-related fields follow the doc (e.g., positionBalance in margin coin, size in base where applicable).
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UtaPositionInfo {
    /**
     * Product type: USDT-FUTURES / COIN-FUTURES / USDC-FUTURES.
     */
    private String category;
    /**
     * Symbol name (e.g., BTCUSDT).
     */
    private String symbol;
    /**
     * Margin coin for the position.
     */
    private String marginCoin;
    private String marginSize;
    /**
     * Position side: long/short.
     */
    private String posSide;
    /**
     * Position balance (unit: margin coin).
     */
    private String positionBalance;
    /**
     * Available position size.
     */
    private String available;
    /**
     * Frozen position size.
     */
    private String frozen;
    /**
     * Total position size (available + frozen).
     */
    private String total;
    private String size;
    /**
     * Leverage multiple.
     */
    private String leverage;
    /**
     * Current realised profit and loss.
     */
    private String curRealisedPnl;
    /**
     * Average entry price.
     */
    private String avgPrice;
    /**
     * Margin mode: crossed / isolated.
     */
    private String marginMode;
    /**
     * Position status (e.g., normal).
     */
    private String positionStatus;
    /**
     * Holding mode: one_way_mode / hedge_mode.
     */
    private String holdMode;
    /**
     * Unrealised profit and loss.
     */
    private String unrealisedPnl;
    /**
     * Estimated liquidation price (<=0 means no liquidation).
     */
    private String liquidationPrice;
    private String liqPrice;
    /**
     * Maintenance margin rate.
     */
    private String mmr;
    /**
     * Profit rate.
     */
    private String profitRate;
    /**
     * Mark price.
     */
    private String markPrice;
    /**
     * Break-even price.
     */
    private String breakEvenPrice;
    /**
     * Total funding fees accrued during the position.
     */
    private String totalFunding;
    private String totalFundingFee;

    /**
     * Fees deducted on position opening.
     */
    private String openFeeTotal;
    /**
     * Fees deducted on position closing.
     */
    private String closeFeeTotal;
    /**
     * Created timestamp (ms).
     */
    private String createdTime;
    /**
     * Updated timestamp (ms).
     */
    private String updatedTime;

    public String getLiquidationPrice() {
        return liquidationPrice == null ? liqPrice : liquidationPrice;
    }

    public String getTotalFundingFee() {
        return totalFundingFee == null ? totalFunding : totalFundingFee;
    }

    public String getSize() {
        return size == null ? total : size;
    }
}
