// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceVlansMandatoryDhcpArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceVlansMandatoryDhcpArgs Empty = new ApplianceVlansMandatoryDhcpArgs();

    /**
     * Enable Mandatory DHCP on VLAN.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable Mandatory DHCP on VLAN.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ApplianceVlansMandatoryDhcpArgs() {}

    private ApplianceVlansMandatoryDhcpArgs(ApplianceVlansMandatoryDhcpArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceVlansMandatoryDhcpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceVlansMandatoryDhcpArgs $;

        public Builder() {
            $ = new ApplianceVlansMandatoryDhcpArgs();
        }

        public Builder(ApplianceVlansMandatoryDhcpArgs defaults) {
            $ = new ApplianceVlansMandatoryDhcpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable Mandatory DHCP on VLAN.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable Mandatory DHCP on VLAN.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ApplianceVlansMandatoryDhcpArgs build() {
            return $;
        }
    }

}
