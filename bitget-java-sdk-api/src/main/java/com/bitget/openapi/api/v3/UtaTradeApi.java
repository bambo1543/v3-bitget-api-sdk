package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.request.uta.*;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.dto.response.uta.UtaBatchPlaceOrderResp;
import com.bitget.openapi.dto.response.uta.UtaOpenOrdersResp;
import com.bitget.openapi.dto.response.uta.UtaOrderHistoryResp;
import com.bitget.openapi.dto.response.uta.UtaPositionInfoResp;
import com.bitget.openapi.dto.response.uta.UtaPlaceOrderResp;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface UtaTradeApi {

    @POST("/api/v3/trade/place-order")
    Call<UtaPlaceOrderResp> placeOrder(@Body UtaPlaceOrderReq request);

    @POST("/api/v3/trade/place-order")
    Call<UtaPlaceOrderResp> placeOrder(@Body Map<String, String> request);

    @POST("/api/v3/trade/place-batch")
    Call<UtaBatchPlaceOrderResp> placeBatchOrders(@Body List<UtaPlaceOrderReq> request);

    @POST("/api/v3/trade/place-batch")
    Call<UtaBatchPlaceOrderResp> placeBatchOrdersMap(@Body List<Map<String, String>> request);

    @POST("/api/v3/trade/cancel-order")
    Call<ResponseResult> cancelOrder(@Body UtaCancelOrderReq request);

    @POST("/api/v3/trade/cancel-order")
    Call<ResponseResult> cancelOrder(@Body Map<String, String> request);

    @POST("/api/v3/trade/cancel-batch")
    Call<ResponseResult> cancelBatchOrders(@Body UtaCancelBatchOrdersReq request);

    @POST("/api/v3/trade/cancel-batch")
    Call<ResponseResult> cancelBatchOrders(@Body Map<String, String> request);

    @POST("/api/v3/trade/cancel-symbol-order")
    Call<ResponseResult> cancelAllOrders(@Body UtaCancelAllOrdersReq request);

    @POST("/api/v3/trade/cancel-symbol-order")
    Call<ResponseResult> cancelAllOrders(@Body Map<String, String> request);

    @POST("/api/v3/trade/modify-order")
    Call<ResponseResult> modifyOrder(@Body UtaModifyOrderReq request);

    @POST("/api/v3/trade/modify-order")
    Call<ResponseResult> modifyOrder(@Body Map<String, String> request);

    @POST("/api/v3/trade/batch-modify-order")
    Call<ResponseResult> modifyBatchOrders(@Body List<UtaModifyOrderReq> request);

    @POST("/api/v3/trade/batch-modify-order")
    Call<ResponseResult> modifyBatchOrdersMap(@Body List<Map<String, String>> request);

    @POST("/api/v3/trade/close-positions")
    Call<ResponseResult> closeAllPositions(@Body UtaClosePositionsReq request);

    @POST("/api/v3/trade/close-positions")
    Call<ResponseResult> closeAllPositions(@Body Map<String, String> request);

    @POST("/api/v3/trade/countdown-cancel-all")
    Call<ResponseResult> countdownCancelAll(@Body UtaCountdownCancelAllReq request);

    @POST("/api/v3/trade/countdown-cancel-all")
    Call<ResponseResult> countdownCancelAll(@Body Map<String, String> request);

    @GET("/api/v3/trade/order-info")
    Call<ResponseResult> getOrderDetails(@QueryMap Map<String, String> query);

    @GET("/api/v3/trade/unfilled-orders")
    Call<UtaOpenOrdersResp> getOpenOrders(@QueryMap Map<String, String> query);

    @GET("/api/v3/trade/history-orders")
    Call<UtaOrderHistoryResp> getOrderHistory(@QueryMap Map<String, String> query);

    @GET("/api/v3/trade/fills")
    Call<ResponseResult> getOrderFills(@QueryMap Map<String, String> query);

    @GET("/api/v3/position/current-position")
    Call<UtaPositionInfoResp> getPositionInfo(@QueryMap Map<String, String> query);

    @GET("/api/v3/position/history-position")
    Call<ResponseResult> getPositionsHistory(@QueryMap Map<String, String> query);

    @POST("/api/v3/account/max-open-available")
    Call<ResponseResult> getMaxOpenAvailable(@Body Map<String, String> request);

    @GET("/api/v3/position/adlRank")
    Call<ResponseResult> getPositionAdlRank(@QueryMap Map<String, String> query);

}
