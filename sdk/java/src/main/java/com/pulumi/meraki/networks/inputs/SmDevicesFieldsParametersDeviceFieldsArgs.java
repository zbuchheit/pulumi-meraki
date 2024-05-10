// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SmDevicesFieldsParametersDeviceFieldsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SmDevicesFieldsParametersDeviceFieldsArgs Empty = new SmDevicesFieldsParametersDeviceFieldsArgs();

    /**
     * New name for the device
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return New name for the device
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * New notes for the device
     * 
     */
    @Import(name="notes")
    private @Nullable Output<String> notes;

    /**
     * @return New notes for the device
     * 
     */
    public Optional<Output<String>> notes() {
        return Optional.ofNullable(this.notes);
    }

    private SmDevicesFieldsParametersDeviceFieldsArgs() {}

    private SmDevicesFieldsParametersDeviceFieldsArgs(SmDevicesFieldsParametersDeviceFieldsArgs $) {
        this.name = $.name;
        this.notes = $.notes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SmDevicesFieldsParametersDeviceFieldsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SmDevicesFieldsParametersDeviceFieldsArgs $;

        public Builder() {
            $ = new SmDevicesFieldsParametersDeviceFieldsArgs();
        }

        public Builder(SmDevicesFieldsParametersDeviceFieldsArgs defaults) {
            $ = new SmDevicesFieldsParametersDeviceFieldsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name New name for the device
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name New name for the device
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notes New notes for the device
         * 
         * @return builder
         * 
         */
        public Builder notes(@Nullable Output<String> notes) {
            $.notes = notes;
            return this;
        }

        /**
         * @param notes New notes for the device
         * 
         * @return builder
         * 
         */
        public Builder notes(String notes) {
            return notes(Output.of(notes));
        }

        public SmDevicesFieldsParametersDeviceFieldsArgs build() {
            return $;
        }
    }

}
