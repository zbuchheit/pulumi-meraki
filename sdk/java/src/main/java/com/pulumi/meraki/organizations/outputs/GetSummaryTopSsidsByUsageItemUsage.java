// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GetSummaryTopSsidsByUsageItemUsage {
    /**
     * @return Downstream usage of the SSID
     * 
     */
    private Double downstream;
    /**
     * @return Percentage usage of the SSID
     * 
     */
    private Double percentage;
    /**
     * @return Total usage of the SSID
     * 
     */
    private Double total;
    /**
     * @return Upstream usage of the SSID
     * 
     */
    private Double upstream;

    private GetSummaryTopSsidsByUsageItemUsage() {}
    /**
     * @return Downstream usage of the SSID
     * 
     */
    public Double downstream() {
        return this.downstream;
    }
    /**
     * @return Percentage usage of the SSID
     * 
     */
    public Double percentage() {
        return this.percentage;
    }
    /**
     * @return Total usage of the SSID
     * 
     */
    public Double total() {
        return this.total;
    }
    /**
     * @return Upstream usage of the SSID
     * 
     */
    public Double upstream() {
        return this.upstream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSummaryTopSsidsByUsageItemUsage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double downstream;
        private Double percentage;
        private Double total;
        private Double upstream;
        public Builder() {}
        public Builder(GetSummaryTopSsidsByUsageItemUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.downstream = defaults.downstream;
    	      this.percentage = defaults.percentage;
    	      this.total = defaults.total;
    	      this.upstream = defaults.upstream;
        }

        @CustomType.Setter
        public Builder downstream(Double downstream) {
            if (downstream == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopSsidsByUsageItemUsage", "downstream");
            }
            this.downstream = downstream;
            return this;
        }
        @CustomType.Setter
        public Builder percentage(Double percentage) {
            if (percentage == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopSsidsByUsageItemUsage", "percentage");
            }
            this.percentage = percentage;
            return this;
        }
        @CustomType.Setter
        public Builder total(Double total) {
            if (total == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopSsidsByUsageItemUsage", "total");
            }
            this.total = total;
            return this;
        }
        @CustomType.Setter
        public Builder upstream(Double upstream) {
            if (upstream == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopSsidsByUsageItemUsage", "upstream");
            }
            this.upstream = upstream;
            return this;
        }
        public GetSummaryTopSsidsByUsageItemUsage build() {
            final var _resultValue = new GetSummaryTopSsidsByUsageItemUsage();
            _resultValue.downstream = downstream;
            _resultValue.percentage = percentage;
            _resultValue.total = total;
            _resultValue.upstream = upstream;
            return _resultValue;
        }
    }
}
