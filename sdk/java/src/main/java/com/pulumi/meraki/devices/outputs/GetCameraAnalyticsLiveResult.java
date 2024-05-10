// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetCameraAnalyticsLiveItem;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCameraAnalyticsLiveResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetCameraAnalyticsLiveItem item;
    /**
     * @return serial path parameter.
     * 
     */
    private String serial;

    private GetCameraAnalyticsLiveResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetCameraAnalyticsLiveItem item() {
        return this.item;
    }
    /**
     * @return serial path parameter.
     * 
     */
    public String serial() {
        return this.serial;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCameraAnalyticsLiveResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetCameraAnalyticsLiveItem item;
        private String serial;
        public Builder() {}
        public Builder(GetCameraAnalyticsLiveResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.serial = defaults.serial;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCameraAnalyticsLiveResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetCameraAnalyticsLiveItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetCameraAnalyticsLiveResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetCameraAnalyticsLiveResult", "serial");
            }
            this.serial = serial;
            return this;
        }
        public GetCameraAnalyticsLiveResult build() {
            final var _resultValue = new GetCameraAnalyticsLiveResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.serial = serial;
            return _resultValue;
        }
    }
}
