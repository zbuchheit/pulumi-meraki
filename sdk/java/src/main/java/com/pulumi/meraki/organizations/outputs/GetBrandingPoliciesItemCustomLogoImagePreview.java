// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBrandingPoliciesItemCustomLogoImagePreview {
    /**
     * @return Timestamp of the preview image
     * 
     */
    private String expiresAt;
    /**
     * @return Url of the preview image
     * 
     */
    private String url;

    private GetBrandingPoliciesItemCustomLogoImagePreview() {}
    /**
     * @return Timestamp of the preview image
     * 
     */
    public String expiresAt() {
        return this.expiresAt;
    }
    /**
     * @return Url of the preview image
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrandingPoliciesItemCustomLogoImagePreview defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expiresAt;
        private String url;
        public Builder() {}
        public Builder(GetBrandingPoliciesItemCustomLogoImagePreview defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiresAt = defaults.expiresAt;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder expiresAt(String expiresAt) {
            if (expiresAt == null) {
              throw new MissingRequiredPropertyException("GetBrandingPoliciesItemCustomLogoImagePreview", "expiresAt");
            }
            this.expiresAt = expiresAt;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetBrandingPoliciesItemCustomLogoImagePreview", "url");
            }
            this.url = url;
            return this;
        }
        public GetBrandingPoliciesItemCustomLogoImagePreview build() {
            final var _resultValue = new GetBrandingPoliciesItemCustomLogoImagePreview();
            _resultValue.expiresAt = expiresAt;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}