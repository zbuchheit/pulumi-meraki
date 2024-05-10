// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SensorAlertsProfilesSchedule {
    /**
     * @return ID of the sensor schedule to use with the alert profile. If not defined, the alert profile will be active at all times.
     * 
     */
    private @Nullable String id;
    /**
     * @return Name of the sensor schedule to use with the alert profile.
     * 
     */
    private @Nullable String name;

    private SensorAlertsProfilesSchedule() {}
    /**
     * @return ID of the sensor schedule to use with the alert profile. If not defined, the alert profile will be active at all times.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Name of the sensor schedule to use with the alert profile.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SensorAlertsProfilesSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;
        public Builder() {}
        public Builder(SensorAlertsProfilesSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public SensorAlertsProfilesSchedule build() {
            final var _resultValue = new SensorAlertsProfilesSchedule();
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
