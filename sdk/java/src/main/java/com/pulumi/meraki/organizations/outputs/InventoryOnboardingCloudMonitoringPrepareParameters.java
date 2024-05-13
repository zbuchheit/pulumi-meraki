// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.organizations.outputs.InventoryOnboardingCloudMonitoringPrepareParametersDevice;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class InventoryOnboardingCloudMonitoringPrepareParameters {
    /**
     * @return A set of devices to import (or update)
     * 
     */
    private @Nullable List<InventoryOnboardingCloudMonitoringPrepareParametersDevice> devices;

    private InventoryOnboardingCloudMonitoringPrepareParameters() {}
    /**
     * @return A set of devices to import (or update)
     * 
     */
    public List<InventoryOnboardingCloudMonitoringPrepareParametersDevice> devices() {
        return this.devices == null ? List.of() : this.devices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryOnboardingCloudMonitoringPrepareParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<InventoryOnboardingCloudMonitoringPrepareParametersDevice> devices;
        public Builder() {}
        public Builder(InventoryOnboardingCloudMonitoringPrepareParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devices = defaults.devices;
        }

        @CustomType.Setter
        public Builder devices(@Nullable List<InventoryOnboardingCloudMonitoringPrepareParametersDevice> devices) {

            this.devices = devices;
            return this;
        }
        public Builder devices(InventoryOnboardingCloudMonitoringPrepareParametersDevice... devices) {
            return devices(List.of(devices));
        }
        public InventoryOnboardingCloudMonitoringPrepareParameters build() {
            final var _resultValue = new InventoryOnboardingCloudMonitoringPrepareParameters();
            _resultValue.devices = devices;
            return _resultValue;
        }
    }
}