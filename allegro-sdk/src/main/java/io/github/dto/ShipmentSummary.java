package io.github.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ShipmentSummary {
    @JsonProperty("lineItemsSent")
    private String lineItemsSent;
}