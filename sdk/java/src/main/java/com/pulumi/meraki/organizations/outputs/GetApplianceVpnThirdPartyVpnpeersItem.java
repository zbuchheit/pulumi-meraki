// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetApplianceVpnThirdPartyVpnpeersItemPeer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplianceVpnThirdPartyVpnpeersItem {
    /**
     * @return The list of VPN peers
     * 
     */
    private List<GetApplianceVpnThirdPartyVpnpeersItemPeer> peers;

    private GetApplianceVpnThirdPartyVpnpeersItem() {}
    /**
     * @return The list of VPN peers
     * 
     */
    public List<GetApplianceVpnThirdPartyVpnpeersItemPeer> peers() {
        return this.peers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceVpnThirdPartyVpnpeersItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetApplianceVpnThirdPartyVpnpeersItemPeer> peers;
        public Builder() {}
        public Builder(GetApplianceVpnThirdPartyVpnpeersItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peers = defaults.peers;
        }

        @CustomType.Setter
        public Builder peers(List<GetApplianceVpnThirdPartyVpnpeersItemPeer> peers) {
            if (peers == null) {
              throw new MissingRequiredPropertyException("GetApplianceVpnThirdPartyVpnpeersItem", "peers");
            }
            this.peers = peers;
            return this;
        }
        public Builder peers(GetApplianceVpnThirdPartyVpnpeersItemPeer... peers) {
            return peers(List.of(peers));
        }
        public GetApplianceVpnThirdPartyVpnpeersItem build() {
            final var _resultValue = new GetApplianceVpnThirdPartyVpnpeersItem();
            _resultValue.peers = peers;
            return _resultValue;
        }
    }
}
