package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by EalenXie on 2022/5/31 14:19
 */
@NoArgsConstructor
@Data
public class OrderLineItems {
    @JsonProperty("lineItemId")
    private String lineItemId;
    @JsonProperty("feeBasisAmount")
    private Amount feeBasisAmount;
    @JsonProperty("marketplaceFees")
    private List<MarketplaceFees> marketplaceFees;
}
