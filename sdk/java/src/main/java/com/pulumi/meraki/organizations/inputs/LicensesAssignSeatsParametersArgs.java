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


public final class LicensesAssignSeatsParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicensesAssignSeatsParametersArgs Empty = new LicensesAssignSeatsParametersArgs();

    /**
     * The ID of the SM license to assign seats from
     * 
     */
    @Import(name="licenseId")
    private @Nullable Output<String> licenseId;

    /**
     * @return The ID of the SM license to assign seats from
     * 
     */
    public Optional<Output<String>> licenseId() {
        return Optional.ofNullable(this.licenseId);
    }

    /**
     * The ID of the SM network to assign the seats to
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return The ID of the SM network to assign the seats to
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * The number of seats to assign to the SM network. Must be less than or equal to the total number of seats of the license
     * 
     */
    @Import(name="seatCount")
    private @Nullable Output<Integer> seatCount;

    /**
     * @return The number of seats to assign to the SM network. Must be less than or equal to the total number of seats of the license
     * 
     */
    public Optional<Output<Integer>> seatCount() {
        return Optional.ofNullable(this.seatCount);
    }

    private LicensesAssignSeatsParametersArgs() {}

    private LicensesAssignSeatsParametersArgs(LicensesAssignSeatsParametersArgs $) {
        this.licenseId = $.licenseId;
        this.networkId = $.networkId;
        this.seatCount = $.seatCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicensesAssignSeatsParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicensesAssignSeatsParametersArgs $;

        public Builder() {
            $ = new LicensesAssignSeatsParametersArgs();
        }

        public Builder(LicensesAssignSeatsParametersArgs defaults) {
            $ = new LicensesAssignSeatsParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param licenseId The ID of the SM license to assign seats from
         * 
         * @return builder
         * 
         */
        public Builder licenseId(@Nullable Output<String> licenseId) {
            $.licenseId = licenseId;
            return this;
        }

        /**
         * @param licenseId The ID of the SM license to assign seats from
         * 
         * @return builder
         * 
         */
        public Builder licenseId(String licenseId) {
            return licenseId(Output.of(licenseId));
        }

        /**
         * @param networkId The ID of the SM network to assign the seats to
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId The ID of the SM network to assign the seats to
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param seatCount The number of seats to assign to the SM network. Must be less than or equal to the total number of seats of the license
         * 
         * @return builder
         * 
         */
        public Builder seatCount(@Nullable Output<Integer> seatCount) {
            $.seatCount = seatCount;
            return this;
        }

        /**
         * @param seatCount The number of seats to assign to the SM network. Must be less than or equal to the total number of seats of the license
         * 
         * @return builder
         * 
         */
        public Builder seatCount(Integer seatCount) {
            return seatCount(Output.of(seatCount));
        }

        public LicensesAssignSeatsParametersArgs build() {
            return $;
        }
    }

}
