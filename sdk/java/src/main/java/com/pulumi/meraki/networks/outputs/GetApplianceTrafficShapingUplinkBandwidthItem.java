// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimits;
import java.util.Objects;

@CustomType
public final class GetApplianceTrafficShapingUplinkBandwidthItem {
    /**
     * @return A hash uplink keys and their configured settings for the Appliance
     * 
     */
    private GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimits bandwidthLimits;

    private GetApplianceTrafficShapingUplinkBandwidthItem() {}
    /**
     * @return A hash uplink keys and their configured settings for the Appliance
     * 
     */
    public GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimits bandwidthLimits() {
        return this.bandwidthLimits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceTrafficShapingUplinkBandwidthItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimits bandwidthLimits;
        public Builder() {}
        public Builder(GetApplianceTrafficShapingUplinkBandwidthItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthLimits = defaults.bandwidthLimits;
        }

        @CustomType.Setter
        public Builder bandwidthLimits(GetApplianceTrafficShapingUplinkBandwidthItemBandwidthLimits bandwidthLimits) {
            if (bandwidthLimits == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkBandwidthItem", "bandwidthLimits");
            }
            this.bandwidthLimits = bandwidthLimits;
            return this;
        }
        public GetApplianceTrafficShapingUplinkBandwidthItem build() {
            final var _resultValue = new GetApplianceTrafficShapingUplinkBandwidthItem();
            _resultValue.bandwidthLimits = bandwidthLimits;
            return _resultValue;
        }
    }
}
