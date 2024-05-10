// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLicensesOverviewItemStatesUnusedActiveOldestActivation {
    /**
     * @return The oldest license activation date
     * 
     */
    private String activationDate;
    /**
     * @return The number of licenses that activated on this date
     * 
     */
    private Integer activeCount;

    private GetLicensesOverviewItemStatesUnusedActiveOldestActivation() {}
    /**
     * @return The oldest license activation date
     * 
     */
    public String activationDate() {
        return this.activationDate;
    }
    /**
     * @return The number of licenses that activated on this date
     * 
     */
    public Integer activeCount() {
        return this.activeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensesOverviewItemStatesUnusedActiveOldestActivation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String activationDate;
        private Integer activeCount;
        public Builder() {}
        public Builder(GetLicensesOverviewItemStatesUnusedActiveOldestActivation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationDate = defaults.activationDate;
    	      this.activeCount = defaults.activeCount;
        }

        @CustomType.Setter
        public Builder activationDate(String activationDate) {
            if (activationDate == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemStatesUnusedActiveOldestActivation", "activationDate");
            }
            this.activationDate = activationDate;
            return this;
        }
        @CustomType.Setter
        public Builder activeCount(Integer activeCount) {
            if (activeCount == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemStatesUnusedActiveOldestActivation", "activeCount");
            }
            this.activeCount = activeCount;
            return this;
        }
        public GetLicensesOverviewItemStatesUnusedActiveOldestActivation build() {
            final var _resultValue = new GetLicensesOverviewItemStatesUnusedActiveOldestActivation();
            _resultValue.activationDate = activationDate;
            _resultValue.activeCount = activeCount;
            return _resultValue;
        }
    }
}
