// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchDhcpServerPolicyArpInspectionTrustedServersItemIpv4 {
    /**
     * @return IPv4 address of the trusted server.
     * 
     */
    private String address;

    private GetSwitchDhcpServerPolicyArpInspectionTrustedServersItemIpv4() {}
    /**
     * @return IPv4 address of the trusted server.
     * 
     */
    public String address() {
        return this.address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchDhcpServerPolicyArpInspectionTrustedServersItemIpv4 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        public Builder() {}
        public Builder(GetSwitchDhcpServerPolicyArpInspectionTrustedServersItemIpv4 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpServerPolicyArpInspectionTrustedServersItemIpv4", "address");
            }
            this.address = address;
            return this;
        }
        public GetSwitchDhcpServerPolicyArpInspectionTrustedServersItemIpv4 build() {
            final var _resultValue = new GetSwitchDhcpServerPolicyArpInspectionTrustedServersItemIpv4();
            _resultValue.address = address;
            return _resultValue;
        }
    }
}
