// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetLicensesOverviewItemStatesExpired {
    /**
     * @return The number of expired licenses
     * 
     */
    private Integer count;

    private GetLicensesOverviewItemStatesExpired() {}
    /**
     * @return The number of expired licenses
     * 
     */
    public Integer count() {
        return this.count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensesOverviewItemStatesExpired defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer count;
        public Builder() {}
        public Builder(GetLicensesOverviewItemStatesExpired defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
        }

        @CustomType.Setter
        public Builder count(Integer count) {
            if (count == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemStatesExpired", "count");
            }
            this.count = count;
            return this;
        }
        public GetLicensesOverviewItemStatesExpired build() {
            final var _resultValue = new GetLicensesOverviewItemStatesExpired();
            _resultValue.count = count;
            return _resultValue;
        }
    }
}
