// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientsSplashAuthorizationStatusSsidsStatus2Args extends com.pulumi.resources.ResourceArgs {

    public static final ClientsSplashAuthorizationStatusSsidsStatus2Args Empty = new ClientsSplashAuthorizationStatusSsidsStatus2Args();

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

    private ClientsSplashAuthorizationStatusSsidsStatus2Args() {}

    private ClientsSplashAuthorizationStatusSsidsStatus2Args(ClientsSplashAuthorizationStatusSsidsStatus2Args $) {
        this.isAuthorized = $.isAuthorized;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientsSplashAuthorizationStatusSsidsStatus2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientsSplashAuthorizationStatusSsidsStatus2Args $;

        public Builder() {
            $ = new ClientsSplashAuthorizationStatusSsidsStatus2Args();
        }

        public Builder(ClientsSplashAuthorizationStatusSsidsStatus2Args defaults) {
            $ = new ClientsSplashAuthorizationStatusSsidsStatus2Args(Objects.requireNonNull(defaults));
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

        public ClientsSplashAuthorizationStatusSsidsStatus2Args build() {
            return $;
        }
    }

}
