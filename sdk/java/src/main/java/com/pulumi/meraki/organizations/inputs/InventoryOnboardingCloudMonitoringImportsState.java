// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.InventoryOnboardingCloudMonitoringImportsParametersArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InventoryOnboardingCloudMonitoringImportsState extends com.pulumi.resources.ResourceArgs {

    public static final InventoryOnboardingCloudMonitoringImportsState Empty = new InventoryOnboardingCloudMonitoringImportsState();

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    @Import(name="parameters")
    private @Nullable Output<InventoryOnboardingCloudMonitoringImportsParametersArgs> parameters;

    public Optional<Output<InventoryOnboardingCloudMonitoringImportsParametersArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private InventoryOnboardingCloudMonitoringImportsState() {}

    private InventoryOnboardingCloudMonitoringImportsState(InventoryOnboardingCloudMonitoringImportsState $) {
        this.organizationId = $.organizationId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryOnboardingCloudMonitoringImportsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryOnboardingCloudMonitoringImportsState $;

        public Builder() {
            $ = new InventoryOnboardingCloudMonitoringImportsState();
        }

        public Builder(InventoryOnboardingCloudMonitoringImportsState defaults) {
            $ = new InventoryOnboardingCloudMonitoringImportsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
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

        public Builder parameters(@Nullable Output<InventoryOnboardingCloudMonitoringImportsParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(InventoryOnboardingCloudMonitoringImportsParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public InventoryOnboardingCloudMonitoringImportsState build() {
            return $;
        }
    }

}
