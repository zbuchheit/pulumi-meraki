// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConfigTemplatesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigTemplatesArgs Empty = new GetConfigTemplatesArgs();

    /**
     * configTemplateId path parameter. Config template ID
     * 
     */
    @Import(name="configTemplateId")
    private @Nullable Output<String> configTemplateId;

    /**
     * @return configTemplateId path parameter. Config template ID
     * 
     */
    public Optional<Output<String>> configTemplateId() {
        return Optional.ofNullable(this.configTemplateId);
    }

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

    private GetConfigTemplatesArgs() {}

    private GetConfigTemplatesArgs(GetConfigTemplatesArgs $) {
        this.configTemplateId = $.configTemplateId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigTemplatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigTemplatesArgs $;

        public Builder() {
            $ = new GetConfigTemplatesArgs();
        }

        public Builder(GetConfigTemplatesArgs defaults) {
            $ = new GetConfigTemplatesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configTemplateId configTemplateId path parameter. Config template ID
         * 
         * @return builder
         * 
         */
        public Builder configTemplateId(@Nullable Output<String> configTemplateId) {
            $.configTemplateId = configTemplateId;
            return this;
        }

        /**
         * @param configTemplateId configTemplateId path parameter. Config template ID
         * 
         * @return builder
         * 
         */
        public Builder configTemplateId(String configTemplateId) {
            return configTemplateId(Output.of(configTemplateId));
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

        public GetConfigTemplatesArgs build() {
            return $;
        }
    }

}
