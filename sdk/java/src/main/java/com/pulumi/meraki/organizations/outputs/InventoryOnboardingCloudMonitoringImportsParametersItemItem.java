// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InventoryOnboardingCloudMonitoringImportsParametersItemItem {
    /**
     * @return Unique id associated with the import of the device
     * 
     */
    private @Nullable String importId;
    /**
     * @return Response method
     * 
     */
    private @Nullable String message;
    /**
     * @return Cloud monitor import status
     * 
     */
    private @Nullable String status;

    private InventoryOnboardingCloudMonitoringImportsParametersItemItem() {}
    /**
     * @return Unique id associated with the import of the device
     * 
     */
    public Optional<String> importId() {
        return Optional.ofNullable(this.importId);
    }
    /**
     * @return Response method
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return Cloud monitor import status
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryOnboardingCloudMonitoringImportsParametersItemItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String importId;
        private @Nullable String message;
        private @Nullable String status;
        public Builder() {}
        public Builder(InventoryOnboardingCloudMonitoringImportsParametersItemItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.importId = defaults.importId;
    	      this.message = defaults.message;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder importId(@Nullable String importId) {

            this.importId = importId;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {

            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public InventoryOnboardingCloudMonitoringImportsParametersItemItem build() {
            final var _resultValue = new InventoryOnboardingCloudMonitoringImportsParametersItemItem();
            _resultValue.importId = importId;
            _resultValue.message = message;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
