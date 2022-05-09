package io.github.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class OrderItem {
    @JsonProperty("orderItemId")
    private String orderItemId;
    @JsonProperty("quantity")
    private Integer quantity;
}