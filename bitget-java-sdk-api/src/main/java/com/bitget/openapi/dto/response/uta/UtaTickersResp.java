package com.bitget.openapi.dto.response.uta;

import com.bitget.openapi.dto.response.ResponseResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Response wrapper for /api/v3/market/tickers (data is an array of ticker entries).
 *
 * symbol = "ETHUSDT"
 * category = "USDT-FUTURES"
 * lastPrice = "3366.64"
 * openPrice24h = "3104.73"
 * lowPrice24h = "3089"
 * highPrice24h = "3397.21"
 * ask1Price = "3366.64"
 * bid1Price = "3366.63"
 * bid1Size = "93.76"
 * ask1Size = "6.1"
 * price24hPcnt = "0.08436"
 * turnover24h = "3955232702.9691"
 * volume24h = "1233477.53"
 * indexPrice = "3367.9904724453068061"
 * markPrice = "3366.64"
 * fundingRate = "0.000044"
 * openInterest = "547474.43"
 * deliveryStartTime = ""
 * deliveryTime = ""
 * deliveryStatus = ""
 * ts = "1765308241048"
 *
 */
@Data
@AllArgsConstructor
public class UtaTickersResp extends ResponseResult<List<UtaTicker>> {
}
