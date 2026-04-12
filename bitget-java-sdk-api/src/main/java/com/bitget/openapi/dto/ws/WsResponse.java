package com.bitget.openapi.dto.ws;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//result = {JSONObject@17319}  size = 4
//        "action" -> "snapshot"
//key = "action"
//value = "snapshot"
//        "arg" -> {JSONObject@17328}  size = 2
//key = "arg"
//value = {JSONObject@17328}  size = 2
//        "data" -> {JSONArray@17329}  size = 1
//key = "data"
//value = {JSONArray@17329}  size = 1
//        "ts" -> {Long@17330} 1775728370017
//key = "ts"
//value = {Long@17330} 1775728370017

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class WsResponse<T> {

    @JsonProperty("action")
    private String action;

    @JsonProperty("arg")
    private WsArg arg;

    @JsonProperty("ts")
    private long time;

    @JsonProperty("data")
    private T data;

}
