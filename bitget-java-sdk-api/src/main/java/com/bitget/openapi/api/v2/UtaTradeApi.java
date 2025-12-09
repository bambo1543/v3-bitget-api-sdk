package com.bitget.openapi.api.v2;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.Map;

public interface UtaTradeApi {

    @POST("/api/v3/trade/cancel-symbol-order")
    Call<ResponseResult> cancelSymbolOrder(@Body Map<String, String> paramMap);
}
