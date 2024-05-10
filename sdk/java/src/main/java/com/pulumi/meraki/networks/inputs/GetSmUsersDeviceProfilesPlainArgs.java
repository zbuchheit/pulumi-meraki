// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSmUsersDeviceProfilesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSmUsersDeviceProfilesPlainArgs Empty = new GetSmUsersDeviceProfilesPlainArgs();

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

    /**
     * userId path parameter. User ID
     * 
     */
    @Import(name="userId", required=true)
    private String userId;

    /**
     * @return userId path parameter. User ID
     * 
     */
    public String userId() {
        return this.userId;
    }

    private GetSmUsersDeviceProfilesPlainArgs() {}

    private GetSmUsersDeviceProfilesPlainArgs(GetSmUsersDeviceProfilesPlainArgs $) {
        this.networkId = $.networkId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSmUsersDeviceProfilesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSmUsersDeviceProfilesPlainArgs $;

        public Builder() {
            $ = new GetSmUsersDeviceProfilesPlainArgs();
        }

        public Builder(GetSmUsersDeviceProfilesPlainArgs defaults) {
            $ = new GetSmUsersDeviceProfilesPlainArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param userId userId path parameter. User ID
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            $.userId = userId;
            return this;
        }

        public GetSmUsersDeviceProfilesPlainArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetSmUsersDeviceProfilesPlainArgs", "networkId");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("GetSmUsersDeviceProfilesPlainArgs", "userId");
            }
            return $;
        }
    }

}
