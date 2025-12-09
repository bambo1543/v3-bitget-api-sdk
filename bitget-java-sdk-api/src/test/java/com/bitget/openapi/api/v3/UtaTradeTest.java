package com.bitget.openapi.api.v3;

import com.alibaba.fastjson2.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.dto.request.uta.UtaCancelOrderReq;
import com.bitget.openapi.dto.request.uta.UtaPlaceOrderReq;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.dto.response.uta.UtaPositionInfoResp;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

public class UtaTradeTest extends BaseTest {

    @Test
    public void placeAndCancelOrder() throws IOException {
        try {
            String uuid = UUID.randomUUID().toString().replace("-", "");

//            Map<String, String> paramMap = Maps.newHashMap();
//            paramMap.put("category", "USDT-FUTURES");
//            paramMap.put("symbol", "ETHUSDT");
//            paramMap.put("qty", "1.0");
//            paramMap.put("side", "buy");
//            paramMap.put("posSide", "long");
//            paramMap.put("orderType", "limit");
//            paramMap.put("price", "100.0");
//            paramMap.put("clientOid", uuid);
//            ResponseResult result = bitgetRestClient.bitget().v3().trade().placeOrder(paramMap);

            UtaPlaceOrderReq placeOrderReq = UtaPlaceOrderReq.builder().category("USDT-FUTURES").symbol("ETHUSDT").clientOid(uuid)
                    .qty("1.0").side("buy").posSide("long").orderType("limit").price("100.0").build();
            ResponseResult response = bitgetRestClient.bitget().v3().trade().placeOrder(placeOrderReq);
            assetResponse(response);
            System.out.println(JSON.toJSONString(response));

//            UtaCancelAllOrdersReq req = UtaCancelAllOrdersReq.builder().category("USDT-FUTURES").symbol("ETHUSDT").build();
//            result = bitgetRestClient.bitget().v3().trade().cancelAllOrders(req);
            UtaCancelOrderReq cancelOrderReq = UtaCancelOrderReq.builder().clientOid(uuid).build();
            response = bitgetRestClient.bitget().v3().trade().cancelOrder(cancelOrderReq);
            assetResponse(response);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }

    @Test
    public void getPositionInfo() throws IOException {
//        ResponseResult result = bitgetRestClient.bitget().v3().trade().placeOrder(
//                UtaPlaceOrderReq.builder().category("USDT-FUTURES").symbol("ETHUSDT").clientOid(UUID.randomUUID().toString())
//                .qty("0.01").side("buy").posSide("long").orderType("market").build());

        UtaPositionInfoResp resp = bitgetRestClient.bitget().v3().trade()
                .getPositionInfo(Map.of("category", "USDT-FUTURES", "symbol", "ETHUSDT"));
        assetResponse(resp);
        System.out.println(JSON.toJSONString(resp));
    }

    private static void assetResponse(ResponseResult resp) {
        Assert.assertNotNull(resp);
        Assert.assertEquals("00000", resp.getCode());
        Assert.assertEquals("200", resp.getHttpCode());
        Assert.assertEquals("success", resp.getMsg());
    }
}
