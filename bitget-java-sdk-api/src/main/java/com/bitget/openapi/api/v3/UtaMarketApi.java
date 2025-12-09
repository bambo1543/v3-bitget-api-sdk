package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface UtaMarketApi {

    @GET("/api/v3/market/instruments")
    Call<ResponseResult> instruments(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/tickers")
    Call<ResponseResult> tickers(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/orderbook")
    Call<ResponseResult> orderBook(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/fills")
    Call<ResponseResult> fills(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/proof-of-reserves")
    Call<ResponseResult> proofOfReserves(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/open-interest")
    Call<ResponseResult> openInterest(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/candles")
    Call<ResponseResult> candles(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/history-candles")
    Call<ResponseResult> historyCandles(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/current-fund-rate")
    Call<ResponseResult> currentFundingRate(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/history-fund-rate")
    Call<ResponseResult> historyFundingRate(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/risk-reserve")
    Call<ResponseResult> riskReserve(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/discount-rate")
    Call<ResponseResult> discountRate(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/margin-loans")
    Call<ResponseResult> marginLoans(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/position-tier")
    Call<ResponseResult> positionTier(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/oi-limit")
    Call<ResponseResult> openInterestLimit(@QueryMap Map<String, String> paramMap);

}
