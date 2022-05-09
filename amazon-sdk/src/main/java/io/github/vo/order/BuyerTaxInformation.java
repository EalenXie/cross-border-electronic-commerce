package io.github.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BuyerTaxInformation {
    @JsonProperty("BuyerLegalCompanyName")
    private String buyerLegalCompanyName;
    @JsonProperty("BuyerBusinessAddress")
    private String buyerBusinessAddress;
    @JsonProperty("BuyerTaxRegistrationId")
    private String buyerTaxRegistrationId;
    @JsonProperty("BuyerTaxOffice")
    private String buyerTaxOffice;
}