package com.bitget.openapi.api.v3;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.ws.BitgetWsClient;
import com.bitget.openapi.ws.BitgetWsHandle;

import static com.bitget.openapi.common.utils.BitgetConsts.PUSH_URL;

public class WsListener extends BaseTest {

    public static void main(String[] args1) {
        BitgetWsClient client = BitgetWsHandle.builder()
                .pushUrl(PUSH_URL)
                .apiKey(apiKey)
                .secretKey(secretKey)
                .passPhrase(passphrase)
                .isLogin(true)
                .listener(response -> {
                    JSONObject json = JSONObject.parseObject(response);
                    System.out.println("def:" + json);
//                    dispatchWsEvent(json);
                }).errorListener(response -> {
                    JSONObject json = JSONObject.parseObject(response);
                    System.out.println("error:" + json);
                }).build();

        // Send raw subscribe payload to match the documented UTA private websocket schema.
        JSONObject subscribe = new JSONObject();
        subscribe.put("op", "subscribe");
        JSONArray args = new JSONArray();
            args.add(new JSONObject() {{ put("instType", "UTA"); put("topic", "account"); }});
        args.add(new JSONObject() {{ put("instType", "UTA"); put("topic", "position"); }});
            args.add(new JSONObject() {{ put("instType", "UTA"); put("topic", "fill"); }});
        args.add(new JSONObject() {{ put("instType", "UTA"); put("topic", "order"); }});
        subscribe.put("args", args);
        client.sendMessage(subscribe.toJSONString());

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
