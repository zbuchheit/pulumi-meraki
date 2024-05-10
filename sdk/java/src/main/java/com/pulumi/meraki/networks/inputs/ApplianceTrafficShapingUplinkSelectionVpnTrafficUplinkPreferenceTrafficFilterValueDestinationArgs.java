// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestinationArgs Empty = new ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestinationArgs();

    /**
     * CIDR format address (e.g.&#34;192.168.10.1&#34;, which is the same as &#34;192.168.10.1/32&#34;), or &#34;any&#34;. Cannot be used in combination with the &#34;vlan&#34; or &#34;fqdn&#34; property
     * 
     */
    @Import(name="cidr")
    private @Nullable Output<String> cidr;

    /**
     * @return CIDR format address (e.g.&#34;192.168.10.1&#34;, which is the same as &#34;192.168.10.1/32&#34;), or &#34;any&#34;. Cannot be used in combination with the &#34;vlan&#34; or &#34;fqdn&#34; property
     * 
     */
    public Optional<Output<String>> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    /**
     * FQDN format address. Cannot be used in combination with the &#34;cidr&#34; or &#34;fqdn&#34; property and is currently only available in the &#34;destination&#34; object of the &#34;vpnTrafficUplinkPreference&#34; object. E.g.: &#34;www.google.com&#34;
     * 
     */
    @Import(name="fqdn")
    private @Nullable Output<String> fqdn;

    /**
     * @return FQDN format address. Cannot be used in combination with the &#34;cidr&#34; or &#34;fqdn&#34; property and is currently only available in the &#34;destination&#34; object of the &#34;vpnTrafficUplinkPreference&#34; object. E.g.: &#34;www.google.com&#34;
     * 
     */
    public Optional<Output<String>> fqdn() {
        return Optional.ofNullable(this.fqdn);
    }

    /**
     * Host ID in the VLAN. Should not exceed the VLAN subnet capacity. Must be used along with the &#34;vlan&#34; property and is currently only available under a template network.
     * 
     */
    @Import(name="host")
    private @Nullable Output<Integer> host;

    /**
     * @return Host ID in the VLAN. Should not exceed the VLAN subnet capacity. Must be used along with the &#34;vlan&#34; property and is currently only available under a template network.
     * 
     */
    public Optional<Output<Integer>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * Meraki network ID. Currently only available under a template network, and the value should be ID of either same template network, or another template network currently. E.g.: &#34;L_12345678&#34;.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return Meraki network ID. Currently only available under a template network, and the value should be ID of either same template network, or another template network currently. E.g.: &#34;L_12345678&#34;.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * E.g.: &#34;any&#34;, &#34;0&#34; (also means &#34;any&#34;), &#34;8080&#34;, &#34;1-1024&#34;
     * 
     */
    @Import(name="port")
    private @Nullable Output<String> port;

    /**
     * @return E.g.: &#34;any&#34;, &#34;0&#34; (also means &#34;any&#34;), &#34;8080&#34;, &#34;1-1024&#34;
     * 
     */
    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * VLAN ID of the configured VLAN in the Meraki network. Cannot be used in combination with the &#34;cidr&#34; or &#34;fqdn&#34; property and is currently only available under a template network.
     * 
     */
    @Import(name="vlan")
    private @Nullable Output<Integer> vlan;

    /**
     * @return VLAN ID of the configured VLAN in the Meraki network. Cannot be used in combination with the &#34;cidr&#34; or &#34;fqdn&#34; property and is currently only available under a template network.
     * 
     */
    public Optional<Output<Integer>> vlan() {
        return Optional.ofNullable(this.vlan);
    }

    private ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestinationArgs() {}

    private ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestinationArgs(ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestinationArgs $) {
        this.cidr = $.cidr;
        this.fqdn = $.fqdn;
        this.host = $.host;
        this.network = $.network;
        this.port = $.port;
        this.vlan = $.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestinationArgs $;

        public Builder() {
            $ = new ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestinationArgs();
        }

        public Builder(ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestinationArgs defaults) {
            $ = new ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr CIDR format address (e.g.&#34;192.168.10.1&#34;, which is the same as &#34;192.168.10.1/32&#34;), or &#34;any&#34;. Cannot be used in combination with the &#34;vlan&#34; or &#34;fqdn&#34; property
         * 
         * @return builder
         * 
         */
        public Builder cidr(@Nullable Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr CIDR format address (e.g.&#34;192.168.10.1&#34;, which is the same as &#34;192.168.10.1/32&#34;), or &#34;any&#34;. Cannot be used in combination with the &#34;vlan&#34; or &#34;fqdn&#34; property
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param fqdn FQDN format address. Cannot be used in combination with the &#34;cidr&#34; or &#34;fqdn&#34; property and is currently only available in the &#34;destination&#34; object of the &#34;vpnTrafficUplinkPreference&#34; object. E.g.: &#34;www.google.com&#34;
         * 
         * @return builder
         * 
         */
        public Builder fqdn(@Nullable Output<String> fqdn) {
            $.fqdn = fqdn;
            return this;
        }

        /**
         * @param fqdn FQDN format address. Cannot be used in combination with the &#34;cidr&#34; or &#34;fqdn&#34; property and is currently only available in the &#34;destination&#34; object of the &#34;vpnTrafficUplinkPreference&#34; object. E.g.: &#34;www.google.com&#34;
         * 
         * @return builder
         * 
         */
        public Builder fqdn(String fqdn) {
            return fqdn(Output.of(fqdn));
        }

        /**
         * @param host Host ID in the VLAN. Should not exceed the VLAN subnet capacity. Must be used along with the &#34;vlan&#34; property and is currently only available under a template network.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<Integer> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Host ID in the VLAN. Should not exceed the VLAN subnet capacity. Must be used along with the &#34;vlan&#34; property and is currently only available under a template network.
         * 
         * @return builder
         * 
         */
        public Builder host(Integer host) {
            return host(Output.of(host));
        }

        /**
         * @param network Meraki network ID. Currently only available under a template network, and the value should be ID of either same template network, or another template network currently. E.g.: &#34;L_12345678&#34;.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Meraki network ID. Currently only available under a template network, and the value should be ID of either same template network, or another template network currently. E.g.: &#34;L_12345678&#34;.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param port E.g.: &#34;any&#34;, &#34;0&#34; (also means &#34;any&#34;), &#34;8080&#34;, &#34;1-1024&#34;
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port E.g.: &#34;any&#34;, &#34;0&#34; (also means &#34;any&#34;), &#34;8080&#34;, &#34;1-1024&#34;
         * 
         * @return builder
         * 
         */
        public Builder port(String port) {
            return port(Output.of(port));
        }

        /**
         * @param vlan VLAN ID of the configured VLAN in the Meraki network. Cannot be used in combination with the &#34;cidr&#34; or &#34;fqdn&#34; property and is currently only available under a template network.
         * 
         * @return builder
         * 
         */
        public Builder vlan(@Nullable Output<Integer> vlan) {
            $.vlan = vlan;
            return this;
        }

        /**
         * @param vlan VLAN ID of the configured VLAN in the Meraki network. Cannot be used in combination with the &#34;cidr&#34; or &#34;fqdn&#34; property and is currently only available under a template network.
         * 
         * @return builder
         * 
         */
        public Builder vlan(Integer vlan) {
            return vlan(Output.of(vlan));
        }

        public ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestinationArgs build() {
            return $;
        }
    }

}
