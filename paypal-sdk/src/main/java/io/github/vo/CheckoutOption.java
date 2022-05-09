package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 结帐选项
 *
 * By Ashe
 */
@NoArgsConstructor
@Data
public class CheckoutOption {

    /**
     * 结帐操作名称
     */
    @JsonProperty("checkout_option_name")
    private String checkoutOptionName;

    /**
     * 结帐操作值
     */
    @JsonProperty("checkout_option_value")
    private String checkoutOptionValue;
}
