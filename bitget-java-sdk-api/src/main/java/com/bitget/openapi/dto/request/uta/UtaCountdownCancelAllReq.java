package com.bitget.openapi.dto.request.uta;

import lombok.*;

/**
 * Request for countdown cancel all.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtaCountdownCancelAllReq {

    /**
     * Countdown window in seconds (5-60). 0 disables countdown cancel.
     */
    @NonNull
    private String countdown;
}
