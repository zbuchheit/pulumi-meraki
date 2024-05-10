// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetApplianceUplinksSettingsItemInterfacesWan2PppoeAuthentication;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetApplianceUplinksSettingsItemInterfacesWan2Pppoe {
    /**
     * @return Settings for PPPoE Authentication.
     * 
     */
    private GetApplianceUplinksSettingsItemInterfacesWan2PppoeAuthentication authentication;
    /**
     * @return Whether PPPoE is enabled.
     * 
     */
    private Boolean enabled;

    private GetApplianceUplinksSettingsItemInterfacesWan2Pppoe() {}
    /**
     * @return Settings for PPPoE Authentication.
     * 
     */
    public GetApplianceUplinksSettingsItemInterfacesWan2PppoeAuthentication authentication() {
        return this.authentication;
    }
    /**
     * @return Whether PPPoE is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceUplinksSettingsItemInterfacesWan2Pppoe defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetApplianceUplinksSettingsItemInterfacesWan2PppoeAuthentication authentication;
        private Boolean enabled;
        public Builder() {}
        public Builder(GetApplianceUplinksSettingsItemInterfacesWan2Pppoe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder authentication(GetApplianceUplinksSettingsItemInterfacesWan2PppoeAuthentication authentication) {
            if (authentication == null) {
              throw new MissingRequiredPropertyException("GetApplianceUplinksSettingsItemInterfacesWan2Pppoe", "authentication");
            }
            this.authentication = authentication;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetApplianceUplinksSettingsItemInterfacesWan2Pppoe", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        public GetApplianceUplinksSettingsItemInterfacesWan2Pppoe build() {
            final var _resultValue = new GetApplianceUplinksSettingsItemInterfacesWan2Pppoe();
            _resultValue.authentication = authentication;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
