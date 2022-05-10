package io.github.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PaymentExecutionDetail {
    @JsonProperty("Payment")
    private Payment payment;
    @JsonProperty("PaymentMethod")
    private String paymentMethod;
}