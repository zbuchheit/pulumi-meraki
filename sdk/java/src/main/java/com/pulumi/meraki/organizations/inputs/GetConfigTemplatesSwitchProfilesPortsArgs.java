// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConfigTemplatesSwitchProfilesPortsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigTemplatesSwitchProfilesPortsArgs Empty = new GetConfigTemplatesSwitchProfilesPortsArgs();

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

    /**
     * portId path parameter. Port ID
     * 
     */
    @Import(name="portId")
    private @Nullable Output<String> portId;

    /**
     * @return portId path parameter. Port ID
     * 
     */
    public Optional<Output<String>> portId() {
        return Optional.ofNullable(this.portId);
    }

    /**
     * profileId path parameter. Profile ID
     * 
     */
    @Import(name="profileId")
    private @Nullable Output<String> profileId;

    /**
     * @return profileId path parameter. Profile ID
     * 
     */
    public Optional<Output<String>> profileId() {
        return Optional.ofNullable(this.profileId);
    }

    private GetConfigTemplatesSwitchProfilesPortsArgs() {}

    private GetConfigTemplatesSwitchProfilesPortsArgs(GetConfigTemplatesSwitchProfilesPortsArgs $) {
        this.configTemplateId = $.configTemplateId;
        this.organizationId = $.organizationId;
        this.portId = $.portId;
        this.profileId = $.profileId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigTemplatesSwitchProfilesPortsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigTemplatesSwitchProfilesPortsArgs $;

        public Builder() {
            $ = new GetConfigTemplatesSwitchProfilesPortsArgs();
        }

        public Builder(GetConfigTemplatesSwitchProfilesPortsArgs defaults) {
            $ = new GetConfigTemplatesSwitchProfilesPortsArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param portId portId path parameter. Port ID
         * 
         * @return builder
         * 
         */
        public Builder portId(@Nullable Output<String> portId) {
            $.portId = portId;
            return this;
        }

        /**
         * @param portId portId path parameter. Port ID
         * 
         * @return builder
         * 
         */
        public Builder portId(String portId) {
            return portId(Output.of(portId));
        }

        /**
         * @param profileId profileId path parameter. Profile ID
         * 
         * @return builder
         * 
         */
        public Builder profileId(@Nullable Output<String> profileId) {
            $.profileId = profileId;
            return this;
        }

        /**
         * @param profileId profileId path parameter. Profile ID
         * 
         * @return builder
         * 
         */
        public Builder profileId(String profileId) {
            return profileId(Output.of(profileId));
        }

        public GetConfigTemplatesSwitchProfilesPortsArgs build() {
            return $;
        }
    }

}
