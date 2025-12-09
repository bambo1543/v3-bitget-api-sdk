package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * UTA account endpoints (see doc/www.bitget.com/api-doc/uta/account).
 */
public interface UtaAccountApi {

    /**
     * POST /api/v3/account/set-leverage
     */
    @POST("/api/v3/account/set-leverage")
    Call<ResponseResult> setLeverage(@Body Map<String, String> body);

    /**
     * POST /api/v3/account/switch-deduct
     */
    @POST("/api/v3/account/switch-deduct")
    Call<ResponseResult> switchDeduct(@Body Map<String, String> body);

    /**
     * GET /api/v3/account/max-transferable
     */
    @GET("/api/v3/account/max-transferable")
    Call<ResponseResult> getMaxTransferable(@QueryMap Map<String, String> query);

    /**
     * GET /api/v3/account/open-interest-limit
     */
    @GET("/api/v3/account/open-interest-limit")
    Call<ResponseResult> getOpenInterestLimit(@QueryMap Map<String, String> query);

    /**
     * POST /api/v3/user/freeze-sub
     */
    @POST("/api/v3/user/freeze-sub")
    Call<ResponseResult> freezeSubAccount(@Body Map<String, String> body);
}
