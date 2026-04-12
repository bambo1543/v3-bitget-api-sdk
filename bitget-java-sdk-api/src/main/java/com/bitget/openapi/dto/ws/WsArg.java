package com.bitget.openapi.dto.ws;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class WsArg {

    @JsonProperty("instType")
    private String instType;

    @JsonProperty("topic")
    private String topic;

}
