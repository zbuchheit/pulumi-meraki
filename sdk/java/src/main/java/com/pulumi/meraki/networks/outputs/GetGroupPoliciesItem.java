// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemBandwidth;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemBonjourForwarding;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemContentFiltering;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemFirewallAndTrafficShaping;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemScheduling;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemVlanTagging;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupPoliciesItem {
    /**
     * @return The bandwidth settings for clients bound to your group policy.
     * 
     */
    private GetGroupPoliciesItemBandwidth bandwidth;
    /**
     * @return The Bonjour settings for your group policy. Only valid if your network has a wireless configuration.
     * 
     */
    private GetGroupPoliciesItemBonjourForwarding bonjourForwarding;
    /**
     * @return The content filtering settings for your group policy
     * 
     */
    private GetGroupPoliciesItemContentFiltering contentFiltering;
    /**
     * @return The firewall and traffic shaping rules and settings for your policy.
     * 
     */
    private GetGroupPoliciesItemFirewallAndTrafficShaping firewallAndTrafficShaping;
    /**
     * @return The ID of the group policy
     * 
     */
    private String groupPolicyId;
    /**
     * @return The schedule for the group policy. Schedules are applied to days of the week.
     * 
     */
    private GetGroupPoliciesItemScheduling scheduling;
    /**
     * @return Whether clients bound to your policy will bypass splash authorization or behave according to the network&#39;s rules. Can be one of &#39;network default&#39; or &#39;bypass&#39;. Only available if your network has a wireless configuration.
     * 
     */
    private String splashAuthSettings;
    /**
     * @return The VLAN tagging settings for your group policy. Only available if your network has a wireless configuration.
     * 
     */
    private GetGroupPoliciesItemVlanTagging vlanTagging;

    private GetGroupPoliciesItem() {}
    /**
     * @return The bandwidth settings for clients bound to your group policy.
     * 
     */
    public GetGroupPoliciesItemBandwidth bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return The Bonjour settings for your group policy. Only valid if your network has a wireless configuration.
     * 
     */
    public GetGroupPoliciesItemBonjourForwarding bonjourForwarding() {
        return this.bonjourForwarding;
    }
    /**
     * @return The content filtering settings for your group policy
     * 
     */
    public GetGroupPoliciesItemContentFiltering contentFiltering() {
        return this.contentFiltering;
    }
    /**
     * @return The firewall and traffic shaping rules and settings for your policy.
     * 
     */
    public GetGroupPoliciesItemFirewallAndTrafficShaping firewallAndTrafficShaping() {
        return this.firewallAndTrafficShaping;
    }
    /**
     * @return The ID of the group policy
     * 
     */
    public String groupPolicyId() {
        return this.groupPolicyId;
    }
    /**
     * @return The schedule for the group policy. Schedules are applied to days of the week.
     * 
     */
    public GetGroupPoliciesItemScheduling scheduling() {
        return this.scheduling;
    }
    /**
     * @return Whether clients bound to your policy will bypass splash authorization or behave according to the network&#39;s rules. Can be one of &#39;network default&#39; or &#39;bypass&#39;. Only available if your network has a wireless configuration.
     * 
     */
    public String splashAuthSettings() {
        return this.splashAuthSettings;
    }
    /**
     * @return The VLAN tagging settings for your group policy. Only available if your network has a wireless configuration.
     * 
     */
    public GetGroupPoliciesItemVlanTagging vlanTagging() {
        return this.vlanTagging;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupPoliciesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetGroupPoliciesItemBandwidth bandwidth;
        private GetGroupPoliciesItemBonjourForwarding bonjourForwarding;
        private GetGroupPoliciesItemContentFiltering contentFiltering;
        private GetGroupPoliciesItemFirewallAndTrafficShaping firewallAndTrafficShaping;
        private String groupPolicyId;
        private GetGroupPoliciesItemScheduling scheduling;
        private String splashAuthSettings;
        private GetGroupPoliciesItemVlanTagging vlanTagging;
        public Builder() {}
        public Builder(GetGroupPoliciesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.bonjourForwarding = defaults.bonjourForwarding;
    	      this.contentFiltering = defaults.contentFiltering;
    	      this.firewallAndTrafficShaping = defaults.firewallAndTrafficShaping;
    	      this.groupPolicyId = defaults.groupPolicyId;
    	      this.scheduling = defaults.scheduling;
    	      this.splashAuthSettings = defaults.splashAuthSettings;
    	      this.vlanTagging = defaults.vlanTagging;
        }

        @CustomType.Setter
        public Builder bandwidth(GetGroupPoliciesItemBandwidth bandwidth) {
            if (bandwidth == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItem", "bandwidth");
            }
            this.bandwidth = bandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder bonjourForwarding(GetGroupPoliciesItemBonjourForwarding bonjourForwarding) {
            if (bonjourForwarding == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItem", "bonjourForwarding");
            }
            this.bonjourForwarding = bonjourForwarding;
            return this;
        }
        @CustomType.Setter
        public Builder contentFiltering(GetGroupPoliciesItemContentFiltering contentFiltering) {
            if (contentFiltering == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItem", "contentFiltering");
            }
            this.contentFiltering = contentFiltering;
            return this;
        }
        @CustomType.Setter
        public Builder firewallAndTrafficShaping(GetGroupPoliciesItemFirewallAndTrafficShaping firewallAndTrafficShaping) {
            if (firewallAndTrafficShaping == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItem", "firewallAndTrafficShaping");
            }
            this.firewallAndTrafficShaping = firewallAndTrafficShaping;
            return this;
        }
        @CustomType.Setter
        public Builder groupPolicyId(String groupPolicyId) {
            if (groupPolicyId == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItem", "groupPolicyId");
            }
            this.groupPolicyId = groupPolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder scheduling(GetGroupPoliciesItemScheduling scheduling) {
            if (scheduling == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItem", "scheduling");
            }
            this.scheduling = scheduling;
            return this;
        }
        @CustomType.Setter
        public Builder splashAuthSettings(String splashAuthSettings) {
            if (splashAuthSettings == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItem", "splashAuthSettings");
            }
            this.splashAuthSettings = splashAuthSettings;
            return this;
        }
        @CustomType.Setter
        public Builder vlanTagging(GetGroupPoliciesItemVlanTagging vlanTagging) {
            if (vlanTagging == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItem", "vlanTagging");
            }
            this.vlanTagging = vlanTagging;
            return this;
        }
        public GetGroupPoliciesItem build() {
            final var _resultValue = new GetGroupPoliciesItem();
            _resultValue.bandwidth = bandwidth;
            _resultValue.bonjourForwarding = bonjourForwarding;
            _resultValue.contentFiltering = contentFiltering;
            _resultValue.firewallAndTrafficShaping = firewallAndTrafficShaping;
            _resultValue.groupPolicyId = groupPolicyId;
            _resultValue.scheduling = scheduling;
            _resultValue.splashAuthSettings = splashAuthSettings;
            _resultValue.vlanTagging = vlanTagging;
            return _resultValue;
        }
    }
}
