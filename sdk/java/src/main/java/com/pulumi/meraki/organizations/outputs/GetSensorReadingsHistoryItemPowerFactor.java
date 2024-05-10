// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetSensorReadingsHistoryItemPowerFactor {
    /**
     * @return Power factor reading as a percentage.
     * 
     */
    private Integer percentage;

    private GetSensorReadingsHistoryItemPowerFactor() {}
    /**
     * @return Power factor reading as a percentage.
     * 
     */
    public Integer percentage() {
        return this.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorReadingsHistoryItemPowerFactor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer percentage;
        public Builder() {}
        public Builder(GetSensorReadingsHistoryItemPowerFactor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentage = defaults.percentage;
        }

        @CustomType.Setter
        public Builder percentage(Integer percentage) {
            if (percentage == null) {
              throw new MissingRequiredPropertyException("GetSensorReadingsHistoryItemPowerFactor", "percentage");
            }
            this.percentage = percentage;
            return this;
        }
        public GetSensorReadingsHistoryItemPowerFactor build() {
            final var _resultValue = new GetSensorReadingsHistoryItemPowerFactor();
            _resultValue.percentage = percentage;
            return _resultValue;
        }
    }
}
