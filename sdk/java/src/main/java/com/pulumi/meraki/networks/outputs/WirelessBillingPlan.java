// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.WirelessBillingPlanBandwidthLimits;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessBillingPlan {
    /**
     * @return The uplink bandwidth settings for the pricing plan.
     * 
     */
    private @Nullable WirelessBillingPlanBandwidthLimits bandwidthLimits;
    /**
     * @return The id of the pricing plan to update.
     * 
     */
    private @Nullable String id;
    /**
     * @return The price of the billing plan.
     * 
     */
    private @Nullable Double price;
    /**
     * @return The time limit of the pricing plan in minutes.
     * 
     */
    private @Nullable String timeLimit;

    private WirelessBillingPlan() {}
    /**
     * @return The uplink bandwidth settings for the pricing plan.
     * 
     */
    public Optional<WirelessBillingPlanBandwidthLimits> bandwidthLimits() {
        return Optional.ofNullable(this.bandwidthLimits);
    }
    /**
     * @return The id of the pricing plan to update.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The price of the billing plan.
     * 
     */
    public Optional<Double> price() {
        return Optional.ofNullable(this.price);
    }
    /**
     * @return The time limit of the pricing plan in minutes.
     * 
     */
    public Optional<String> timeLimit() {
        return Optional.ofNullable(this.timeLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessBillingPlan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WirelessBillingPlanBandwidthLimits bandwidthLimits;
        private @Nullable String id;
        private @Nullable Double price;
        private @Nullable String timeLimit;
        public Builder() {}
        public Builder(WirelessBillingPlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthLimits = defaults.bandwidthLimits;
    	      this.id = defaults.id;
    	      this.price = defaults.price;
    	      this.timeLimit = defaults.timeLimit;
        }

        @CustomType.Setter
        public Builder bandwidthLimits(@Nullable WirelessBillingPlanBandwidthLimits bandwidthLimits) {

            this.bandwidthLimits = bandwidthLimits;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder price(@Nullable Double price) {

            this.price = price;
            return this;
        }
        @CustomType.Setter
        public Builder timeLimit(@Nullable String timeLimit) {

            this.timeLimit = timeLimit;
            return this;
        }
        public WirelessBillingPlan build() {
            final var _resultValue = new WirelessBillingPlan();
            _resultValue.bandwidthLimits = bandwidthLimits;
            _resultValue.id = id;
            _resultValue.price = price;
            _resultValue.timeLimit = timeLimit;
            return _resultValue;
        }
    }
}
