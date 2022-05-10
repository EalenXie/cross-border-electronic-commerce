package io.github.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/5/10 12:45
 */
@NoArgsConstructor
@Data
public class OrderCancellation {
    @JsonProperty("orderLines")
    private OrderLines orderLines;
}
