// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.organizations.outputs.LicensesRenewSeatsItemResultingLicense;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class LicensesRenewSeatsItem {
    /**
     * @return Resulting licenses from the move
     * 
     */
    private @Nullable List<LicensesRenewSeatsItemResultingLicense> resultingLicenses;

    private LicensesRenewSeatsItem() {}
    /**
     * @return Resulting licenses from the move
     * 
     */
    public List<LicensesRenewSeatsItemResultingLicense> resultingLicenses() {
        return this.resultingLicenses == null ? List.of() : this.resultingLicenses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicensesRenewSeatsItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<LicensesRenewSeatsItemResultingLicense> resultingLicenses;
        public Builder() {}
        public Builder(LicensesRenewSeatsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resultingLicenses = defaults.resultingLicenses;
        }

        @CustomType.Setter
        public Builder resultingLicenses(@Nullable List<LicensesRenewSeatsItemResultingLicense> resultingLicenses) {

            this.resultingLicenses = resultingLicenses;
            return this;
        }
        public Builder resultingLicenses(LicensesRenewSeatsItemResultingLicense... resultingLicenses) {
            return resultingLicenses(List.of(resultingLicenses));
        }
        public LicensesRenewSeatsItem build() {
            final var _resultValue = new LicensesRenewSeatsItem();
            _resultValue.resultingLicenses = resultingLicenses;
            return _resultValue;
        }
    }
}
