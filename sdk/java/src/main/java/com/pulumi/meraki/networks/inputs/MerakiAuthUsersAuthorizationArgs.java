// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MerakiAuthUsersAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final MerakiAuthUsersAuthorizationArgs Empty = new MerakiAuthUsersAuthorizationArgs();

    /**
     * User is authorized by the account email address
     * 
     */
    @Import(name="authorizedByEmail")
    private @Nullable Output<String> authorizedByEmail;

    /**
     * @return User is authorized by the account email address
     * 
     */
    public Optional<Output<String>> authorizedByEmail() {
        return Optional.ofNullable(this.authorizedByEmail);
    }

    /**
     * User is authorized by the account name
     * 
     */
    @Import(name="authorizedByName")
    private @Nullable Output<String> authorizedByName;

    /**
     * @return User is authorized by the account name
     * 
     */
    public Optional<Output<String>> authorizedByName() {
        return Optional.ofNullable(this.authorizedByName);
    }

    /**
     * Authorized zone of the user
     * 
     */
    @Import(name="authorizedZone")
    private @Nullable Output<String> authorizedZone;

    /**
     * @return Authorized zone of the user
     * 
     */
    public Optional<Output<String>> authorizedZone() {
        return Optional.ofNullable(this.authorizedZone);
    }

    /**
     * Authorization expiration time
     * 
     */
    @Import(name="expiresAt")
    private @Nullable Output<String> expiresAt;

    /**
     * @return Authorization expiration time
     * 
     */
    public Optional<Output<String>> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }

    /**
     * SSID number
     * 
     */
    @Import(name="ssidNumber")
    private @Nullable Output<Integer> ssidNumber;

    /**
     * @return SSID number
     * 
     */
    public Optional<Output<Integer>> ssidNumber() {
        return Optional.ofNullable(this.ssidNumber);
    }

    private MerakiAuthUsersAuthorizationArgs() {}

    private MerakiAuthUsersAuthorizationArgs(MerakiAuthUsersAuthorizationArgs $) {
        this.authorizedByEmail = $.authorizedByEmail;
        this.authorizedByName = $.authorizedByName;
        this.authorizedZone = $.authorizedZone;
        this.expiresAt = $.expiresAt;
        this.ssidNumber = $.ssidNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MerakiAuthUsersAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MerakiAuthUsersAuthorizationArgs $;

        public Builder() {
            $ = new MerakiAuthUsersAuthorizationArgs();
        }

        public Builder(MerakiAuthUsersAuthorizationArgs defaults) {
            $ = new MerakiAuthUsersAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizedByEmail User is authorized by the account email address
         * 
         * @return builder
         * 
         */
        public Builder authorizedByEmail(@Nullable Output<String> authorizedByEmail) {
            $.authorizedByEmail = authorizedByEmail;
            return this;
        }

        /**
         * @param authorizedByEmail User is authorized by the account email address
         * 
         * @return builder
         * 
         */
        public Builder authorizedByEmail(String authorizedByEmail) {
            return authorizedByEmail(Output.of(authorizedByEmail));
        }

        /**
         * @param authorizedByName User is authorized by the account name
         * 
         * @return builder
         * 
         */
        public Builder authorizedByName(@Nullable Output<String> authorizedByName) {
            $.authorizedByName = authorizedByName;
            return this;
        }

        /**
         * @param authorizedByName User is authorized by the account name
         * 
         * @return builder
         * 
         */
        public Builder authorizedByName(String authorizedByName) {
            return authorizedByName(Output.of(authorizedByName));
        }

        /**
         * @param authorizedZone Authorized zone of the user
         * 
         * @return builder
         * 
         */
        public Builder authorizedZone(@Nullable Output<String> authorizedZone) {
            $.authorizedZone = authorizedZone;
            return this;
        }

        /**
         * @param authorizedZone Authorized zone of the user
         * 
         * @return builder
         * 
         */
        public Builder authorizedZone(String authorizedZone) {
            return authorizedZone(Output.of(authorizedZone));
        }

        /**
         * @param expiresAt Authorization expiration time
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(@Nullable Output<String> expiresAt) {
            $.expiresAt = expiresAt;
            return this;
        }

        /**
         * @param expiresAt Authorization expiration time
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(String expiresAt) {
            return expiresAt(Output.of(expiresAt));
        }

        /**
         * @param ssidNumber SSID number
         * 
         * @return builder
         * 
         */
        public Builder ssidNumber(@Nullable Output<Integer> ssidNumber) {
            $.ssidNumber = ssidNumber;
            return this;
        }

        /**
         * @param ssidNumber SSID number
         * 
         * @return builder
         * 
         */
        public Builder ssidNumber(Integer ssidNumber) {
            return ssidNumber(Output.of(ssidNumber));
        }

        public MerakiAuthUsersAuthorizationArgs build() {
            return $;
        }
    }

}