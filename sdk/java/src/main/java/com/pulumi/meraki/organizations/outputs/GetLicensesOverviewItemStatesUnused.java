// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetLicensesOverviewItemStatesUnusedSoonestActivation;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetLicensesOverviewItemStatesUnused {
    /**
     * @return The number of unused licenses
     * 
     */
    private Integer count;
    /**
     * @return Information about the soonest forthcoming license activation
     * 
     */
    private GetLicensesOverviewItemStatesUnusedSoonestActivation soonestActivation;

    private GetLicensesOverviewItemStatesUnused() {}
    /**
     * @return The number of unused licenses
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return Information about the soonest forthcoming license activation
     * 
     */
    public GetLicensesOverviewItemStatesUnusedSoonestActivation soonestActivation() {
        return this.soonestActivation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensesOverviewItemStatesUnused defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer count;
        private GetLicensesOverviewItemStatesUnusedSoonestActivation soonestActivation;
        public Builder() {}
        public Builder(GetLicensesOverviewItemStatesUnused defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.soonestActivation = defaults.soonestActivation;
        }

        @CustomType.Setter
        public Builder count(Integer count) {
            if (count == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemStatesUnused", "count");
            }
            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder soonestActivation(GetLicensesOverviewItemStatesUnusedSoonestActivation soonestActivation) {
            if (soonestActivation == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemStatesUnused", "soonestActivation");
            }
            this.soonestActivation = soonestActivation;
            return this;
        }
        public GetLicensesOverviewItemStatesUnused build() {
            final var _resultValue = new GetLicensesOverviewItemStatesUnused();
            _resultValue.count = count;
            _resultValue.soonestActivation = soonestActivation;
            return _resultValue;
        }
    }
}
