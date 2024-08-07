// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceFirewallOneToOneNatRulesRuleAllowedInboundArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceFirewallOneToOneNatRulesRuleAllowedInboundArgs Empty = new ApplianceFirewallOneToOneNatRulesRuleAllowedInboundArgs();

    /**
     * An array of ranges of WAN IP addresses that are allowed to make inbound connections on the specified ports or port ranges, or &#39;any&#39;
     * 
     */
    @Import(name="allowedIps")
    private @Nullable Output<List<String>> allowedIps;

    /**
     * @return An array of ranges of WAN IP addresses that are allowed to make inbound connections on the specified ports or port ranges, or &#39;any&#39;
     * 
     */
    public Optional<Output<List<String>>> allowedIps() {
        return Optional.ofNullable(this.allowedIps);
    }

    /**
     * An array of ports or port ranges that will be forwarded to the host on the LAN
     * 
     */
    @Import(name="destinationPorts")
    private @Nullable Output<List<String>> destinationPorts;

    /**
     * @return An array of ports or port ranges that will be forwarded to the host on the LAN
     * 
     */
    public Optional<Output<List<String>>> destinationPorts() {
        return Optional.ofNullable(this.destinationPorts);
    }

    /**
     * Either of the following: &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp-ping&#39; or &#39;any&#39;
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return Either of the following: &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp-ping&#39; or &#39;any&#39;
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private ApplianceFirewallOneToOneNatRulesRuleAllowedInboundArgs() {}

    private ApplianceFirewallOneToOneNatRulesRuleAllowedInboundArgs(ApplianceFirewallOneToOneNatRulesRuleAllowedInboundArgs $) {
        this.allowedIps = $.allowedIps;
        this.destinationPorts = $.destinationPorts;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceFirewallOneToOneNatRulesRuleAllowedInboundArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceFirewallOneToOneNatRulesRuleAllowedInboundArgs $;

        public Builder() {
            $ = new ApplianceFirewallOneToOneNatRulesRuleAllowedInboundArgs();
        }

        public Builder(ApplianceFirewallOneToOneNatRulesRuleAllowedInboundArgs defaults) {
            $ = new ApplianceFirewallOneToOneNatRulesRuleAllowedInboundArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedIps An array of ranges of WAN IP addresses that are allowed to make inbound connections on the specified ports or port ranges, or &#39;any&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedIps(@Nullable Output<List<String>> allowedIps) {
            $.allowedIps = allowedIps;
            return this;
        }

        /**
         * @param allowedIps An array of ranges of WAN IP addresses that are allowed to make inbound connections on the specified ports or port ranges, or &#39;any&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedIps(List<String> allowedIps) {
            return allowedIps(Output.of(allowedIps));
        }

        /**
         * @param allowedIps An array of ranges of WAN IP addresses that are allowed to make inbound connections on the specified ports or port ranges, or &#39;any&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedIps(String... allowedIps) {
            return allowedIps(List.of(allowedIps));
        }

        /**
         * @param destinationPorts An array of ports or port ranges that will be forwarded to the host on the LAN
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(@Nullable Output<List<String>> destinationPorts) {
            $.destinationPorts = destinationPorts;
            return this;
        }

        /**
         * @param destinationPorts An array of ports or port ranges that will be forwarded to the host on the LAN
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(List<String> destinationPorts) {
            return destinationPorts(Output.of(destinationPorts));
        }

        /**
         * @param destinationPorts An array of ports or port ranges that will be forwarded to the host on the LAN
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }

        /**
         * @param protocol Either of the following: &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp-ping&#39; or &#39;any&#39;
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Either of the following: &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp-ping&#39; or &#39;any&#39;
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public ApplianceFirewallOneToOneNatRulesRuleAllowedInboundArgs build() {
            return $;
        }
    }

}
