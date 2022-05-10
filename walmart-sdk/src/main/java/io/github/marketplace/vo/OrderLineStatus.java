package io.github.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/5/10 12:45
 */
@NoArgsConstructor
@Data
public class OrderLineStatus {
    @JsonProperty("status")
    private String status;
    @JsonProperty("cancellationReason")
    private String cancellationReason;
    @JsonProperty("statusQuantity")
    private StatusQuantity statusQuantity;
}
