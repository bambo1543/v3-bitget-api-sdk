package com.bitget.openapi.api.v3;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.dto.response.ResponseResult;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

public class TradeTest extends BaseTest {

    @Test
    public void placeOrder() throws IOException {
        try {
            Map<String, String> paramMap = Maps.newHashMap();
            paramMap.put("category", "USDT-FUTURES");
            paramMap.put("symbol", "ETHUSDT");
            paramMap.put("qty", "0.01");
            paramMap.put("side", "buy");
            paramMap.put("orderType", "market");
            paramMap.put("posSide", "long");
            String uuid = UUID.randomUUID().toString().replace("-", "");
            paramMap.put("clientOid", uuid);
            ResponseResult result = bitgetRestClient.bitget().v3().trade().placeOrder(paramMap);
            System.out.println(JSON.toJSONString(result));
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
    @Test
    public void cancelAllOrders() throws IOException {
        try {
            Map<String, String> paramMap = Maps.newHashMap();
            paramMap.put("category", "USDT-FUTURES");
//            paramMap.put("symbol", "ETHUSDT");
            ResponseResult result = bitgetRestClient.bitget().v3().trade().cancelAllOrders(paramMap);
            System.out.println(JSON.toJSONString(result));
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
}
