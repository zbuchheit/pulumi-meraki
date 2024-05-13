// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceRfProfilesPerSsidSettingsStatus1Args extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceRfProfilesPerSsidSettingsStatus1Args Empty = new ApplianceRfProfilesPerSsidSettingsStatus1Args();

    /**
     * Band mode of this SSID
     * 
     */
    @Import(name="bandOperationMode")
    private @Nullable Output<String> bandOperationMode;

    /**
     * @return Band mode of this SSID
     * 
     */
    public Optional<Output<String>> bandOperationMode() {
        return Optional.ofNullable(this.bandOperationMode);
    }

    /**
     * Whether this SSID steers clients to the most open band between 2.4 GHz and 5 GHz.
     * 
     */
    @Import(name="bandSteeringEnabled")
    private @Nullable Output<Boolean> bandSteeringEnabled;

    /**
     * @return Whether this SSID steers clients to the most open band between 2.4 GHz and 5 GHz.
     * 
     */
    public Optional<Output<Boolean>> bandSteeringEnabled() {
        return Optional.ofNullable(this.bandSteeringEnabled);
    }

    private ApplianceRfProfilesPerSsidSettingsStatus1Args() {}

    private ApplianceRfProfilesPerSsidSettingsStatus1Args(ApplianceRfProfilesPerSsidSettingsStatus1Args $) {
        this.bandOperationMode = $.bandOperationMode;
        this.bandSteeringEnabled = $.bandSteeringEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceRfProfilesPerSsidSettingsStatus1Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceRfProfilesPerSsidSettingsStatus1Args $;

        public Builder() {
            $ = new ApplianceRfProfilesPerSsidSettingsStatus1Args();
        }

        public Builder(ApplianceRfProfilesPerSsidSettingsStatus1Args defaults) {
            $ = new ApplianceRfProfilesPerSsidSettingsStatus1Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandOperationMode Band mode of this SSID
         * 
         * @return builder
         * 
         */
        public Builder bandOperationMode(@Nullable Output<String> bandOperationMode) {
            $.bandOperationMode = bandOperationMode;
            return this;
        }

        /**
         * @param bandOperationMode Band mode of this SSID
         * 
         * @return builder
         * 
         */
        public Builder bandOperationMode(String bandOperationMode) {
            return bandOperationMode(Output.of(bandOperationMode));
        }

        /**
         * @param bandSteeringEnabled Whether this SSID steers clients to the most open band between 2.4 GHz and 5 GHz.
         * 
         * @return builder
         * 
         */
        public Builder bandSteeringEnabled(@Nullable Output<Boolean> bandSteeringEnabled) {
            $.bandSteeringEnabled = bandSteeringEnabled;
            return this;
        }

        /**
         * @param bandSteeringEnabled Whether this SSID steers clients to the most open band between 2.4 GHz and 5 GHz.
         * 
         * @return builder
         * 
         */
        public Builder bandSteeringEnabled(Boolean bandSteeringEnabled) {
            return bandSteeringEnabled(Output.of(bandSteeringEnabled));
        }

        public ApplianceRfProfilesPerSsidSettingsStatus1Args build() {
            return $;
        }
    }

}