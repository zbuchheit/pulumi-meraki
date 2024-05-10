// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesStagedEventsProductsSwitchArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesStagedEventsProductsSwitchArgs Empty = new FirmwareUpgradesStagedEventsProductsSwitchArgs();

    /**
     * Details of the next firmware upgrade
     * 
     */
    @Import(name="nextUpgrade")
    private @Nullable Output<FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeArgs> nextUpgrade;

    /**
     * @return Details of the next firmware upgrade
     * 
     */
    public Optional<Output<FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeArgs>> nextUpgrade() {
        return Optional.ofNullable(this.nextUpgrade);
    }

    private FirmwareUpgradesStagedEventsProductsSwitchArgs() {}

    private FirmwareUpgradesStagedEventsProductsSwitchArgs(FirmwareUpgradesStagedEventsProductsSwitchArgs $) {
        this.nextUpgrade = $.nextUpgrade;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesStagedEventsProductsSwitchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesStagedEventsProductsSwitchArgs $;

        public Builder() {
            $ = new FirmwareUpgradesStagedEventsProductsSwitchArgs();
        }

        public Builder(FirmwareUpgradesStagedEventsProductsSwitchArgs defaults) {
            $ = new FirmwareUpgradesStagedEventsProductsSwitchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nextUpgrade Details of the next firmware upgrade
         * 
         * @return builder
         * 
         */
        public Builder nextUpgrade(@Nullable Output<FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeArgs> nextUpgrade) {
            $.nextUpgrade = nextUpgrade;
            return this;
        }

        /**
         * @param nextUpgrade Details of the next firmware upgrade
         * 
         * @return builder
         * 
         */
        public Builder nextUpgrade(FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeArgs nextUpgrade) {
            return nextUpgrade(Output.of(nextUpgrade));
        }

        public FirmwareUpgradesStagedEventsProductsSwitchArgs build() {
            return $;
        }
    }

}
