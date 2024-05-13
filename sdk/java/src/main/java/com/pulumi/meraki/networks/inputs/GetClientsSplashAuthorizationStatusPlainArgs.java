// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetClientsSplashAuthorizationStatusPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClientsSplashAuthorizationStatusPlainArgs Empty = new GetClientsSplashAuthorizationStatusPlainArgs();

    /**
     * clientId path parameter. Client ID
     * 
     */
    @Import(name="clientId", required=true)
    private String clientId;

    /**
     * @return clientId path parameter. Client ID
     * 
     */
    public String clientId() {
        return this.clientId;
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

    private GetClientsSplashAuthorizationStatusPlainArgs() {}

    private GetClientsSplashAuthorizationStatusPlainArgs(GetClientsSplashAuthorizationStatusPlainArgs $) {
        this.clientId = $.clientId;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClientsSplashAuthorizationStatusPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClientsSplashAuthorizationStatusPlainArgs $;

        public Builder() {
            $ = new GetClientsSplashAuthorizationStatusPlainArgs();
        }

        public Builder(GetClientsSplashAuthorizationStatusPlainArgs defaults) {
            $ = new GetClientsSplashAuthorizationStatusPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId clientId path parameter. Client ID
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            $.clientId = clientId;
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

        public GetClientsSplashAuthorizationStatusPlainArgs build() {
            if ($.clientId == null) {
                throw new MissingRequiredPropertyException("GetClientsSplashAuthorizationStatusPlainArgs", "clientId");
            }
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetClientsSplashAuthorizationStatusPlainArgs", "networkId");
            }
            return $;
        }
    }

}