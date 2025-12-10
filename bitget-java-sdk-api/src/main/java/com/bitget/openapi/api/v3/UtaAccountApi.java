package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.dto.response.uta.UtaAccountInfoResp;
import com.bitget.openapi.dto.response.uta.UtaFundingAssetsResp;
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
     * GET /api/v3/account/assets
     */
    @GET("/api/v3/account/assets")
    Call<UtaAccountInfoResp> getAccountAssets();

    /**
     * GET /api/v3/account/funding-assets
     */
    @GET("/api/v3/account/funding-assets")
    Call<UtaFundingAssetsResp> getAccountFundingAssets(@QueryMap Map<String, String> query);

    /**
     * POST /api/v3/account/set-hold-mode
     */
    @POST("/api/v3/account/set-hold-mode")
    Call<ResponseResult> setHoldMode(@Body Map<String, String> body);

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
