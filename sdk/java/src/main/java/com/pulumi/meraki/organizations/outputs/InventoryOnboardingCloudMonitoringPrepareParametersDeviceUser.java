// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InventoryOnboardingCloudMonitoringPrepareParametersDeviceUser {
    /**
     * @return The name of the device user for Meraki monitoring
     * 
     */
    private @Nullable String username;

    private InventoryOnboardingCloudMonitoringPrepareParametersDeviceUser() {}
    /**
     * @return The name of the device user for Meraki monitoring
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryOnboardingCloudMonitoringPrepareParametersDeviceUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String username;
        public Builder() {}
        public Builder(InventoryOnboardingCloudMonitoringPrepareParametersDeviceUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        public InventoryOnboardingCloudMonitoringPrepareParametersDeviceUser build() {
            final var _resultValue = new InventoryOnboardingCloudMonitoringPrepareParametersDeviceUser();
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
