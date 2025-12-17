package com.bitget.openapi.api.v3;

import com.alibaba.fastjson2.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.BitgetApiFacade;
import com.bitget.openapi.dto.request.uta.UtaCandlesReq;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.dto.response.uta.UtaCandlesResp;
import com.bitget.openapi.dto.response.uta.UtaFundingAsset;
import com.bitget.openapi.dto.response.uta.UtaFundingAssetsResp;
import com.bitget.openapi.dto.response.uta.UtaTickersResp;
import com.bitget.openapi.service.v3.UtaAccountService;
import com.bitget.openapi.service.v3.UtaMarketService;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

public class UtaMarketTest extends BaseTest {

    private UtaMarketService marketService;

    @Override
    public void setup() {
        super.setup();
        BitgetApiFacade.BgEndpointV3 utaEndpoint = bitgetRestClient.bitget().v3();
        marketService = utaEndpoint.market();
    }

    @Test
    public void instrumentsTest() throws IOException {
        try {
            ResponseResult<?> result = marketService.instruments(Map.of("category", "USDT-FUTURES", "symbol", "ETHUSDT"));
            System.out.println(JSON.toJSONString(result));
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }

    @Test
    public void tickersTest() throws IOException {
        UtaTickersResp response = marketService.tickers(Map.of("category", "USDT-FUTURES", "symbol", "ETHUSDT"));
        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void candlesTest() throws IOException {
        long endTime = System.currentTimeMillis();
        long startTime = endTime - 3_600_000L; // last hour
        UtaCandlesReq request = UtaCandlesReq.builder()
                .category("USDT-FUTURES")
                .symbol("ETHUSDT")
                .interval("15m")
                .startTime(String.valueOf(startTime))
                .endTime(String.valueOf(endTime))
                .build();

        UtaCandlesResp response = marketService.candles(request);
        System.out.println(JSON.toJSONString(response));
    }
}
