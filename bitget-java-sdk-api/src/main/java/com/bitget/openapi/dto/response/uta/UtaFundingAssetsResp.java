package com.bitget.openapi.dto.response.uta;

import com.bitget.openapi.dto.response.ResponseResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Response wrapper for /api/v3/account/funding-assets.
 */
@Data
public class UtaFundingAssetsResp extends ResponseResult<List<UtaFundingAsset>> {
}
