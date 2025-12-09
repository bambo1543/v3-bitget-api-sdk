package com.bitget.openapi.api.v3;

import com.alibaba.fastjson2.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.dto.response.uta.UtaTickersResp;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

public class UtaMarketTest extends BaseTest {

    @Test
    public void instrumentsTest() throws IOException {
        try {
            Map<String, String> paramMap = Maps.newHashMap();
            paramMap.put("category", "USDT-FUTURES");
            paramMap.put("symbol", "BIOUSDT");
            ResponseResult result = bitgetRestClient.bitget().v3().market().instruments(paramMap);
            System.out.println(JSON.toJSONString(result));
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }

    @Test
    public void tickersTest() throws IOException {
        UtaTickersResp response = bitgetRestClient.bitget().v3().market().tickers(Map.of("category", "USDT-FUTURES", "symbol", "ETHUSDT"));
        System.out.println(JSON.toJSONString(response));
    }
}
