package com.bitget.openapi.api.v3;

import com.alibaba.fastjson2.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.BitgetApiFacade;
import com.bitget.openapi.dto.request.uta.UtaCancelOrderReq;
import com.bitget.openapi.dto.request.uta.UtaClosePositionsReq;
import com.bitget.openapi.dto.request.uta.UtaPlaceOrderReq;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.dto.response.uta.UtaPositionInfoResp;
import com.bitget.openapi.dto.response.uta.UtaTicker;
import com.bitget.openapi.dto.response.uta.UtaTickersResp;
import com.bitget.openapi.service.v3.UtaMarketService;
import com.bitget.openapi.service.v3.UtaTradeService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class UtaTradeTest extends BaseTest {

    private UtaTradeService tradeService;
    private UtaMarketService marketService;

    @Override
    public void setup() {
        super.setup();
        BitgetApiFacade.BgEndpointV3 utaEndpoint = bitgetRestClient.bitget().v3();
        tradeService = utaEndpoint.trade();
        marketService = utaEndpoint.market();
    }

    @Test
    public void placeAndCancelOrder() throws IOException {
        try {
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

            UtaPlaceOrderReq placeOrderReq = UtaPlaceOrderReq.builder().category("USDT-FUTURES").symbol("ETHUSDT").clientOid(UUID.randomUUID().toString())
                    .posSide("long").side("buy").qty("1.0").orderType("limit").price("100.0").stopLoss("90.0").build();
            ResponseResult<Map<String, String>> response = tradeService.placeOrder(placeOrderReq);
            assetResponse(response);
            System.out.println(JSON.toJSONString(response));

//            UtaCancelAllOrdersReq req = UtaCancelAllOrdersReq.builder().category("USDT-FUTURES").symbol("ETHUSDT").build();
//            result = bitgetRestClient.bitget().v3().trade().cancelAllOrders(req);
            UtaCancelOrderReq cancelOrderReq = UtaCancelOrderReq.builder().clientOid(response.getData().get("clientOid")).build();
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

    @Test
//    @Ignore
    public void createPositionSetTpAndCancelPosition() throws IOException {
        try {
            UtaTicker ticker = marketService.tickers(Map.of("category", "USDT-FUTURES", "symbol", "ETHUSDT")).getData().getFirst();
            double lastPrice = Double.parseDouble(ticker.getLastPrice());
            String slParam = getPriceAdjustedByFactor(lastPrice, 0.9);
            String tpParam = getPriceAdjustedByFactor(lastPrice, 1.5);
            UtaPlaceOrderReq placeOrderReq = UtaPlaceOrderReq.builder().category("USDT-FUTURES").symbol("ETHUSDT").clientOid(UUID.randomUUID().toString())
                    .posSide("long").side("buy").qty("0.05").orderType("market").stopLoss(slParam).takeProfit(tpParam).build();
            ResponseResult<Map<String, String>> response = tradeService.placeOrder(placeOrderReq);
            assetResponse(response);
            System.out.println(JSON.toJSONString(response));

            List<UtaPlaceOrderReq> list = new ArrayList<>();
            for(double i = 1; i <= 5; i++) {
                tpParam = getPriceAdjustedByFactor(lastPrice, 1 + i / 10.0);
                list.add(UtaPlaceOrderReq.builder().category("USDT-FUTURES")
                        .symbol("ETHUSDT").clientOid(UUID.randomUUID().toString())
                        .posSide("long").side("sell").qty("0.01").orderType("limit").price(tpParam).build());
//                response = tradeService.placeOrder(UtaPlaceOrderReq.builder().category("USDT-FUTURES")
//                        .symbol("ETHUSDT").clientOid(UUID.randomUUID().toString())
//                        .posSide("long").side("sell").qty("0.01").orderType("limit").price(tpParam).build());
//                System.out.println(JSON.toJSONString(response));
            }
            ResponseResult tpResponse = tradeService.placeBatchOrders(list);
            System.out.println(JSON.toJSONString(tpResponse));

            response = tradeService.closeAllPositions(UtaClosePositionsReq.builder().category("USDT-FUTURES").symbol("ETHUSDT").posSide("long").build());
            assetResponse(response);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }

    private static String getPriceAdjustedByFactor(double lastPrice, double factor) {
        return String.valueOf(BigDecimal.valueOf(lastPrice * factor).setScale(2, RoundingMode.HALF_UP));
    }

    private static void assetResponse(ResponseResult resp) {
        Assert.assertNotNull(resp);
        Assert.assertEquals("00000", resp.getCode());
        Assert.assertEquals("200", resp.getHttpCode());
        Assert.assertEquals("success", resp.getMsg());
    }
}
