package com.bitget.openapi.dto.request.uta;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UtaCancelBatchOrdersReq {

    private String symbol;

    private String marginCoin;

    private List<String> orderIds;

    private List<String> clientOids;
}
