// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSmDevicesSecurityCentersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSmDevicesSecurityCentersPlainArgs Empty = new GetSmDevicesSecurityCentersPlainArgs();

    /**
     * deviceId path parameter. Device ID
     * 
     */
    @Import(name="deviceId")
    private @Nullable String deviceId;

    /**
     * @return deviceId path parameter. Device ID
     * 
     */
    public Optional<String> deviceId() {
        return Optional.ofNullable(this.deviceId);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable String networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    private GetSmDevicesSecurityCentersPlainArgs() {}

    private GetSmDevicesSecurityCentersPlainArgs(GetSmDevicesSecurityCentersPlainArgs $) {
        this.deviceId = $.deviceId;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSmDevicesSecurityCentersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSmDevicesSecurityCentersPlainArgs $;

        public Builder() {
            $ = new GetSmDevicesSecurityCentersPlainArgs();
        }

        public Builder(GetSmDevicesSecurityCentersPlainArgs defaults) {
            $ = new GetSmDevicesSecurityCentersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceId deviceId path parameter. Device ID
         * 
         * @return builder
         * 
         */
        public Builder deviceId(@Nullable String deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable String networkId) {
            $.networkId = networkId;
            return this;
        }

        public GetSmDevicesSecurityCentersPlainArgs build() {
            return $;
        }
    }

}
