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

    public ResponseResult tickers(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.tickers(paramMap).execute().body());
    }

    public ResponseResult orderBook(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.orderBook(paramMap).execute().body());
    }

    public ResponseResult fills(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.fills(paramMap).execute().body());
    }

    public ResponseResult proofOfReserves(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.proofOfReserves(paramMap).execute().body());
    }

    public ResponseResult openInterest(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.openInterest(paramMap).execute().body());
    }

    public ResponseResult candles(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.candles(paramMap).execute().body());
    }

    public ResponseResult historyCandles(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.historyCandles(paramMap).execute().body());
    }

    public ResponseResult currentFundingRate(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.currentFundingRate(paramMap).execute().body());
    }

    public ResponseResult historyFundingRate(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.historyFundingRate(paramMap).execute().body());
    }

    public ResponseResult riskReserve(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.riskReserve(paramMap).execute().body());
    }

    public ResponseResult discountRate(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.discountRate(paramMap).execute().body());
    }

    public ResponseResult marginLoans(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.marginLoans(paramMap).execute().body());
    }

    public ResponseResult positionTier(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.positionTier(paramMap).execute().body());
    }

    public ResponseResult openInterestLimit(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.openInterestLimit(paramMap).execute().body());
    }
}
