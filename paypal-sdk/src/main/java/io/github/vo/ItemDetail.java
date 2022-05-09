package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
/**
 * 商品详情
 *
 * By Ashe
 */
@NoArgsConstructor
@Data
public class ItemDetail {

    /**
     * 商品代码
     */
    @JsonProperty("item_code")
    private String itemCode;

    /**
     * 商品名称
     */
    @JsonProperty("item_name")
    private String itemName;

    /**
     * 商品描述
     */
    @JsonProperty("item_description")
    private String itemDescription;

    /**
     * 详细地描述关于购买物品的选项选择
     */
    @JsonProperty("item_options")
    private String itemOptions;

    /**
     * 商品数量
     */
    @JsonProperty("item_quantity")
    private String itemQuantity;

    /**
     * 商品单价
     */
    @JsonProperty("item_unit_price")
    private TransactionAmount itemUnitPrice;

    /**
     * 商品金额
     */
    @JsonProperty("item_amount")
    private TransactionAmount itemAmount;

    /**
     * 折扣金额
     */
    @JsonProperty("discount_amount")
    private TransactionAmount discountAmount;

    /**
     * 调整金额
     */
    @JsonProperty("adjustment_amount")
    private TransactionAmount adjustmentAmount;

    /**
     * 礼品包装金额
     */
    @JsonProperty("gift_wrap_amount")
    private TransactionAmount giftWrapAmount;

    /**
     * 税率
     */
    @JsonProperty("tax_percentage")
    private String taxPercentage;

    /**
     * 商品税额
     */
    @JsonProperty("tax_amounts")
    private List<TransactionAmount> taxAmounts;

    /**
     * 基本运费
     */
    @JsonProperty("basic_shipping_amount")
    private TransactionAmount basicShippingAmount;

    /**
     * 额外运费
     */
    @JsonProperty("extra_shipping_amount")
    private TransactionAmount extraShippingAmount;

    /**
     * 购买商品或服务的费用
     */
    @JsonProperty("handling_amount")
    private TransactionAmount handlingAmount;

    /**
     * 保险金额
     */
    @JsonProperty("insurance_amount")
    private TransactionAmount insuranceAmount;

    /**
     * 商品总金额
     */
    @JsonProperty("total_item_amount")
    private TransactionAmount totalItemAmount;

    /**
     * 发票号码。标识商家帐单的字母数字字符串。
     */
    @JsonProperty("invoice_number")
    private String invoiceNumber;

    /**
     * 结帐操作
     */
    @JsonProperty("checkout_options")
    private List<CheckoutOption> checkoutOptions;



}
