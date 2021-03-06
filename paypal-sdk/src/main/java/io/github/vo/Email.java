package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小小怪下士
 * @version 1.0.0
 */
@NoArgsConstructor
@Data
public class Email {
    @JsonProperty("value")
    private String value;
    @JsonProperty("primary")
    private Boolean primary;
}
