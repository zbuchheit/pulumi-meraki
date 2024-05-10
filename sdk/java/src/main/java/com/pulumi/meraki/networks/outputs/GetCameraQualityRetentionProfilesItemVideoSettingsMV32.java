// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCameraQualityRetentionProfilesItemVideoSettingsMV32 {
    private String quality;
    private String resolution;

    private GetCameraQualityRetentionProfilesItemVideoSettingsMV32() {}
    public String quality() {
        return this.quality;
    }
    public String resolution() {
        return this.resolution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCameraQualityRetentionProfilesItemVideoSettingsMV32 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String quality;
        private String resolution;
        public Builder() {}
        public Builder(GetCameraQualityRetentionProfilesItemVideoSettingsMV32 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quality = defaults.quality;
    	      this.resolution = defaults.resolution;
        }

        @CustomType.Setter
        public Builder quality(String quality) {
            if (quality == null) {
              throw new MissingRequiredPropertyException("GetCameraQualityRetentionProfilesItemVideoSettingsMV32", "quality");
            }
            this.quality = quality;
            return this;
        }
        @CustomType.Setter
        public Builder resolution(String resolution) {
            if (resolution == null) {
              throw new MissingRequiredPropertyException("GetCameraQualityRetentionProfilesItemVideoSettingsMV32", "resolution");
            }
            this.resolution = resolution;
            return this;
        }
        public GetCameraQualityRetentionProfilesItemVideoSettingsMV32 build() {
            final var _resultValue = new GetCameraQualityRetentionProfilesItemVideoSettingsMV32();
            _resultValue.quality = quality;
            _resultValue.resolution = resolution;
            return _resultValue;
        }
    }
}
