// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CameraWirelessProfilesIds {
    /**
     * @return The id of the backup wireless profile
     * 
     */
    private @Nullable String backup;
    /**
     * @return The id of the primary wireless profile
     * 
     */
    private @Nullable String primary;
    /**
     * @return The id of the secondary wireless profile
     * 
     */
    private @Nullable String secondary;

    private CameraWirelessProfilesIds() {}
    /**
     * @return The id of the backup wireless profile
     * 
     */
    public Optional<String> backup() {
        return Optional.ofNullable(this.backup);
    }
    /**
     * @return The id of the primary wireless profile
     * 
     */
    public Optional<String> primary() {
        return Optional.ofNullable(this.primary);
    }
    /**
     * @return The id of the secondary wireless profile
     * 
     */
    public Optional<String> secondary() {
        return Optional.ofNullable(this.secondary);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CameraWirelessProfilesIds defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String backup;
        private @Nullable String primary;
        private @Nullable String secondary;
        public Builder() {}
        public Builder(CameraWirelessProfilesIds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backup = defaults.backup;
    	      this.primary = defaults.primary;
    	      this.secondary = defaults.secondary;
        }

        @CustomType.Setter
        public Builder backup(@Nullable String backup) {

            this.backup = backup;
            return this;
        }
        @CustomType.Setter
        public Builder primary(@Nullable String primary) {

            this.primary = primary;
            return this;
        }
        @CustomType.Setter
        public Builder secondary(@Nullable String secondary) {

            this.secondary = secondary;
            return this;
        }
        public CameraWirelessProfilesIds build() {
            final var _resultValue = new CameraWirelessProfilesIds();
            _resultValue.backup = backup;
            _resultValue.primary = primary;
            _resultValue.secondary = secondary;
            return _resultValue;
        }
    }
}