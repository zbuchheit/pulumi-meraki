// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.SwitchAlternateManagementInterfaceSwitchArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchAlternateManagementInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchAlternateManagementInterfaceArgs Empty = new SwitchAlternateManagementInterfaceArgs();

    /**
     * Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    /**
     * Can be one or more of the following values: &#39;radius&#39;, &#39;snmp&#39; or &#39;syslog&#39;
     * 
     */
    @Import(name="protocols")
    private @Nullable Output<List<String>> protocols;

    /**
     * @return Can be one or more of the following values: &#39;radius&#39;, &#39;snmp&#39; or &#39;syslog&#39;
     * 
     */
    public Optional<Output<List<String>>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    /**
     * Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put &#39;switches&#39; in the body when updating template networks. Also, an empty &#39;switches&#39; array will remove all previous assignments
     * 
     */
    @Import(name="switches")
    private @Nullable Output<List<SwitchAlternateManagementInterfaceSwitchArgs>> switches;

    /**
     * @return Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put &#39;switches&#39; in the body when updating template networks. Also, an empty &#39;switches&#39; array will remove all previous assignments
     * 
     */
    public Optional<Output<List<SwitchAlternateManagementInterfaceSwitchArgs>>> switches() {
        return Optional.ofNullable(this.switches);
    }

    /**
     * Alternate management VLAN, must be between 1 and 4094
     * 
     */
    @Import(name="vlanId")
    private @Nullable Output<Integer> vlanId;

    /**
     * @return Alternate management VLAN, must be between 1 and 4094
     * 
     */
    public Optional<Output<Integer>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    private SwitchAlternateManagementInterfaceArgs() {}

    private SwitchAlternateManagementInterfaceArgs(SwitchAlternateManagementInterfaceArgs $) {
        this.enabled = $.enabled;
        this.networkId = $.networkId;
        this.protocols = $.protocols;
        this.switches = $.switches;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchAlternateManagementInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchAlternateManagementInterfaceArgs $;

        public Builder() {
            $ = new SwitchAlternateManagementInterfaceArgs();
        }

        public Builder(SwitchAlternateManagementInterfaceArgs defaults) {
            $ = new SwitchAlternateManagementInterfaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param protocols Can be one or more of the following values: &#39;radius&#39;, &#39;snmp&#39; or &#39;syslog&#39;
         * 
         * @return builder
         * 
         */
        public Builder protocols(@Nullable Output<List<String>> protocols) {
            $.protocols = protocols;
            return this;
        }

        /**
         * @param protocols Can be one or more of the following values: &#39;radius&#39;, &#39;snmp&#39; or &#39;syslog&#39;
         * 
         * @return builder
         * 
         */
        public Builder protocols(List<String> protocols) {
            return protocols(Output.of(protocols));
        }

        /**
         * @param protocols Can be one or more of the following values: &#39;radius&#39;, &#39;snmp&#39; or &#39;syslog&#39;
         * 
         * @return builder
         * 
         */
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }

        /**
         * @param switches Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put &#39;switches&#39; in the body when updating template networks. Also, an empty &#39;switches&#39; array will remove all previous assignments
         * 
         * @return builder
         * 
         */
        public Builder switches(@Nullable Output<List<SwitchAlternateManagementInterfaceSwitchArgs>> switches) {
            $.switches = switches;
            return this;
        }

        /**
         * @param switches Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put &#39;switches&#39; in the body when updating template networks. Also, an empty &#39;switches&#39; array will remove all previous assignments
         * 
         * @return builder
         * 
         */
        public Builder switches(List<SwitchAlternateManagementInterfaceSwitchArgs> switches) {
            return switches(Output.of(switches));
        }

        /**
         * @param switches Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put &#39;switches&#39; in the body when updating template networks. Also, an empty &#39;switches&#39; array will remove all previous assignments
         * 
         * @return builder
         * 
         */
        public Builder switches(SwitchAlternateManagementInterfaceSwitchArgs... switches) {
            return switches(List.of(switches));
        }

        /**
         * @param vlanId Alternate management VLAN, must be between 1 and 4094
         * 
         * @return builder
         * 
         */
        public Builder vlanId(@Nullable Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vlanId Alternate management VLAN, must be between 1 and 4094
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public SwitchAlternateManagementInterfaceArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("SwitchAlternateManagementInterfaceArgs", "networkId");
            }
            return $;
        }
    }

}
