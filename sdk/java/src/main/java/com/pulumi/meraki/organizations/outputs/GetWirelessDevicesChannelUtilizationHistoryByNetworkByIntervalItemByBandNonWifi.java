// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GetWirelessDevicesChannelUtilizationHistoryByNetworkByIntervalItemByBandNonWifi {
    /**
     * @return Percentage of non-wifi channel utiliation for the given band.
     * 
     */
    private Double percentage;

    private GetWirelessDevicesChannelUtilizationHistoryByNetworkByIntervalItemByBandNonWifi() {}
    /**
     * @return Percentage of non-wifi channel utiliation for the given band.
     * 
     */
    public Double percentage() {
        return this.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessDevicesChannelUtilizationHistoryByNetworkByIntervalItemByBandNonWifi defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double percentage;
        public Builder() {}
        public Builder(GetWirelessDevicesChannelUtilizationHistoryByNetworkByIntervalItemByBandNonWifi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentage = defaults.percentage;
        }

        @CustomType.Setter
        public Builder percentage(Double percentage) {
            if (percentage == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesChannelUtilizationHistoryByNetworkByIntervalItemByBandNonWifi", "percentage");
            }
            this.percentage = percentage;
            return this;
        }
        public GetWirelessDevicesChannelUtilizationHistoryByNetworkByIntervalItemByBandNonWifi build() {
            final var _resultValue = new GetWirelessDevicesChannelUtilizationHistoryByNetworkByIntervalItemByBandNonWifi();
            _resultValue.percentage = percentage;
            return _resultValue;
        }
    }
}
