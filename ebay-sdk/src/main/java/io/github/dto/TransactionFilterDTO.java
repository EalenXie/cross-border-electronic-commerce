package io.github.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/31 10:50
 */
@Getter
@Setter
public class TransactionFilterDTO implements EbayFilterDTO {

    /**
     * 格式为 [2018-10-23T00:00:01.000Z..2018-11-09T00:00:01.000Z]
     */
    private String transactionDate;
    private String transactionType;
    private String transactionStatus;
    private String buyerUsername;
    private String salesRecordReference;
    private String payoutId;
    private String transactionId;
    private String orderId;

}
