// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeToVersionArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs Empty = new FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs();

    /**
     * Details of the version the device will upgrade to
     * 
     */
    @Import(name="toVersion")
    private @Nullable Output<FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeToVersionArgs> toVersion;

    /**
     * @return Details of the version the device will upgrade to
     * 
     */
    public Optional<Output<FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeToVersionArgs>> toVersion() {
        return Optional.ofNullable(this.toVersion);
    }

    private FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs() {}

    private FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs(FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs $) {
        this.toVersion = $.toVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs $;

        public Builder() {
            $ = new FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs();
        }

        public Builder(FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs defaults) {
            $ = new FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param toVersion Details of the version the device will upgrade to
         * 
         * @return builder
         * 
         */
        public Builder toVersion(@Nullable Output<FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeToVersionArgs> toVersion) {
            $.toVersion = toVersion;
            return this;
        }

        /**
         * @param toVersion Details of the version the device will upgrade to
         * 
         * @return builder
         * 
         */
        public Builder toVersion(FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeToVersionArgs toVersion) {
            return toVersion(Output.of(toVersion));
        }

        public FirmwareUpgradesStagedEventsRollbacksItemProductsSwitchNextUpgradeArgs build() {
            return $;
        }
    }

}
