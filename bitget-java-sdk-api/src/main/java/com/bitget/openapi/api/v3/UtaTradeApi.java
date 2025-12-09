package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.request.uta.*;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface UtaTradeApi {

    @POST("/api/v3/trade/place-order")
    Call<ResponseResult> placeOrder(@Body UtaPlaceOrderReq request);

    @POST("/api/v3/trade/place-order")
    Call<ResponseResult> placeOrder(@Body Map<String, String> request);

    @POST("/api/v3/trade/place-batch")
    Call<ResponseResult> placeBatch(@Body List<UtaPlaceOrderReq> request);

    @POST("/api/v3/trade/place-batch")
    Call<ResponseResult> placeBatchMap(@Body List<Map<String, String>> request);

    @POST("/api/v3/trade/cancel-order")
    Call<ResponseResult> cancelOrder(@Body UtaCancelOrderReq request);

    @POST("/api/v3/trade/cancel-order")
    Call<ResponseResult> cancelOrder(@Body Map<String, String> request);

    @POST("/api/v3/trade/cancel-batch")
    Call<ResponseResult> cancelBatch(@Body UtaCancelBatchOrdersReq request);

    @POST("/api/v3/trade/cancel-batch")
    Call<ResponseResult> cancelBatch(@Body Map<String, String> request);

    @POST("/api/v3/trade/cancel-symbol-order")
    Call<ResponseResult> cancelAllOrders(@Body UtaCancelAllOrdersReq request);

    @POST("/api/v3/trade/cancel-symbol-order")
    Call<ResponseResult> cancelAllOrders(@Body Map<String, String> request);

    @POST("/api/v3/trade/modify-order")
    Call<ResponseResult> modifyOrder(@Body UtaModifyOrderReq request);

    @POST("/api/v3/trade/modify-order")
    Call<ResponseResult> modifyOrder(@Body Map<String, String> request);

    @POST("/api/v3/trade/batch-modify-order")
    Call<ResponseResult> modifyBatch(@Body List<UtaModifyOrderReq> request);

    @POST("/api/v3/trade/batch-modify-order")
    Call<ResponseResult> modifyBatchMap(@Body List<Map<String, String>> request);

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

    @GET("/api/v3/trade/open-orders")
    Call<ResponseResult> getOpenOrders(@QueryMap Map<String, String> query);

    @GET("/api/v3/trade/history-orders")
    Call<ResponseResult> getOrderHistory(@QueryMap Map<String, String> query);

    @GET("/api/v3/trade/fills")
    Call<ResponseResult> getOrderFills(@QueryMap Map<String, String> query);

    @GET("/api/v3/trade/position")
    Call<ResponseResult> getPositions(@QueryMap Map<String, String> query);

    @GET("/api/v3/trade/position-history")
    Call<ResponseResult> getPositionHistory(@QueryMap Map<String, String> query);

    @GET("/api/v3/trade/max-open-amount")
    Call<ResponseResult> getMaxOpenAvailable(@QueryMap Map<String, String> query);

    @GET("/api/v3/trade/position-adl")
    Call<ResponseResult> getPositionAdlRank(@QueryMap Map<String, String> query);

}
