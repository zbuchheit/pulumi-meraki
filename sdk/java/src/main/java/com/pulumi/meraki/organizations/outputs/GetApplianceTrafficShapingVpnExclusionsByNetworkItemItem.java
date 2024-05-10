// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemCustom;
import com.pulumi.meraki.organizations.outputs.GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemMajorApplication;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem {
    /**
     * @return Custom VPN exclusion rules.
     * 
     */
    private List<GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemCustom> customs;
    /**
     * @return Major Application based VPN exclusion rules.
     * 
     */
    private List<GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemMajorApplication> majorApplications;
    /**
     * @return ID of the network whose VPN exclusion rules are returned.
     * 
     */
    private String networkId;
    /**
     * @return Name of the network whose VPN exclusion rules are returned.
     * 
     */
    private String networkName;

    private GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem() {}
    /**
     * @return Custom VPN exclusion rules.
     * 
     */
    public List<GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemCustom> customs() {
        return this.customs;
    }
    /**
     * @return Major Application based VPN exclusion rules.
     * 
     */
    public List<GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemMajorApplication> majorApplications() {
        return this.majorApplications;
    }
    /**
     * @return ID of the network whose VPN exclusion rules are returned.
     * 
     */
    public String networkId() {
        return this.networkId;
    }
    /**
     * @return Name of the network whose VPN exclusion rules are returned.
     * 
     */
    public String networkName() {
        return this.networkName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemCustom> customs;
        private List<GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemMajorApplication> majorApplications;
        private String networkId;
        private String networkName;
        public Builder() {}
        public Builder(GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customs = defaults.customs;
    	      this.majorApplications = defaults.majorApplications;
    	      this.networkId = defaults.networkId;
    	      this.networkName = defaults.networkName;
        }

        @CustomType.Setter
        public Builder customs(List<GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemCustom> customs) {
            if (customs == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem", "customs");
            }
            this.customs = customs;
            return this;
        }
        public Builder customs(GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemCustom... customs) {
            return customs(List.of(customs));
        }
        @CustomType.Setter
        public Builder majorApplications(List<GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemMajorApplication> majorApplications) {
            if (majorApplications == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem", "majorApplications");
            }
            this.majorApplications = majorApplications;
            return this;
        }
        public Builder majorApplications(GetApplianceTrafficShapingVpnExclusionsByNetworkItemItemMajorApplication... majorApplications) {
            return majorApplications(List.of(majorApplications));
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder networkName(String networkName) {
            if (networkName == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem", "networkName");
            }
            this.networkName = networkName;
            return this;
        }
        public GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem build() {
            final var _resultValue = new GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem();
            _resultValue.customs = customs;
            _resultValue.majorApplications = majorApplications;
            _resultValue.networkId = networkId;
            _resultValue.networkName = networkName;
            return _resultValue;
        }
    }
}
