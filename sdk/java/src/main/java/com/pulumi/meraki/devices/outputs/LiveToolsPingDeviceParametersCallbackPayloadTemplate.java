// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiveToolsPingDeviceParametersCallbackPayloadTemplate {
    /**
     * @return The ID of the payload template. Defaults to &#39;wpt_00005&#39; for the Callback (included) template.
     * 
     */
    private @Nullable String id;

    private LiveToolsPingDeviceParametersCallbackPayloadTemplate() {}
    /**
     * @return The ID of the payload template. Defaults to &#39;wpt_00005&#39; for the Callback (included) template.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveToolsPingDeviceParametersCallbackPayloadTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        public Builder() {}
        public Builder(LiveToolsPingDeviceParametersCallbackPayloadTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        public LiveToolsPingDeviceParametersCallbackPayloadTemplate build() {
            final var _resultValue = new LiveToolsPingDeviceParametersCallbackPayloadTemplate();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
