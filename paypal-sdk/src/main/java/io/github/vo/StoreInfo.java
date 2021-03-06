package io.github.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class StoreInfo {

    @JsonProperty("store_id")
    private String storeId;

    @JsonProperty("terminal_id")
    private String terminalId;
}
