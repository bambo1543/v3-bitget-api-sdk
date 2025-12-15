package com.bitget.openapi.api.v2;

import com.bitget.openapi.dto.request.uta.UtaCancelSymbolOrderReq;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UtaTradeApi {

    @POST("/api/v3/trade/cancel-symbol-order")
    Call<ResponseResult> cancelSymbolOrder(@Body UtaCancelSymbolOrderReq request);
}
