package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/6/1 10:59
 */
@Getter
@Setter
public class FundsSummaryVO {
    @JsonProperty("totalFunds")
    private TotalFunds totalFunds;
    @JsonProperty("processingFunds")
    private TotalFunds processingFunds;
    @JsonProperty("availableFunds")
    private TotalFunds availableFunds;
}
