// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetVlanProfilesAssignmentsByDeviceItemStack;
import com.pulumi.meraki.networks.outputs.GetVlanProfilesAssignmentsByDeviceItemVlanProfile;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVlanProfilesAssignmentsByDeviceItem {
    /**
     * @return MAC address of the device
     * 
     */
    private String mac;
    /**
     * @return Name of the Device
     * 
     */
    private String name;
    /**
     * @return The product type
     * 
     */
    private String productType;
    /**
     * @return Serial of the Device
     * 
     */
    private String serial;
    /**
     * @return The Switch Stack the device belongs to
     * 
     */
    private GetVlanProfilesAssignmentsByDeviceItemStack stack;
    /**
     * @return The VLAN Profile
     * 
     */
    private GetVlanProfilesAssignmentsByDeviceItemVlanProfile vlanProfile;

    private GetVlanProfilesAssignmentsByDeviceItem() {}
    /**
     * @return MAC address of the device
     * 
     */
    public String mac() {
        return this.mac;
    }
    /**
     * @return Name of the Device
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The product type
     * 
     */
    public String productType() {
        return this.productType;
    }
    /**
     * @return Serial of the Device
     * 
     */
    public String serial() {
        return this.serial;
    }
    /**
     * @return The Switch Stack the device belongs to
     * 
     */
    public GetVlanProfilesAssignmentsByDeviceItemStack stack() {
        return this.stack;
    }
    /**
     * @return The VLAN Profile
     * 
     */
    public GetVlanProfilesAssignmentsByDeviceItemVlanProfile vlanProfile() {
        return this.vlanProfile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVlanProfilesAssignmentsByDeviceItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mac;
        private String name;
        private String productType;
        private String serial;
        private GetVlanProfilesAssignmentsByDeviceItemStack stack;
        private GetVlanProfilesAssignmentsByDeviceItemVlanProfile vlanProfile;
        public Builder() {}
        public Builder(GetVlanProfilesAssignmentsByDeviceItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mac = defaults.mac;
    	      this.name = defaults.name;
    	      this.productType = defaults.productType;
    	      this.serial = defaults.serial;
    	      this.stack = defaults.stack;
    	      this.vlanProfile = defaults.vlanProfile;
        }

        @CustomType.Setter
        public Builder mac(String mac) {
            if (mac == null) {
              throw new MissingRequiredPropertyException("GetVlanProfilesAssignmentsByDeviceItem", "mac");
            }
            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetVlanProfilesAssignmentsByDeviceItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder productType(String productType) {
            if (productType == null) {
              throw new MissingRequiredPropertyException("GetVlanProfilesAssignmentsByDeviceItem", "productType");
            }
            this.productType = productType;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetVlanProfilesAssignmentsByDeviceItem", "serial");
            }
            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder stack(GetVlanProfilesAssignmentsByDeviceItemStack stack) {
            if (stack == null) {
              throw new MissingRequiredPropertyException("GetVlanProfilesAssignmentsByDeviceItem", "stack");
            }
            this.stack = stack;
            return this;
        }
        @CustomType.Setter
        public Builder vlanProfile(GetVlanProfilesAssignmentsByDeviceItemVlanProfile vlanProfile) {
            if (vlanProfile == null) {
              throw new MissingRequiredPropertyException("GetVlanProfilesAssignmentsByDeviceItem", "vlanProfile");
            }
            this.vlanProfile = vlanProfile;
            return this;
        }
        public GetVlanProfilesAssignmentsByDeviceItem build() {
            final var _resultValue = new GetVlanProfilesAssignmentsByDeviceItem();
            _resultValue.mac = mac;
            _resultValue.name = name;
            _resultValue.productType = productType;
            _resultValue.serial = serial;
            _resultValue.stack = stack;
            _resultValue.vlanProfile = vlanProfile;
            return _resultValue;
        }
    }
}
