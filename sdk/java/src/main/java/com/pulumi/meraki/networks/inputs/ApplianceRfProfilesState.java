// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.ApplianceRfProfilesFiveGhzSettingsArgs;
import com.pulumi.meraki.networks.inputs.ApplianceRfProfilesPerSsidSettingsArgs;
import com.pulumi.meraki.networks.inputs.ApplianceRfProfilesTwoFourGhzSettingsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceRfProfilesState extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceRfProfilesState Empty = new ApplianceRfProfilesState();

    /**
     * Settings related to 5Ghz band.
     * 
     */
    @Import(name="fiveGhzSettings")
    private @Nullable Output<ApplianceRfProfilesFiveGhzSettingsArgs> fiveGhzSettings;

    /**
     * @return Settings related to 5Ghz band.
     * 
     */
    public Optional<Output<ApplianceRfProfilesFiveGhzSettingsArgs>> fiveGhzSettings() {
        return Optional.ofNullable(this.fiveGhzSettings);
    }

    /**
     * The name of the profile.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the profile.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * ID of network this RF Profile belongs in.
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return ID of network this RF Profile belongs in.
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * Per-SSID radio settings by number.
     * 
     */
    @Import(name="perSsidSettings")
    private @Nullable Output<ApplianceRfProfilesPerSsidSettingsArgs> perSsidSettings;

    /**
     * @return Per-SSID radio settings by number.
     * 
     */
    public Optional<Output<ApplianceRfProfilesPerSsidSettingsArgs>> perSsidSettings() {
        return Optional.ofNullable(this.perSsidSettings);
    }

    /**
     * rfProfileId path parameter. Rf profile ID
     * 
     */
    @Import(name="rfProfileId")
    private @Nullable Output<String> rfProfileId;

    /**
     * @return rfProfileId path parameter. Rf profile ID
     * 
     */
    public Optional<Output<String>> rfProfileId() {
        return Optional.ofNullable(this.rfProfileId);
    }

    /**
     * Settings related to 2.4Ghz band.
     * 
     */
    @Import(name="twoFourGhzSettings")
    private @Nullable Output<ApplianceRfProfilesTwoFourGhzSettingsArgs> twoFourGhzSettings;

    /**
     * @return Settings related to 2.4Ghz band.
     * 
     */
    public Optional<Output<ApplianceRfProfilesTwoFourGhzSettingsArgs>> twoFourGhzSettings() {
        return Optional.ofNullable(this.twoFourGhzSettings);
    }

    private ApplianceRfProfilesState() {}

    private ApplianceRfProfilesState(ApplianceRfProfilesState $) {
        this.fiveGhzSettings = $.fiveGhzSettings;
        this.name = $.name;
        this.networkId = $.networkId;
        this.perSsidSettings = $.perSsidSettings;
        this.rfProfileId = $.rfProfileId;
        this.twoFourGhzSettings = $.twoFourGhzSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceRfProfilesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceRfProfilesState $;

        public Builder() {
            $ = new ApplianceRfProfilesState();
        }

        public Builder(ApplianceRfProfilesState defaults) {
            $ = new ApplianceRfProfilesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param fiveGhzSettings Settings related to 5Ghz band.
         * 
         * @return builder
         * 
         */
        public Builder fiveGhzSettings(@Nullable Output<ApplianceRfProfilesFiveGhzSettingsArgs> fiveGhzSettings) {
            $.fiveGhzSettings = fiveGhzSettings;
            return this;
        }

        /**
         * @param fiveGhzSettings Settings related to 5Ghz band.
         * 
         * @return builder
         * 
         */
        public Builder fiveGhzSettings(ApplianceRfProfilesFiveGhzSettingsArgs fiveGhzSettings) {
            return fiveGhzSettings(Output.of(fiveGhzSettings));
        }

        /**
         * @param name The name of the profile.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the profile.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkId ID of network this RF Profile belongs in.
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId ID of network this RF Profile belongs in.
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param perSsidSettings Per-SSID radio settings by number.
         * 
         * @return builder
         * 
         */
        public Builder perSsidSettings(@Nullable Output<ApplianceRfProfilesPerSsidSettingsArgs> perSsidSettings) {
            $.perSsidSettings = perSsidSettings;
            return this;
        }

        /**
         * @param perSsidSettings Per-SSID radio settings by number.
         * 
         * @return builder
         * 
         */
        public Builder perSsidSettings(ApplianceRfProfilesPerSsidSettingsArgs perSsidSettings) {
            return perSsidSettings(Output.of(perSsidSettings));
        }

        /**
         * @param rfProfileId rfProfileId path parameter. Rf profile ID
         * 
         * @return builder
         * 
         */
        public Builder rfProfileId(@Nullable Output<String> rfProfileId) {
            $.rfProfileId = rfProfileId;
            return this;
        }

        /**
         * @param rfProfileId rfProfileId path parameter. Rf profile ID
         * 
         * @return builder
         * 
         */
        public Builder rfProfileId(String rfProfileId) {
            return rfProfileId(Output.of(rfProfileId));
        }

        /**
         * @param twoFourGhzSettings Settings related to 2.4Ghz band.
         * 
         * @return builder
         * 
         */
        public Builder twoFourGhzSettings(@Nullable Output<ApplianceRfProfilesTwoFourGhzSettingsArgs> twoFourGhzSettings) {
            $.twoFourGhzSettings = twoFourGhzSettings;
            return this;
        }

        /**
         * @param twoFourGhzSettings Settings related to 2.4Ghz band.
         * 
         * @return builder
         * 
         */
        public Builder twoFourGhzSettings(ApplianceRfProfilesTwoFourGhzSettingsArgs twoFourGhzSettings) {
            return twoFourGhzSettings(Output.of(twoFourGhzSettings));
        }

        public ApplianceRfProfilesState build() {
            return $;
        }
    }

}
