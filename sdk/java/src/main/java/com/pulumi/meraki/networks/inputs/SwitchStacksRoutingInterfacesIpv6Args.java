// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchStacksRoutingInterfacesIpv6Args extends com.pulumi.resources.ResourceArgs {

    public static final SwitchStacksRoutingInterfacesIpv6Args Empty = new SwitchStacksRoutingInterfacesIpv6Args();

    /**
     * IPv6 address
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return IPv6 address
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * Assignment mode
     * 
     */
    @Import(name="assignmentMode")
    private @Nullable Output<String> assignmentMode;

    /**
     * @return Assignment mode
     * 
     */
    public Optional<Output<String>> assignmentMode() {
        return Optional.ofNullable(this.assignmentMode);
    }

    /**
     * IPv6 gateway
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    /**
     * @return IPv6 gateway
     * 
     */
    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    /**
     * IPv6 subnet
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return IPv6 subnet
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private SwitchStacksRoutingInterfacesIpv6Args() {}

    private SwitchStacksRoutingInterfacesIpv6Args(SwitchStacksRoutingInterfacesIpv6Args $) {
        this.address = $.address;
        this.assignmentMode = $.assignmentMode;
        this.gateway = $.gateway;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchStacksRoutingInterfacesIpv6Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchStacksRoutingInterfacesIpv6Args $;

        public Builder() {
            $ = new SwitchStacksRoutingInterfacesIpv6Args();
        }

        public Builder(SwitchStacksRoutingInterfacesIpv6Args defaults) {
            $ = new SwitchStacksRoutingInterfacesIpv6Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param address IPv6 address
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address IPv6 address
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param assignmentMode Assignment mode
         * 
         * @return builder
         * 
         */
        public Builder assignmentMode(@Nullable Output<String> assignmentMode) {
            $.assignmentMode = assignmentMode;
            return this;
        }

        /**
         * @param assignmentMode Assignment mode
         * 
         * @return builder
         * 
         */
        public Builder assignmentMode(String assignmentMode) {
            return assignmentMode(Output.of(assignmentMode));
        }

        /**
         * @param gateway IPv6 gateway
         * 
         * @return builder
         * 
         */
        public Builder gateway(@Nullable Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway IPv6 gateway
         * 
         * @return builder
         * 
         */
        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        /**
         * @param prefix IPv6 subnet
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix IPv6 subnet
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public SwitchStacksRoutingInterfacesIpv6Args build() {
            return $;
        }
    }

}
