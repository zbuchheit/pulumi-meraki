// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesStagedGroupsAssignedDevicesSwitchStackArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesStagedGroupsAssignedDevicesSwitchStackArgs Empty = new FirmwareUpgradesStagedGroupsAssignedDevicesSwitchStackArgs();

    /**
     * ID of the Switch Stack
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return ID of the Switch Stack
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name of the Switch Stack
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Switch Stack
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private FirmwareUpgradesStagedGroupsAssignedDevicesSwitchStackArgs() {}

    private FirmwareUpgradesStagedGroupsAssignedDevicesSwitchStackArgs(FirmwareUpgradesStagedGroupsAssignedDevicesSwitchStackArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesStagedGroupsAssignedDevicesSwitchStackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesStagedGroupsAssignedDevicesSwitchStackArgs $;

        public Builder() {
            $ = new FirmwareUpgradesStagedGroupsAssignedDevicesSwitchStackArgs();
        }

        public Builder(FirmwareUpgradesStagedGroupsAssignedDevicesSwitchStackArgs defaults) {
            $ = new FirmwareUpgradesStagedGroupsAssignedDevicesSwitchStackArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the Switch Stack
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the Switch Stack
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Name of the Switch Stack
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Switch Stack
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public FirmwareUpgradesStagedGroupsAssignedDevicesSwitchStackArgs build() {
            return $;
        }
    }

}
