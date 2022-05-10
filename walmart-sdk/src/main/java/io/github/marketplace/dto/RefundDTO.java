package io.github.marketplace.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.marketplace.vo.OrderRefund;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/3/21 13:40
 */
@NoArgsConstructor
@Data
public class RefundDTO {

    @JsonProperty("orderRefund")
    private OrderRefund orderRefund;
}
