package com.bitget.openapi.ws;

import com.alibaba.fastjson2.JSONObject;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.common.utils.BitgetConsts;
import com.bitget.openapi.dto.request.ws.SubscribeReq;

import java.util.ArrayList;
import java.util.List;

public class BitgetWsClientTest extends BaseTest {

    public static void main(String[] args) throws InterruptedException {
        BitgetWsClient client = BitgetWsHandle.builder()
                .pushUrl(BitgetConsts.PUSH_URL)
                .apiKey(apiKey)
                .secretKey(secretKey)
                .passPhrase(passphrase)
                .isLogin(true)
                .listener(response -> {
                    JSONObject json = JSONObject.parseObject(response);
                    System.out.println("def:" + json);
                }).errorListener(response -> {
                    JSONObject json = JSONObject.parseObject(response);
                    System.out.println("error:" + json);
                }).build();

        client.subscribe(List.of(
            SubscribeReq.builder().instType("UTA").topic("position").build(),
            SubscribeReq.builder().instType("UTA").topic("order").build())
        );

        while (true) {
            Thread.sleep(1000);
        }

    }
}
