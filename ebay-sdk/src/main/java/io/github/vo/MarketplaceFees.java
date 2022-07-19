package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/5/31 14:19
 */
@NoArgsConstructor
@Data
public class MarketplaceFees {
    @JsonProperty("feeType")
    private String feeType;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("feeMemo")
    private String feeMemo;
}
