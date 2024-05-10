// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.devices.outputs.WirelessAlternateManagementInterfaceIpv6ItemAddress;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WirelessAlternateManagementInterfaceIpv6Item {
    /**
     * @return configured alternate management interface addresses
     * 
     */
    private @Nullable List<WirelessAlternateManagementInterfaceIpv6ItemAddress> addresses;

    private WirelessAlternateManagementInterfaceIpv6Item() {}
    /**
     * @return configured alternate management interface addresses
     * 
     */
    public List<WirelessAlternateManagementInterfaceIpv6ItemAddress> addresses() {
        return this.addresses == null ? List.of() : this.addresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessAlternateManagementInterfaceIpv6Item defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<WirelessAlternateManagementInterfaceIpv6ItemAddress> addresses;
        public Builder() {}
        public Builder(WirelessAlternateManagementInterfaceIpv6Item defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
        }

        @CustomType.Setter
        public Builder addresses(@Nullable List<WirelessAlternateManagementInterfaceIpv6ItemAddress> addresses) {

            this.addresses = addresses;
            return this;
        }
        public Builder addresses(WirelessAlternateManagementInterfaceIpv6ItemAddress... addresses) {
            return addresses(List.of(addresses));
        }
        public WirelessAlternateManagementInterfaceIpv6Item build() {
            final var _resultValue = new WirelessAlternateManagementInterfaceIpv6Item();
            _resultValue.addresses = addresses;
            return _resultValue;
        }
    }
}
