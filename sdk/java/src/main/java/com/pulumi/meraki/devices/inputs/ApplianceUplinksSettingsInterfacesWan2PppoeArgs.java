// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan2PppoeAuthenticationArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceUplinksSettingsInterfacesWan2PppoeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceUplinksSettingsInterfacesWan2PppoeArgs Empty = new ApplianceUplinksSettingsInterfacesWan2PppoeArgs();

    /**
     * Settings for PPPoE Authentication.
     * 
     */
    @Import(name="authentication")
    private @Nullable Output<ApplianceUplinksSettingsInterfacesWan2PppoeAuthenticationArgs> authentication;

    /**
     * @return Settings for PPPoE Authentication.
     * 
     */
    public Optional<Output<ApplianceUplinksSettingsInterfacesWan2PppoeAuthenticationArgs>> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    /**
     * Whether PPPoE is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether PPPoE is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ApplianceUplinksSettingsInterfacesWan2PppoeArgs() {}

    private ApplianceUplinksSettingsInterfacesWan2PppoeArgs(ApplianceUplinksSettingsInterfacesWan2PppoeArgs $) {
        this.authentication = $.authentication;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceUplinksSettingsInterfacesWan2PppoeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceUplinksSettingsInterfacesWan2PppoeArgs $;

        public Builder() {
            $ = new ApplianceUplinksSettingsInterfacesWan2PppoeArgs();
        }

        public Builder(ApplianceUplinksSettingsInterfacesWan2PppoeArgs defaults) {
            $ = new ApplianceUplinksSettingsInterfacesWan2PppoeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authentication Settings for PPPoE Authentication.
         * 
         * @return builder
         * 
         */
        public Builder authentication(@Nullable Output<ApplianceUplinksSettingsInterfacesWan2PppoeAuthenticationArgs> authentication) {
            $.authentication = authentication;
            return this;
        }

        /**
         * @param authentication Settings for PPPoE Authentication.
         * 
         * @return builder
         * 
         */
        public Builder authentication(ApplianceUplinksSettingsInterfacesWan2PppoeAuthenticationArgs authentication) {
            return authentication(Output.of(authentication));
        }

        /**
         * @param enabled Whether PPPoE is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether PPPoE is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ApplianceUplinksSettingsInterfacesWan2PppoeArgs build() {
            return $;
        }
    }

}
