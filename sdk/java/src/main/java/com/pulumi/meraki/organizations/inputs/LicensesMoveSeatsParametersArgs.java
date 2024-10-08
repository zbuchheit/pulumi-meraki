// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LicensesMoveSeatsParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicensesMoveSeatsParametersArgs Empty = new LicensesMoveSeatsParametersArgs();

    /**
     * The ID of the organization to move the SM seats to
     * 
     */
    @Import(name="destOrganizationId")
    private @Nullable Output<String> destOrganizationId;

    /**
     * @return The ID of the organization to move the SM seats to
     * 
     */
    public Optional<Output<String>> destOrganizationId() {
        return Optional.ofNullable(this.destOrganizationId);
    }

    /**
     * The ID of the SM license to move the seats from
     * 
     */
    @Import(name="licenseId")
    private @Nullable Output<String> licenseId;

    /**
     * @return The ID of the SM license to move the seats from
     * 
     */
    public Optional<Output<String>> licenseId() {
        return Optional.ofNullable(this.licenseId);
    }

    /**
     * The number of seats to move to the new organization. Must be less than or equal to the total number of seats of the license
     * 
     */
    @Import(name="seatCount")
    private @Nullable Output<Integer> seatCount;

    /**
     * @return The number of seats to move to the new organization. Must be less than or equal to the total number of seats of the license
     * 
     */
    public Optional<Output<Integer>> seatCount() {
        return Optional.ofNullable(this.seatCount);
    }

    private LicensesMoveSeatsParametersArgs() {}

    private LicensesMoveSeatsParametersArgs(LicensesMoveSeatsParametersArgs $) {
        this.destOrganizationId = $.destOrganizationId;
        this.licenseId = $.licenseId;
        this.seatCount = $.seatCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicensesMoveSeatsParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicensesMoveSeatsParametersArgs $;

        public Builder() {
            $ = new LicensesMoveSeatsParametersArgs();
        }

        public Builder(LicensesMoveSeatsParametersArgs defaults) {
            $ = new LicensesMoveSeatsParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destOrganizationId The ID of the organization to move the SM seats to
         * 
         * @return builder
         * 
         */
        public Builder destOrganizationId(@Nullable Output<String> destOrganizationId) {
            $.destOrganizationId = destOrganizationId;
            return this;
        }

        /**
         * @param destOrganizationId The ID of the organization to move the SM seats to
         * 
         * @return builder
         * 
         */
        public Builder destOrganizationId(String destOrganizationId) {
            return destOrganizationId(Output.of(destOrganizationId));
        }

        /**
         * @param licenseId The ID of the SM license to move the seats from
         * 
         * @return builder
         * 
         */
        public Builder licenseId(@Nullable Output<String> licenseId) {
            $.licenseId = licenseId;
            return this;
        }

        /**
         * @param licenseId The ID of the SM license to move the seats from
         * 
         * @return builder
         * 
         */
        public Builder licenseId(String licenseId) {
            return licenseId(Output.of(licenseId));
        }

        /**
         * @param seatCount The number of seats to move to the new organization. Must be less than or equal to the total number of seats of the license
         * 
         * @return builder
         * 
         */
        public Builder seatCount(@Nullable Output<Integer> seatCount) {
            $.seatCount = seatCount;
            return this;
        }

        /**
         * @param seatCount The number of seats to move to the new organization. Must be less than or equal to the total number of seats of the license
         * 
         * @return builder
         * 
         */
        public Builder seatCount(Integer seatCount) {
            return seatCount(Output.of(seatCount));
        }

        public LicensesMoveSeatsParametersArgs build() {
            return $;
        }
    }

}
