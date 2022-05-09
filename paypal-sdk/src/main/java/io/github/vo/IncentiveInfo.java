package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class IncentiveInfo {

    /**
     * 激励详情
     */
    @JsonProperty("incentive_details")
    private List<IncentiveDetail> incentiveDetails;
}
