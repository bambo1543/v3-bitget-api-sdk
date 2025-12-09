package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaTradeApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.request.uta.*;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.List;
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
    public ResponseResult placeBatch(List<UtaPlaceOrderReq> request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.placeBatch(request).execute().body());
    }
    public ResponseResult placeBatchByMap(List<Map<String, String>> request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.placeBatchMap(request).execute().body());
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

    public ResponseResult modifyOrder(UtaModifyOrderReq request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.modifyOrder(request).execute().body());
    }
    public ResponseResult modifyOrder(Map<String, String> request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.modifyOrder(request).execute().body());
    }
    public ResponseResult modifyBatch(List<UtaModifyOrderReq> request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.modifyBatch(request).execute().body());
    }
    public ResponseResult modifyBatchByMap(List<Map<String, String>> request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.modifyBatchMap(request).execute().body());
    }

    public ResponseResult closeAllPositions(UtaClosePositionsReq request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.closeAllPositions(request).execute().body());
    }
    public ResponseResult closeAllPositions(Map<String, String> request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.closeAllPositions(request).execute().body());
    }

    public ResponseResult countdownCancelAll(UtaCountdownCancelAllReq request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.countdownCancelAll(request).execute().body());
    }
    public ResponseResult countdownCancelAll(Map<String, String> request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.countdownCancelAll(request).execute().body());
    }

    public ResponseResult getOrderDetails(Map<String, String> query) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.getOrderDetails(query).execute().body());
    }

    public ResponseResult getOpenOrders(Map<String, String> query) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.getOpenOrders(query).execute().body());
    }

    public ResponseResult getOrderHistory(Map<String, String> query) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.getOrderHistory(query).execute().body());
    }

    public ResponseResult getOrderFills(Map<String, String> query) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.getOrderFills(query).execute().body());
    }

    public ResponseResult getPositions(Map<String, String> query) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.getPositions(query).execute().body());
    }

    public ResponseResult getPositionHistory(Map<String, String> query) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.getPositionHistory(query).execute().body());
    }

    public ResponseResult getMaxOpenAvailable(Map<String, String> query) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.getMaxOpenAvailable(query).execute().body());
    }

    public ResponseResult getPositionAdlRank(Map<String, String> query) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.getPositionAdlRank(query).execute().body());
    }
}
