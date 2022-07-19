package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/6/1 10:59
 */
@NoArgsConstructor
@Data
public class TotalFunds {
    @JsonProperty("value")
    private String value;
    @JsonProperty("currency")
    private String currency;
}
