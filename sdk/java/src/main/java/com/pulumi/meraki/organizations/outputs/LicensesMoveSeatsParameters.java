// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LicensesMoveSeatsParameters {
    /**
     * @return The ID of the organization to move the SM seats to
     * 
     */
    private @Nullable String destOrganizationId;
    /**
     * @return The ID of the SM license to move the seats from
     * 
     */
    private @Nullable String licenseId;
    /**
     * @return The number of seats to move to the new organization. Must be less than or equal to the total number of seats of the license
     * 
     */
    private @Nullable Integer seatCount;

    private LicensesMoveSeatsParameters() {}
    /**
     * @return The ID of the organization to move the SM seats to
     * 
     */
    public Optional<String> destOrganizationId() {
        return Optional.ofNullable(this.destOrganizationId);
    }
    /**
     * @return The ID of the SM license to move the seats from
     * 
     */
    public Optional<String> licenseId() {
        return Optional.ofNullable(this.licenseId);
    }
    /**
     * @return The number of seats to move to the new organization. Must be less than or equal to the total number of seats of the license
     * 
     */
    public Optional<Integer> seatCount() {
        return Optional.ofNullable(this.seatCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicensesMoveSeatsParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String destOrganizationId;
        private @Nullable String licenseId;
        private @Nullable Integer seatCount;
        public Builder() {}
        public Builder(LicensesMoveSeatsParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destOrganizationId = defaults.destOrganizationId;
    	      this.licenseId = defaults.licenseId;
    	      this.seatCount = defaults.seatCount;
        }

        @CustomType.Setter
        public Builder destOrganizationId(@Nullable String destOrganizationId) {

            this.destOrganizationId = destOrganizationId;
            return this;
        }
        @CustomType.Setter
        public Builder licenseId(@Nullable String licenseId) {

            this.licenseId = licenseId;
            return this;
        }
        @CustomType.Setter
        public Builder seatCount(@Nullable Integer seatCount) {

            this.seatCount = seatCount;
            return this;
        }
        public LicensesMoveSeatsParameters build() {
            final var _resultValue = new LicensesMoveSeatsParameters();
            _resultValue.destOrganizationId = destOrganizationId;
            _resultValue.licenseId = licenseId;
            _resultValue.seatCount = seatCount;
            return _resultValue;
        }
    }
}
