package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/5/7 10:53
 */
@NoArgsConstructor
@Data
public class PayoutDirective {
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("type")
    private String type;
}
