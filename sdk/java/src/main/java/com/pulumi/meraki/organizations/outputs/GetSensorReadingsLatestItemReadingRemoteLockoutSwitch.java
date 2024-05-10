// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetSensorReadingsLatestItemReadingRemoteLockoutSwitch {
    /**
     * @return True if power controls are disabled via the MT40&#39;s physical remote lockout switch.
     * 
     */
    private Boolean locked;

    private GetSensorReadingsLatestItemReadingRemoteLockoutSwitch() {}
    /**
     * @return True if power controls are disabled via the MT40&#39;s physical remote lockout switch.
     * 
     */
    public Boolean locked() {
        return this.locked;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorReadingsLatestItemReadingRemoteLockoutSwitch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean locked;
        public Builder() {}
        public Builder(GetSensorReadingsLatestItemReadingRemoteLockoutSwitch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
        }

        @CustomType.Setter
        public Builder locked(Boolean locked) {
            if (locked == null) {
              throw new MissingRequiredPropertyException("GetSensorReadingsLatestItemReadingRemoteLockoutSwitch", "locked");
            }
            this.locked = locked;
            return this;
        }
        public GetSensorReadingsLatestItemReadingRemoteLockoutSwitch build() {
            final var _resultValue = new GetSensorReadingsLatestItemReadingRemoteLockoutSwitch();
            _resultValue.locked = locked;
            return _resultValue;
        }
    }
}
