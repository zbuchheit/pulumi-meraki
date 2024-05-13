// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceRadioSettingsTwoFourGhzSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceRadioSettingsTwoFourGhzSettingsArgs Empty = new ApplianceRadioSettingsTwoFourGhzSettingsArgs();

    /**
     * Manual channel for 2.4 GHz
     * 
     */
    @Import(name="channel")
    private @Nullable Output<Integer> channel;

    /**
     * @return Manual channel for 2.4 GHz
     * 
     */
    public Optional<Output<Integer>> channel() {
        return Optional.ofNullable(this.channel);
    }

    /**
     * Manual target power for 2.4 GHz
     * 
     */
    @Import(name="targetPower")
    private @Nullable Output<Integer> targetPower;

    /**
     * @return Manual target power for 2.4 GHz
     * 
     */
    public Optional<Output<Integer>> targetPower() {
        return Optional.ofNullable(this.targetPower);
    }

    private ApplianceRadioSettingsTwoFourGhzSettingsArgs() {}

    private ApplianceRadioSettingsTwoFourGhzSettingsArgs(ApplianceRadioSettingsTwoFourGhzSettingsArgs $) {
        this.channel = $.channel;
        this.targetPower = $.targetPower;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceRadioSettingsTwoFourGhzSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceRadioSettingsTwoFourGhzSettingsArgs $;

        public Builder() {
            $ = new ApplianceRadioSettingsTwoFourGhzSettingsArgs();
        }

        public Builder(ApplianceRadioSettingsTwoFourGhzSettingsArgs defaults) {
            $ = new ApplianceRadioSettingsTwoFourGhzSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param channel Manual channel for 2.4 GHz
         * 
         * @return builder
         * 
         */
        public Builder channel(@Nullable Output<Integer> channel) {
            $.channel = channel;
            return this;
        }

        /**
         * @param channel Manual channel for 2.4 GHz
         * 
         * @return builder
         * 
         */
        public Builder channel(Integer channel) {
            return channel(Output.of(channel));
        }

        /**
         * @param targetPower Manual target power for 2.4 GHz
         * 
         * @return builder
         * 
         */
        public Builder targetPower(@Nullable Output<Integer> targetPower) {
            $.targetPower = targetPower;
            return this;
        }

        /**
         * @param targetPower Manual target power for 2.4 GHz
         * 
         * @return builder
         * 
         */
        public Builder targetPower(Integer targetPower) {
            return targetPower(Output.of(targetPower));
        }

        public ApplianceRadioSettingsTwoFourGhzSettingsArgs build() {
            return $;
        }
    }

}