package io.github.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Payment {
    @JsonProperty("CurrencyCode")
    private String currencyCode;
    @JsonProperty("Amount")
    private String amount;
}