package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.MarketApi;
import com.bitget.openapi.api.v3.TradeApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class TradeService {

    private final TradeApi tradeApi;

    public TradeService(ApiClient client) {
        tradeApi = client.create(TradeApi.class);
    }

    public ResponseResult placeOrder(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(tradeApi.placeOrder(paramMap).execute().body());
    }
    public ResponseResult cancelOrder(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(tradeApi.cancelOrder(paramMap).execute().body());
    }
    public ResponseResult cancelBatch(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(tradeApi.cancelBatch(paramMap).execute().body());
    }

    public ResponseResult cancelAllOrders(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(tradeApi.cancelAllOrders(paramMap).execute().body());
    }
}
