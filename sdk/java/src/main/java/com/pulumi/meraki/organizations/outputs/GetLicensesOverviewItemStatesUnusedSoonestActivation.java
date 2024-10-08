// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLicensesOverviewItemStatesUnusedSoonestActivation {
    /**
     * @return The soonest license activation date
     * 
     */
    private String activationDate;
    /**
     * @return The number of licenses that will activate on this date
     * 
     */
    private Integer toActivateCount;

    private GetLicensesOverviewItemStatesUnusedSoonestActivation() {}
    /**
     * @return The soonest license activation date
     * 
     */
    public String activationDate() {
        return this.activationDate;
    }
    /**
     * @return The number of licenses that will activate on this date
     * 
     */
    public Integer toActivateCount() {
        return this.toActivateCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensesOverviewItemStatesUnusedSoonestActivation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String activationDate;
        private Integer toActivateCount;
        public Builder() {}
        public Builder(GetLicensesOverviewItemStatesUnusedSoonestActivation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationDate = defaults.activationDate;
    	      this.toActivateCount = defaults.toActivateCount;
        }

        @CustomType.Setter
        public Builder activationDate(String activationDate) {
            if (activationDate == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemStatesUnusedSoonestActivation", "activationDate");
            }
            this.activationDate = activationDate;
            return this;
        }
        @CustomType.Setter
        public Builder toActivateCount(Integer toActivateCount) {
            if (toActivateCount == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemStatesUnusedSoonestActivation", "toActivateCount");
            }
            this.toActivateCount = toActivateCount;
            return this;
        }
        public GetLicensesOverviewItemStatesUnusedSoonestActivation build() {
            final var _resultValue = new GetLicensesOverviewItemStatesUnusedSoonestActivation();
            _resultValue.activationDate = activationDate;
            _resultValue.toActivateCount = toActivateCount;
            return _resultValue;
        }
    }
}
