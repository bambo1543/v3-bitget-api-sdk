package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaMarketApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class UtaMarketService {

    private final UtaMarketApi utaMarketApi;

    public UtaMarketService(ApiClient client) {
        utaMarketApi = client.create(UtaMarketApi.class);
    }

    public ResponseResult instruments(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.instruments(paramMap).execute().body());
    }
}
