package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaTradeApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class UtaTradeService {

    private final UtaTradeApi utaTradeApi;

    public UtaTradeService(ApiClient client) {
        utaTradeApi = client.create(UtaTradeApi.class);
    }

    public ResponseResult placeOrder(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.placeOrder(paramMap).execute().body());
    }
    public ResponseResult cancelOrder(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.cancelOrder(paramMap).execute().body());
    }
    public ResponseResult cancelBatch(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.cancelBatch(paramMap).execute().body());
    }

    public ResponseResult cancelAllOrders(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.cancelAllOrders(paramMap).execute().body());
    }
}
