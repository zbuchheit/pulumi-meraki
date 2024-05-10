// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplianceRfProfilesPerSsidSettingsStatus2 {
    /**
     * @return Band mode of this SSID
     * 
     */
    private @Nullable String bandOperationMode;
    /**
     * @return Whether this SSID steers clients to the most open band between 2.4 GHz and 5 GHz.
     * 
     */
    private @Nullable Boolean bandSteeringEnabled;

    private ApplianceRfProfilesPerSsidSettingsStatus2() {}
    /**
     * @return Band mode of this SSID
     * 
     */
    public Optional<String> bandOperationMode() {
        return Optional.ofNullable(this.bandOperationMode);
    }
    /**
     * @return Whether this SSID steers clients to the most open band between 2.4 GHz and 5 GHz.
     * 
     */
    public Optional<Boolean> bandSteeringEnabled() {
        return Optional.ofNullable(this.bandSteeringEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceRfProfilesPerSsidSettingsStatus2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bandOperationMode;
        private @Nullable Boolean bandSteeringEnabled;
        public Builder() {}
        public Builder(ApplianceRfProfilesPerSsidSettingsStatus2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandOperationMode = defaults.bandOperationMode;
    	      this.bandSteeringEnabled = defaults.bandSteeringEnabled;
        }

        @CustomType.Setter
        public Builder bandOperationMode(@Nullable String bandOperationMode) {

            this.bandOperationMode = bandOperationMode;
            return this;
        }
        @CustomType.Setter
        public Builder bandSteeringEnabled(@Nullable Boolean bandSteeringEnabled) {

            this.bandSteeringEnabled = bandSteeringEnabled;
            return this;
        }
        public ApplianceRfProfilesPerSsidSettingsStatus2 build() {
            final var _resultValue = new ApplianceRfProfilesPerSsidSettingsStatus2();
            _resultValue.bandOperationMode = bandOperationMode;
            _resultValue.bandSteeringEnabled = bandSteeringEnabled;
            return _resultValue;
        }
    }
}
