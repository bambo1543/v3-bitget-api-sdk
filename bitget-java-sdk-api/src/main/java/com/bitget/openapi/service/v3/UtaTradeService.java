package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaTradeApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.request.uta.UtaCancelAllOrdersReq;
import com.bitget.openapi.dto.request.uta.UtaCancelBatchOrdersReq;
import com.bitget.openapi.dto.request.uta.UtaCancelOrderReq;
import com.bitget.openapi.dto.request.uta.UtaPlaceOrderReq;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class UtaTradeService {

    private final UtaTradeApi utaTradeApi;

    public UtaTradeService(ApiClient client) {
        utaTradeApi = client.create(UtaTradeApi.class);
    }

    public ResponseResult placeOrder(UtaPlaceOrderReq request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.placeOrder(request).execute().body());
    }
    public ResponseResult placeOrder(Map<String, String> request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.placeOrder(request).execute().body());
    }
    public ResponseResult cancelOrder(UtaCancelOrderReq request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.cancelOrder(request).execute().body());
    }
    public ResponseResult cancelOrder(Map<String, String> request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.cancelOrder(request).execute().body());
    }
    public ResponseResult cancelBatch(UtaCancelBatchOrdersReq request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.cancelBatch(request).execute().body());
    }
    public ResponseResult cancelBatch(Map<String, String> request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.cancelBatch(request).execute().body());
    }

    public ResponseResult cancelAllOrders(UtaCancelAllOrdersReq request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.cancelAllOrders(request).execute().body());
    }
    public ResponseResult cancelAllOrders(Map<String, String> request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.cancelAllOrders(request).execute().body());
    }
}
