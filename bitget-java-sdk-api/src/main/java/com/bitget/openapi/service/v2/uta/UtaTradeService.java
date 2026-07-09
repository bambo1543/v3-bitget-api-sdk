package com.bitget.openapi.service.v2.uta;

import com.bitget.openapi.api.v2.UtaTradeApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.request.uta.UtaCancelSymbolOrderReq;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;

public class UtaTradeService {

    private final UtaTradeApi utaTradeApi;

    public UtaTradeService(ApiClient client) {
        utaTradeApi = client.create(UtaTradeApi.class);
    }

    public ResponseResult cancelSymbolOrder(UtaCancelSymbolOrderReq request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.cancelSymbolOrder(request).execute().body());
    }
}
