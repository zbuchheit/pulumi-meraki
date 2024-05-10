// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetApplianceUplinksSettingsItemInterfacesWan2VlanTagging {
    /**
     * @return Whether VLAN tagging is enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return The ID of the VLAN to use for VLAN tagging.
     * 
     */
    private Integer vlanId;

    private GetApplianceUplinksSettingsItemInterfacesWan2VlanTagging() {}
    /**
     * @return Whether VLAN tagging is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The ID of the VLAN to use for VLAN tagging.
     * 
     */
    public Integer vlanId() {
        return this.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceUplinksSettingsItemInterfacesWan2VlanTagging defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private Integer vlanId;
        public Builder() {}
        public Builder(GetApplianceUplinksSettingsItemInterfacesWan2VlanTagging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.vlanId = defaults.vlanId;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetApplianceUplinksSettingsItemInterfacesWan2VlanTagging", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(Integer vlanId) {
            if (vlanId == null) {
              throw new MissingRequiredPropertyException("GetApplianceUplinksSettingsItemInterfacesWan2VlanTagging", "vlanId");
            }
            this.vlanId = vlanId;
            return this;
        }
        public GetApplianceUplinksSettingsItemInterfacesWan2VlanTagging build() {
            final var _resultValue = new GetApplianceUplinksSettingsItemInterfacesWan2VlanTagging();
            _resultValue.enabled = enabled;
            _resultValue.vlanId = vlanId;
            return _resultValue;
        }
    }
}
