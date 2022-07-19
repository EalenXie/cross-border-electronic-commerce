package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/5/31 15:43
 */
@NoArgsConstructor
@Data
public class PayoutInstrument {
    @JsonProperty("instrumentType")
    private String instrumentType;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("accountLastFourDigits")
    private String accountLastFourDigits;
}
