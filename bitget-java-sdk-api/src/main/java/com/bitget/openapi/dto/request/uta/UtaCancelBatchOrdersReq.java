package com.bitget.openapi.dto.request.uta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtaCancelBatchOrdersReq {

    private String symbol;

    private String category;

    private List<String> orderIds;

    private List<String> clientOids;
}
