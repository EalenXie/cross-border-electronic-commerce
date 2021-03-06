package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@NoArgsConstructor
@Data
public class TransactionTax {
    @JsonProperty("tax_amount_in_merchant_currency")
    private Amount taxAmountInMerchantCurrency;
    @JsonProperty("tax_amount_in_authority_currency")
    private Amount taxAmountInAuthorityCurrency;
    @JsonProperty("tax_type")
    private String taxType;
    @JsonProperty("remit_type")
    private String remitType;
}
