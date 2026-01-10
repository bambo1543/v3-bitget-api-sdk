package com.bitget.openapi.dto.request.uta;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtaCancelSymbolOrderReq {

    @JSONField(ordinal = 1)
    private String productType;

    @JSONField(ordinal = 2)
    private String symbol;
}
