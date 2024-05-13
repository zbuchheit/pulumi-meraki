// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemCustom {
    /**
     * @return Destination address; hostname required for DNS, IPv4 otherwise.
     * 
     */
    private String destination;
    /**
     * @return Destination port.
     * 
     */
    private String port;
    /**
     * @return Protocol.
     * 
     */
    private String protocol;

    private GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemCustom() {}
    /**
     * @return Destination address; hostname required for DNS, IPv4 otherwise.
     * 
     */
    public String destination() {
        return this.destination;
    }
    /**
     * @return Destination port.
     * 
     */
    public String port() {
        return this.port;
    }
    /**
     * @return Protocol.
     * 
     */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemCustom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destination;
        private String port;
        private String protocol;
        public Builder() {}
        public Builder(GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemCustom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder destination(String destination) {
            if (destination == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemCustom", "destination");
            }
            this.destination = destination;
            return this;
        }
        @CustomType.Setter
        public Builder port(String port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemCustom", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemCustom", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        public GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemCustom build() {
            final var _resultValue = new GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemCustom();
            _resultValue.destination = destination;
            _resultValue.port = port;
            _resultValue.protocol = protocol;
            return _resultValue;
        }
    }
}