package com.bitget.openapi.api.v3;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.dto.request.uta.UtaCancelOrderReq;
import com.bitget.openapi.dto.response.ResponseResult;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

public class UtaTradeTest extends BaseTest {

    @Test
    public void placeAndCancelOrder() throws IOException {
        try {
            Map<String, String> paramMap = Maps.newHashMap();
            paramMap.put("category", "USDT-FUTURES");
            paramMap.put("symbol", "ETHUSDT");
            paramMap.put("qty", "1.0");
            paramMap.put("side", "buy");
            paramMap.put("posSide", "long");
            paramMap.put("orderType", "limit");
            paramMap.put("price", "100.0");
            String uuid = UUID.randomUUID().toString().replace("-", "");
            paramMap.put("clientOid", uuid);
            ResponseResult result = bitgetRestClient.bitget().v3().trade().placeOrder(paramMap);
            System.out.println(JSON.toJSONString(result));

//            UtaCancelAllOrdersReq req = UtaCancelAllOrdersReq.builder().category("USDT-FUTURES").symbol("ETHUSDT").build();
//            result = bitgetRestClient.bitget().v3().trade().cancelAllOrders(req);
            UtaCancelOrderReq req = UtaCancelOrderReq.builder().clientOid(uuid).build();
            result = bitgetRestClient.bitget().v3().trade().cancelOrder(req);
            System.out.println(JSON.toJSONString(result));
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
}
