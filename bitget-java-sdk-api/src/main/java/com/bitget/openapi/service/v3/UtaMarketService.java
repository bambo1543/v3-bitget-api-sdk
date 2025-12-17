package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaMarketApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.request.uta.UtaCandlesReq;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.dto.response.uta.UtaCandlesResp;
import com.bitget.openapi.dto.response.uta.UtaTickersResp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UtaMarketService {

    private final UtaMarketApi utaMarketApi;

    public UtaMarketService(ApiClient client) {
        utaMarketApi = client.create(UtaMarketApi.class);
    }

    public ResponseResult instruments(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.instruments(paramMap).execute().body());
    }

    public UtaTickersResp tickers(Map<String, String> paramMap) throws IOException {
        UtaTickersResp resp = utaMarketApi.tickers(paramMap).execute().body();
        ResponseUtils.handleResponse(resp);
        return resp;
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

    public UtaCandlesResp candles(UtaCandlesReq request) throws IOException {
        Map<String, String> params = buildCandlesParams(request);
        UtaCandlesResp resp = utaMarketApi.candles(params).execute().body();
        ResponseUtils.handleResponse(resp);
        return resp;
    }

    public UtaCandlesResp historyCandles(UtaCandlesReq request) throws IOException {
        Map<String, String> params = buildCandlesParams(request);
        UtaCandlesResp resp = utaMarketApi.historyCandles(params).execute().body();
        ResponseUtils.handleResponse(resp);
        return resp;
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

    private Map<String, String> buildCandlesParams(UtaCandlesReq request) {
        Objects.requireNonNull(request, "request is required");

        Map<String, String> params = new HashMap<>();
        params.put("category", Objects.requireNonNull(request.getCategory(), "category is required"));
        params.put("symbol", Objects.requireNonNull(request.getSymbol(), "symbol is required"));
        params.put("interval", Objects.requireNonNull(request.getInterval(), "interval is required"));

        if (request.getStartTime() != null) {
            params.put("startTime", request.getStartTime());
        }
        if (request.getEndTime() != null) {
            params.put("endTime", request.getEndTime());
        }
        if (request.getType() != null) {
            params.put("type", request.getType());
        }
        if (request.getLimit() != null) {
            params.put("limit", request.getLimit());
        }

        return params;
    }
}
