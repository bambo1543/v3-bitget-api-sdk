package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.MarketApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;
import java.util.Map;

public class MarketService {

    private final MarketApi marketApi;

    public MarketService(ApiClient client) {
        marketApi = client.create(MarketApi.class);
    }

    public ResponseResult instruments(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(marketApi.instruments(paramMap).execute().body());
    }
}
