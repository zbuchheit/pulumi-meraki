// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.inputs.ConfigTemplatesSwitchProfilesPortsProfileArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigTemplatesSwitchProfilesPortsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigTemplatesSwitchProfilesPortsArgs Empty = new ConfigTemplatesSwitchProfilesPortsArgs();

    /**
     * The number of a custom access policy to configure on the switch template port. Only applicable when &#39;accessPolicyType&#39; is &#39;Custom access policy&#39;.
     * 
     */
    @Import(name="accessPolicyNumber")
    private @Nullable Output<Integer> accessPolicyNumber;

    /**
     * @return The number of a custom access policy to configure on the switch template port. Only applicable when &#39;accessPolicyType&#39; is &#39;Custom access policy&#39;.
     * 
     */
    public Optional<Output<Integer>> accessPolicyNumber() {
        return Optional.ofNullable(this.accessPolicyNumber);
    }

    /**
     * The type of the access policy of the switch template port. Only applicable to access ports. Can be one of &#39;Open&#39;, &#39;Custom access policy&#39;, &#39;MAC allow list&#39; or &#39;Sticky MAC allow list&#39;.
     * 
     */
    @Import(name="accessPolicyType")
    private @Nullable Output<String> accessPolicyType;

    /**
     * @return The type of the access policy of the switch template port. Only applicable to access ports. Can be one of &#39;Open&#39;, &#39;Custom access policy&#39;, &#39;MAC allow list&#39; or &#39;Sticky MAC allow list&#39;.
     * 
     */
    public Optional<Output<String>> accessPolicyType() {
        return Optional.ofNullable(this.accessPolicyType);
    }

    /**
     * The VLANs allowed on the switch template port. Only applicable to trunk ports.
     * 
     */
    @Import(name="allowedVlans")
    private @Nullable Output<String> allowedVlans;

    /**
     * @return The VLANs allowed on the switch template port. Only applicable to trunk ports.
     * 
     */
    public Optional<Output<String>> allowedVlans() {
        return Optional.ofNullable(this.allowedVlans);
    }

    /**
     * configTemplateId path parameter. Config template ID
     * 
     */
    @Import(name="configTemplateId", required=true)
    private Output<String> configTemplateId;

    /**
     * @return configTemplateId path parameter. Config template ID
     * 
     */
    public Output<String> configTemplateId() {
        return this.configTemplateId;
    }

    /**
     * If true, ARP packets for this port will be considered trusted, and Dynamic ARP Inspection will allow the traffic.
     * 
     */
    @Import(name="daiTrusted")
    private @Nullable Output<Boolean> daiTrusted;

    /**
     * @return If true, ARP packets for this port will be considered trusted, and Dynamic ARP Inspection will allow the traffic.
     * 
     */
    public Optional<Output<Boolean>> daiTrusted() {
        return Optional.ofNullable(this.daiTrusted);
    }

    /**
     * The status of the switch template port.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return The status of the switch template port.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * For supported switches (e.g. MS420/MS425), whether or not the port has flexible stacking enabled.
     * 
     */
    @Import(name="flexibleStackingEnabled")
    private @Nullable Output<Boolean> flexibleStackingEnabled;

    /**
     * @return For supported switches (e.g. MS420/MS425), whether or not the port has flexible stacking enabled.
     * 
     */
    public Optional<Output<Boolean>> flexibleStackingEnabled() {
        return Optional.ofNullable(this.flexibleStackingEnabled);
    }

    /**
     * The isolation status of the switch template port.
     * 
     */
    @Import(name="isolationEnabled")
    private @Nullable Output<Boolean> isolationEnabled;

    /**
     * @return The isolation status of the switch template port.
     * 
     */
    public Optional<Output<Boolean>> isolationEnabled() {
        return Optional.ofNullable(this.isolationEnabled);
    }

    /**
     * The link speed for the switch template port.
     * 
     */
    @Import(name="linkNegotiation")
    private @Nullable Output<String> linkNegotiation;

    /**
     * @return The link speed for the switch template port.
     * 
     */
    public Optional<Output<String>> linkNegotiation() {
        return Optional.ofNullable(this.linkNegotiation);
    }

    /**
     * Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when &#39;accessPolicyType&#39; is &#39;MAC allow list&#39;.
     * 
     */
    @Import(name="macAllowLists")
    private @Nullable Output<List<String>> macAllowLists;

    /**
     * @return Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when &#39;accessPolicyType&#39; is &#39;MAC allow list&#39;.
     * 
     */
    public Optional<Output<List<String>>> macAllowLists() {
        return Optional.ofNullable(this.macAllowLists);
    }

    /**
     * The name of the switch template port.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the switch template port.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * The PoE status of the switch template port.
     * 
     */
    @Import(name="poeEnabled")
    private @Nullable Output<Boolean> poeEnabled;

    /**
     * @return The PoE status of the switch template port.
     * 
     */
    public Optional<Output<Boolean>> poeEnabled() {
        return Optional.ofNullable(this.poeEnabled);
    }

    /**
     * The identifier of the switch template port.
     * 
     */
    @Import(name="portId", required=true)
    private Output<String> portId;

    /**
     * @return The identifier of the switch template port.
     * 
     */
    public Output<String> portId() {
        return this.portId;
    }

    /**
     * The ID of the port schedule. A value of null will clear the port schedule.
     * 
     */
    @Import(name="portScheduleId")
    private @Nullable Output<String> portScheduleId;

    /**
     * @return The ID of the port schedule. A value of null will clear the port schedule.
     * 
     */
    public Optional<Output<String>> portScheduleId() {
        return Optional.ofNullable(this.portScheduleId);
    }

    /**
     * Profile attributes
     * 
     */
    @Import(name="profile")
    private @Nullable Output<ConfigTemplatesSwitchProfilesPortsProfileArgs> profile;

    /**
     * @return Profile attributes
     * 
     */
    public Optional<Output<ConfigTemplatesSwitchProfilesPortsProfileArgs>> profile() {
        return Optional.ofNullable(this.profile);
    }

    /**
     * profileId path parameter. Profile ID
     * 
     */
    @Import(name="profileId", required=true)
    private Output<String> profileId;

    /**
     * @return profileId path parameter. Profile ID
     * 
     */
    public Output<String> profileId() {
        return this.profileId;
    }

    /**
     * The rapid spanning tree protocol status.
     * 
     */
    @Import(name="rstpEnabled")
    private @Nullable Output<Boolean> rstpEnabled;

    /**
     * @return The rapid spanning tree protocol status.
     * 
     */
    public Optional<Output<Boolean>> rstpEnabled() {
        return Optional.ofNullable(this.rstpEnabled);
    }

    /**
     * The maximum number of MAC addresses for sticky MAC allow list. Only applicable when &#39;accessPolicyType&#39; is &#39;Sticky MAC allow list&#39;.
     * 
     */
    @Import(name="stickyMacAllowListLimit")
    private @Nullable Output<Integer> stickyMacAllowListLimit;

    /**
     * @return The maximum number of MAC addresses for sticky MAC allow list. Only applicable when &#39;accessPolicyType&#39; is &#39;Sticky MAC allow list&#39;.
     * 
     */
    public Optional<Output<Integer>> stickyMacAllowListLimit() {
        return Optional.ofNullable(this.stickyMacAllowListLimit);
    }

    /**
     * The initial list of MAC addresses for sticky Mac allow list. Only applicable when &#39;accessPolicyType&#39; is &#39;Sticky MAC allow list&#39;.
     * 
     */
    @Import(name="stickyMacAllowLists")
    private @Nullable Output<List<String>> stickyMacAllowLists;

    /**
     * @return The initial list of MAC addresses for sticky Mac allow list. Only applicable when &#39;accessPolicyType&#39; is &#39;Sticky MAC allow list&#39;.
     * 
     */
    public Optional<Output<List<String>>> stickyMacAllowLists() {
        return Optional.ofNullable(this.stickyMacAllowLists);
    }

    /**
     * The storm control status of the switch template port.
     * 
     */
    @Import(name="stormControlEnabled")
    private @Nullable Output<Boolean> stormControlEnabled;

    /**
     * @return The storm control status of the switch template port.
     * 
     */
    public Optional<Output<Boolean>> stormControlEnabled() {
        return Optional.ofNullable(this.stormControlEnabled);
    }

    /**
     * The state of the STP guard (&#39;disabled&#39;, &#39;root guard&#39;, &#39;bpdu guard&#39; or &#39;loop guard&#39;).
     * 
     */
    @Import(name="stpGuard")
    private @Nullable Output<String> stpGuard;

    /**
     * @return The state of the STP guard (&#39;disabled&#39;, &#39;root guard&#39;, &#39;bpdu guard&#39; or &#39;loop guard&#39;).
     * 
     */
    public Optional<Output<String>> stpGuard() {
        return Optional.ofNullable(this.stpGuard);
    }

    /**
     * The list of tags of the switch template port.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The list of tags of the switch template port.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of the switch template port (&#39;trunk&#39; or &#39;access&#39;).
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the switch template port (&#39;trunk&#39; or &#39;access&#39;).
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The action to take when Unidirectional Link is detected (Alert only, Enforce). Default configuration is Alert only.
     * 
     */
    @Import(name="udld")
    private @Nullable Output<String> udld;

    /**
     * @return The action to take when Unidirectional Link is detected (Alert only, Enforce). Default configuration is Alert only.
     * 
     */
    public Optional<Output<String>> udld() {
        return Optional.ofNullable(this.udld);
    }

    /**
     * The VLAN of the switch template port. For a trunk port, this is the native VLAN. A null value will clear the value set for trunk ports.
     * 
     */
    @Import(name="vlan")
    private @Nullable Output<Integer> vlan;

    /**
     * @return The VLAN of the switch template port. For a trunk port, this is the native VLAN. A null value will clear the value set for trunk ports.
     * 
     */
    public Optional<Output<Integer>> vlan() {
        return Optional.ofNullable(this.vlan);
    }

    /**
     * The voice VLAN of the switch template port. Only applicable to access ports.
     * 
     */
    @Import(name="voiceVlan")
    private @Nullable Output<Integer> voiceVlan;

    /**
     * @return The voice VLAN of the switch template port. Only applicable to access ports.
     * 
     */
    public Optional<Output<Integer>> voiceVlan() {
        return Optional.ofNullable(this.voiceVlan);
    }

    private ConfigTemplatesSwitchProfilesPortsArgs() {}

    private ConfigTemplatesSwitchProfilesPortsArgs(ConfigTemplatesSwitchProfilesPortsArgs $) {
        this.accessPolicyNumber = $.accessPolicyNumber;
        this.accessPolicyType = $.accessPolicyType;
        this.allowedVlans = $.allowedVlans;
        this.configTemplateId = $.configTemplateId;
        this.daiTrusted = $.daiTrusted;
        this.enabled = $.enabled;
        this.flexibleStackingEnabled = $.flexibleStackingEnabled;
        this.isolationEnabled = $.isolationEnabled;
        this.linkNegotiation = $.linkNegotiation;
        this.macAllowLists = $.macAllowLists;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.poeEnabled = $.poeEnabled;
        this.portId = $.portId;
        this.portScheduleId = $.portScheduleId;
        this.profile = $.profile;
        this.profileId = $.profileId;
        this.rstpEnabled = $.rstpEnabled;
        this.stickyMacAllowListLimit = $.stickyMacAllowListLimit;
        this.stickyMacAllowLists = $.stickyMacAllowLists;
        this.stormControlEnabled = $.stormControlEnabled;
        this.stpGuard = $.stpGuard;
        this.tags = $.tags;
        this.type = $.type;
        this.udld = $.udld;
        this.vlan = $.vlan;
        this.voiceVlan = $.voiceVlan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigTemplatesSwitchProfilesPortsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigTemplatesSwitchProfilesPortsArgs $;

        public Builder() {
            $ = new ConfigTemplatesSwitchProfilesPortsArgs();
        }

        public Builder(ConfigTemplatesSwitchProfilesPortsArgs defaults) {
            $ = new ConfigTemplatesSwitchProfilesPortsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicyNumber The number of a custom access policy to configure on the switch template port. Only applicable when &#39;accessPolicyType&#39; is &#39;Custom access policy&#39;.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyNumber(@Nullable Output<Integer> accessPolicyNumber) {
            $.accessPolicyNumber = accessPolicyNumber;
            return this;
        }

        /**
         * @param accessPolicyNumber The number of a custom access policy to configure on the switch template port. Only applicable when &#39;accessPolicyType&#39; is &#39;Custom access policy&#39;.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyNumber(Integer accessPolicyNumber) {
            return accessPolicyNumber(Output.of(accessPolicyNumber));
        }

        /**
         * @param accessPolicyType The type of the access policy of the switch template port. Only applicable to access ports. Can be one of &#39;Open&#39;, &#39;Custom access policy&#39;, &#39;MAC allow list&#39; or &#39;Sticky MAC allow list&#39;.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyType(@Nullable Output<String> accessPolicyType) {
            $.accessPolicyType = accessPolicyType;
            return this;
        }

        /**
         * @param accessPolicyType The type of the access policy of the switch template port. Only applicable to access ports. Can be one of &#39;Open&#39;, &#39;Custom access policy&#39;, &#39;MAC allow list&#39; or &#39;Sticky MAC allow list&#39;.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyType(String accessPolicyType) {
            return accessPolicyType(Output.of(accessPolicyType));
        }

        /**
         * @param allowedVlans The VLANs allowed on the switch template port. Only applicable to trunk ports.
         * 
         * @return builder
         * 
         */
        public Builder allowedVlans(@Nullable Output<String> allowedVlans) {
            $.allowedVlans = allowedVlans;
            return this;
        }

        /**
         * @param allowedVlans The VLANs allowed on the switch template port. Only applicable to trunk ports.
         * 
         * @return builder
         * 
         */
        public Builder allowedVlans(String allowedVlans) {
            return allowedVlans(Output.of(allowedVlans));
        }

        /**
         * @param configTemplateId configTemplateId path parameter. Config template ID
         * 
         * @return builder
         * 
         */
        public Builder configTemplateId(Output<String> configTemplateId) {
            $.configTemplateId = configTemplateId;
            return this;
        }

        /**
         * @param configTemplateId configTemplateId path parameter. Config template ID
         * 
         * @return builder
         * 
         */
        public Builder configTemplateId(String configTemplateId) {
            return configTemplateId(Output.of(configTemplateId));
        }

        /**
         * @param daiTrusted If true, ARP packets for this port will be considered trusted, and Dynamic ARP Inspection will allow the traffic.
         * 
         * @return builder
         * 
         */
        public Builder daiTrusted(@Nullable Output<Boolean> daiTrusted) {
            $.daiTrusted = daiTrusted;
            return this;
        }

        /**
         * @param daiTrusted If true, ARP packets for this port will be considered trusted, and Dynamic ARP Inspection will allow the traffic.
         * 
         * @return builder
         * 
         */
        public Builder daiTrusted(Boolean daiTrusted) {
            return daiTrusted(Output.of(daiTrusted));
        }

        /**
         * @param enabled The status of the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The status of the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param flexibleStackingEnabled For supported switches (e.g. MS420/MS425), whether or not the port has flexible stacking enabled.
         * 
         * @return builder
         * 
         */
        public Builder flexibleStackingEnabled(@Nullable Output<Boolean> flexibleStackingEnabled) {
            $.flexibleStackingEnabled = flexibleStackingEnabled;
            return this;
        }

        /**
         * @param flexibleStackingEnabled For supported switches (e.g. MS420/MS425), whether or not the port has flexible stacking enabled.
         * 
         * @return builder
         * 
         */
        public Builder flexibleStackingEnabled(Boolean flexibleStackingEnabled) {
            return flexibleStackingEnabled(Output.of(flexibleStackingEnabled));
        }

        /**
         * @param isolationEnabled The isolation status of the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder isolationEnabled(@Nullable Output<Boolean> isolationEnabled) {
            $.isolationEnabled = isolationEnabled;
            return this;
        }

        /**
         * @param isolationEnabled The isolation status of the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder isolationEnabled(Boolean isolationEnabled) {
            return isolationEnabled(Output.of(isolationEnabled));
        }

        /**
         * @param linkNegotiation The link speed for the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder linkNegotiation(@Nullable Output<String> linkNegotiation) {
            $.linkNegotiation = linkNegotiation;
            return this;
        }

        /**
         * @param linkNegotiation The link speed for the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder linkNegotiation(String linkNegotiation) {
            return linkNegotiation(Output.of(linkNegotiation));
        }

        /**
         * @param macAllowLists Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when &#39;accessPolicyType&#39; is &#39;MAC allow list&#39;.
         * 
         * @return builder
         * 
         */
        public Builder macAllowLists(@Nullable Output<List<String>> macAllowLists) {
            $.macAllowLists = macAllowLists;
            return this;
        }

        /**
         * @param macAllowLists Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when &#39;accessPolicyType&#39; is &#39;MAC allow list&#39;.
         * 
         * @return builder
         * 
         */
        public Builder macAllowLists(List<String> macAllowLists) {
            return macAllowLists(Output.of(macAllowLists));
        }

        /**
         * @param macAllowLists Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when &#39;accessPolicyType&#39; is &#39;MAC allow list&#39;.
         * 
         * @return builder
         * 
         */
        public Builder macAllowLists(String... macAllowLists) {
            return macAllowLists(List.of(macAllowLists));
        }

        /**
         * @param name The name of the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param poeEnabled The PoE status of the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder poeEnabled(@Nullable Output<Boolean> poeEnabled) {
            $.poeEnabled = poeEnabled;
            return this;
        }

        /**
         * @param poeEnabled The PoE status of the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder poeEnabled(Boolean poeEnabled) {
            return poeEnabled(Output.of(poeEnabled));
        }

        /**
         * @param portId The identifier of the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder portId(Output<String> portId) {
            $.portId = portId;
            return this;
        }

        /**
         * @param portId The identifier of the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder portId(String portId) {
            return portId(Output.of(portId));
        }

        /**
         * @param portScheduleId The ID of the port schedule. A value of null will clear the port schedule.
         * 
         * @return builder
         * 
         */
        public Builder portScheduleId(@Nullable Output<String> portScheduleId) {
            $.portScheduleId = portScheduleId;
            return this;
        }

        /**
         * @param portScheduleId The ID of the port schedule. A value of null will clear the port schedule.
         * 
         * @return builder
         * 
         */
        public Builder portScheduleId(String portScheduleId) {
            return portScheduleId(Output.of(portScheduleId));
        }

        /**
         * @param profile Profile attributes
         * 
         * @return builder
         * 
         */
        public Builder profile(@Nullable Output<ConfigTemplatesSwitchProfilesPortsProfileArgs> profile) {
            $.profile = profile;
            return this;
        }

        /**
         * @param profile Profile attributes
         * 
         * @return builder
         * 
         */
        public Builder profile(ConfigTemplatesSwitchProfilesPortsProfileArgs profile) {
            return profile(Output.of(profile));
        }

        /**
         * @param profileId profileId path parameter. Profile ID
         * 
         * @return builder
         * 
         */
        public Builder profileId(Output<String> profileId) {
            $.profileId = profileId;
            return this;
        }

        /**
         * @param profileId profileId path parameter. Profile ID
         * 
         * @return builder
         * 
         */
        public Builder profileId(String profileId) {
            return profileId(Output.of(profileId));
        }

        /**
         * @param rstpEnabled The rapid spanning tree protocol status.
         * 
         * @return builder
         * 
         */
        public Builder rstpEnabled(@Nullable Output<Boolean> rstpEnabled) {
            $.rstpEnabled = rstpEnabled;
            return this;
        }

        /**
         * @param rstpEnabled The rapid spanning tree protocol status.
         * 
         * @return builder
         * 
         */
        public Builder rstpEnabled(Boolean rstpEnabled) {
            return rstpEnabled(Output.of(rstpEnabled));
        }

        /**
         * @param stickyMacAllowListLimit The maximum number of MAC addresses for sticky MAC allow list. Only applicable when &#39;accessPolicyType&#39; is &#39;Sticky MAC allow list&#39;.
         * 
         * @return builder
         * 
         */
        public Builder stickyMacAllowListLimit(@Nullable Output<Integer> stickyMacAllowListLimit) {
            $.stickyMacAllowListLimit = stickyMacAllowListLimit;
            return this;
        }

        /**
         * @param stickyMacAllowListLimit The maximum number of MAC addresses for sticky MAC allow list. Only applicable when &#39;accessPolicyType&#39; is &#39;Sticky MAC allow list&#39;.
         * 
         * @return builder
         * 
         */
        public Builder stickyMacAllowListLimit(Integer stickyMacAllowListLimit) {
            return stickyMacAllowListLimit(Output.of(stickyMacAllowListLimit));
        }

        /**
         * @param stickyMacAllowLists The initial list of MAC addresses for sticky Mac allow list. Only applicable when &#39;accessPolicyType&#39; is &#39;Sticky MAC allow list&#39;.
         * 
         * @return builder
         * 
         */
        public Builder stickyMacAllowLists(@Nullable Output<List<String>> stickyMacAllowLists) {
            $.stickyMacAllowLists = stickyMacAllowLists;
            return this;
        }

        /**
         * @param stickyMacAllowLists The initial list of MAC addresses for sticky Mac allow list. Only applicable when &#39;accessPolicyType&#39; is &#39;Sticky MAC allow list&#39;.
         * 
         * @return builder
         * 
         */
        public Builder stickyMacAllowLists(List<String> stickyMacAllowLists) {
            return stickyMacAllowLists(Output.of(stickyMacAllowLists));
        }

        /**
         * @param stickyMacAllowLists The initial list of MAC addresses for sticky Mac allow list. Only applicable when &#39;accessPolicyType&#39; is &#39;Sticky MAC allow list&#39;.
         * 
         * @return builder
         * 
         */
        public Builder stickyMacAllowLists(String... stickyMacAllowLists) {
            return stickyMacAllowLists(List.of(stickyMacAllowLists));
        }

        /**
         * @param stormControlEnabled The storm control status of the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder stormControlEnabled(@Nullable Output<Boolean> stormControlEnabled) {
            $.stormControlEnabled = stormControlEnabled;
            return this;
        }

        /**
         * @param stormControlEnabled The storm control status of the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder stormControlEnabled(Boolean stormControlEnabled) {
            return stormControlEnabled(Output.of(stormControlEnabled));
        }

        /**
         * @param stpGuard The state of the STP guard (&#39;disabled&#39;, &#39;root guard&#39;, &#39;bpdu guard&#39; or &#39;loop guard&#39;).
         * 
         * @return builder
         * 
         */
        public Builder stpGuard(@Nullable Output<String> stpGuard) {
            $.stpGuard = stpGuard;
            return this;
        }

        /**
         * @param stpGuard The state of the STP guard (&#39;disabled&#39;, &#39;root guard&#39;, &#39;bpdu guard&#39; or &#39;loop guard&#39;).
         * 
         * @return builder
         * 
         */
        public Builder stpGuard(String stpGuard) {
            return stpGuard(Output.of(stpGuard));
        }

        /**
         * @param tags The list of tags of the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The list of tags of the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The list of tags of the switch template port.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type The type of the switch template port (&#39;trunk&#39; or &#39;access&#39;).
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the switch template port (&#39;trunk&#39; or &#39;access&#39;).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param udld The action to take when Unidirectional Link is detected (Alert only, Enforce). Default configuration is Alert only.
         * 
         * @return builder
         * 
         */
        public Builder udld(@Nullable Output<String> udld) {
            $.udld = udld;
            return this;
        }

        /**
         * @param udld The action to take when Unidirectional Link is detected (Alert only, Enforce). Default configuration is Alert only.
         * 
         * @return builder
         * 
         */
        public Builder udld(String udld) {
            return udld(Output.of(udld));
        }

        /**
         * @param vlan The VLAN of the switch template port. For a trunk port, this is the native VLAN. A null value will clear the value set for trunk ports.
         * 
         * @return builder
         * 
         */
        public Builder vlan(@Nullable Output<Integer> vlan) {
            $.vlan = vlan;
            return this;
        }

        /**
         * @param vlan The VLAN of the switch template port. For a trunk port, this is the native VLAN. A null value will clear the value set for trunk ports.
         * 
         * @return builder
         * 
         */
        public Builder vlan(Integer vlan) {
            return vlan(Output.of(vlan));
        }

        /**
         * @param voiceVlan The voice VLAN of the switch template port. Only applicable to access ports.
         * 
         * @return builder
         * 
         */
        public Builder voiceVlan(@Nullable Output<Integer> voiceVlan) {
            $.voiceVlan = voiceVlan;
            return this;
        }

        /**
         * @param voiceVlan The voice VLAN of the switch template port. Only applicable to access ports.
         * 
         * @return builder
         * 
         */
        public Builder voiceVlan(Integer voiceVlan) {
            return voiceVlan(Output.of(voiceVlan));
        }

        public ConfigTemplatesSwitchProfilesPortsArgs build() {
            if ($.configTemplateId == null) {
                throw new MissingRequiredPropertyException("ConfigTemplatesSwitchProfilesPortsArgs", "configTemplateId");
            }
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("ConfigTemplatesSwitchProfilesPortsArgs", "organizationId");
            }
            if ($.portId == null) {
                throw new MissingRequiredPropertyException("ConfigTemplatesSwitchProfilesPortsArgs", "portId");
            }
            if ($.profileId == null) {
                throw new MissingRequiredPropertyException("ConfigTemplatesSwitchProfilesPortsArgs", "profileId");
            }
            return $;
        }
    }

}
