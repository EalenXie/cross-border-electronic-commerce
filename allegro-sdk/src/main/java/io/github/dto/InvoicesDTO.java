package io.github.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by EalenXie on 2022/3/18 15:17
 */
@NoArgsConstructor
@Data
public class InvoicesDTO {


    @JsonProperty("file")
    private FileDTO file;
    @JsonProperty("invoiceNumber")
    private String invoiceNumber;

}
