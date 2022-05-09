package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/5/7 10:53
 */
@NoArgsConstructor
@Data
public class ProcessingState {
    @JsonProperty("status")
    private String status;
}
