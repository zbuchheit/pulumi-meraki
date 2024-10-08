// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesProductsCellularGatewayNextUpgradeToVersionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesProductsCellularGatewayNextUpgradeArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesProductsCellularGatewayNextUpgradeArgs Empty = new FirmwareUpgradesProductsCellularGatewayNextUpgradeArgs();

    /**
     * Timestamp of the next scheduled firmware upgrade
     * 
     */
    @Import(name="time")
    private @Nullable Output<String> time;

    /**
     * @return Timestamp of the next scheduled firmware upgrade
     * 
     */
    public Optional<Output<String>> time() {
        return Optional.ofNullable(this.time);
    }

    /**
     * Details of the version the device will upgrade to if it exists
     * 
     */
    @Import(name="toVersion")
    private @Nullable Output<FirmwareUpgradesProductsCellularGatewayNextUpgradeToVersionArgs> toVersion;

    /**
     * @return Details of the version the device will upgrade to if it exists
     * 
     */
    public Optional<Output<FirmwareUpgradesProductsCellularGatewayNextUpgradeToVersionArgs>> toVersion() {
        return Optional.ofNullable(this.toVersion);
    }

    private FirmwareUpgradesProductsCellularGatewayNextUpgradeArgs() {}

    private FirmwareUpgradesProductsCellularGatewayNextUpgradeArgs(FirmwareUpgradesProductsCellularGatewayNextUpgradeArgs $) {
        this.time = $.time;
        this.toVersion = $.toVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesProductsCellularGatewayNextUpgradeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesProductsCellularGatewayNextUpgradeArgs $;

        public Builder() {
            $ = new FirmwareUpgradesProductsCellularGatewayNextUpgradeArgs();
        }

        public Builder(FirmwareUpgradesProductsCellularGatewayNextUpgradeArgs defaults) {
            $ = new FirmwareUpgradesProductsCellularGatewayNextUpgradeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param time Timestamp of the next scheduled firmware upgrade
         * 
         * @return builder
         * 
         */
        public Builder time(@Nullable Output<String> time) {
            $.time = time;
            return this;
        }

        /**
         * @param time Timestamp of the next scheduled firmware upgrade
         * 
         * @return builder
         * 
         */
        public Builder time(String time) {
            return time(Output.of(time));
        }

        /**
         * @param toVersion Details of the version the device will upgrade to if it exists
         * 
         * @return builder
         * 
         */
        public Builder toVersion(@Nullable Output<FirmwareUpgradesProductsCellularGatewayNextUpgradeToVersionArgs> toVersion) {
            $.toVersion = toVersion;
            return this;
        }

        /**
         * @param toVersion Details of the version the device will upgrade to if it exists
         * 
         * @return builder
         * 
         */
        public Builder toVersion(FirmwareUpgradesProductsCellularGatewayNextUpgradeToVersionArgs toVersion) {
            return toVersion(Output.of(toVersion));
        }

        public FirmwareUpgradesProductsCellularGatewayNextUpgradeArgs build() {
            return $;
        }
    }

}
