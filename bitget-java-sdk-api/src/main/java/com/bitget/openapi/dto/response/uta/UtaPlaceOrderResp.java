package com.bitget.openapi.dto.response.uta;

import com.bitget.openapi.dto.response.ResponseResult;
import lombok.Data;

/**
 * Response wrapper for /api/v3/trade/place-order.
 */
@Data
public class UtaPlaceOrderResp extends ResponseResult<UtaPlacedOrder> {
}
