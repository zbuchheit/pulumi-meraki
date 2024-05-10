// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetSensorReadingsHistoryItemHumidity {
    /**
     * @return Humidity reading in %RH.
     * 
     */
    private Integer relativePercentage;

    private GetSensorReadingsHistoryItemHumidity() {}
    /**
     * @return Humidity reading in %RH.
     * 
     */
    public Integer relativePercentage() {
        return this.relativePercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorReadingsHistoryItemHumidity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer relativePercentage;
        public Builder() {}
        public Builder(GetSensorReadingsHistoryItemHumidity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.relativePercentage = defaults.relativePercentage;
        }

        @CustomType.Setter
        public Builder relativePercentage(Integer relativePercentage) {
            if (relativePercentage == null) {
              throw new MissingRequiredPropertyException("GetSensorReadingsHistoryItemHumidity", "relativePercentage");
            }
            this.relativePercentage = relativePercentage;
            return this;
        }
        public GetSensorReadingsHistoryItemHumidity build() {
            final var _resultValue = new GetSensorReadingsHistoryItemHumidity();
            _resultValue.relativePercentage = relativePercentage;
            return _resultValue;
        }
    }
}
