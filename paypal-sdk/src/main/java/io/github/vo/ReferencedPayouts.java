package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by EalenXie on 2022/5/7 10:53
 */
@NoArgsConstructor
@Data
public class ReferencedPayouts {
    @JsonProperty("item_id")
    private String itemId;
    @JsonProperty("processing_state")
    private ProcessingState processingState;
    @JsonProperty("reference_id")
    private String referenceId;
    @JsonProperty("reference_type")
    private String referenceType;
    @JsonProperty("payout_amount")
    private PayoutAmount payoutAmount;
    @JsonProperty("payout_destination")
    private String payoutDestination;
    @JsonProperty("payout_transaction_id")
    private String payoutTransactionId;
    @JsonProperty("disbursement_transaction_id")
    private String disbursementTransactionId;
    @JsonProperty("links")
    private List<Links> links;
}
