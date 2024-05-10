// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetCameraCustomAnalyticsItemParameter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCameraCustomAnalyticsItem {
    /**
     * @return Custom analytics artifact ID
     * 
     */
    private String artifactId;
    /**
     * @return Whether custom analytics is enabled
     * 
     */
    private Boolean enabled;
    /**
     * @return Parameters for the custom analytics workload
     * 
     */
    private List<GetCameraCustomAnalyticsItemParameter> parameters;

    private GetCameraCustomAnalyticsItem() {}
    /**
     * @return Custom analytics artifact ID
     * 
     */
    public String artifactId() {
        return this.artifactId;
    }
    /**
     * @return Whether custom analytics is enabled
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Parameters for the custom analytics workload
     * 
     */
    public List<GetCameraCustomAnalyticsItemParameter> parameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCameraCustomAnalyticsItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String artifactId;
        private Boolean enabled;
        private List<GetCameraCustomAnalyticsItemParameter> parameters;
        public Builder() {}
        public Builder(GetCameraCustomAnalyticsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
    	      this.enabled = defaults.enabled;
    	      this.parameters = defaults.parameters;
        }

        @CustomType.Setter
        public Builder artifactId(String artifactId) {
            if (artifactId == null) {
              throw new MissingRequiredPropertyException("GetCameraCustomAnalyticsItem", "artifactId");
            }
            this.artifactId = artifactId;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetCameraCustomAnalyticsItem", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(List<GetCameraCustomAnalyticsItemParameter> parameters) {
            if (parameters == null) {
              throw new MissingRequiredPropertyException("GetCameraCustomAnalyticsItem", "parameters");
            }
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(GetCameraCustomAnalyticsItemParameter... parameters) {
            return parameters(List.of(parameters));
        }
        public GetCameraCustomAnalyticsItem build() {
            final var _resultValue = new GetCameraCustomAnalyticsItem();
            _resultValue.artifactId = artifactId;
            _resultValue.enabled = enabled;
            _resultValue.parameters = parameters;
            return _resultValue;
        }
    }
}
