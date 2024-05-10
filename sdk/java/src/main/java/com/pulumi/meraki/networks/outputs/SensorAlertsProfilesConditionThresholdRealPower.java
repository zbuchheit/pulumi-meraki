// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SensorAlertsProfilesConditionThresholdRealPower {
    /**
     * @return Alerting threshold in watts. Must be between 0 and 3750.
     * 
     */
    private @Nullable Double draw;

    private SensorAlertsProfilesConditionThresholdRealPower() {}
    /**
     * @return Alerting threshold in watts. Must be between 0 and 3750.
     * 
     */
    public Optional<Double> draw() {
        return Optional.ofNullable(this.draw);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SensorAlertsProfilesConditionThresholdRealPower defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double draw;
        public Builder() {}
        public Builder(SensorAlertsProfilesConditionThresholdRealPower defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.draw = defaults.draw;
        }

        @CustomType.Setter
        public Builder draw(@Nullable Double draw) {

            this.draw = draw;
            return this;
        }
        public SensorAlertsProfilesConditionThresholdRealPower build() {
            final var _resultValue = new SensorAlertsProfilesConditionThresholdRealPower();
            _resultValue.draw = draw;
            return _resultValue;
        }
    }
}
