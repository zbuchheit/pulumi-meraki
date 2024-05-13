// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.devices.inputs.SwitchRoutingInterfacesIpv6Args;
import com.pulumi.meraki.devices.inputs.SwitchRoutingInterfacesOspfSettingsArgs;
import com.pulumi.meraki.devices.inputs.SwitchRoutingInterfacesOspfV3Args;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchRoutingInterfacesState extends com.pulumi.resources.ResourceArgs {

    public static final SwitchRoutingInterfacesState Empty = new SwitchRoutingInterfacesState();

    /**
     * IPv4 default gateway
     * 
     */
    @Import(name="defaultGateway")
    private @Nullable Output<String> defaultGateway;

    /**
     * @return IPv4 default gateway
     * 
     */
    public Optional<Output<String>> defaultGateway() {
        return Optional.ofNullable(this.defaultGateway);
    }

    /**
     * The id
     * 
     */
    @Import(name="interfaceId")
    private @Nullable Output<String> interfaceId;

    /**
     * @return The id
     * 
     */
    public Optional<Output<String>> interfaceId() {
        return Optional.ofNullable(this.interfaceId);
    }

    /**
     * IPv4 address
     * 
     */
    @Import(name="interfaceIp")
    private @Nullable Output<String> interfaceIp;

    /**
     * @return IPv4 address
     * 
     */
    public Optional<Output<String>> interfaceIp() {
        return Optional.ofNullable(this.interfaceIp);
    }

    /**
     * IPv6 addressing
     * 
     */
    @Import(name="ipv6")
    private @Nullable Output<SwitchRoutingInterfacesIpv6Args> ipv6;

    /**
     * @return IPv6 addressing
     * 
     */
    public Optional<Output<SwitchRoutingInterfacesIpv6Args>> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }

    /**
     * Multicast routing status
     * 
     */
    @Import(name="multicastRouting")
    private @Nullable Output<String> multicastRouting;

    /**
     * @return Multicast routing status
     * 
     */
    public Optional<Output<String>> multicastRouting() {
        return Optional.ofNullable(this.multicastRouting);
    }

    /**
     * The name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * IPv4 OSPF Settings
     * 
     */
    @Import(name="ospfSettings")
    private @Nullable Output<SwitchRoutingInterfacesOspfSettingsArgs> ospfSettings;

    /**
     * @return IPv4 OSPF Settings
     * 
     */
    public Optional<Output<SwitchRoutingInterfacesOspfSettingsArgs>> ospfSettings() {
        return Optional.ofNullable(this.ospfSettings);
    }

    /**
     * IPv6 OSPF Settings
     * 
     */
    @Import(name="ospfV3")
    private @Nullable Output<SwitchRoutingInterfacesOspfV3Args> ospfV3;

    /**
     * @return IPv6 OSPF Settings
     * 
     */
    public Optional<Output<SwitchRoutingInterfacesOspfV3Args>> ospfV3() {
        return Optional.ofNullable(this.ospfV3);
    }

    /**
     * serial path parameter.
     * 
     */
    @Import(name="serial")
    private @Nullable Output<String> serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    /**
     * IPv4 subnet
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<String> subnet;

    /**
     * @return IPv4 subnet
     * 
     */
    public Optional<Output<String>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    /**
     * VLAN id
     * 
     */
    @Import(name="vlanId")
    private @Nullable Output<Integer> vlanId;

    /**
     * @return VLAN id
     * 
     */
    public Optional<Output<Integer>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    private SwitchRoutingInterfacesState() {}

    private SwitchRoutingInterfacesState(SwitchRoutingInterfacesState $) {
        this.defaultGateway = $.defaultGateway;
        this.interfaceId = $.interfaceId;
        this.interfaceIp = $.interfaceIp;
        this.ipv6 = $.ipv6;
        this.multicastRouting = $.multicastRouting;
        this.name = $.name;
        this.ospfSettings = $.ospfSettings;
        this.ospfV3 = $.ospfV3;
        this.serial = $.serial;
        this.subnet = $.subnet;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchRoutingInterfacesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchRoutingInterfacesState $;

        public Builder() {
            $ = new SwitchRoutingInterfacesState();
        }

        public Builder(SwitchRoutingInterfacesState defaults) {
            $ = new SwitchRoutingInterfacesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultGateway IPv4 default gateway
         * 
         * @return builder
         * 
         */
        public Builder defaultGateway(@Nullable Output<String> defaultGateway) {
            $.defaultGateway = defaultGateway;
            return this;
        }

        /**
         * @param defaultGateway IPv4 default gateway
         * 
         * @return builder
         * 
         */
        public Builder defaultGateway(String defaultGateway) {
            return defaultGateway(Output.of(defaultGateway));
        }

        /**
         * @param interfaceId The id
         * 
         * @return builder
         * 
         */
        public Builder interfaceId(@Nullable Output<String> interfaceId) {
            $.interfaceId = interfaceId;
            return this;
        }

        /**
         * @param interfaceId The id
         * 
         * @return builder
         * 
         */
        public Builder interfaceId(String interfaceId) {
            return interfaceId(Output.of(interfaceId));
        }

        /**
         * @param interfaceIp IPv4 address
         * 
         * @return builder
         * 
         */
        public Builder interfaceIp(@Nullable Output<String> interfaceIp) {
            $.interfaceIp = interfaceIp;
            return this;
        }

        /**
         * @param interfaceIp IPv4 address
         * 
         * @return builder
         * 
         */
        public Builder interfaceIp(String interfaceIp) {
            return interfaceIp(Output.of(interfaceIp));
        }

        /**
         * @param ipv6 IPv6 addressing
         * 
         * @return builder
         * 
         */
        public Builder ipv6(@Nullable Output<SwitchRoutingInterfacesIpv6Args> ipv6) {
            $.ipv6 = ipv6;
            return this;
        }

        /**
         * @param ipv6 IPv6 addressing
         * 
         * @return builder
         * 
         */
        public Builder ipv6(SwitchRoutingInterfacesIpv6Args ipv6) {
            return ipv6(Output.of(ipv6));
        }

        /**
         * @param multicastRouting Multicast routing status
         * 
         * @return builder
         * 
         */
        public Builder multicastRouting(@Nullable Output<String> multicastRouting) {
            $.multicastRouting = multicastRouting;
            return this;
        }

        /**
         * @param multicastRouting Multicast routing status
         * 
         * @return builder
         * 
         */
        public Builder multicastRouting(String multicastRouting) {
            return multicastRouting(Output.of(multicastRouting));
        }

        /**
         * @param name The name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ospfSettings IPv4 OSPF Settings
         * 
         * @return builder
         * 
         */
        public Builder ospfSettings(@Nullable Output<SwitchRoutingInterfacesOspfSettingsArgs> ospfSettings) {
            $.ospfSettings = ospfSettings;
            return this;
        }

        /**
         * @param ospfSettings IPv4 OSPF Settings
         * 
         * @return builder
         * 
         */
        public Builder ospfSettings(SwitchRoutingInterfacesOspfSettingsArgs ospfSettings) {
            return ospfSettings(Output.of(ospfSettings));
        }

        /**
         * @param ospfV3 IPv6 OSPF Settings
         * 
         * @return builder
         * 
         */
        public Builder ospfV3(@Nullable Output<SwitchRoutingInterfacesOspfV3Args> ospfV3) {
            $.ospfV3 = ospfV3;
            return this;
        }

        /**
         * @param ospfV3 IPv6 OSPF Settings
         * 
         * @return builder
         * 
         */
        public Builder ospfV3(SwitchRoutingInterfacesOspfV3Args ospfV3) {
            return ospfV3(Output.of(ospfV3));
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        /**
         * @param subnet IPv4 subnet
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet IPv4 subnet
         * 
         * @return builder
         * 
         */
        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        /**
         * @param vlanId VLAN id
         * 
         * @return builder
         * 
         */
        public Builder vlanId(@Nullable Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vlanId VLAN id
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public SwitchRoutingInterfacesState build() {
            return $;
        }
    }

}