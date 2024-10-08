// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetLicensesOverviewItemStatesUnusedActiveOldestActivation;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetLicensesOverviewItemStatesUnusedActive {
    /**
     * @return The number of unused, active licenses
     * 
     */
    private Integer count;
    /**
     * @return Information about the oldest historical license activation
     * 
     */
    private GetLicensesOverviewItemStatesUnusedActiveOldestActivation oldestActivation;

    private GetLicensesOverviewItemStatesUnusedActive() {}
    /**
     * @return The number of unused, active licenses
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return Information about the oldest historical license activation
     * 
     */
    public GetLicensesOverviewItemStatesUnusedActiveOldestActivation oldestActivation() {
        return this.oldestActivation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensesOverviewItemStatesUnusedActive defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer count;
        private GetLicensesOverviewItemStatesUnusedActiveOldestActivation oldestActivation;
        public Builder() {}
        public Builder(GetLicensesOverviewItemStatesUnusedActive defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.oldestActivation = defaults.oldestActivation;
        }

        @CustomType.Setter
        public Builder count(Integer count) {
            if (count == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemStatesUnusedActive", "count");
            }
            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder oldestActivation(GetLicensesOverviewItemStatesUnusedActiveOldestActivation oldestActivation) {
            if (oldestActivation == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemStatesUnusedActive", "oldestActivation");
            }
            this.oldestActivation = oldestActivation;
            return this;
        }
        public GetLicensesOverviewItemStatesUnusedActive build() {
            final var _resultValue = new GetLicensesOverviewItemStatesUnusedActive();
            _resultValue.count = count;
            _resultValue.oldestActivation = oldestActivation;
            return _resultValue;
        }
    }
}
