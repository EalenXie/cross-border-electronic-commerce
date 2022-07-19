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
public class Transaction {
    /**
     * 交易号
     */
    @JsonProperty("transactionId")
    private String transactionId;

    /**
     * 交易时间
     */
    @JsonProperty("transactionDate")
    private String transactionDate;


    /**
     * 订单编号
     */
    @JsonProperty("orderId")
    private String orderId;

    /**
     * 发款编号
     */
    @JsonProperty("payoutId")
    private String payoutId;
    /**
     *
     */
    @JsonProperty("salesRecordReference")
    private String salesRecordReference;
    @JsonProperty("transactionType")
    private String transactionType;

    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("bookingEntry")
    private String bookingEntry;

    /**
     *
     */
    @JsonProperty("transactionStatus")
    private String transactionStatus;
    @JsonProperty("paymentsEntity")
    private String paymentsEntity;
    @JsonProperty("references")
    private List<References> references;
    /**
     * 费用类型
     */
    @JsonProperty("feeType")
    private String feeType;
    /**
     * 购买人信息
     */
    @JsonProperty("buyer")
    private Buyer buyer;
    @JsonProperty("totalFeeBasisAmount")
    private Amount totalFeeBasisAmount;
    @JsonProperty("totalFeeAmount")
    private Amount totalFeeAmount;
    @JsonProperty("orderLineItems")
    private List<OrderLineItems> orderLineItems;
}
