package com.bitget.openapi.dto.response.uta;

import com.bitget.openapi.dto.response.ResponseResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Response payload wrapper for getPositionInfo.
 * <p>Data object follows doc/www.bitget.com/api-doc/uta/trade/Get-Position.html: data -> list.</p>
 */
@Data
@AllArgsConstructor
public class UtaPositionInfoResp extends ResponseResult<UtaPositionInfoResp.PositionInfoData> {

    @Data
    public static class PositionInfoData {
        private List<UtaPositionInfo> list;
    }
}
