// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetWirelessLatencyStatsItemBackgroundTrafficRawDistribution;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GetWirelessLatencyStatsItemBackgroundTraffic {
    private Double avg;
    private GetWirelessLatencyStatsItemBackgroundTrafficRawDistribution rawDistribution;

    private GetWirelessLatencyStatsItemBackgroundTraffic() {}
    public Double avg() {
        return this.avg;
    }
    public GetWirelessLatencyStatsItemBackgroundTrafficRawDistribution rawDistribution() {
        return this.rawDistribution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessLatencyStatsItemBackgroundTraffic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double avg;
        private GetWirelessLatencyStatsItemBackgroundTrafficRawDistribution rawDistribution;
        public Builder() {}
        public Builder(GetWirelessLatencyStatsItemBackgroundTraffic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.avg = defaults.avg;
    	      this.rawDistribution = defaults.rawDistribution;
        }

        @CustomType.Setter
        public Builder avg(Double avg) {
            if (avg == null) {
              throw new MissingRequiredPropertyException("GetWirelessLatencyStatsItemBackgroundTraffic", "avg");
            }
            this.avg = avg;
            return this;
        }
        @CustomType.Setter
        public Builder rawDistribution(GetWirelessLatencyStatsItemBackgroundTrafficRawDistribution rawDistribution) {
            if (rawDistribution == null) {
              throw new MissingRequiredPropertyException("GetWirelessLatencyStatsItemBackgroundTraffic", "rawDistribution");
            }
            this.rawDistribution = rawDistribution;
            return this;
        }
        public GetWirelessLatencyStatsItemBackgroundTraffic build() {
            final var _resultValue = new GetWirelessLatencyStatsItemBackgroundTraffic();
            _resultValue.avg = avg;
            _resultValue.rawDistribution = rawDistribution;
            return _resultValue;
        }
    }
}