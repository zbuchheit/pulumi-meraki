// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSmDevicesCellularUsageHistoryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSmDevicesCellularUsageHistoryPlainArgs Empty = new GetSmDevicesCellularUsageHistoryPlainArgs();

    /**
     * deviceId path parameter. Device ID
     * 
     */
    @Import(name="deviceId", required=true)
    private String deviceId;

    /**
     * @return deviceId path parameter. Device ID
     * 
     */
    public String deviceId() {
        return this.deviceId;
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private String networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }

    private GetSmDevicesCellularUsageHistoryPlainArgs() {}

    private GetSmDevicesCellularUsageHistoryPlainArgs(GetSmDevicesCellularUsageHistoryPlainArgs $) {
        this.deviceId = $.deviceId;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSmDevicesCellularUsageHistoryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSmDevicesCellularUsageHistoryPlainArgs $;

        public Builder() {
            $ = new GetSmDevicesCellularUsageHistoryPlainArgs();
        }

        public Builder(GetSmDevicesCellularUsageHistoryPlainArgs defaults) {
            $ = new GetSmDevicesCellularUsageHistoryPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceId deviceId path parameter. Device ID
         * 
         * @return builder
         * 
         */
        public Builder deviceId(String deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            $.networkId = networkId;
            return this;
        }

        public GetSmDevicesCellularUsageHistoryPlainArgs build() {
            if ($.deviceId == null) {
                throw new MissingRequiredPropertyException("GetSmDevicesCellularUsageHistoryPlainArgs", "deviceId");
            }
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetSmDevicesCellularUsageHistoryPlainArgs", "networkId");
            }
            return $;
        }
    }

}
