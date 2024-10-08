// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetApplianceUplinksSettingsItemInterfacesWan1Pppoe;
import com.pulumi.meraki.devices.outputs.GetApplianceUplinksSettingsItemInterfacesWan1Svis;
import com.pulumi.meraki.devices.outputs.GetApplianceUplinksSettingsItemInterfacesWan1VlanTagging;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetApplianceUplinksSettingsItemInterfacesWan1 {
    /**
     * @return Enable or disable the interface.
     * 
     */
    private Boolean enabled;
    /**
     * @return Configuration options for PPPoE.
     * 
     */
    private GetApplianceUplinksSettingsItemInterfacesWan1Pppoe pppoe;
    /**
     * @return SVI settings by protocol.
     * 
     */
    private GetApplianceUplinksSettingsItemInterfacesWan1Svis svis;
    /**
     * @return VLAN tagging settings.
     * 
     */
    private GetApplianceUplinksSettingsItemInterfacesWan1VlanTagging vlanTagging;

    private GetApplianceUplinksSettingsItemInterfacesWan1() {}
    /**
     * @return Enable or disable the interface.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Configuration options for PPPoE.
     * 
     */
    public GetApplianceUplinksSettingsItemInterfacesWan1Pppoe pppoe() {
        return this.pppoe;
    }
    /**
     * @return SVI settings by protocol.
     * 
     */
    public GetApplianceUplinksSettingsItemInterfacesWan1Svis svis() {
        return this.svis;
    }
    /**
     * @return VLAN tagging settings.
     * 
     */
    public GetApplianceUplinksSettingsItemInterfacesWan1VlanTagging vlanTagging() {
        return this.vlanTagging;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceUplinksSettingsItemInterfacesWan1 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private GetApplianceUplinksSettingsItemInterfacesWan1Pppoe pppoe;
        private GetApplianceUplinksSettingsItemInterfacesWan1Svis svis;
        private GetApplianceUplinksSettingsItemInterfacesWan1VlanTagging vlanTagging;
        public Builder() {}
        public Builder(GetApplianceUplinksSettingsItemInterfacesWan1 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.pppoe = defaults.pppoe;
    	      this.svis = defaults.svis;
    	      this.vlanTagging = defaults.vlanTagging;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetApplianceUplinksSettingsItemInterfacesWan1", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder pppoe(GetApplianceUplinksSettingsItemInterfacesWan1Pppoe pppoe) {
            if (pppoe == null) {
              throw new MissingRequiredPropertyException("GetApplianceUplinksSettingsItemInterfacesWan1", "pppoe");
            }
            this.pppoe = pppoe;
            return this;
        }
        @CustomType.Setter
        public Builder svis(GetApplianceUplinksSettingsItemInterfacesWan1Svis svis) {
            if (svis == null) {
              throw new MissingRequiredPropertyException("GetApplianceUplinksSettingsItemInterfacesWan1", "svis");
            }
            this.svis = svis;
            return this;
        }
        @CustomType.Setter
        public Builder vlanTagging(GetApplianceUplinksSettingsItemInterfacesWan1VlanTagging vlanTagging) {
            if (vlanTagging == null) {
              throw new MissingRequiredPropertyException("GetApplianceUplinksSettingsItemInterfacesWan1", "vlanTagging");
            }
            this.vlanTagging = vlanTagging;
            return this;
        }
        public GetApplianceUplinksSettingsItemInterfacesWan1 build() {
            final var _resultValue = new GetApplianceUplinksSettingsItemInterfacesWan1();
            _resultValue.enabled = enabled;
            _resultValue.pppoe = pppoe;
            _resultValue.svis = svis;
            _resultValue.vlanTagging = vlanTagging;
            return _resultValue;
        }
    }
}
