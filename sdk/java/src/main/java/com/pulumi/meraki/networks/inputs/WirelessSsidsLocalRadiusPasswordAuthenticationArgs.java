// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsLocalRadiusPasswordAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsLocalRadiusPasswordAuthenticationArgs Empty = new WirelessSsidsLocalRadiusPasswordAuthenticationArgs();

    /**
     * Whether or not to use EAP-TTLS/PAP or PEAP-GTC password-based authentication via LDAP lookup.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether or not to use EAP-TTLS/PAP or PEAP-GTC password-based authentication via LDAP lookup.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private WirelessSsidsLocalRadiusPasswordAuthenticationArgs() {}

    private WirelessSsidsLocalRadiusPasswordAuthenticationArgs(WirelessSsidsLocalRadiusPasswordAuthenticationArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsLocalRadiusPasswordAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsLocalRadiusPasswordAuthenticationArgs $;

        public Builder() {
            $ = new WirelessSsidsLocalRadiusPasswordAuthenticationArgs();
        }

        public Builder(WirelessSsidsLocalRadiusPasswordAuthenticationArgs defaults) {
            $ = new WirelessSsidsLocalRadiusPasswordAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether or not to use EAP-TTLS/PAP or PEAP-GTC password-based authentication via LDAP lookup.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether or not to use EAP-TTLS/PAP or PEAP-GTC password-based authentication via LDAP lookup.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public WirelessSsidsLocalRadiusPasswordAuthenticationArgs build() {
            return $;
        }
    }

}
