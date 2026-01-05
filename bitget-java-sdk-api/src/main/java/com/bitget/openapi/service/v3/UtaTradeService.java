package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaTradeApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.request.uta.*;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.dto.response.uta.UtaBatchPlaceOrderResp;
import com.bitget.openapi.dto.response.uta.UtaOpenOrdersResp;
import com.bitget.openapi.dto.response.uta.UtaOrderHistoryResp;
import com.bitget.openapi.dto.response.uta.UtaPositionInfoResp;
import com.bitget.openapi.dto.response.uta.UtaPlaceOrderResp;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

    public UtaOpenOrdersResp getOpenOrders(UtaOpenOrdersReq query) throws IOException {
        Map<String, String> params = buildOpenOrdersParams(query);
        UtaOpenOrdersResp resp = utaTradeApi.getOpenOrders(params).execute().body();
        ResponseUtils.handleResponse(resp);
        return resp;
    }

    public UtaOrderHistoryResp getOrderHistory(UtaOrderHistoryReq query) throws IOException {
        Map<String, String> params = buildOrderHistoryParams(query);
        UtaOrderHistoryResp resp = utaTradeApi.getOrderHistory(params).execute().body();
        ResponseUtils.handleResponse(resp);
        return resp;
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

    private Map<String, String> buildOpenOrdersParams(UtaOpenOrdersReq request) {
        Objects.requireNonNull(request, "request is required");

        Map<String, String> params = new HashMap<>();
        if (request.getCategory() != null) {
            params.put("category", request.getCategory());
        }
        if (request.getSymbol() != null) {
            params.put("symbol", request.getSymbol());
        }
        if (request.getStartTime() != null) {
            params.put("startTime", request.getStartTime());
        }
        if (request.getEndTime() != null) {
            params.put("endTime", request.getEndTime());
        }
        if (request.getLimit() != null) {
            params.put("limit", request.getLimit());
        }
        if (request.getCursor() != null) {
            params.put("cursor", request.getCursor());
        }
        return params;
    }

    private Map<String, String> buildOrderHistoryParams(UtaOrderHistoryReq request) {
        Objects.requireNonNull(request, "request is required");

        Map<String, String> params = new HashMap<>();
        if (request.getCategory() != null) {
            params.put("category", request.getCategory());
        }
        if (request.getSymbol() != null) {
            params.put("symbol", request.getSymbol());
        }
        if (request.getStartTime() != null) {
            params.put("startTime", request.getStartTime());
        }
        if (request.getEndTime() != null) {
            params.put("endTime", request.getEndTime());
        }
        if (request.getLimit() != null) {
            params.put("limit", request.getLimit());
        }
        if (request.getCursor() != null) {
            params.put("cursor", request.getCursor());
        }
        return params;
    }
}
