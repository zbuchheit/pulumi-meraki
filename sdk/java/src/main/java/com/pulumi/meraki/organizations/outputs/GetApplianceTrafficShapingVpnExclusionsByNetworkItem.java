// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplianceTrafficShapingVpnExclusionsByNetworkItem {
    /**
     * @return VPN exclusion rules by network
     * 
     */
    private List<GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem> items;

    private GetApplianceTrafficShapingVpnExclusionsByNetworkItem() {}
    /**
     * @return VPN exclusion rules by network
     * 
     */
    public List<GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceTrafficShapingVpnExclusionsByNetworkItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem> items;
        public Builder() {}
        public Builder(GetApplianceTrafficShapingVpnExclusionsByNetworkItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        @CustomType.Setter
        public Builder items(List<GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingVpnExclusionsByNetworkItem", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetApplianceTrafficShapingVpnExclusionsByNetworkItemItem... items) {
            return items(List.of(items));
        }
        public GetApplianceTrafficShapingVpnExclusionsByNetworkItem build() {
            final var _resultValue = new GetApplianceTrafficShapingVpnExclusionsByNetworkItem();
            _resultValue.items = items;
            return _resultValue;
        }
    }
}
