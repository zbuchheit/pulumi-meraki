// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs Empty = new ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs();

    /**
     * Whether VLAN tagging is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether VLAN tagging is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The ID of the VLAN to use for VLAN tagging.
     * 
     */
    @Import(name="vlanId")
    private @Nullable Output<Integer> vlanId;

    /**
     * @return The ID of the VLAN to use for VLAN tagging.
     * 
     */
    public Optional<Output<Integer>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    private ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs() {}

    private ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs(ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs $) {
        this.enabled = $.enabled;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs $;

        public Builder() {
            $ = new ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs();
        }

        public Builder(ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs defaults) {
            $ = new ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether VLAN tagging is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether VLAN tagging is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param vlanId The ID of the VLAN to use for VLAN tagging.
         * 
         * @return builder
         * 
         */
        public Builder vlanId(@Nullable Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vlanId The ID of the VLAN to use for VLAN tagging.
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs build() {
            return $;
        }
    }

}
