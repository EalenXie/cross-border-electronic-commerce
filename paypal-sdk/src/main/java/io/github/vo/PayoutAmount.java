package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/5/7 10:53
 */
@NoArgsConstructor
@Data
public class PayoutAmount {
    @JsonProperty("currency_code")
    private String currencyCode;
    @JsonProperty("value")
    private String value;
}
