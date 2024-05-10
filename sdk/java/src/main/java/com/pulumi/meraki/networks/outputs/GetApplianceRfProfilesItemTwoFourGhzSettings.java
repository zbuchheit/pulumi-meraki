// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GetApplianceRfProfilesItemTwoFourGhzSettings {
    /**
     * @return Whether ax radio on 2.4Ghz band is on or off.
     * 
     */
    private Boolean axEnabled;
    /**
     * @return Min bitrate (Mbps) of 2.4Ghz band.
     * 
     */
    private Double minBitrate;

    private GetApplianceRfProfilesItemTwoFourGhzSettings() {}
    /**
     * @return Whether ax radio on 2.4Ghz band is on or off.
     * 
     */
    public Boolean axEnabled() {
        return this.axEnabled;
    }
    /**
     * @return Min bitrate (Mbps) of 2.4Ghz band.
     * 
     */
    public Double minBitrate() {
        return this.minBitrate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceRfProfilesItemTwoFourGhzSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean axEnabled;
        private Double minBitrate;
        public Builder() {}
        public Builder(GetApplianceRfProfilesItemTwoFourGhzSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.axEnabled = defaults.axEnabled;
    	      this.minBitrate = defaults.minBitrate;
        }

        @CustomType.Setter
        public Builder axEnabled(Boolean axEnabled) {
            if (axEnabled == null) {
              throw new MissingRequiredPropertyException("GetApplianceRfProfilesItemTwoFourGhzSettings", "axEnabled");
            }
            this.axEnabled = axEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder minBitrate(Double minBitrate) {
            if (minBitrate == null) {
              throw new MissingRequiredPropertyException("GetApplianceRfProfilesItemTwoFourGhzSettings", "minBitrate");
            }
            this.minBitrate = minBitrate;
            return this;
        }
        public GetApplianceRfProfilesItemTwoFourGhzSettings build() {
            final var _resultValue = new GetApplianceRfProfilesItemTwoFourGhzSettings();
            _resultValue.axEnabled = axEnabled;
            _resultValue.minBitrate = minBitrate;
            return _resultValue;
        }
    }
}
