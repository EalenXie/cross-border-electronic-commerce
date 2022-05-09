package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by EalenXie on 2022/5/7 10:52
 */
@NoArgsConstructor
@Data
public class ReferencedPayoutsItems {
    @JsonProperty("referenced_payouts")
    private List<ReferencedPayouts> referencedPayouts;
    @JsonProperty("payout_directive")
    private PayoutDirective payoutDirective;
    @JsonProperty("links")
    private List<Links> links;
}
