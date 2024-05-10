// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.devices.outputs.ApplianceUplinksSettingsInterfacesWan1Pppoe;
import com.pulumi.meraki.devices.outputs.ApplianceUplinksSettingsInterfacesWan1Svis;
import com.pulumi.meraki.devices.outputs.ApplianceUplinksSettingsInterfacesWan1VlanTagging;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplianceUplinksSettingsInterfacesWan1 {
    /**
     * @return Enable or disable the interface.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Configuration options for PPPoE.
     * 
     */
    private @Nullable ApplianceUplinksSettingsInterfacesWan1Pppoe pppoe;
    /**
     * @return SVI settings by protocol.
     * 
     */
    private @Nullable ApplianceUplinksSettingsInterfacesWan1Svis svis;
    /**
     * @return VLAN tagging settings.
     * 
     */
    private @Nullable ApplianceUplinksSettingsInterfacesWan1VlanTagging vlanTagging;

    private ApplianceUplinksSettingsInterfacesWan1() {}
    /**
     * @return Enable or disable the interface.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Configuration options for PPPoE.
     * 
     */
    public Optional<ApplianceUplinksSettingsInterfacesWan1Pppoe> pppoe() {
        return Optional.ofNullable(this.pppoe);
    }
    /**
     * @return SVI settings by protocol.
     * 
     */
    public Optional<ApplianceUplinksSettingsInterfacesWan1Svis> svis() {
        return Optional.ofNullable(this.svis);
    }
    /**
     * @return VLAN tagging settings.
     * 
     */
    public Optional<ApplianceUplinksSettingsInterfacesWan1VlanTagging> vlanTagging() {
        return Optional.ofNullable(this.vlanTagging);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceUplinksSettingsInterfacesWan1 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable ApplianceUplinksSettingsInterfacesWan1Pppoe pppoe;
        private @Nullable ApplianceUplinksSettingsInterfacesWan1Svis svis;
        private @Nullable ApplianceUplinksSettingsInterfacesWan1VlanTagging vlanTagging;
        public Builder() {}
        public Builder(ApplianceUplinksSettingsInterfacesWan1 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.pppoe = defaults.pppoe;
    	      this.svis = defaults.svis;
    	      this.vlanTagging = defaults.vlanTagging;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder pppoe(@Nullable ApplianceUplinksSettingsInterfacesWan1Pppoe pppoe) {

            this.pppoe = pppoe;
            return this;
        }
        @CustomType.Setter
        public Builder svis(@Nullable ApplianceUplinksSettingsInterfacesWan1Svis svis) {

            this.svis = svis;
            return this;
        }
        @CustomType.Setter
        public Builder vlanTagging(@Nullable ApplianceUplinksSettingsInterfacesWan1VlanTagging vlanTagging) {

            this.vlanTagging = vlanTagging;
            return this;
        }
        public ApplianceUplinksSettingsInterfacesWan1 build() {
            final var _resultValue = new ApplianceUplinksSettingsInterfacesWan1();
            _resultValue.enabled = enabled;
            _resultValue.pppoe = pppoe;
            _resultValue.svis = svis;
            _resultValue.vlanTagging = vlanTagging;
            return _resultValue;
        }
    }
}
