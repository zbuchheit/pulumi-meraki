// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetConfigTemplatesSwitchProfilesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigTemplatesSwitchProfilesPlainArgs Empty = new GetConfigTemplatesSwitchProfilesPlainArgs();

    /**
     * configTemplateId path parameter. Config template ID
     * 
     */
    @Import(name="configTemplateId", required=true)
    private String configTemplateId;

    /**
     * @return configTemplateId path parameter. Config template ID
     * 
     */
    public String configTemplateId() {
        return this.configTemplateId;
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

    private GetConfigTemplatesSwitchProfilesPlainArgs() {}

    private GetConfigTemplatesSwitchProfilesPlainArgs(GetConfigTemplatesSwitchProfilesPlainArgs $) {
        this.configTemplateId = $.configTemplateId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigTemplatesSwitchProfilesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigTemplatesSwitchProfilesPlainArgs $;

        public Builder() {
            $ = new GetConfigTemplatesSwitchProfilesPlainArgs();
        }

        public Builder(GetConfigTemplatesSwitchProfilesPlainArgs defaults) {
            $ = new GetConfigTemplatesSwitchProfilesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configTemplateId configTemplateId path parameter. Config template ID
         * 
         * @return builder
         * 
         */
        public Builder configTemplateId(String configTemplateId) {
            $.configTemplateId = configTemplateId;
            return this;
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

        public GetConfigTemplatesSwitchProfilesPlainArgs build() {
            if ($.configTemplateId == null) {
                throw new MissingRequiredPropertyException("GetConfigTemplatesSwitchProfilesPlainArgs", "configTemplateId");
            }
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetConfigTemplatesSwitchProfilesPlainArgs", "organizationId");
            }
            return $;
        }
    }

}
