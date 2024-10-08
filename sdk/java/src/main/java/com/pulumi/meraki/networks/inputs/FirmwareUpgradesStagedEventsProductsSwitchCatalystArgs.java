// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs Empty = new FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs();

    /**
     * The next upgrade version for the switch network
     * 
     */
    @Import(name="nextUpgrade")
    private @Nullable Output<FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs> nextUpgrade;

    /**
     * @return The next upgrade version for the switch network
     * 
     */
    public Optional<Output<FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs>> nextUpgrade() {
        return Optional.ofNullable(this.nextUpgrade);
    }

    private FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs() {}

    private FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs(FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs $) {
        this.nextUpgrade = $.nextUpgrade;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs $;

        public Builder() {
            $ = new FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs();
        }

        public Builder(FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs defaults) {
            $ = new FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nextUpgrade The next upgrade version for the switch network
         * 
         * @return builder
         * 
         */
        public Builder nextUpgrade(@Nullable Output<FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs> nextUpgrade) {
            $.nextUpgrade = nextUpgrade;
            return this;
        }

        /**
         * @param nextUpgrade The next upgrade version for the switch network
         * 
         * @return builder
         * 
         */
        public Builder nextUpgrade(FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs nextUpgrade) {
            return nextUpgrade(Output.of(nextUpgrade));
        }

        public FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs build() {
            return $;
        }
    }

}
