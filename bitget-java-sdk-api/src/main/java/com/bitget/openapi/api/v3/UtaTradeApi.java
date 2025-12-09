package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.request.uta.UtaCancelAllOrdersReq;
import com.bitget.openapi.dto.request.uta.UtaCancelBatchOrdersReq;
import com.bitget.openapi.dto.request.uta.UtaCancelOrderReq;
import com.bitget.openapi.dto.request.uta.UtaPlaceOrderReq;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UtaTradeApi {

    @POST("/api/v3/trade/place-order")
    Call<ResponseResult> placeOrder(@Body UtaPlaceOrderReq request);

    @POST("/api/v3/trade/cancel-order")
    Call<ResponseResult> cancelOrder(@Body UtaCancelOrderReq request);

    @POST("/api/v3/trade/cancel-batch")
    Call<ResponseResult> cancelBatch(@Body UtaCancelBatchOrdersReq request);

    @POST("/api/v3/trade/cancel-symbol-order")
    Call<ResponseResult> cancelAllOrders(@Body UtaCancelAllOrdersReq request);

}
