package com.bitget.openapi.dto.response.uta;

import lombok.Data;

import java.util.List;

@Data
public class UtaOrderHistoryData {
    private List<UtaOrderHistory> list;
    private String cursor;
}
