package io.github.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by EalenXie on 2022/5/10 12:44
 */
@NoArgsConstructor
@Data
public class OrderLines {
    @JsonProperty("orderLine")
    private List<OrderLine> orderLine;
}
