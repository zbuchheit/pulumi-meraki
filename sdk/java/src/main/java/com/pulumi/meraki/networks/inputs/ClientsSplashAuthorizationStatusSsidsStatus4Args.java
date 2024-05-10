// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientsSplashAuthorizationStatusSsidsStatus4Args extends com.pulumi.resources.ResourceArgs {

    public static final ClientsSplashAuthorizationStatusSsidsStatus4Args Empty = new ClientsSplashAuthorizationStatusSsidsStatus4Args();

    /**
     * New authorization status for the SSID (true, false).
     * 
     */
    @Import(name="isAuthorized")
    private @Nullable Output<Boolean> isAuthorized;

    /**
     * @return New authorization status for the SSID (true, false).
     * 
     */
    public Optional<Output<Boolean>> isAuthorized() {
        return Optional.ofNullable(this.isAuthorized);
    }

    private ClientsSplashAuthorizationStatusSsidsStatus4Args() {}

    private ClientsSplashAuthorizationStatusSsidsStatus4Args(ClientsSplashAuthorizationStatusSsidsStatus4Args $) {
        this.isAuthorized = $.isAuthorized;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientsSplashAuthorizationStatusSsidsStatus4Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientsSplashAuthorizationStatusSsidsStatus4Args $;

        public Builder() {
            $ = new ClientsSplashAuthorizationStatusSsidsStatus4Args();
        }

        public Builder(ClientsSplashAuthorizationStatusSsidsStatus4Args defaults) {
            $ = new ClientsSplashAuthorizationStatusSsidsStatus4Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param isAuthorized New authorization status for the SSID (true, false).
         * 
         * @return builder
         * 
         */
        public Builder isAuthorized(@Nullable Output<Boolean> isAuthorized) {
            $.isAuthorized = isAuthorized;
            return this;
        }

        /**
         * @param isAuthorized New authorization status for the SSID (true, false).
         * 
         * @return builder
         * 
         */
        public Builder isAuthorized(Boolean isAuthorized) {
            return isAuthorized(Output.of(isAuthorized));
        }

        public ClientsSplashAuthorizationStatusSsidsStatus4Args build() {
            return $;
        }
    }

}
