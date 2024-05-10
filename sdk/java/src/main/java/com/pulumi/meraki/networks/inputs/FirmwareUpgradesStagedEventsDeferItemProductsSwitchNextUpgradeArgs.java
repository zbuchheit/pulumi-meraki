// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeToVersionArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs Empty = new FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs();

    /**
     * Details of the version the device will upgrade to
     * 
     */
    @Import(name="toVersion")
    private @Nullable Output<FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeToVersionArgs> toVersion;

    /**
     * @return Details of the version the device will upgrade to
     * 
     */
    public Optional<Output<FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeToVersionArgs>> toVersion() {
        return Optional.ofNullable(this.toVersion);
    }

    private FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs() {}

    private FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs(FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs $) {
        this.toVersion = $.toVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs $;

        public Builder() {
            $ = new FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs();
        }

        public Builder(FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs defaults) {
            $ = new FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param toVersion Details of the version the device will upgrade to
         * 
         * @return builder
         * 
         */
        public Builder toVersion(@Nullable Output<FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeToVersionArgs> toVersion) {
            $.toVersion = toVersion;
            return this;
        }

        /**
         * @param toVersion Details of the version the device will upgrade to
         * 
         * @return builder
         * 
         */
        public Builder toVersion(FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeToVersionArgs toVersion) {
            return toVersion(Output.of(toVersion));
        }

        public FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs build() {
            return $;
        }
    }

}
