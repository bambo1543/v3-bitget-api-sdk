package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaTradeApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.request.uta.*;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.dto.response.uta.UtaBatchPlaceOrderResp;
import com.bitget.openapi.dto.response.uta.UtaPositionInfoResp;
import com.bitget.openapi.dto.response.uta.UtaPlaceOrderResp;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class UtaTradeService {

    private final UtaTradeApi utaTradeApi;

    public UtaTradeService(ApiClient client) {
        utaTradeApi = client.create(UtaTradeApi.class);
    }

    public UtaPlaceOrderResp placeOrder(UtaPlaceOrderReq request) throws IOException {
        UtaPlaceOrderResp resp = utaTradeApi.placeOrder(request).execute().body();
        ResponseUtils.handleResponse(resp);
        return resp;
    }
    public UtaPlaceOrderResp placeOrder(Map<String, String> request) throws IOException {
        UtaPlaceOrderResp resp = utaTradeApi.placeOrder(request).execute().body();
        ResponseUtils.handleResponse(resp);
        return resp;
    }
    public UtaBatchPlaceOrderResp placeBatchOrders(List<UtaPlaceOrderReq> request) throws IOException {
        UtaBatchPlaceOrderResp resp = utaTradeApi.placeBatchOrders(request).execute().body();
        ResponseUtils.handleResponse(resp);
        return resp;
    }
    public UtaBatchPlaceOrderResp placeBatchOrdersByMap(List<Map<String, String>> request) throws IOException {
        UtaBatchPlaceOrderResp resp = utaTradeApi.placeBatchOrdersMap(request).execute().body();
        ResponseUtils.handleResponse(resp);
        return resp;
    }
    public ResponseResult cancelOrder(UtaCancelOrderReq request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.cancelOrder(request).execute().body());
    }
    public ResponseResult cancelOrder(Map<String, String> request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.cancelOrder(request).execute().body());
    }
    public ResponseResult cancelBatchOrders(UtaCancelBatchOrdersReq request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.cancelBatchOrders(request).execute().body());
    }
    public ResponseResult cancelBatchOrders(Map<String, String> request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.cancelBatchOrders(request).execute().body());
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
    public ResponseResult modifyBatchOrders(List<UtaModifyOrderReq> request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.modifyBatchOrders(request).execute().body());
    }
    public ResponseResult modifyBatchOrdersByMap(List<Map<String, String>> request) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.modifyBatchOrdersMap(request).execute().body());
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

    public UtaPositionInfoResp getPositionInfo(Map<String, String> query) throws IOException {
        return utaTradeApi.getPositionInfo(query).execute().body();
    }

    public ResponseResult getPositionsHistory(Map<String, String> query) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.getPositionsHistory(query).execute().body());
    }

    public ResponseResult getMaxOpenAvailable(Map<String, String> query) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.getMaxOpenAvailable(query).execute().body());
    }

    public ResponseResult getPositionAdlRank(Map<String, String> query) throws IOException {
        return ResponseUtils.handleResponse(utaTradeApi.getPositionAdlRank(query).execute().body());
    }
}
