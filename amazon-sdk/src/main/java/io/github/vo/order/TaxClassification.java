package io.github.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TaxClassification {
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private String value;
}