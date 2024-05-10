// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchStacksRoutingInterfacesItemIpv6 {
    /**
     * @return IPv6 address
     * 
     */
    private String address;
    /**
     * @return Assignment mode
     * 
     */
    private String assignmentMode;
    /**
     * @return IPv6 gateway
     * 
     */
    private String gateway;
    /**
     * @return IPv6 subnet
     * 
     */
    private String prefix;

    private GetSwitchStacksRoutingInterfacesItemIpv6() {}
    /**
     * @return IPv6 address
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Assignment mode
     * 
     */
    public String assignmentMode() {
        return this.assignmentMode;
    }
    /**
     * @return IPv6 gateway
     * 
     */
    public String gateway() {
        return this.gateway;
    }
    /**
     * @return IPv6 subnet
     * 
     */
    public String prefix() {
        return this.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchStacksRoutingInterfacesItemIpv6 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String assignmentMode;
        private String gateway;
        private String prefix;
        public Builder() {}
        public Builder(GetSwitchStacksRoutingInterfacesItemIpv6 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.assignmentMode = defaults.assignmentMode;
    	      this.gateway = defaults.gateway;
    	      this.prefix = defaults.prefix;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesItemIpv6", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder assignmentMode(String assignmentMode) {
            if (assignmentMode == null) {
              throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesItemIpv6", "assignmentMode");
            }
            this.assignmentMode = assignmentMode;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(String gateway) {
            if (gateway == null) {
              throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesItemIpv6", "gateway");
            }
            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(String prefix) {
            if (prefix == null) {
              throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesItemIpv6", "prefix");
            }
            this.prefix = prefix;
            return this;
        }
        public GetSwitchStacksRoutingInterfacesItemIpv6 build() {
            final var _resultValue = new GetSwitchStacksRoutingInterfacesItemIpv6();
            _resultValue.address = address;
            _resultValue.assignmentMode = assignmentMode;
            _resultValue.gateway = gateway;
            _resultValue.prefix = prefix;
            return _resultValue;
        }
    }
}
