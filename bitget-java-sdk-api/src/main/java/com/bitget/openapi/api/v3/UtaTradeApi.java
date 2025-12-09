package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface UtaTradeApi {

    @POST("/api/v3/trade/place-order")
    Call<ResponseResult> placeOrder(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/trade/cancel-order")
    Call<ResponseResult> cancelOrder(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/trade/cancel-batch")
    Call<ResponseResult> cancelBatch(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/trade/cancel-symbol-order")
    Call<ResponseResult> cancelAllOrders(@Body Map<String, String> paramMap);

}
