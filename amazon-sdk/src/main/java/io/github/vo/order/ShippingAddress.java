package io.github.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ShippingAddress {
    @JsonProperty("Name")
    private String name;
    @JsonProperty("AddressLine1")
    private String addressLine1;
    @JsonProperty("AddressLine2")
    private String addressLine2;
    @JsonProperty("AddressLine3")
    private String addressLine3;
    @JsonProperty("City")
    private String city;
    @JsonProperty("County")
    private String county;
    @JsonProperty("District")
    private String district;
    @JsonProperty("StateOrRegion")
    private String stateOrRegion;
    @JsonProperty("Municipality")
    private String municipality;
    @JsonProperty("PostalCode")
    private String postalCode;
    @JsonProperty("CountryCode")
    private String countryCode;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("AddressType")
    private String addressType;
}