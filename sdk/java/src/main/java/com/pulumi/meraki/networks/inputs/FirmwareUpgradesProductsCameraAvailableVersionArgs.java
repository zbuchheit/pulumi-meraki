// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesProductsCameraAvailableVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesProductsCameraAvailableVersionArgs Empty = new FirmwareUpgradesProductsCameraAvailableVersionArgs();

    /**
     * Name of the firmware version
     * 
     */
    @Import(name="firmware")
    private @Nullable Output<String> firmware;

    /**
     * @return Name of the firmware version
     * 
     */
    public Optional<Output<String>> firmware() {
        return Optional.ofNullable(this.firmware);
    }

    /**
     * Firmware version identifier
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Firmware version identifier
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Release date of the firmware version
     * 
     */
    @Import(name="releaseDate")
    private @Nullable Output<String> releaseDate;

    /**
     * @return Release date of the firmware version
     * 
     */
    public Optional<Output<String>> releaseDate() {
        return Optional.ofNullable(this.releaseDate);
    }

    /**
     * Release type of the firmware version
     * 
     */
    @Import(name="releaseType")
    private @Nullable Output<String> releaseType;

    /**
     * @return Release type of the firmware version
     * 
     */
    public Optional<Output<String>> releaseType() {
        return Optional.ofNullable(this.releaseType);
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

    private FirmwareUpgradesProductsCameraAvailableVersionArgs() {}

    private FirmwareUpgradesProductsCameraAvailableVersionArgs(FirmwareUpgradesProductsCameraAvailableVersionArgs $) {
        this.firmware = $.firmware;
        this.id = $.id;
        this.releaseDate = $.releaseDate;
        this.releaseType = $.releaseType;
        this.shortName = $.shortName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesProductsCameraAvailableVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesProductsCameraAvailableVersionArgs $;

        public Builder() {
            $ = new FirmwareUpgradesProductsCameraAvailableVersionArgs();
        }

        public Builder(FirmwareUpgradesProductsCameraAvailableVersionArgs defaults) {
            $ = new FirmwareUpgradesProductsCameraAvailableVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param firmware Name of the firmware version
         * 
         * @return builder
         * 
         */
        public Builder firmware(@Nullable Output<String> firmware) {
            $.firmware = firmware;
            return this;
        }

        /**
         * @param firmware Name of the firmware version
         * 
         * @return builder
         * 
         */
        public Builder firmware(String firmware) {
            return firmware(Output.of(firmware));
        }

        /**
         * @param id Firmware version identifier
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Firmware version identifier
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param releaseDate Release date of the firmware version
         * 
         * @return builder
         * 
         */
        public Builder releaseDate(@Nullable Output<String> releaseDate) {
            $.releaseDate = releaseDate;
            return this;
        }

        /**
         * @param releaseDate Release date of the firmware version
         * 
         * @return builder
         * 
         */
        public Builder releaseDate(String releaseDate) {
            return releaseDate(Output.of(releaseDate));
        }

        /**
         * @param releaseType Release type of the firmware version
         * 
         * @return builder
         * 
         */
        public Builder releaseType(@Nullable Output<String> releaseType) {
            $.releaseType = releaseType;
            return this;
        }

        /**
         * @param releaseType Release type of the firmware version
         * 
         * @return builder
         * 
         */
        public Builder releaseType(String releaseType) {
            return releaseType(Output.of(releaseType));
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

        public FirmwareUpgradesProductsCameraAvailableVersionArgs build() {
            return $;
        }
    }

}
