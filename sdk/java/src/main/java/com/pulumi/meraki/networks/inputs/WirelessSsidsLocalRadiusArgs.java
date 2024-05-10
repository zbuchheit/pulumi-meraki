// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.WirelessSsidsLocalRadiusCertificateAuthenticationArgs;
import com.pulumi.meraki.networks.inputs.WirelessSsidsLocalRadiusPasswordAuthenticationArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsLocalRadiusArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsLocalRadiusArgs Empty = new WirelessSsidsLocalRadiusArgs();

    /**
     * The duration (in seconds) for which LDAP and OCSP lookups are cached.
     * 
     */
    @Import(name="cacheTimeout")
    private @Nullable Output<Integer> cacheTimeout;

    /**
     * @return The duration (in seconds) for which LDAP and OCSP lookups are cached.
     * 
     */
    public Optional<Output<Integer>> cacheTimeout() {
        return Optional.ofNullable(this.cacheTimeout);
    }

    /**
     * The current setting for certificate verification.
     * 
     */
    @Import(name="certificateAuthentication")
    private @Nullable Output<WirelessSsidsLocalRadiusCertificateAuthenticationArgs> certificateAuthentication;

    /**
     * @return The current setting for certificate verification.
     * 
     */
    public Optional<Output<WirelessSsidsLocalRadiusCertificateAuthenticationArgs>> certificateAuthentication() {
        return Optional.ofNullable(this.certificateAuthentication);
    }

    /**
     * The current setting for password-based authentication.
     * 
     */
    @Import(name="passwordAuthentication")
    private @Nullable Output<WirelessSsidsLocalRadiusPasswordAuthenticationArgs> passwordAuthentication;

    /**
     * @return The current setting for password-based authentication.
     * 
     */
    public Optional<Output<WirelessSsidsLocalRadiusPasswordAuthenticationArgs>> passwordAuthentication() {
        return Optional.ofNullable(this.passwordAuthentication);
    }

    private WirelessSsidsLocalRadiusArgs() {}

    private WirelessSsidsLocalRadiusArgs(WirelessSsidsLocalRadiusArgs $) {
        this.cacheTimeout = $.cacheTimeout;
        this.certificateAuthentication = $.certificateAuthentication;
        this.passwordAuthentication = $.passwordAuthentication;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsLocalRadiusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsLocalRadiusArgs $;

        public Builder() {
            $ = new WirelessSsidsLocalRadiusArgs();
        }

        public Builder(WirelessSsidsLocalRadiusArgs defaults) {
            $ = new WirelessSsidsLocalRadiusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cacheTimeout The duration (in seconds) for which LDAP and OCSP lookups are cached.
         * 
         * @return builder
         * 
         */
        public Builder cacheTimeout(@Nullable Output<Integer> cacheTimeout) {
            $.cacheTimeout = cacheTimeout;
            return this;
        }

        /**
         * @param cacheTimeout The duration (in seconds) for which LDAP and OCSP lookups are cached.
         * 
         * @return builder
         * 
         */
        public Builder cacheTimeout(Integer cacheTimeout) {
            return cacheTimeout(Output.of(cacheTimeout));
        }

        /**
         * @param certificateAuthentication The current setting for certificate verification.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthentication(@Nullable Output<WirelessSsidsLocalRadiusCertificateAuthenticationArgs> certificateAuthentication) {
            $.certificateAuthentication = certificateAuthentication;
            return this;
        }

        /**
         * @param certificateAuthentication The current setting for certificate verification.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthentication(WirelessSsidsLocalRadiusCertificateAuthenticationArgs certificateAuthentication) {
            return certificateAuthentication(Output.of(certificateAuthentication));
        }

        /**
         * @param passwordAuthentication The current setting for password-based authentication.
         * 
         * @return builder
         * 
         */
        public Builder passwordAuthentication(@Nullable Output<WirelessSsidsLocalRadiusPasswordAuthenticationArgs> passwordAuthentication) {
            $.passwordAuthentication = passwordAuthentication;
            return this;
        }

        /**
         * @param passwordAuthentication The current setting for password-based authentication.
         * 
         * @return builder
         * 
         */
        public Builder passwordAuthentication(WirelessSsidsLocalRadiusPasswordAuthenticationArgs passwordAuthentication) {
            return passwordAuthentication(Output.of(passwordAuthentication));
        }

        public WirelessSsidsLocalRadiusArgs build() {
            return $;
        }
    }

}
