// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchDhcpV4ServersSeenItemLastAckIpv4 {
    /**
     * @return IPv4 address of the last ack.
     * 
     */
    private String address;

    private GetSwitchDhcpV4ServersSeenItemLastAckIpv4() {}
    /**
     * @return IPv4 address of the last ack.
     * 
     */
    public String address() {
        return this.address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchDhcpV4ServersSeenItemLastAckIpv4 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        public Builder() {}
        public Builder(GetSwitchDhcpV4ServersSeenItemLastAckIpv4 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpV4ServersSeenItemLastAckIpv4", "address");
            }
            this.address = address;
            return this;
        }
        public GetSwitchDhcpV4ServersSeenItemLastAckIpv4 build() {
            final var _resultValue = new GetSwitchDhcpV4ServersSeenItemLastAckIpv4();
            _resultValue.address = address;
            return _resultValue;
        }
    }
}
