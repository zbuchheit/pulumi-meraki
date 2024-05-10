// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.organizations.outputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationGroup;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorization {
    /**
     * @return Group Details
     * 
     */
    private @Nullable InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationGroup group;

    private InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorization() {}
    /**
     * @return Group Details
     * 
     */
    public Optional<InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationGroup> group() {
        return Optional.ofNullable(this.group);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationGroup group;
        public Builder() {}
        public Builder(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
        }

        @CustomType.Setter
        public Builder group(@Nullable InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationGroup group) {

            this.group = group;
            return this;
        }
        public InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorization build() {
            final var _resultValue = new InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorization();
            _resultValue.group = group;
            return _resultValue;
        }
    }
}
