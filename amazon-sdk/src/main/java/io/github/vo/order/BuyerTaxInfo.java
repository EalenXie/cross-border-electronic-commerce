package io.github.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class BuyerTaxInfo {
    @JsonProperty("CompanyLegalName")
    private String companyLegalName;
    @JsonProperty("TaxingRegion")
    private String taxingRegion;
    @JsonProperty("TaxClassifications")
    private List<TaxClassification> taxClassifications;
}