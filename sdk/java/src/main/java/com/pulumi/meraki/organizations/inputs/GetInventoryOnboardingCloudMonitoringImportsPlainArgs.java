// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInventoryOnboardingCloudMonitoringImportsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInventoryOnboardingCloudMonitoringImportsPlainArgs Empty = new GetInventoryOnboardingCloudMonitoringImportsPlainArgs();

    /**
     * importIds query parameter. import ids from an imports
     * 
     */
    @Import(name="importIds", required=true)
    private List<String> importIds;

    /**
     * @return importIds query parameter. import ids from an imports
     * 
     */
    public List<String> importIds() {
        return this.importIds;
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private String organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }

    private GetInventoryOnboardingCloudMonitoringImportsPlainArgs() {}

    private GetInventoryOnboardingCloudMonitoringImportsPlainArgs(GetInventoryOnboardingCloudMonitoringImportsPlainArgs $) {
        this.importIds = $.importIds;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInventoryOnboardingCloudMonitoringImportsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInventoryOnboardingCloudMonitoringImportsPlainArgs $;

        public Builder() {
            $ = new GetInventoryOnboardingCloudMonitoringImportsPlainArgs();
        }

        public Builder(GetInventoryOnboardingCloudMonitoringImportsPlainArgs defaults) {
            $ = new GetInventoryOnboardingCloudMonitoringImportsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param importIds importIds query parameter. import ids from an imports
         * 
         * @return builder
         * 
         */
        public Builder importIds(List<String> importIds) {
            $.importIds = importIds;
            return this;
        }

        /**
         * @param importIds importIds query parameter. import ids from an imports
         * 
         * @return builder
         * 
         */
        public Builder importIds(String... importIds) {
            return importIds(List.of(importIds));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetInventoryOnboardingCloudMonitoringImportsPlainArgs build() {
            if ($.importIds == null) {
                throw new MissingRequiredPropertyException("GetInventoryOnboardingCloudMonitoringImportsPlainArgs", "importIds");
            }
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetInventoryOnboardingCloudMonitoringImportsPlainArgs", "organizationId");
            }
            return $;
        }
    }

}
