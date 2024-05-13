// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GetSummaryTopSwitchesByEnergyUsageItemUsage {
    /**
     * @return Total energy usage of the switch
     * 
     */
    private Double total;

    private GetSummaryTopSwitchesByEnergyUsageItemUsage() {}
    /**
     * @return Total energy usage of the switch
     * 
     */
    public Double total() {
        return this.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSummaryTopSwitchesByEnergyUsageItemUsage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double total;
        public Builder() {}
        public Builder(GetSummaryTopSwitchesByEnergyUsageItemUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.total = defaults.total;
        }

        @CustomType.Setter
        public Builder total(Double total) {
            if (total == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopSwitchesByEnergyUsageItemUsage", "total");
            }
            this.total = total;
            return this;
        }
        public GetSummaryTopSwitchesByEnergyUsageItemUsage build() {
            final var _resultValue = new GetSummaryTopSwitchesByEnergyUsageItemUsage();
            _resultValue.total = total;
            return _resultValue;
        }
    }
}