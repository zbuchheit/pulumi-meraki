// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class SmUserAccessDevicesDeleteArgs extends com.pulumi.resources.ResourceArgs {

    public static final SmUserAccessDevicesDeleteArgs Empty = new SmUserAccessDevicesDeleteArgs();

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    /**
     * userAccessDeviceId path parameter. User access device ID
     * 
     */
    @Import(name="userAccessDeviceId", required=true)
    private Output<String> userAccessDeviceId;

    /**
     * @return userAccessDeviceId path parameter. User access device ID
     * 
     */
    public Output<String> userAccessDeviceId() {
        return this.userAccessDeviceId;
    }

    private SmUserAccessDevicesDeleteArgs() {}

    private SmUserAccessDevicesDeleteArgs(SmUserAccessDevicesDeleteArgs $) {
        this.networkId = $.networkId;
        this.userAccessDeviceId = $.userAccessDeviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SmUserAccessDevicesDeleteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SmUserAccessDevicesDeleteArgs $;

        public Builder() {
            $ = new SmUserAccessDevicesDeleteArgs();
        }

        public Builder(SmUserAccessDevicesDeleteArgs defaults) {
            $ = new SmUserAccessDevicesDeleteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
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

        /**
         * @param userAccessDeviceId userAccessDeviceId path parameter. User access device ID
         * 
         * @return builder
         * 
         */
        public Builder userAccessDeviceId(Output<String> userAccessDeviceId) {
            $.userAccessDeviceId = userAccessDeviceId;
            return this;
        }

        /**
         * @param userAccessDeviceId userAccessDeviceId path parameter. User access device ID
         * 
         * @return builder
         * 
         */
        public Builder userAccessDeviceId(String userAccessDeviceId) {
            return userAccessDeviceId(Output.of(userAccessDeviceId));
        }

        public SmUserAccessDevicesDeleteArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("SmUserAccessDevicesDeleteArgs", "networkId");
            }
            if ($.userAccessDeviceId == null) {
                throw new MissingRequiredPropertyException("SmUserAccessDevicesDeleteArgs", "userAccessDeviceId");
            }
            return $;
        }
    }

}
