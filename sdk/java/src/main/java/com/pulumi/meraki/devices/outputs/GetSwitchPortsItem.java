// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetSwitchPortsItemMirror;
import com.pulumi.meraki.devices.outputs.GetSwitchPortsItemModule;
import com.pulumi.meraki.devices.outputs.GetSwitchPortsItemProfile;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSwitchPortsItem {
    /**
     * @return The number of a custom access policy to configure on the switch port. Only applicable when &#39;accessPolicyType&#39; is &#39;Custom access policy&#39;.
     * 
     */
    private Integer accessPolicyNumber;
    /**
     * @return The type of the access policy of the switch port. Only applicable to access ports. Can be one of &#39;Open&#39;, &#39;Custom access policy&#39;, &#39;MAC allow list&#39; or &#39;Sticky MAC allow list&#39;.
     * 
     */
    private String accessPolicyType;
    /**
     * @return The adaptive policy group ID that will be used to tag traffic through this switch port. This ID must pre-exist during the configuration, else needs to be created using adaptivePolicy/groups API. Cannot be applied to a port on a switch bound to profile.
     * 
     */
    private String adaptivePolicyGroupId;
    /**
     * @return The VLANs allowed on the switch port. Only applicable to trunk ports.
     * 
     */
    private String allowedVlans;
    /**
     * @return If true, ARP packets for this port will be considered trusted, and Dynamic ARP Inspection will allow the traffic.
     * 
     */
    private Boolean daiTrusted;
    /**
     * @return The status of the switch port.
     * 
     */
    private Boolean enabled;
    /**
     * @return For supported switches (e.g. MS420/MS425), whether or not the port has flexible stacking enabled.
     * 
     */
    private Boolean flexibleStackingEnabled;
    /**
     * @return The isolation status of the switch port.
     * 
     */
    private Boolean isolationEnabled;
    /**
     * @return The link speed for the switch port.
     * 
     */
    private String linkNegotiation;
    /**
     * @return Available link speeds for the switch port.
     * 
     */
    private List<String> linkNegotiationCapabilities;
    /**
     * @return Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when &#39;accessPolicyType&#39; is &#39;MAC allow list&#39;.
     * 
     */
    private List<String> macAllowLists;
    /**
     * @return Port mirror
     * 
     */
    private GetSwitchPortsItemMirror mirror;
    /**
     * @return Expansion module
     * 
     */
    private GetSwitchPortsItemModule module;
    /**
     * @return The name of the switch port.
     * 
     */
    private String name;
    /**
     * @return If true, Peer SGT is enabled for traffic through this switch port. Applicable to trunk port only, not access port. Cannot be applied to a port on a switch bound to profile.
     * 
     */
    private Boolean peerSgtCapable;
    /**
     * @return The PoE status of the switch port.
     * 
     */
    private Boolean poeEnabled;
    /**
     * @return The identifier of the switch port.
     * 
     */
    private String portId;
    /**
     * @return The ID of the port schedule. A value of null will clear the port schedule.
     * 
     */
    private String portScheduleId;
    /**
     * @return Profile attributes
     * 
     */
    private GetSwitchPortsItemProfile profile;
    /**
     * @return The rapid spanning tree protocol status.
     * 
     */
    private Boolean rstpEnabled;
    /**
     * @return The maximum number of MAC addresses for sticky MAC allow list. Only applicable when &#39;accessPolicyType&#39; is &#39;Sticky MAC allow list&#39;.
     * 
     */
    private Integer stickyMacAllowListLimit;
    /**
     * @return The initial list of MAC addresses for sticky Mac allow list. Only applicable when &#39;accessPolicyType&#39; is &#39;Sticky MAC allow list&#39;.
     * 
     */
    private List<String> stickyMacAllowLists;
    /**
     * @return The storm control status of the switch port.
     * 
     */
    private Boolean stormControlEnabled;
    /**
     * @return The state of the STP guard (&#39;disabled&#39;, &#39;root guard&#39;, &#39;bpdu guard&#39; or &#39;loop guard&#39;).
     * 
     */
    private String stpGuard;
    /**
     * @return The list of tags of the switch port.
     * 
     */
    private List<String> tags;
    /**
     * @return The type of the switch port (&#39;trunk&#39; or &#39;access&#39;).
     * 
     */
    private String type;
    /**
     * @return The action to take when Unidirectional Link is detected (Alert only, Enforce). Default configuration is Alert only.
     * 
     */
    private String udld;
    /**
     * @return The VLAN of the switch port. For a trunk port, this is the native VLAN. A null value will clear the value set for trunk ports.
     * 
     */
    private Integer vlan;
    /**
     * @return The voice VLAN of the switch port. Only applicable to access ports.
     * 
     */
    private Integer voiceVlan;

    private GetSwitchPortsItem() {}
    /**
     * @return The number of a custom access policy to configure on the switch port. Only applicable when &#39;accessPolicyType&#39; is &#39;Custom access policy&#39;.
     * 
     */
    public Integer accessPolicyNumber() {
        return this.accessPolicyNumber;
    }
    /**
     * @return The type of the access policy of the switch port. Only applicable to access ports. Can be one of &#39;Open&#39;, &#39;Custom access policy&#39;, &#39;MAC allow list&#39; or &#39;Sticky MAC allow list&#39;.
     * 
     */
    public String accessPolicyType() {
        return this.accessPolicyType;
    }
    /**
     * @return The adaptive policy group ID that will be used to tag traffic through this switch port. This ID must pre-exist during the configuration, else needs to be created using adaptivePolicy/groups API. Cannot be applied to a port on a switch bound to profile.
     * 
     */
    public String adaptivePolicyGroupId() {
        return this.adaptivePolicyGroupId;
    }
    /**
     * @return The VLANs allowed on the switch port. Only applicable to trunk ports.
     * 
     */
    public String allowedVlans() {
        return this.allowedVlans;
    }
    /**
     * @return If true, ARP packets for this port will be considered trusted, and Dynamic ARP Inspection will allow the traffic.
     * 
     */
    public Boolean daiTrusted() {
        return this.daiTrusted;
    }
    /**
     * @return The status of the switch port.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return For supported switches (e.g. MS420/MS425), whether or not the port has flexible stacking enabled.
     * 
     */
    public Boolean flexibleStackingEnabled() {
        return this.flexibleStackingEnabled;
    }
    /**
     * @return The isolation status of the switch port.
     * 
     */
    public Boolean isolationEnabled() {
        return this.isolationEnabled;
    }
    /**
     * @return The link speed for the switch port.
     * 
     */
    public String linkNegotiation() {
        return this.linkNegotiation;
    }
    /**
     * @return Available link speeds for the switch port.
     * 
     */
    public List<String> linkNegotiationCapabilities() {
        return this.linkNegotiationCapabilities;
    }
    /**
     * @return Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when &#39;accessPolicyType&#39; is &#39;MAC allow list&#39;.
     * 
     */
    public List<String> macAllowLists() {
        return this.macAllowLists;
    }
    /**
     * @return Port mirror
     * 
     */
    public GetSwitchPortsItemMirror mirror() {
        return this.mirror;
    }
    /**
     * @return Expansion module
     * 
     */
    public GetSwitchPortsItemModule module() {
        return this.module;
    }
    /**
     * @return The name of the switch port.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return If true, Peer SGT is enabled for traffic through this switch port. Applicable to trunk port only, not access port. Cannot be applied to a port on a switch bound to profile.
     * 
     */
    public Boolean peerSgtCapable() {
        return this.peerSgtCapable;
    }
    /**
     * @return The PoE status of the switch port.
     * 
     */
    public Boolean poeEnabled() {
        return this.poeEnabled;
    }
    /**
     * @return The identifier of the switch port.
     * 
     */
    public String portId() {
        return this.portId;
    }
    /**
     * @return The ID of the port schedule. A value of null will clear the port schedule.
     * 
     */
    public String portScheduleId() {
        return this.portScheduleId;
    }
    /**
     * @return Profile attributes
     * 
     */
    public GetSwitchPortsItemProfile profile() {
        return this.profile;
    }
    /**
     * @return The rapid spanning tree protocol status.
     * 
     */
    public Boolean rstpEnabled() {
        return this.rstpEnabled;
    }
    /**
     * @return The maximum number of MAC addresses for sticky MAC allow list. Only applicable when &#39;accessPolicyType&#39; is &#39;Sticky MAC allow list&#39;.
     * 
     */
    public Integer stickyMacAllowListLimit() {
        return this.stickyMacAllowListLimit;
    }
    /**
     * @return The initial list of MAC addresses for sticky Mac allow list. Only applicable when &#39;accessPolicyType&#39; is &#39;Sticky MAC allow list&#39;.
     * 
     */
    public List<String> stickyMacAllowLists() {
        return this.stickyMacAllowLists;
    }
    /**
     * @return The storm control status of the switch port.
     * 
     */
    public Boolean stormControlEnabled() {
        return this.stormControlEnabled;
    }
    /**
     * @return The state of the STP guard (&#39;disabled&#39;, &#39;root guard&#39;, &#39;bpdu guard&#39; or &#39;loop guard&#39;).
     * 
     */
    public String stpGuard() {
        return this.stpGuard;
    }
    /**
     * @return The list of tags of the switch port.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return The type of the switch port (&#39;trunk&#39; or &#39;access&#39;).
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The action to take when Unidirectional Link is detected (Alert only, Enforce). Default configuration is Alert only.
     * 
     */
    public String udld() {
        return this.udld;
    }
    /**
     * @return The VLAN of the switch port. For a trunk port, this is the native VLAN. A null value will clear the value set for trunk ports.
     * 
     */
    public Integer vlan() {
        return this.vlan;
    }
    /**
     * @return The voice VLAN of the switch port. Only applicable to access ports.
     * 
     */
    public Integer voiceVlan() {
        return this.voiceVlan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchPortsItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer accessPolicyNumber;
        private String accessPolicyType;
        private String adaptivePolicyGroupId;
        private String allowedVlans;
        private Boolean daiTrusted;
        private Boolean enabled;
        private Boolean flexibleStackingEnabled;
        private Boolean isolationEnabled;
        private String linkNegotiation;
        private List<String> linkNegotiationCapabilities;
        private List<String> macAllowLists;
        private GetSwitchPortsItemMirror mirror;
        private GetSwitchPortsItemModule module;
        private String name;
        private Boolean peerSgtCapable;
        private Boolean poeEnabled;
        private String portId;
        private String portScheduleId;
        private GetSwitchPortsItemProfile profile;
        private Boolean rstpEnabled;
        private Integer stickyMacAllowListLimit;
        private List<String> stickyMacAllowLists;
        private Boolean stormControlEnabled;
        private String stpGuard;
        private List<String> tags;
        private String type;
        private String udld;
        private Integer vlan;
        private Integer voiceVlan;
        public Builder() {}
        public Builder(GetSwitchPortsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicyNumber = defaults.accessPolicyNumber;
    	      this.accessPolicyType = defaults.accessPolicyType;
    	      this.adaptivePolicyGroupId = defaults.adaptivePolicyGroupId;
    	      this.allowedVlans = defaults.allowedVlans;
    	      this.daiTrusted = defaults.daiTrusted;
    	      this.enabled = defaults.enabled;
    	      this.flexibleStackingEnabled = defaults.flexibleStackingEnabled;
    	      this.isolationEnabled = defaults.isolationEnabled;
    	      this.linkNegotiation = defaults.linkNegotiation;
    	      this.linkNegotiationCapabilities = defaults.linkNegotiationCapabilities;
    	      this.macAllowLists = defaults.macAllowLists;
    	      this.mirror = defaults.mirror;
    	      this.module = defaults.module;
    	      this.name = defaults.name;
    	      this.peerSgtCapable = defaults.peerSgtCapable;
    	      this.poeEnabled = defaults.poeEnabled;
    	      this.portId = defaults.portId;
    	      this.portScheduleId = defaults.portScheduleId;
    	      this.profile = defaults.profile;
    	      this.rstpEnabled = defaults.rstpEnabled;
    	      this.stickyMacAllowListLimit = defaults.stickyMacAllowListLimit;
    	      this.stickyMacAllowLists = defaults.stickyMacAllowLists;
    	      this.stormControlEnabled = defaults.stormControlEnabled;
    	      this.stpGuard = defaults.stpGuard;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.udld = defaults.udld;
    	      this.vlan = defaults.vlan;
    	      this.voiceVlan = defaults.voiceVlan;
        }

        @CustomType.Setter
        public Builder accessPolicyNumber(Integer accessPolicyNumber) {
            if (accessPolicyNumber == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "accessPolicyNumber");
            }
            this.accessPolicyNumber = accessPolicyNumber;
            return this;
        }
        @CustomType.Setter
        public Builder accessPolicyType(String accessPolicyType) {
            if (accessPolicyType == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "accessPolicyType");
            }
            this.accessPolicyType = accessPolicyType;
            return this;
        }
        @CustomType.Setter
        public Builder adaptivePolicyGroupId(String adaptivePolicyGroupId) {
            if (adaptivePolicyGroupId == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "adaptivePolicyGroupId");
            }
            this.adaptivePolicyGroupId = adaptivePolicyGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder allowedVlans(String allowedVlans) {
            if (allowedVlans == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "allowedVlans");
            }
            this.allowedVlans = allowedVlans;
            return this;
        }
        @CustomType.Setter
        public Builder daiTrusted(Boolean daiTrusted) {
            if (daiTrusted == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "daiTrusted");
            }
            this.daiTrusted = daiTrusted;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder flexibleStackingEnabled(Boolean flexibleStackingEnabled) {
            if (flexibleStackingEnabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "flexibleStackingEnabled");
            }
            this.flexibleStackingEnabled = flexibleStackingEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder isolationEnabled(Boolean isolationEnabled) {
            if (isolationEnabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "isolationEnabled");
            }
            this.isolationEnabled = isolationEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder linkNegotiation(String linkNegotiation) {
            if (linkNegotiation == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "linkNegotiation");
            }
            this.linkNegotiation = linkNegotiation;
            return this;
        }
        @CustomType.Setter
        public Builder linkNegotiationCapabilities(List<String> linkNegotiationCapabilities) {
            if (linkNegotiationCapabilities == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "linkNegotiationCapabilities");
            }
            this.linkNegotiationCapabilities = linkNegotiationCapabilities;
            return this;
        }
        public Builder linkNegotiationCapabilities(String... linkNegotiationCapabilities) {
            return linkNegotiationCapabilities(List.of(linkNegotiationCapabilities));
        }
        @CustomType.Setter
        public Builder macAllowLists(List<String> macAllowLists) {
            if (macAllowLists == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "macAllowLists");
            }
            this.macAllowLists = macAllowLists;
            return this;
        }
        public Builder macAllowLists(String... macAllowLists) {
            return macAllowLists(List.of(macAllowLists));
        }
        @CustomType.Setter
        public Builder mirror(GetSwitchPortsItemMirror mirror) {
            if (mirror == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "mirror");
            }
            this.mirror = mirror;
            return this;
        }
        @CustomType.Setter
        public Builder module(GetSwitchPortsItemModule module) {
            if (module == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "module");
            }
            this.module = module;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder peerSgtCapable(Boolean peerSgtCapable) {
            if (peerSgtCapable == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "peerSgtCapable");
            }
            this.peerSgtCapable = peerSgtCapable;
            return this;
        }
        @CustomType.Setter
        public Builder poeEnabled(Boolean poeEnabled) {
            if (poeEnabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "poeEnabled");
            }
            this.poeEnabled = poeEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder portId(String portId) {
            if (portId == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "portId");
            }
            this.portId = portId;
            return this;
        }
        @CustomType.Setter
        public Builder portScheduleId(String portScheduleId) {
            if (portScheduleId == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "portScheduleId");
            }
            this.portScheduleId = portScheduleId;
            return this;
        }
        @CustomType.Setter
        public Builder profile(GetSwitchPortsItemProfile profile) {
            if (profile == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "profile");
            }
            this.profile = profile;
            return this;
        }
        @CustomType.Setter
        public Builder rstpEnabled(Boolean rstpEnabled) {
            if (rstpEnabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "rstpEnabled");
            }
            this.rstpEnabled = rstpEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder stickyMacAllowListLimit(Integer stickyMacAllowListLimit) {
            if (stickyMacAllowListLimit == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "stickyMacAllowListLimit");
            }
            this.stickyMacAllowListLimit = stickyMacAllowListLimit;
            return this;
        }
        @CustomType.Setter
        public Builder stickyMacAllowLists(List<String> stickyMacAllowLists) {
            if (stickyMacAllowLists == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "stickyMacAllowLists");
            }
            this.stickyMacAllowLists = stickyMacAllowLists;
            return this;
        }
        public Builder stickyMacAllowLists(String... stickyMacAllowLists) {
            return stickyMacAllowLists(List.of(stickyMacAllowLists));
        }
        @CustomType.Setter
        public Builder stormControlEnabled(Boolean stormControlEnabled) {
            if (stormControlEnabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "stormControlEnabled");
            }
            this.stormControlEnabled = stormControlEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder stpGuard(String stpGuard) {
            if (stpGuard == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "stpGuard");
            }
            this.stpGuard = stpGuard;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder udld(String udld) {
            if (udld == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "udld");
            }
            this.udld = udld;
            return this;
        }
        @CustomType.Setter
        public Builder vlan(Integer vlan) {
            if (vlan == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "vlan");
            }
            this.vlan = vlan;
            return this;
        }
        @CustomType.Setter
        public Builder voiceVlan(Integer voiceVlan) {
            if (voiceVlan == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsItem", "voiceVlan");
            }
            this.voiceVlan = voiceVlan;
            return this;
        }
        public GetSwitchPortsItem build() {
            final var _resultValue = new GetSwitchPortsItem();
            _resultValue.accessPolicyNumber = accessPolicyNumber;
            _resultValue.accessPolicyType = accessPolicyType;
            _resultValue.adaptivePolicyGroupId = adaptivePolicyGroupId;
            _resultValue.allowedVlans = allowedVlans;
            _resultValue.daiTrusted = daiTrusted;
            _resultValue.enabled = enabled;
            _resultValue.flexibleStackingEnabled = flexibleStackingEnabled;
            _resultValue.isolationEnabled = isolationEnabled;
            _resultValue.linkNegotiation = linkNegotiation;
            _resultValue.linkNegotiationCapabilities = linkNegotiationCapabilities;
            _resultValue.macAllowLists = macAllowLists;
            _resultValue.mirror = mirror;
            _resultValue.module = module;
            _resultValue.name = name;
            _resultValue.peerSgtCapable = peerSgtCapable;
            _resultValue.poeEnabled = poeEnabled;
            _resultValue.portId = portId;
            _resultValue.portScheduleId = portScheduleId;
            _resultValue.profile = profile;
            _resultValue.rstpEnabled = rstpEnabled;
            _resultValue.stickyMacAllowListLimit = stickyMacAllowListLimit;
            _resultValue.stickyMacAllowLists = stickyMacAllowLists;
            _resultValue.stormControlEnabled = stormControlEnabled;
            _resultValue.stpGuard = stpGuard;
            _resultValue.tags = tags;
            _resultValue.type = type;
            _resultValue.udld = udld;
            _resultValue.vlan = vlan;
            _resultValue.voiceVlan = voiceVlan;
            return _resultValue;
        }
    }
}
