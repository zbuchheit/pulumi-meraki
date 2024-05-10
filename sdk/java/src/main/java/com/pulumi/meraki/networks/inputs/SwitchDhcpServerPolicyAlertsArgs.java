// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.SwitchDhcpServerPolicyAlertsEmailArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchDhcpServerPolicyAlertsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchDhcpServerPolicyAlertsArgs Empty = new SwitchDhcpServerPolicyAlertsArgs();

    /**
     * Alert settings for DHCP servers
     * 
     */
    @Import(name="email")
    private @Nullable Output<SwitchDhcpServerPolicyAlertsEmailArgs> email;

    /**
     * @return Alert settings for DHCP servers
     * 
     */
    public Optional<Output<SwitchDhcpServerPolicyAlertsEmailArgs>> email() {
        return Optional.ofNullable(this.email);
    }

    private SwitchDhcpServerPolicyAlertsArgs() {}

    private SwitchDhcpServerPolicyAlertsArgs(SwitchDhcpServerPolicyAlertsArgs $) {
        this.email = $.email;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchDhcpServerPolicyAlertsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchDhcpServerPolicyAlertsArgs $;

        public Builder() {
            $ = new SwitchDhcpServerPolicyAlertsArgs();
        }

        public Builder(SwitchDhcpServerPolicyAlertsArgs defaults) {
            $ = new SwitchDhcpServerPolicyAlertsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email Alert settings for DHCP servers
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<SwitchDhcpServerPolicyAlertsEmailArgs> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Alert settings for DHCP servers
         * 
         * @return builder
         * 
         */
        public Builder email(SwitchDhcpServerPolicyAlertsEmailArgs email) {
            return email(Output.of(email));
        }

        public SwitchDhcpServerPolicyAlertsArgs build() {
            return $;
        }
    }

}
