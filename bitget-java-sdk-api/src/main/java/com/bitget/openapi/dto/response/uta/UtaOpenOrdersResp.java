package com.bitget.openapi.dto.response.uta;

import com.bitget.openapi.dto.response.ResponseResult;
import lombok.Data;

/**
 * Response wrapper for /api/v3/trade/unfilled-orders.
 */
@Data
public class UtaOpenOrdersResp extends ResponseResult<UtaOpenOrdersData> {
}
