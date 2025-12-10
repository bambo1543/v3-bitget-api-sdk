package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaAccountApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.dto.response.uta.UtaAccountInfoResp;
import com.bitget.openapi.dto.response.uta.UtaFundingAssetsResp;

import java.io.IOException;
import java.util.Map;

/**
 * Service wrapper for UTA account endpoints.
 */
public class UtaAccountService {

    private final UtaAccountApi utaAccountApi;

    public UtaAccountService(ApiClient client) {
        this.utaAccountApi = client.create(UtaAccountApi.class);
    }

    public UtaAccountInfoResp getAccountAssets() throws IOException {
        UtaAccountInfoResp resp = utaAccountApi.getAccountAssets().execute().body();
        ResponseUtils.handleResponse(resp);
        return resp;
    }

    public UtaFundingAssetsResp getAccountFundingAssets(Map<String, String> query) throws IOException {
        UtaFundingAssetsResp resp = utaAccountApi.getAccountFundingAssets(query).execute().body();
        ResponseUtils.handleResponse(resp);
        return resp;
    }

    public ResponseResult setLeverage(Map<String, String> body) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.setLeverage(body).execute().body());
    }

    public ResponseResult switchDeduct(Map<String, String> body) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.switchDeduct(body).execute().body());
    }

    public ResponseResult setHoldMode(Map<String, String> body) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.setHoldMode(body).execute().body());
    }

    public ResponseResult getMaxTransferable(Map<String, String> query) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.getMaxTransferable(query).execute().body());
    }

    public ResponseResult getOpenInterestLimit(Map<String, String> query) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.getOpenInterestLimit(query).execute().body());
    }

    public ResponseResult freezeSubAccount(Map<String, String> body) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.freezeSubAccount(body).execute().body());
    }
}
