// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.SmDevicesUnenrollItemArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SmDevicesUnenrollState extends com.pulumi.resources.ResourceArgs {

    public static final SmDevicesUnenrollState Empty = new SmDevicesUnenrollState();

    /**
     * deviceId path parameter. Device ID
     * 
     */
    @Import(name="deviceId")
    private @Nullable Output<String> deviceId;

    /**
     * @return deviceId path parameter. Device ID
     * 
     */
    public Optional<Output<String>> deviceId() {
        return Optional.ofNullable(this.deviceId);
    }

    @Import(name="item")
    private @Nullable Output<SmDevicesUnenrollItemArgs> item;

    public Optional<Output<SmDevicesUnenrollItemArgs>> item() {
        return Optional.ofNullable(this.item);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    private SmDevicesUnenrollState() {}

    private SmDevicesUnenrollState(SmDevicesUnenrollState $) {
        this.deviceId = $.deviceId;
        this.item = $.item;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SmDevicesUnenrollState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SmDevicesUnenrollState $;

        public Builder() {
            $ = new SmDevicesUnenrollState();
        }

        public Builder(SmDevicesUnenrollState defaults) {
            $ = new SmDevicesUnenrollState(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceId deviceId path parameter. Device ID
         * 
         * @return builder
         * 
         */
        public Builder deviceId(@Nullable Output<String> deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        /**
         * @param deviceId deviceId path parameter. Device ID
         * 
         * @return builder
         * 
         */
        public Builder deviceId(String deviceId) {
            return deviceId(Output.of(deviceId));
        }

        public Builder item(@Nullable Output<SmDevicesUnenrollItemArgs> item) {
            $.item = item;
            return this;
        }

        public Builder item(SmDevicesUnenrollItemArgs item) {
            return item(Output.of(item));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        public SmDevicesUnenrollState build() {
            return $;
        }
    }

}
