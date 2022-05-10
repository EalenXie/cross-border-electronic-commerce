package io.github.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AutomatedShippingSettings {
    @JsonProperty("HasAutomatedShippingSettings")
    private Boolean hasAutomatedShippingSettings;
    @JsonProperty("AutomatedCarrier")
    private String automatedCarrier;
    @JsonProperty("AutomatedShipMethod")
    private String automatedShipMethod;
}