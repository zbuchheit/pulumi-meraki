// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.WirelessRfProfilesApBandSettingsBandsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessRfProfilesApBandSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessRfProfilesApBandSettingsArgs Empty = new WirelessRfProfilesApBandSettingsArgs();

    /**
     * Choice between &#39;dual&#39;, &#39;2.4ghz&#39;, &#39;5ghz&#39;, &#39;6ghz&#39; or &#39;multi&#39;. Defaults to dual.
     * 
     */
    @Import(name="bandOperationMode")
    private @Nullable Output<String> bandOperationMode;

    /**
     * @return Choice between &#39;dual&#39;, &#39;2.4ghz&#39;, &#39;5ghz&#39;, &#39;6ghz&#39; or &#39;multi&#39;. Defaults to dual.
     * 
     */
    public Optional<Output<String>> bandOperationMode() {
        return Optional.ofNullable(this.bandOperationMode);
    }

    /**
     * Steers client to most open band. Can be either true or false. Defaults to true.
     * 
     */
    @Import(name="bandSteeringEnabled")
    private @Nullable Output<Boolean> bandSteeringEnabled;

    /**
     * @return Steers client to most open band. Can be either true or false. Defaults to true.
     * 
     */
    public Optional<Output<Boolean>> bandSteeringEnabled() {
        return Optional.ofNullable(this.bandSteeringEnabled);
    }

    /**
     * Settings related to all bands
     * 
     */
    @Import(name="bands")
    private @Nullable Output<WirelessRfProfilesApBandSettingsBandsArgs> bands;

    /**
     * @return Settings related to all bands
     * 
     */
    public Optional<Output<WirelessRfProfilesApBandSettingsBandsArgs>> bands() {
        return Optional.ofNullable(this.bands);
    }

    private WirelessRfProfilesApBandSettingsArgs() {}

    private WirelessRfProfilesApBandSettingsArgs(WirelessRfProfilesApBandSettingsArgs $) {
        this.bandOperationMode = $.bandOperationMode;
        this.bandSteeringEnabled = $.bandSteeringEnabled;
        this.bands = $.bands;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessRfProfilesApBandSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessRfProfilesApBandSettingsArgs $;

        public Builder() {
            $ = new WirelessRfProfilesApBandSettingsArgs();
        }

        public Builder(WirelessRfProfilesApBandSettingsArgs defaults) {
            $ = new WirelessRfProfilesApBandSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandOperationMode Choice between &#39;dual&#39;, &#39;2.4ghz&#39;, &#39;5ghz&#39;, &#39;6ghz&#39; or &#39;multi&#39;. Defaults to dual.
         * 
         * @return builder
         * 
         */
        public Builder bandOperationMode(@Nullable Output<String> bandOperationMode) {
            $.bandOperationMode = bandOperationMode;
            return this;
        }

        /**
         * @param bandOperationMode Choice between &#39;dual&#39;, &#39;2.4ghz&#39;, &#39;5ghz&#39;, &#39;6ghz&#39; or &#39;multi&#39;. Defaults to dual.
         * 
         * @return builder
         * 
         */
        public Builder bandOperationMode(String bandOperationMode) {
            return bandOperationMode(Output.of(bandOperationMode));
        }

        /**
         * @param bandSteeringEnabled Steers client to most open band. Can be either true or false. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder bandSteeringEnabled(@Nullable Output<Boolean> bandSteeringEnabled) {
            $.bandSteeringEnabled = bandSteeringEnabled;
            return this;
        }

        /**
         * @param bandSteeringEnabled Steers client to most open band. Can be either true or false. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder bandSteeringEnabled(Boolean bandSteeringEnabled) {
            return bandSteeringEnabled(Output.of(bandSteeringEnabled));
        }

        /**
         * @param bands Settings related to all bands
         * 
         * @return builder
         * 
         */
        public Builder bands(@Nullable Output<WirelessRfProfilesApBandSettingsBandsArgs> bands) {
            $.bands = bands;
            return this;
        }

        /**
         * @param bands Settings related to all bands
         * 
         * @return builder
         * 
         */
        public Builder bands(WirelessRfProfilesApBandSettingsBandsArgs bands) {
            return bands(Output.of(bands));
        }

        public WirelessRfProfilesApBandSettingsArgs build() {
            return $;
        }
    }

}
