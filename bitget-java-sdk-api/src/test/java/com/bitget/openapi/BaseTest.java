package com.bitget.openapi;

import com.bitget.openapi.common.client.BitgetRestClient;
import com.bitget.openapi.common.domain.ClientParameter;
import com.bitget.openapi.common.enums.SignTypeEnum;
import com.bitget.openapi.common.enums.SupportedLocaleEnum;
import org.junit.After;
import org.junit.Before;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class BaseTest {

    /**
     * 用户 apiKey 替换成自己的
     */
//    private final String apiKey = "bg_5f05d28d7292dbf76f50572f7e4facaa";
    private final String apiKey = "bg_bccf0e62fd17daff2e85b763be7e1d7a";

    /**
     * 用户 secretKey 替换成自己的
     */
//    private final String secretKey = "fa1adb059174401b999915bb1f61b7ae2ec380a960cad44eef144ce682e7d850";
    private final String secretKey = "2cac5ac8ebaac14c929937113c6f6c19b5202874c2b50fc2291be1b7c60f1c41";

    /**
     * 口令 替换成自己的
     */
    private final String passphrase = "Bambo1543";

    /**
     * bitget open api 根路径
     */
    private final String baseUrl = "https://api.bitget.com";

    private final ClientParameter parameter = ClientParameter.builder()
            .apiKey(apiKey)
            .secretKey(secretKey)
            .passphrase(passphrase)
            .baseUrl(baseUrl)
//            .signType(SignTypeEnum.RSA) // 如果你的apikey是RSA类型则主动设置
            .locale(SupportedLocaleEnum.EN_US.getName())
            .build();
    public BitgetRestClient bitgetRestClient;

    @Before
    public void setup() {
        bitgetRestClient = BitgetRestClient.builder().configuration(parameter).build();
    }

    @After
    public void tearDown() {
    }
}
