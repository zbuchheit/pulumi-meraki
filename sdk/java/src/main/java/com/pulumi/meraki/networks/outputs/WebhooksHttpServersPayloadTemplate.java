// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebhooksHttpServersPayloadTemplate {
    /**
     * @return The name of the payload template.
     * 
     */
    private @Nullable String name;
    /**
     * @return The ID of the payload template.
     * 
     */
    private @Nullable String payloadTemplateId;

    private WebhooksHttpServersPayloadTemplate() {}
    /**
     * @return The name of the payload template.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The ID of the payload template.
     * 
     */
    public Optional<String> payloadTemplateId() {
        return Optional.ofNullable(this.payloadTemplateId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhooksHttpServersPayloadTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String payloadTemplateId;
        public Builder() {}
        public Builder(WebhooksHttpServersPayloadTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.payloadTemplateId = defaults.payloadTemplateId;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder payloadTemplateId(@Nullable String payloadTemplateId) {

            this.payloadTemplateId = payloadTemplateId;
            return this;
        }
        public WebhooksHttpServersPayloadTemplate build() {
            final var _resultValue = new WebhooksHttpServersPayloadTemplate();
            _resultValue.name = name;
            _resultValue.payloadTemplateId = payloadTemplateId;
            return _resultValue;
        }
    }
}
