package io.github.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/5/10 12:44
 */
@NoArgsConstructor
@Data
public class RefundCharge {
    @JsonProperty("refundReason")
    private String refundReason;
    @JsonProperty("charge")
    private Charge charge;
}
