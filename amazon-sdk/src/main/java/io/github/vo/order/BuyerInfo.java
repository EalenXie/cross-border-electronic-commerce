package io.github.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BuyerInfo {
    @JsonProperty("BuyerEmail")
    private String buyerEmail;
    @JsonProperty("BuyerName")
    private String buyerName;
    @JsonProperty("BuyerCounty")
    private String buyerCounty;
    @JsonProperty("BuyerTaxInfo")
    private BuyerTaxInfo buyerTaxInfo;
    @JsonProperty("PurchaseOrderNumber")
    private String purchaseOrderNumber;
}