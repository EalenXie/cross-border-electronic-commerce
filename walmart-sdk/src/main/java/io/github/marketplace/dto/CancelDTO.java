package io.github.marketplace.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.marketplace.vo.OrderCancellation;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/3/21 14:11
 */
@NoArgsConstructor
@Data
public class CancelDTO {

    @JsonProperty("orderCancellation")
    private OrderCancellation orderCancellation;
}
