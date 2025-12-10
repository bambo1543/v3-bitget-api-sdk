package com.bitget.openapi.api.v3;

import com.bitget.openapi.BaseTest;
import com.bitget.openapi.BitgetApiFacade;
import com.bitget.openapi.dto.response.uta.UtaAccountInfoResp;
import com.bitget.openapi.dto.response.uta.UtaFundingAsset;
import com.bitget.openapi.dto.response.uta.UtaFundingAssetsResp;
import com.bitget.openapi.service.v3.UtaAccountService;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

public class UtaAccountTest extends BaseTest {

    private UtaAccountService accountService;

    @Override
    public void setup() {
        super.setup();
        BitgetApiFacade.BgEndpointV3 utaEndpoint = bitgetRestClient.bitget().v3();
        accountService = utaEndpoint.account();
    }
    @Test
    public void accountAssetsTest() throws IOException {
        UtaAccountInfoResp utaAccountInfoResp = accountService.getAccountAssets(Map.of());
        utaAccountInfoResp.getData().getAssets().stream().filter(o->o.getCoin().equals("USDT")).findFirst()
                .ifPresent(utaAccountAsset -> System.out.println(utaAccountAsset.getAvailable()));
    }

}
