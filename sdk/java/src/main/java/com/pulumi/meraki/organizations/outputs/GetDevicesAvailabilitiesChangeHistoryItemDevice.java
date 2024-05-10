// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDevicesAvailabilitiesChangeHistoryItemDevice {
    /**
     * @return Device model
     * 
     */
    private String model;
    /**
     * @return Device name
     * 
     */
    private String name;
    /**
     * @return Device product type.
     * 
     */
    private String productType;
    /**
     * @return Device serial number
     * 
     */
    private String serial;

    private GetDevicesAvailabilitiesChangeHistoryItemDevice() {}
    /**
     * @return Device model
     * 
     */
    public String model() {
        return this.model;
    }
    /**
     * @return Device name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Device product type.
     * 
     */
    public String productType() {
        return this.productType;
    }
    /**
     * @return Device serial number
     * 
     */
    public String serial() {
        return this.serial;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicesAvailabilitiesChangeHistoryItemDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String model;
        private String name;
        private String productType;
        private String serial;
        public Builder() {}
        public Builder(GetDevicesAvailabilitiesChangeHistoryItemDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.model = defaults.model;
    	      this.name = defaults.name;
    	      this.productType = defaults.productType;
    	      this.serial = defaults.serial;
        }

        @CustomType.Setter
        public Builder model(String model) {
            if (model == null) {
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesChangeHistoryItemDevice", "model");
            }
            this.model = model;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesChangeHistoryItemDevice", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder productType(String productType) {
            if (productType == null) {
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesChangeHistoryItemDevice", "productType");
            }
            this.productType = productType;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetDevicesAvailabilitiesChangeHistoryItemDevice", "serial");
            }
            this.serial = serial;
            return this;
        }
        public GetDevicesAvailabilitiesChangeHistoryItemDevice build() {
            final var _resultValue = new GetDevicesAvailabilitiesChangeHistoryItemDevice();
            _resultValue.model = model;
            _resultValue.name = name;
            _resultValue.productType = productType;
            _resultValue.serial = serial;
            return _resultValue;
        }
    }
}
