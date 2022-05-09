package io.github.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class MarketplaceTaxInfo {
    @JsonProperty("TaxClassifications")
    private List<TaxClassification> taxClassifications;
}