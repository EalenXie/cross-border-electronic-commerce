package io.github.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/5/10 12:44
 */
@NoArgsConstructor
@Data
public class Charge {
    @JsonProperty("chargeType")
    private String chargeType;
    @JsonProperty("chargeName")
    private String chargeName;
    @JsonProperty("chargeAmount")
    private ChargeAmount chargeAmount;
    @JsonProperty("tax")
    private Tax tax;
}
