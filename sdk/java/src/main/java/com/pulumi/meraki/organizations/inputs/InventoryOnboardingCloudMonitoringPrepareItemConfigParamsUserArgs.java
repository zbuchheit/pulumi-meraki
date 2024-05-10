// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserArgs Empty = new InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserArgs();

    /**
     * The public key for the registered user
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return The public key for the registered user
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    /**
     * Stores the user secret hash
     * 
     */
    @Import(name="secret")
    private @Nullable Output<InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs> secret;

    /**
     * @return Stores the user secret hash
     * 
     */
    public Optional<Output<InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs>> secret() {
        return Optional.ofNullable(this.secret);
    }

    /**
     * The username added to Catalyst device
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The username added to Catalyst device
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserArgs() {}

    private InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserArgs(InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserArgs $) {
        this.publicKey = $.publicKey;
        this.secret = $.secret;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserArgs $;

        public Builder() {
            $ = new InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserArgs();
        }

        public Builder(InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserArgs defaults) {
            $ = new InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param publicKey The public key for the registered user
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey The public key for the registered user
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        /**
         * @param secret Stores the user secret hash
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Stores the user secret hash
         * 
         * @return builder
         * 
         */
        public Builder secret(InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param username The username added to Catalyst device
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username added to Catalyst device
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserArgs build() {
            return $;
        }
    }

}
