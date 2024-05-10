// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInventoryOnboardingCloudMonitoringImportsItemDevice {
    /**
     * @return Whether or not the device was successfully created in dashboard.
     * 
     */
    private Boolean created;
    /**
     * @return Represents the current state of importing the device.
     * 
     */
    private String status;
    /**
     * @return The url to the device details page within dashboard.
     * 
     */
    private String url;

    private GetInventoryOnboardingCloudMonitoringImportsItemDevice() {}
    /**
     * @return Whether or not the device was successfully created in dashboard.
     * 
     */
    public Boolean created() {
        return this.created;
    }
    /**
     * @return Represents the current state of importing the device.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The url to the device details page within dashboard.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInventoryOnboardingCloudMonitoringImportsItemDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean created;
        private String status;
        private String url;
        public Builder() {}
        public Builder(GetInventoryOnboardingCloudMonitoringImportsItemDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.status = defaults.status;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder created(Boolean created) {
            if (created == null) {
              throw new MissingRequiredPropertyException("GetInventoryOnboardingCloudMonitoringImportsItemDevice", "created");
            }
            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetInventoryOnboardingCloudMonitoringImportsItemDevice", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetInventoryOnboardingCloudMonitoringImportsItemDevice", "url");
            }
            this.url = url;
            return this;
        }
        public GetInventoryOnboardingCloudMonitoringImportsItemDevice build() {
            final var _resultValue = new GetInventoryOnboardingCloudMonitoringImportsItemDevice();
            _resultValue.created = created;
            _resultValue.status = status;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
