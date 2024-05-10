// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCameraCustomAnalyticsArtifactsItemStatus {
    /**
     * @return Status message
     * 
     */
    private String message;
    /**
     * @return Status type
     * 
     */
    private String type;

    private GetCameraCustomAnalyticsArtifactsItemStatus() {}
    /**
     * @return Status message
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return Status type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCameraCustomAnalyticsArtifactsItemStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String message;
        private String type;
        public Builder() {}
        public Builder(GetCameraCustomAnalyticsArtifactsItemStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder message(String message) {
            if (message == null) {
              throw new MissingRequiredPropertyException("GetCameraCustomAnalyticsArtifactsItemStatus", "message");
            }
            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetCameraCustomAnalyticsArtifactsItemStatus", "type");
            }
            this.type = type;
            return this;
        }
        public GetCameraCustomAnalyticsArtifactsItemStatus build() {
            final var _resultValue = new GetCameraCustomAnalyticsArtifactsItemStatus();
            _resultValue.message = message;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
