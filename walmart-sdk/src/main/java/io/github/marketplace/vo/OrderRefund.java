package io.github.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/5/10 12:44
 */
@NoArgsConstructor
@Data
public class OrderRefund {
    @JsonProperty("purchaseOrderId")
    private String purchaseOrderId;
    @JsonProperty("orderLines")
    private OrderLines orderLines;
}
