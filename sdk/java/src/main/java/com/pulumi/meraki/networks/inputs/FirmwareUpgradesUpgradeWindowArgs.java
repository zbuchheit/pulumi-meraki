// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesUpgradeWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesUpgradeWindowArgs Empty = new FirmwareUpgradesUpgradeWindowArgs();

    /**
     * Day of the week
     * 
     */
    @Import(name="dayOfWeek")
    private @Nullable Output<String> dayOfWeek;

    /**
     * @return Day of the week
     * 
     */
    public Optional<Output<String>> dayOfWeek() {
        return Optional.ofNullable(this.dayOfWeek);
    }

    /**
     * Hour of the day
     * 
     */
    @Import(name="hourOfDay")
    private @Nullable Output<String> hourOfDay;

    /**
     * @return Hour of the day
     * 
     */
    public Optional<Output<String>> hourOfDay() {
        return Optional.ofNullable(this.hourOfDay);
    }

    private FirmwareUpgradesUpgradeWindowArgs() {}

    private FirmwareUpgradesUpgradeWindowArgs(FirmwareUpgradesUpgradeWindowArgs $) {
        this.dayOfWeek = $.dayOfWeek;
        this.hourOfDay = $.hourOfDay;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesUpgradeWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesUpgradeWindowArgs $;

        public Builder() {
            $ = new FirmwareUpgradesUpgradeWindowArgs();
        }

        public Builder(FirmwareUpgradesUpgradeWindowArgs defaults) {
            $ = new FirmwareUpgradesUpgradeWindowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dayOfWeek Day of the week
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeek(@Nullable Output<String> dayOfWeek) {
            $.dayOfWeek = dayOfWeek;
            return this;
        }

        /**
         * @param dayOfWeek Day of the week
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeek(String dayOfWeek) {
            return dayOfWeek(Output.of(dayOfWeek));
        }

        /**
         * @param hourOfDay Hour of the day
         * 
         * @return builder
         * 
         */
        public Builder hourOfDay(@Nullable Output<String> hourOfDay) {
            $.hourOfDay = hourOfDay;
            return this;
        }

        /**
         * @param hourOfDay Hour of the day
         * 
         * @return builder
         * 
         */
        public Builder hourOfDay(String hourOfDay) {
            return hourOfDay(Output.of(hourOfDay));
        }

        public FirmwareUpgradesUpgradeWindowArgs build() {
            return $;
        }
    }

}
