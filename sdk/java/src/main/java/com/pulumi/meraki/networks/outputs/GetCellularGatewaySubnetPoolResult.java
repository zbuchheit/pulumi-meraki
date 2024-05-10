// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetCellularGatewaySubnetPoolItem;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCellularGatewaySubnetPoolResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetCellularGatewaySubnetPoolItem item;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private String networkId;

    private GetCellularGatewaySubnetPoolResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetCellularGatewaySubnetPoolItem item() {
        return this.item;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCellularGatewaySubnetPoolResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetCellularGatewaySubnetPoolItem item;
        private String networkId;
        public Builder() {}
        public Builder(GetCellularGatewaySubnetPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.networkId = defaults.networkId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewaySubnetPoolResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetCellularGatewaySubnetPoolItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewaySubnetPoolResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewaySubnetPoolResult", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        public GetCellularGatewaySubnetPoolResult build() {
            final var _resultValue = new GetCellularGatewaySubnetPoolResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.networkId = networkId;
            return _resultValue;
        }
    }
}
