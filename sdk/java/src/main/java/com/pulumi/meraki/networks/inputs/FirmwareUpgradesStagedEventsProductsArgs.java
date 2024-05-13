// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedEventsProductsSwitchArgs;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesStagedEventsProductsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesStagedEventsProductsArgs Empty = new FirmwareUpgradesStagedEventsProductsArgs();

    /**
     * The Switch network to be updated
     * 
     */
    @Import(name="switch")
    private @Nullable Output<FirmwareUpgradesStagedEventsProductsSwitchArgs> switch_;

    /**
     * @return The Switch network to be updated
     * 
     */
    public Optional<Output<FirmwareUpgradesStagedEventsProductsSwitchArgs>> switch_() {
        return Optional.ofNullable(this.switch_);
    }

    /**
     * Version information for the switch network being upgraded
     * 
     */
    @Import(name="switchCatalyst")
    private @Nullable Output<FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs> switchCatalyst;

    /**
     * @return Version information for the switch network being upgraded
     * 
     */
    public Optional<Output<FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs>> switchCatalyst() {
        return Optional.ofNullable(this.switchCatalyst);
    }

    private FirmwareUpgradesStagedEventsProductsArgs() {}

    private FirmwareUpgradesStagedEventsProductsArgs(FirmwareUpgradesStagedEventsProductsArgs $) {
        this.switch_ = $.switch_;
        this.switchCatalyst = $.switchCatalyst;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesStagedEventsProductsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesStagedEventsProductsArgs $;

        public Builder() {
            $ = new FirmwareUpgradesStagedEventsProductsArgs();
        }

        public Builder(FirmwareUpgradesStagedEventsProductsArgs defaults) {
            $ = new FirmwareUpgradesStagedEventsProductsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param switch_ The Switch network to be updated
         * 
         * @return builder
         * 
         */
        public Builder switch_(@Nullable Output<FirmwareUpgradesStagedEventsProductsSwitchArgs> switch_) {
            $.switch_ = switch_;
            return this;
        }

        /**
         * @param switch_ The Switch network to be updated
         * 
         * @return builder
         * 
         */
        public Builder switch_(FirmwareUpgradesStagedEventsProductsSwitchArgs switch_) {
            return switch_(Output.of(switch_));
        }

        /**
         * @param switchCatalyst Version information for the switch network being upgraded
         * 
         * @return builder
         * 
         */
        public Builder switchCatalyst(@Nullable Output<FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs> switchCatalyst) {
            $.switchCatalyst = switchCatalyst;
            return this;
        }

        /**
         * @param switchCatalyst Version information for the switch network being upgraded
         * 
         * @return builder
         * 
         */
        public Builder switchCatalyst(FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs switchCatalyst) {
            return switchCatalyst(Output.of(switchCatalyst));
        }

        public FirmwareUpgradesStagedEventsProductsArgs build() {
            return $;
        }
    }

}