// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetLicensesOverviewItemSystemsManagerCounts;
import java.util.Objects;

@CustomType
public final class GetLicensesOverviewItemSystemsManager {
    /**
     * @return Aggregated license count data for Systems Manager
     * 
     */
    private GetLicensesOverviewItemSystemsManagerCounts counts;

    private GetLicensesOverviewItemSystemsManager() {}
    /**
     * @return Aggregated license count data for Systems Manager
     * 
     */
    public GetLicensesOverviewItemSystemsManagerCounts counts() {
        return this.counts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensesOverviewItemSystemsManager defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetLicensesOverviewItemSystemsManagerCounts counts;
        public Builder() {}
        public Builder(GetLicensesOverviewItemSystemsManager defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.counts = defaults.counts;
        }

        @CustomType.Setter
        public Builder counts(GetLicensesOverviewItemSystemsManagerCounts counts) {
            if (counts == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemSystemsManager", "counts");
            }
            this.counts = counts;
            return this;
        }
        public GetLicensesOverviewItemSystemsManager build() {
            final var _resultValue = new GetLicensesOverviewItemSystemsManager();
            _resultValue.counts = counts;
            return _resultValue;
        }
    }
}