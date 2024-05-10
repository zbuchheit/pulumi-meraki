// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceVpnSiteToSiteVpnItemSubnet {
    /**
     * @return The CIDR notation subnet used within the VPN
     * 
     */
    private String localSubnet;
    /**
     * @return Indicates the presence of the subnet in the VPN
     * 
     */
    private Boolean useVpn;

    private GetApplianceVpnSiteToSiteVpnItemSubnet() {}
    /**
     * @return The CIDR notation subnet used within the VPN
     * 
     */
    public String localSubnet() {
        return this.localSubnet;
    }
    /**
     * @return Indicates the presence of the subnet in the VPN
     * 
     */
    public Boolean useVpn() {
        return this.useVpn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceVpnSiteToSiteVpnItemSubnet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String localSubnet;
        private Boolean useVpn;
        public Builder() {}
        public Builder(GetApplianceVpnSiteToSiteVpnItemSubnet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localSubnet = defaults.localSubnet;
    	      this.useVpn = defaults.useVpn;
        }

        @CustomType.Setter
        public Builder localSubnet(String localSubnet) {
            if (localSubnet == null) {
              throw new MissingRequiredPropertyException("GetApplianceVpnSiteToSiteVpnItemSubnet", "localSubnet");
            }
            this.localSubnet = localSubnet;
            return this;
        }
        @CustomType.Setter
        public Builder useVpn(Boolean useVpn) {
            if (useVpn == null) {
              throw new MissingRequiredPropertyException("GetApplianceVpnSiteToSiteVpnItemSubnet", "useVpn");
            }
            this.useVpn = useVpn;
            return this;
        }
        public GetApplianceVpnSiteToSiteVpnItemSubnet build() {
            final var _resultValue = new GetApplianceVpnSiteToSiteVpnItemSubnet();
            _resultValue.localSubnet = localSubnet;
            _resultValue.useVpn = useVpn;
            return _resultValue;
        }
    }
}
