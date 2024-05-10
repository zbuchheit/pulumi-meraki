// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCameraCustomAnalyticsArtifactsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCameraCustomAnalyticsArtifactsPlainArgs Empty = new GetCameraCustomAnalyticsArtifactsPlainArgs();

    /**
     * artifactId path parameter. Artifact ID
     * 
     */
    @Import(name="artifactId")
    private @Nullable String artifactId;

    /**
     * @return artifactId path parameter. Artifact ID
     * 
     */
    public Optional<String> artifactId() {
        return Optional.ofNullable(this.artifactId);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId")
    private @Nullable String organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    private GetCameraCustomAnalyticsArtifactsPlainArgs() {}

    private GetCameraCustomAnalyticsArtifactsPlainArgs(GetCameraCustomAnalyticsArtifactsPlainArgs $) {
        this.artifactId = $.artifactId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCameraCustomAnalyticsArtifactsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCameraCustomAnalyticsArtifactsPlainArgs $;

        public Builder() {
            $ = new GetCameraCustomAnalyticsArtifactsPlainArgs();
        }

        public Builder(GetCameraCustomAnalyticsArtifactsPlainArgs defaults) {
            $ = new GetCameraCustomAnalyticsArtifactsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactId artifactId path parameter. Artifact ID
         * 
         * @return builder
         * 
         */
        public Builder artifactId(@Nullable String artifactId) {
            $.artifactId = artifactId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetCameraCustomAnalyticsArtifactsPlainArgs build() {
            return $;
        }
    }

}
