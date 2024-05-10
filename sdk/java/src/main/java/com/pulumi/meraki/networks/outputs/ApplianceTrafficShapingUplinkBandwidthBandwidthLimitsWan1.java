// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1 {
    /**
     * @return configured DOWN limit for the uplink (in Kbps).  Null indicated unlimited
     * 
     */
    private @Nullable Integer limitDown;
    /**
     * @return configured UP limit for the uplink (in Kbps).  Null indicated unlimited
     * 
     */
    private @Nullable Integer limitUp;

    private ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1() {}
    /**
     * @return configured DOWN limit for the uplink (in Kbps).  Null indicated unlimited
     * 
     */
    public Optional<Integer> limitDown() {
        return Optional.ofNullable(this.limitDown);
    }
    /**
     * @return configured UP limit for the uplink (in Kbps).  Null indicated unlimited
     * 
     */
    public Optional<Integer> limitUp() {
        return Optional.ofNullable(this.limitUp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer limitDown;
        private @Nullable Integer limitUp;
        public Builder() {}
        public Builder(ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limitDown = defaults.limitDown;
    	      this.limitUp = defaults.limitUp;
        }

        @CustomType.Setter
        public Builder limitDown(@Nullable Integer limitDown) {

            this.limitDown = limitDown;
            return this;
        }
        @CustomType.Setter
        public Builder limitUp(@Nullable Integer limitUp) {

            this.limitUp = limitUp;
            return this;
        }
        public ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1 build() {
            final var _resultValue = new ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1();
            _resultValue.limitDown = limitDown;
            _resultValue.limitUp = limitUp;
            return _resultValue;
        }
    }
}
