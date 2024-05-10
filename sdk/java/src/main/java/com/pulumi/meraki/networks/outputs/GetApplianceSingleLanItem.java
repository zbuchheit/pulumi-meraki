// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceSingleLanItemIpv6;
import com.pulumi.meraki.networks.outputs.GetApplianceSingleLanItemMandatoryDhcp;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceSingleLanItem {
    /**
     * @return The local IP of the appliance on the single LAN
     * 
     */
    private String applianceIp;
    /**
     * @return IPv6 configuration on the single LAN
     * 
     */
    private GetApplianceSingleLanItemIpv6 ipv6;
    /**
     * @return Mandatory DHCP will enforce that clients connecting to this single LAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won&#39;t be able to associate. Only available on firmware versions 17.0 and above
     * 
     */
    private GetApplianceSingleLanItemMandatoryDhcp mandatoryDhcp;
    /**
     * @return The subnet of the single LAN
     * 
     */
    private String subnet;

    private GetApplianceSingleLanItem() {}
    /**
     * @return The local IP of the appliance on the single LAN
     * 
     */
    public String applianceIp() {
        return this.applianceIp;
    }
    /**
     * @return IPv6 configuration on the single LAN
     * 
     */
    public GetApplianceSingleLanItemIpv6 ipv6() {
        return this.ipv6;
    }
    /**
     * @return Mandatory DHCP will enforce that clients connecting to this single LAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won&#39;t be able to associate. Only available on firmware versions 17.0 and above
     * 
     */
    public GetApplianceSingleLanItemMandatoryDhcp mandatoryDhcp() {
        return this.mandatoryDhcp;
    }
    /**
     * @return The subnet of the single LAN
     * 
     */
    public String subnet() {
        return this.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceSingleLanItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applianceIp;
        private GetApplianceSingleLanItemIpv6 ipv6;
        private GetApplianceSingleLanItemMandatoryDhcp mandatoryDhcp;
        private String subnet;
        public Builder() {}
        public Builder(GetApplianceSingleLanItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applianceIp = defaults.applianceIp;
    	      this.ipv6 = defaults.ipv6;
    	      this.mandatoryDhcp = defaults.mandatoryDhcp;
    	      this.subnet = defaults.subnet;
        }

        @CustomType.Setter
        public Builder applianceIp(String applianceIp) {
            if (applianceIp == null) {
              throw new MissingRequiredPropertyException("GetApplianceSingleLanItem", "applianceIp");
            }
            this.applianceIp = applianceIp;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6(GetApplianceSingleLanItemIpv6 ipv6) {
            if (ipv6 == null) {
              throw new MissingRequiredPropertyException("GetApplianceSingleLanItem", "ipv6");
            }
            this.ipv6 = ipv6;
            return this;
        }
        @CustomType.Setter
        public Builder mandatoryDhcp(GetApplianceSingleLanItemMandatoryDhcp mandatoryDhcp) {
            if (mandatoryDhcp == null) {
              throw new MissingRequiredPropertyException("GetApplianceSingleLanItem", "mandatoryDhcp");
            }
            this.mandatoryDhcp = mandatoryDhcp;
            return this;
        }
        @CustomType.Setter
        public Builder subnet(String subnet) {
            if (subnet == null) {
              throw new MissingRequiredPropertyException("GetApplianceSingleLanItem", "subnet");
            }
            this.subnet = subnet;
            return this;
        }
        public GetApplianceSingleLanItem build() {
            final var _resultValue = new GetApplianceSingleLanItem();
            _resultValue.applianceIp = applianceIp;
            _resultValue.ipv6 = ipv6;
            _resultValue.mandatoryDhcp = mandatoryDhcp;
            _resultValue.subnet = subnet;
            return _resultValue;
        }
    }
}
