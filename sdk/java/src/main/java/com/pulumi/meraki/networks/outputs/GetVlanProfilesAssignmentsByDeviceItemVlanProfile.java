// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVlanProfilesAssignmentsByDeviceItemVlanProfile {
    /**
     * @return IName of the VLAN Profile
     * 
     */
    private String iname;
    /**
     * @return Is this VLAN profile the default for the network?
     * 
     */
    private Boolean isDefault;
    /**
     * @return Name of the VLAN Profile
     * 
     */
    private String name;

    private GetVlanProfilesAssignmentsByDeviceItemVlanProfile() {}
    /**
     * @return IName of the VLAN Profile
     * 
     */
    public String iname() {
        return this.iname;
    }
    /**
     * @return Is this VLAN profile the default for the network?
     * 
     */
    public Boolean isDefault() {
        return this.isDefault;
    }
    /**
     * @return Name of the VLAN Profile
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVlanProfilesAssignmentsByDeviceItemVlanProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String iname;
        private Boolean isDefault;
        private String name;
        public Builder() {}
        public Builder(GetVlanProfilesAssignmentsByDeviceItemVlanProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iname = defaults.iname;
    	      this.isDefault = defaults.isDefault;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder iname(String iname) {
            if (iname == null) {
              throw new MissingRequiredPropertyException("GetVlanProfilesAssignmentsByDeviceItemVlanProfile", "iname");
            }
            this.iname = iname;
            return this;
        }
        @CustomType.Setter
        public Builder isDefault(Boolean isDefault) {
            if (isDefault == null) {
              throw new MissingRequiredPropertyException("GetVlanProfilesAssignmentsByDeviceItemVlanProfile", "isDefault");
            }
            this.isDefault = isDefault;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetVlanProfilesAssignmentsByDeviceItemVlanProfile", "name");
            }
            this.name = name;
            return this;
        }
        public GetVlanProfilesAssignmentsByDeviceItemVlanProfile build() {
            final var _resultValue = new GetVlanProfilesAssignmentsByDeviceItemVlanProfile();
            _resultValue.iname = iname;
            _resultValue.isDefault = isDefault;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
