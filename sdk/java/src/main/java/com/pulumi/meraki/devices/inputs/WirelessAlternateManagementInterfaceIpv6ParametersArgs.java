// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.devices.inputs.WirelessAlternateManagementInterfaceIpv6ParametersAddressArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessAlternateManagementInterfaceIpv6ParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessAlternateManagementInterfaceIpv6ParametersArgs Empty = new WirelessAlternateManagementInterfaceIpv6ParametersArgs();

    /**
     * configured alternate management interface addresses
     * 
     */
    @Import(name="addresses")
    private @Nullable Output<List<WirelessAlternateManagementInterfaceIpv6ParametersAddressArgs>> addresses;

    /**
     * @return configured alternate management interface addresses
     * 
     */
    public Optional<Output<List<WirelessAlternateManagementInterfaceIpv6ParametersAddressArgs>>> addresses() {
        return Optional.ofNullable(this.addresses);
    }

    private WirelessAlternateManagementInterfaceIpv6ParametersArgs() {}

    private WirelessAlternateManagementInterfaceIpv6ParametersArgs(WirelessAlternateManagementInterfaceIpv6ParametersArgs $) {
        this.addresses = $.addresses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessAlternateManagementInterfaceIpv6ParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessAlternateManagementInterfaceIpv6ParametersArgs $;

        public Builder() {
            $ = new WirelessAlternateManagementInterfaceIpv6ParametersArgs();
        }

        public Builder(WirelessAlternateManagementInterfaceIpv6ParametersArgs defaults) {
            $ = new WirelessAlternateManagementInterfaceIpv6ParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addresses configured alternate management interface addresses
         * 
         * @return builder
         * 
         */
        public Builder addresses(@Nullable Output<List<WirelessAlternateManagementInterfaceIpv6ParametersAddressArgs>> addresses) {
            $.addresses = addresses;
            return this;
        }

        /**
         * @param addresses configured alternate management interface addresses
         * 
         * @return builder
         * 
         */
        public Builder addresses(List<WirelessAlternateManagementInterfaceIpv6ParametersAddressArgs> addresses) {
            return addresses(Output.of(addresses));
        }

        /**
         * @param addresses configured alternate management interface addresses
         * 
         * @return builder
         * 
         */
        public Builder addresses(WirelessAlternateManagementInterfaceIpv6ParametersAddressArgs... addresses) {
            return addresses(List.of(addresses));
        }

        public WirelessAlternateManagementInterfaceIpv6ParametersArgs build() {
            return $;
        }
    }

}
