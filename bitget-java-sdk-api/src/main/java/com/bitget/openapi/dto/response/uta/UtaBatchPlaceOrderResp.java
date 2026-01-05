package com.bitget.openapi.dto.response.uta;

import com.bitget.openapi.dto.response.ResponseResult;
import lombok.Data;

import java.util.List;

/**
 * Response wrapper for /api/v3/trade/place-batch.
 */
@Data
public class UtaBatchPlaceOrderResp extends ResponseResult<List<UtaBatchPlacedOrder>> {
}
