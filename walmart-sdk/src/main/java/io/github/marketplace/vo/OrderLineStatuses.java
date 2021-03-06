package io.github.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by EalenXie on 2022/5/10 12:45
 */
@NoArgsConstructor
@Data
public class OrderLineStatuses {
    @JsonProperty("orderLineStatus")
    private List<OrderLineStatus> orderLineStatus;
}
