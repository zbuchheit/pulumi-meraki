// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeToVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeToVersionArgs Empty = new FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeToVersionArgs();

    /**
     * Id of the Version being upgraded to
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Id of the Version being upgraded to
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Firmware version short name
     * 
     */
    @Import(name="shortName")
    private @Nullable Output<String> shortName;

    /**
     * @return Firmware version short name
     * 
     */
    public Optional<Output<String>> shortName() {
        return Optional.ofNullable(this.shortName);
    }

    private FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeToVersionArgs() {}

    private FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeToVersionArgs(FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeToVersionArgs $) {
        this.id = $.id;
        this.shortName = $.shortName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeToVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeToVersionArgs $;

        public Builder() {
            $ = new FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeToVersionArgs();
        }

        public Builder(FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeToVersionArgs defaults) {
            $ = new FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeToVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Id of the Version being upgraded to
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Id of the Version being upgraded to
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param shortName Firmware version short name
         * 
         * @return builder
         * 
         */
        public Builder shortName(@Nullable Output<String> shortName) {
            $.shortName = shortName;
            return this;
        }

        /**
         * @param shortName Firmware version short name
         * 
         * @return builder
         * 
         */
        public Builder shortName(String shortName) {
            return shortName(Output.of(shortName));
        }

        public FirmwareUpgradesStagedEventsProductsSwitchNextUpgradeToVersionArgs build() {
            return $;
        }
    }

}
