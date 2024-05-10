// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdaptivePolicySettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AdaptivePolicySettingsArgs Empty = new AdaptivePolicySettingsArgs();

    /**
     * List of network IDs with adaptive policy enabled
     * 
     */
    @Import(name="enabledNetworks")
    private @Nullable Output<List<String>> enabledNetworks;

    /**
     * @return List of network IDs with adaptive policy enabled
     * 
     */
    public Optional<Output<List<String>>> enabledNetworks() {
        return Optional.ofNullable(this.enabledNetworks);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    private AdaptivePolicySettingsArgs() {}

    private AdaptivePolicySettingsArgs(AdaptivePolicySettingsArgs $) {
        this.enabledNetworks = $.enabledNetworks;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdaptivePolicySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdaptivePolicySettingsArgs $;

        public Builder() {
            $ = new AdaptivePolicySettingsArgs();
        }

        public Builder(AdaptivePolicySettingsArgs defaults) {
            $ = new AdaptivePolicySettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabledNetworks List of network IDs with adaptive policy enabled
         * 
         * @return builder
         * 
         */
        public Builder enabledNetworks(@Nullable Output<List<String>> enabledNetworks) {
            $.enabledNetworks = enabledNetworks;
            return this;
        }

        /**
         * @param enabledNetworks List of network IDs with adaptive policy enabled
         * 
         * @return builder
         * 
         */
        public Builder enabledNetworks(List<String> enabledNetworks) {
            return enabledNetworks(Output.of(enabledNetworks));
        }

        /**
         * @param enabledNetworks List of network IDs with adaptive policy enabled
         * 
         * @return builder
         * 
         */
        public Builder enabledNetworks(String... enabledNetworks) {
            return enabledNetworks(List.of(enabledNetworks));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public AdaptivePolicySettingsArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("AdaptivePolicySettingsArgs", "organizationId");
            }
            return $;
        }
    }

}
