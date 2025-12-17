package com.bitget.openapi.dto.response.uta;

import com.bitget.openapi.dto.response.ResponseResult;
import lombok.Data;

import java.util.List;

/**
 * Response wrapper for /api/v3/market/candles.
 * Data is parsed into a typed candle list according to the documented order:
 * [timestamp, open, high, low, close, volume, turnover].
 */
@Data
public class UtaCandlesResp extends ResponseResult<List<UtaCandle>> {
}
