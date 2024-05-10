// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.organizations.outputs.LicensingCotermLicensesMoveParametersDestination;
import com.pulumi.meraki.organizations.outputs.LicensingCotermLicensesMoveParametersLicense;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LicensingCotermLicensesMoveParameters {
    /**
     * @return Destination data for the license move
     * 
     */
    private @Nullable LicensingCotermLicensesMoveParametersDestination destination;
    /**
     * @return The list of licenses to move
     * 
     */
    private @Nullable List<LicensingCotermLicensesMoveParametersLicense> licenses;

    private LicensingCotermLicensesMoveParameters() {}
    /**
     * @return Destination data for the license move
     * 
     */
    public Optional<LicensingCotermLicensesMoveParametersDestination> destination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * @return The list of licenses to move
     * 
     */
    public List<LicensingCotermLicensesMoveParametersLicense> licenses() {
        return this.licenses == null ? List.of() : this.licenses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicensingCotermLicensesMoveParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable LicensingCotermLicensesMoveParametersDestination destination;
        private @Nullable List<LicensingCotermLicensesMoveParametersLicense> licenses;
        public Builder() {}
        public Builder(LicensingCotermLicensesMoveParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.licenses = defaults.licenses;
        }

        @CustomType.Setter
        public Builder destination(@Nullable LicensingCotermLicensesMoveParametersDestination destination) {

            this.destination = destination;
            return this;
        }
        @CustomType.Setter
        public Builder licenses(@Nullable List<LicensingCotermLicensesMoveParametersLicense> licenses) {

            this.licenses = licenses;
            return this;
        }
        public Builder licenses(LicensingCotermLicensesMoveParametersLicense... licenses) {
            return licenses(List.of(licenses));
        }
        public LicensingCotermLicensesMoveParameters build() {
            final var _resultValue = new LicensingCotermLicensesMoveParameters();
            _resultValue.destination = destination;
            _resultValue.licenses = licenses;
            return _resultValue;
        }
    }
}
