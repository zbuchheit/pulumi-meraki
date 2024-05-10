// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetVlanProfilesItemVlanNameAdaptivePolicyGroup;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVlanProfilesItemVlanName {
    /**
     * @return Adaptive Policy Group assigned to Vlan ID
     * 
     */
    private GetVlanProfilesItemVlanNameAdaptivePolicyGroup adaptivePolicyGroup;
    /**
     * @return Name of the VLAN, string length must be from 1 to 32 characters
     * 
     */
    private String name;
    /**
     * @return VLAN ID
     * 
     */
    private String vlanId;

    private GetVlanProfilesItemVlanName() {}
    /**
     * @return Adaptive Policy Group assigned to Vlan ID
     * 
     */
    public GetVlanProfilesItemVlanNameAdaptivePolicyGroup adaptivePolicyGroup() {
        return this.adaptivePolicyGroup;
    }
    /**
     * @return Name of the VLAN, string length must be from 1 to 32 characters
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return VLAN ID
     * 
     */
    public String vlanId() {
        return this.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVlanProfilesItemVlanName defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetVlanProfilesItemVlanNameAdaptivePolicyGroup adaptivePolicyGroup;
        private String name;
        private String vlanId;
        public Builder() {}
        public Builder(GetVlanProfilesItemVlanName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adaptivePolicyGroup = defaults.adaptivePolicyGroup;
    	      this.name = defaults.name;
    	      this.vlanId = defaults.vlanId;
        }

        @CustomType.Setter
        public Builder adaptivePolicyGroup(GetVlanProfilesItemVlanNameAdaptivePolicyGroup adaptivePolicyGroup) {
            if (adaptivePolicyGroup == null) {
              throw new MissingRequiredPropertyException("GetVlanProfilesItemVlanName", "adaptivePolicyGroup");
            }
            this.adaptivePolicyGroup = adaptivePolicyGroup;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetVlanProfilesItemVlanName", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(String vlanId) {
            if (vlanId == null) {
              throw new MissingRequiredPropertyException("GetVlanProfilesItemVlanName", "vlanId");
            }
            this.vlanId = vlanId;
            return this;
        }
        public GetVlanProfilesItemVlanName build() {
            final var _resultValue = new GetVlanProfilesItemVlanName();
            _resultValue.adaptivePolicyGroup = adaptivePolicyGroup;
            _resultValue.name = name;
            _resultValue.vlanId = vlanId;
            return _resultValue;
        }
    }
}
