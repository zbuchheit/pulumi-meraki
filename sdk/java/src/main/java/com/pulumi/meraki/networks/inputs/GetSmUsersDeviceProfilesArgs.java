// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSmUsersDeviceProfilesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSmUsersDeviceProfilesArgs Empty = new GetSmUsersDeviceProfilesArgs();

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
     * userId path parameter. User ID
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return userId path parameter. User ID
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private GetSmUsersDeviceProfilesArgs() {}

    private GetSmUsersDeviceProfilesArgs(GetSmUsersDeviceProfilesArgs $) {
        this.networkId = $.networkId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSmUsersDeviceProfilesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSmUsersDeviceProfilesArgs $;

        public Builder() {
            $ = new GetSmUsersDeviceProfilesArgs();
        }

        public Builder(GetSmUsersDeviceProfilesArgs defaults) {
            $ = new GetSmUsersDeviceProfilesArgs(Objects.requireNonNull(defaults));
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
         * @param userId userId path parameter. User ID
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId userId path parameter. User ID
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public GetSmUsersDeviceProfilesArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetSmUsersDeviceProfilesArgs", "networkId");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("GetSmUsersDeviceProfilesArgs", "userId");
            }
            return $;
        }
    }

}
