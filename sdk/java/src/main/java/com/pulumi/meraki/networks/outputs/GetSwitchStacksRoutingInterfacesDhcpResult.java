// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSwitchStacksRoutingInterfacesDhcpItem;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchStacksRoutingInterfacesDhcpResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return interfaceId path parameter. Interface ID
     * 
     */
    private String interfaceId;
    private GetSwitchStacksRoutingInterfacesDhcpItem item;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private String networkId;
    /**
     * @return switchStackId path parameter. Switch stack ID
     * 
     */
    private String switchStackId;

    private GetSwitchStacksRoutingInterfacesDhcpResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return interfaceId path parameter. Interface ID
     * 
     */
    public String interfaceId() {
        return this.interfaceId;
    }
    public GetSwitchStacksRoutingInterfacesDhcpItem item() {
        return this.item;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }
    /**
     * @return switchStackId path parameter. Switch stack ID
     * 
     */
    public String switchStackId() {
        return this.switchStackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchStacksRoutingInterfacesDhcpResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String interfaceId;
        private GetSwitchStacksRoutingInterfacesDhcpItem item;
        private String networkId;
        private String switchStackId;
        public Builder() {}
        public Builder(GetSwitchStacksRoutingInterfacesDhcpResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.interfaceId = defaults.interfaceId;
    	      this.item = defaults.item;
    	      this.networkId = defaults.networkId;
    	      this.switchStackId = defaults.switchStackId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesDhcpResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder interfaceId(String interfaceId) {
            if (interfaceId == null) {
              throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesDhcpResult", "interfaceId");
            }
            this.interfaceId = interfaceId;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetSwitchStacksRoutingInterfacesDhcpItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesDhcpResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesDhcpResult", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder switchStackId(String switchStackId) {
            if (switchStackId == null) {
              throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesDhcpResult", "switchStackId");
            }
            this.switchStackId = switchStackId;
            return this;
        }
        public GetSwitchStacksRoutingInterfacesDhcpResult build() {
            final var _resultValue = new GetSwitchStacksRoutingInterfacesDhcpResult();
            _resultValue.id = id;
            _resultValue.interfaceId = interfaceId;
            _resultValue.item = item;
            _resultValue.networkId = networkId;
            _resultValue.switchStackId = switchStackId;
            return _resultValue;
        }
    }
}
