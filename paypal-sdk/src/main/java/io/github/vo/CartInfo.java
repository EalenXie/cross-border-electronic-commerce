package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class CartInfo {

    @JsonProperty("tax_inclusive")
    private String taxInclusive;

    @JsonProperty("paypal_invoice_id")
    private String paypalInvoiceId;

    /**
     * 商品详情
     */
    @JsonProperty("item_details")
    private List<ItemDetail> itemDetails;

}
