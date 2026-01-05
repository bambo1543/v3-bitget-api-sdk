package com.bitget.openapi.dto.response.uta;

import lombok.Data;

import java.util.List;

@Data
public class UtaOpenOrdersData {
    private List<UtaOpenOrder> list;
    private String cursor;
}
