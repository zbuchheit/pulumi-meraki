// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetSensorReadingsLatestItemReadingDoor {
    /**
     * @return True if the door is open.
     * 
     */
    private Boolean open;

    private GetSensorReadingsLatestItemReadingDoor() {}
    /**
     * @return True if the door is open.
     * 
     */
    public Boolean open() {
        return this.open;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorReadingsLatestItemReadingDoor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean open;
        public Builder() {}
        public Builder(GetSensorReadingsLatestItemReadingDoor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.open = defaults.open;
        }

        @CustomType.Setter
        public Builder open(Boolean open) {
            if (open == null) {
              throw new MissingRequiredPropertyException("GetSensorReadingsLatestItemReadingDoor", "open");
            }
            this.open = open;
            return this;
        }
        public GetSensorReadingsLatestItemReadingDoor build() {
            final var _resultValue = new GetSensorReadingsLatestItemReadingDoor();
            _resultValue.open = open;
            return _resultValue;
        }
    }
}