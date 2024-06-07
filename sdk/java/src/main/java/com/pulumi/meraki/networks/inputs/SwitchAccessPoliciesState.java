// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.SwitchAccessPoliciesCountsArgs;
import com.pulumi.meraki.networks.inputs.SwitchAccessPoliciesDot1xArgs;
import com.pulumi.meraki.networks.inputs.SwitchAccessPoliciesRadiusAccountingServerArgs;
import com.pulumi.meraki.networks.inputs.SwitchAccessPoliciesRadiusAccountingServersResponseArgs;
import com.pulumi.meraki.networks.inputs.SwitchAccessPoliciesRadiusArgs;
import com.pulumi.meraki.networks.inputs.SwitchAccessPoliciesRadiusServerArgs;
import com.pulumi.meraki.networks.inputs.SwitchAccessPoliciesRadiusServersResponseArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchAccessPoliciesState extends com.pulumi.resources.ResourceArgs {

    public static final SwitchAccessPoliciesState Empty = new SwitchAccessPoliciesState();

    /**
     * accessPolicyNumber path parameter. Access policy number
     * 
     */
    @Import(name="accessPolicyNumber")
    private @Nullable Output<String> accessPolicyNumber;

    /**
     * @return accessPolicyNumber path parameter. Access policy number
     * 
     */
    public Optional<Output<String>> accessPolicyNumber() {
        return Optional.ofNullable(this.accessPolicyNumber);
    }

    /**
     * Access Type of the policy. Automatically &#39;Hybrid authentication&#39; when hostMode is &#39;Multi-Domain&#39;.
     * 
     */
    @Import(name="accessPolicyType")
    private @Nullable Output<String> accessPolicyType;

    /**
     * @return Access Type of the policy. Automatically &#39;Hybrid authentication&#39; when hostMode is &#39;Multi-Domain&#39;.
     * 
     */
    public Optional<Output<String>> accessPolicyType() {
        return Optional.ofNullable(this.accessPolicyType);
    }

    /**
     * Counts associated with the access policy
     * 
     */
    @Import(name="counts")
    private @Nullable Output<SwitchAccessPoliciesCountsArgs> counts;

    /**
     * @return Counts associated with the access policy
     * 
     */
    public Optional<Output<SwitchAccessPoliciesCountsArgs>> counts() {
        return Optional.ofNullable(this.counts);
    }

    /**
     * 802.1x Settings
     * 
     */
    @Import(name="dot1x")
    private @Nullable Output<SwitchAccessPoliciesDot1xArgs> dot1x;

    /**
     * @return 802.1x Settings
     * 
     */
    public Optional<Output<SwitchAccessPoliciesDot1xArgs>> dot1x() {
        return Optional.ofNullable(this.dot1x);
    }

    /**
     * If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
     * 
     */
    @Import(name="guestPortBouncing")
    private @Nullable Output<Boolean> guestPortBouncing;

    /**
     * @return If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
     * 
     */
    public Optional<Output<Boolean>> guestPortBouncing() {
        return Optional.ofNullable(this.guestPortBouncing);
    }

    /**
     * ID for the guest VLAN allow unauthorized devices access to limited network resources
     * 
     */
    @Import(name="guestVlanId")
    private @Nullable Output<Integer> guestVlanId;

    /**
     * @return ID for the guest VLAN allow unauthorized devices access to limited network resources
     * 
     */
    public Optional<Output<Integer>> guestVlanId() {
        return Optional.ofNullable(this.guestVlanId);
    }

    /**
     * Choose the Host Mode for the access policy.
     * 
     */
    @Import(name="hostMode")
    private @Nullable Output<String> hostMode;

    /**
     * @return Choose the Host Mode for the access policy.
     * 
     */
    public Optional<Output<String>> hostMode() {
        return Optional.ofNullable(this.hostMode);
    }

    /**
     * Enabling this option will make switches execute 802.1X and MAC-bypass authentication simultaneously so that clients authenticate faster. Only required when accessPolicyType is &#39;Hybrid Authentication.
     * 
     */
    @Import(name="increaseAccessSpeed")
    private @Nullable Output<Boolean> increaseAccessSpeed;

    /**
     * @return Enabling this option will make switches execute 802.1X and MAC-bypass authentication simultaneously so that clients authenticate faster. Only required when accessPolicyType is &#39;Hybrid Authentication.
     * 
     */
    public Optional<Output<Boolean>> increaseAccessSpeed() {
        return Optional.ofNullable(this.increaseAccessSpeed);
    }

    /**
     * Name of the access policy
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the access policy
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * Object for RADIUS Settings
     * 
     */
    @Import(name="radius")
    private @Nullable Output<SwitchAccessPoliciesRadiusArgs> radius;

    /**
     * @return Object for RADIUS Settings
     * 
     */
    public Optional<Output<SwitchAccessPoliciesRadiusArgs>> radius() {
        return Optional.ofNullable(this.radius);
    }

    /**
     * Enable to send start, interim-update and stop messages to a configured RADIUS accounting server for tracking connected clients
     * 
     */
    @Import(name="radiusAccountingEnabled")
    private @Nullable Output<Boolean> radiusAccountingEnabled;

    /**
     * @return Enable to send start, interim-update and stop messages to a configured RADIUS accounting server for tracking connected clients
     * 
     */
    public Optional<Output<Boolean>> radiusAccountingEnabled() {
        return Optional.ofNullable(this.radiusAccountingEnabled);
    }

    /**
     * List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
     * 
     */
    @Import(name="radiusAccountingServers")
    private @Nullable Output<List<SwitchAccessPoliciesRadiusAccountingServerArgs>> radiusAccountingServers;

    /**
     * @return List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
     * 
     */
    public Optional<Output<List<SwitchAccessPoliciesRadiusAccountingServerArgs>>> radiusAccountingServers() {
        return Optional.ofNullable(this.radiusAccountingServers);
    }

    /**
     * List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
     * 
     */
    @Import(name="radiusAccountingServersResponses")
    private @Nullable Output<List<SwitchAccessPoliciesRadiusAccountingServersResponseArgs>> radiusAccountingServersResponses;

    /**
     * @return List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
     * 
     */
    public Optional<Output<List<SwitchAccessPoliciesRadiusAccountingServersResponseArgs>>> radiusAccountingServersResponses() {
        return Optional.ofNullable(this.radiusAccountingServersResponses);
    }

    /**
     * Change of authentication for RADIUS re-authentication and disconnection
     * 
     */
    @Import(name="radiusCoaSupportEnabled")
    private @Nullable Output<Boolean> radiusCoaSupportEnabled;

    /**
     * @return Change of authentication for RADIUS re-authentication and disconnection
     * 
     */
    public Optional<Output<Boolean>> radiusCoaSupportEnabled() {
        return Optional.ofNullable(this.radiusCoaSupportEnabled);
    }

    /**
     * Acceptable values are *&#34;&#34;* for None, or *&#34;11&#34;* for Group Policies ACL
     * 
     */
    @Import(name="radiusGroupAttribute")
    private @Nullable Output<String> radiusGroupAttribute;

    /**
     * @return Acceptable values are *&#34;&#34;* for None, or *&#34;11&#34;* for Group Policies ACL
     * 
     */
    public Optional<Output<String>> radiusGroupAttribute() {
        return Optional.ofNullable(this.radiusGroupAttribute);
    }

    /**
     * List of RADIUS servers to require connecting devices to authenticate against before granting network access
     * 
     */
    @Import(name="radiusServers")
    private @Nullable Output<List<SwitchAccessPoliciesRadiusServerArgs>> radiusServers;

    /**
     * @return List of RADIUS servers to require connecting devices to authenticate against before granting network access
     * 
     */
    public Optional<Output<List<SwitchAccessPoliciesRadiusServerArgs>>> radiusServers() {
        return Optional.ofNullable(this.radiusServers);
    }

    /**
     * List of RADIUS servers to require connecting devices to authenticate against before granting network access
     * 
     */
    @Import(name="radiusServersResponses")
    private @Nullable Output<List<SwitchAccessPoliciesRadiusServersResponseArgs>> radiusServersResponses;

    /**
     * @return List of RADIUS servers to require connecting devices to authenticate against before granting network access
     * 
     */
    public Optional<Output<List<SwitchAccessPoliciesRadiusServersResponseArgs>>> radiusServersResponses() {
        return Optional.ofNullable(this.radiusServersResponses);
    }

    /**
     * If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
     * 
     */
    @Import(name="radiusTestingEnabled")
    private @Nullable Output<Boolean> radiusTestingEnabled;

    /**
     * @return If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
     * 
     */
    public Optional<Output<Boolean>> radiusTestingEnabled() {
        return Optional.ofNullable(this.radiusTestingEnabled);
    }

    /**
     * Enable to restrict access for clients to a response_objectific set of IP addresses or hostnames prior to authentication
     * 
     */
    @Import(name="urlRedirectWalledGardenEnabled")
    private @Nullable Output<Boolean> urlRedirectWalledGardenEnabled;

    /**
     * @return Enable to restrict access for clients to a response_objectific set of IP addresses or hostnames prior to authentication
     * 
     */
    public Optional<Output<Boolean>> urlRedirectWalledGardenEnabled() {
        return Optional.ofNullable(this.urlRedirectWalledGardenEnabled);
    }

    /**
     * IP address ranges, in CIDR notation, to restrict access for clients to a specific set of IP addresses or hostnames prior to authentication
     * 
     */
    @Import(name="urlRedirectWalledGardenRanges")
    private @Nullable Output<List<String>> urlRedirectWalledGardenRanges;

    /**
     * @return IP address ranges, in CIDR notation, to restrict access for clients to a specific set of IP addresses or hostnames prior to authentication
     * 
     */
    public Optional<Output<List<String>>> urlRedirectWalledGardenRanges() {
        return Optional.ofNullable(this.urlRedirectWalledGardenRanges);
    }

    /**
     * CDP/LLDP capable voice clients will be able to use this VLAN. Automatically true when hostMode is &#39;Multi-Domain&#39;.
     * 
     */
    @Import(name="voiceVlanClients")
    private @Nullable Output<Boolean> voiceVlanClients;

    /**
     * @return CDP/LLDP capable voice clients will be able to use this VLAN. Automatically true when hostMode is &#39;Multi-Domain&#39;.
     * 
     */
    public Optional<Output<Boolean>> voiceVlanClients() {
        return Optional.ofNullable(this.voiceVlanClients);
    }

    private SwitchAccessPoliciesState() {}

    private SwitchAccessPoliciesState(SwitchAccessPoliciesState $) {
        this.accessPolicyNumber = $.accessPolicyNumber;
        this.accessPolicyType = $.accessPolicyType;
        this.counts = $.counts;
        this.dot1x = $.dot1x;
        this.guestPortBouncing = $.guestPortBouncing;
        this.guestVlanId = $.guestVlanId;
        this.hostMode = $.hostMode;
        this.increaseAccessSpeed = $.increaseAccessSpeed;
        this.name = $.name;
        this.networkId = $.networkId;
        this.radius = $.radius;
        this.radiusAccountingEnabled = $.radiusAccountingEnabled;
        this.radiusAccountingServers = $.radiusAccountingServers;
        this.radiusAccountingServersResponses = $.radiusAccountingServersResponses;
        this.radiusCoaSupportEnabled = $.radiusCoaSupportEnabled;
        this.radiusGroupAttribute = $.radiusGroupAttribute;
        this.radiusServers = $.radiusServers;
        this.radiusServersResponses = $.radiusServersResponses;
        this.radiusTestingEnabled = $.radiusTestingEnabled;
        this.urlRedirectWalledGardenEnabled = $.urlRedirectWalledGardenEnabled;
        this.urlRedirectWalledGardenRanges = $.urlRedirectWalledGardenRanges;
        this.voiceVlanClients = $.voiceVlanClients;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchAccessPoliciesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchAccessPoliciesState $;

        public Builder() {
            $ = new SwitchAccessPoliciesState();
        }

        public Builder(SwitchAccessPoliciesState defaults) {
            $ = new SwitchAccessPoliciesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicyNumber accessPolicyNumber path parameter. Access policy number
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyNumber(@Nullable Output<String> accessPolicyNumber) {
            $.accessPolicyNumber = accessPolicyNumber;
            return this;
        }

        /**
         * @param accessPolicyNumber accessPolicyNumber path parameter. Access policy number
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyNumber(String accessPolicyNumber) {
            return accessPolicyNumber(Output.of(accessPolicyNumber));
        }

        /**
         * @param accessPolicyType Access Type of the policy. Automatically &#39;Hybrid authentication&#39; when hostMode is &#39;Multi-Domain&#39;.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyType(@Nullable Output<String> accessPolicyType) {
            $.accessPolicyType = accessPolicyType;
            return this;
        }

        /**
         * @param accessPolicyType Access Type of the policy. Automatically &#39;Hybrid authentication&#39; when hostMode is &#39;Multi-Domain&#39;.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyType(String accessPolicyType) {
            return accessPolicyType(Output.of(accessPolicyType));
        }

        /**
         * @param counts Counts associated with the access policy
         * 
         * @return builder
         * 
         */
        public Builder counts(@Nullable Output<SwitchAccessPoliciesCountsArgs> counts) {
            $.counts = counts;
            return this;
        }

        /**
         * @param counts Counts associated with the access policy
         * 
         * @return builder
         * 
         */
        public Builder counts(SwitchAccessPoliciesCountsArgs counts) {
            return counts(Output.of(counts));
        }

        /**
         * @param dot1x 802.1x Settings
         * 
         * @return builder
         * 
         */
        public Builder dot1x(@Nullable Output<SwitchAccessPoliciesDot1xArgs> dot1x) {
            $.dot1x = dot1x;
            return this;
        }

        /**
         * @param dot1x 802.1x Settings
         * 
         * @return builder
         * 
         */
        public Builder dot1x(SwitchAccessPoliciesDot1xArgs dot1x) {
            return dot1x(Output.of(dot1x));
        }

        /**
         * @param guestPortBouncing If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
         * 
         * @return builder
         * 
         */
        public Builder guestPortBouncing(@Nullable Output<Boolean> guestPortBouncing) {
            $.guestPortBouncing = guestPortBouncing;
            return this;
        }

        /**
         * @param guestPortBouncing If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
         * 
         * @return builder
         * 
         */
        public Builder guestPortBouncing(Boolean guestPortBouncing) {
            return guestPortBouncing(Output.of(guestPortBouncing));
        }

        /**
         * @param guestVlanId ID for the guest VLAN allow unauthorized devices access to limited network resources
         * 
         * @return builder
         * 
         */
        public Builder guestVlanId(@Nullable Output<Integer> guestVlanId) {
            $.guestVlanId = guestVlanId;
            return this;
        }

        /**
         * @param guestVlanId ID for the guest VLAN allow unauthorized devices access to limited network resources
         * 
         * @return builder
         * 
         */
        public Builder guestVlanId(Integer guestVlanId) {
            return guestVlanId(Output.of(guestVlanId));
        }

        /**
         * @param hostMode Choose the Host Mode for the access policy.
         * 
         * @return builder
         * 
         */
        public Builder hostMode(@Nullable Output<String> hostMode) {
            $.hostMode = hostMode;
            return this;
        }

        /**
         * @param hostMode Choose the Host Mode for the access policy.
         * 
         * @return builder
         * 
         */
        public Builder hostMode(String hostMode) {
            return hostMode(Output.of(hostMode));
        }

        /**
         * @param increaseAccessSpeed Enabling this option will make switches execute 802.1X and MAC-bypass authentication simultaneously so that clients authenticate faster. Only required when accessPolicyType is &#39;Hybrid Authentication.
         * 
         * @return builder
         * 
         */
        public Builder increaseAccessSpeed(@Nullable Output<Boolean> increaseAccessSpeed) {
            $.increaseAccessSpeed = increaseAccessSpeed;
            return this;
        }

        /**
         * @param increaseAccessSpeed Enabling this option will make switches execute 802.1X and MAC-bypass authentication simultaneously so that clients authenticate faster. Only required when accessPolicyType is &#39;Hybrid Authentication.
         * 
         * @return builder
         * 
         */
        public Builder increaseAccessSpeed(Boolean increaseAccessSpeed) {
            return increaseAccessSpeed(Output.of(increaseAccessSpeed));
        }

        /**
         * @param name Name of the access policy
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the access policy
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param radius Object for RADIUS Settings
         * 
         * @return builder
         * 
         */
        public Builder radius(@Nullable Output<SwitchAccessPoliciesRadiusArgs> radius) {
            $.radius = radius;
            return this;
        }

        /**
         * @param radius Object for RADIUS Settings
         * 
         * @return builder
         * 
         */
        public Builder radius(SwitchAccessPoliciesRadiusArgs radius) {
            return radius(Output.of(radius));
        }

        /**
         * @param radiusAccountingEnabled Enable to send start, interim-update and stop messages to a configured RADIUS accounting server for tracking connected clients
         * 
         * @return builder
         * 
         */
        public Builder radiusAccountingEnabled(@Nullable Output<Boolean> radiusAccountingEnabled) {
            $.radiusAccountingEnabled = radiusAccountingEnabled;
            return this;
        }

        /**
         * @param radiusAccountingEnabled Enable to send start, interim-update and stop messages to a configured RADIUS accounting server for tracking connected clients
         * 
         * @return builder
         * 
         */
        public Builder radiusAccountingEnabled(Boolean radiusAccountingEnabled) {
            return radiusAccountingEnabled(Output.of(radiusAccountingEnabled));
        }

        /**
         * @param radiusAccountingServers List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
         * 
         * @return builder
         * 
         */
        public Builder radiusAccountingServers(@Nullable Output<List<SwitchAccessPoliciesRadiusAccountingServerArgs>> radiusAccountingServers) {
            $.radiusAccountingServers = radiusAccountingServers;
            return this;
        }

        /**
         * @param radiusAccountingServers List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
         * 
         * @return builder
         * 
         */
        public Builder radiusAccountingServers(List<SwitchAccessPoliciesRadiusAccountingServerArgs> radiusAccountingServers) {
            return radiusAccountingServers(Output.of(radiusAccountingServers));
        }

        /**
         * @param radiusAccountingServers List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
         * 
         * @return builder
         * 
         */
        public Builder radiusAccountingServers(SwitchAccessPoliciesRadiusAccountingServerArgs... radiusAccountingServers) {
            return radiusAccountingServers(List.of(radiusAccountingServers));
        }

        /**
         * @param radiusAccountingServersResponses List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
         * 
         * @return builder
         * 
         */
        public Builder radiusAccountingServersResponses(@Nullable Output<List<SwitchAccessPoliciesRadiusAccountingServersResponseArgs>> radiusAccountingServersResponses) {
            $.radiusAccountingServersResponses = radiusAccountingServersResponses;
            return this;
        }

        /**
         * @param radiusAccountingServersResponses List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
         * 
         * @return builder
         * 
         */
        public Builder radiusAccountingServersResponses(List<SwitchAccessPoliciesRadiusAccountingServersResponseArgs> radiusAccountingServersResponses) {
            return radiusAccountingServersResponses(Output.of(radiusAccountingServersResponses));
        }

        /**
         * @param radiusAccountingServersResponses List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
         * 
         * @return builder
         * 
         */
        public Builder radiusAccountingServersResponses(SwitchAccessPoliciesRadiusAccountingServersResponseArgs... radiusAccountingServersResponses) {
            return radiusAccountingServersResponses(List.of(radiusAccountingServersResponses));
        }

        /**
         * @param radiusCoaSupportEnabled Change of authentication for RADIUS re-authentication and disconnection
         * 
         * @return builder
         * 
         */
        public Builder radiusCoaSupportEnabled(@Nullable Output<Boolean> radiusCoaSupportEnabled) {
            $.radiusCoaSupportEnabled = radiusCoaSupportEnabled;
            return this;
        }

        /**
         * @param radiusCoaSupportEnabled Change of authentication for RADIUS re-authentication and disconnection
         * 
         * @return builder
         * 
         */
        public Builder radiusCoaSupportEnabled(Boolean radiusCoaSupportEnabled) {
            return radiusCoaSupportEnabled(Output.of(radiusCoaSupportEnabled));
        }

        /**
         * @param radiusGroupAttribute Acceptable values are *&#34;&#34;* for None, or *&#34;11&#34;* for Group Policies ACL
         * 
         * @return builder
         * 
         */
        public Builder radiusGroupAttribute(@Nullable Output<String> radiusGroupAttribute) {
            $.radiusGroupAttribute = radiusGroupAttribute;
            return this;
        }

        /**
         * @param radiusGroupAttribute Acceptable values are *&#34;&#34;* for None, or *&#34;11&#34;* for Group Policies ACL
         * 
         * @return builder
         * 
         */
        public Builder radiusGroupAttribute(String radiusGroupAttribute) {
            return radiusGroupAttribute(Output.of(radiusGroupAttribute));
        }

        /**
         * @param radiusServers List of RADIUS servers to require connecting devices to authenticate against before granting network access
         * 
         * @return builder
         * 
         */
        public Builder radiusServers(@Nullable Output<List<SwitchAccessPoliciesRadiusServerArgs>> radiusServers) {
            $.radiusServers = radiusServers;
            return this;
        }

        /**
         * @param radiusServers List of RADIUS servers to require connecting devices to authenticate against before granting network access
         * 
         * @return builder
         * 
         */
        public Builder radiusServers(List<SwitchAccessPoliciesRadiusServerArgs> radiusServers) {
            return radiusServers(Output.of(radiusServers));
        }

        /**
         * @param radiusServers List of RADIUS servers to require connecting devices to authenticate against before granting network access
         * 
         * @return builder
         * 
         */
        public Builder radiusServers(SwitchAccessPoliciesRadiusServerArgs... radiusServers) {
            return radiusServers(List.of(radiusServers));
        }

        /**
         * @param radiusServersResponses List of RADIUS servers to require connecting devices to authenticate against before granting network access
         * 
         * @return builder
         * 
         */
        public Builder radiusServersResponses(@Nullable Output<List<SwitchAccessPoliciesRadiusServersResponseArgs>> radiusServersResponses) {
            $.radiusServersResponses = radiusServersResponses;
            return this;
        }

        /**
         * @param radiusServersResponses List of RADIUS servers to require connecting devices to authenticate against before granting network access
         * 
         * @return builder
         * 
         */
        public Builder radiusServersResponses(List<SwitchAccessPoliciesRadiusServersResponseArgs> radiusServersResponses) {
            return radiusServersResponses(Output.of(radiusServersResponses));
        }

        /**
         * @param radiusServersResponses List of RADIUS servers to require connecting devices to authenticate against before granting network access
         * 
         * @return builder
         * 
         */
        public Builder radiusServersResponses(SwitchAccessPoliciesRadiusServersResponseArgs... radiusServersResponses) {
            return radiusServersResponses(List.of(radiusServersResponses));
        }

        /**
         * @param radiusTestingEnabled If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
         * 
         * @return builder
         * 
         */
        public Builder radiusTestingEnabled(@Nullable Output<Boolean> radiusTestingEnabled) {
            $.radiusTestingEnabled = radiusTestingEnabled;
            return this;
        }

        /**
         * @param radiusTestingEnabled If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
         * 
         * @return builder
         * 
         */
        public Builder radiusTestingEnabled(Boolean radiusTestingEnabled) {
            return radiusTestingEnabled(Output.of(radiusTestingEnabled));
        }

        /**
         * @param urlRedirectWalledGardenEnabled Enable to restrict access for clients to a response_objectific set of IP addresses or hostnames prior to authentication
         * 
         * @return builder
         * 
         */
        public Builder urlRedirectWalledGardenEnabled(@Nullable Output<Boolean> urlRedirectWalledGardenEnabled) {
            $.urlRedirectWalledGardenEnabled = urlRedirectWalledGardenEnabled;
            return this;
        }

        /**
         * @param urlRedirectWalledGardenEnabled Enable to restrict access for clients to a response_objectific set of IP addresses or hostnames prior to authentication
         * 
         * @return builder
         * 
         */
        public Builder urlRedirectWalledGardenEnabled(Boolean urlRedirectWalledGardenEnabled) {
            return urlRedirectWalledGardenEnabled(Output.of(urlRedirectWalledGardenEnabled));
        }

        /**
         * @param urlRedirectWalledGardenRanges IP address ranges, in CIDR notation, to restrict access for clients to a specific set of IP addresses or hostnames prior to authentication
         * 
         * @return builder
         * 
         */
        public Builder urlRedirectWalledGardenRanges(@Nullable Output<List<String>> urlRedirectWalledGardenRanges) {
            $.urlRedirectWalledGardenRanges = urlRedirectWalledGardenRanges;
            return this;
        }

        /**
         * @param urlRedirectWalledGardenRanges IP address ranges, in CIDR notation, to restrict access for clients to a specific set of IP addresses or hostnames prior to authentication
         * 
         * @return builder
         * 
         */
        public Builder urlRedirectWalledGardenRanges(List<String> urlRedirectWalledGardenRanges) {
            return urlRedirectWalledGardenRanges(Output.of(urlRedirectWalledGardenRanges));
        }

        /**
         * @param urlRedirectWalledGardenRanges IP address ranges, in CIDR notation, to restrict access for clients to a specific set of IP addresses or hostnames prior to authentication
         * 
         * @return builder
         * 
         */
        public Builder urlRedirectWalledGardenRanges(String... urlRedirectWalledGardenRanges) {
            return urlRedirectWalledGardenRanges(List.of(urlRedirectWalledGardenRanges));
        }

        /**
         * @param voiceVlanClients CDP/LLDP capable voice clients will be able to use this VLAN. Automatically true when hostMode is &#39;Multi-Domain&#39;.
         * 
         * @return builder
         * 
         */
        public Builder voiceVlanClients(@Nullable Output<Boolean> voiceVlanClients) {
            $.voiceVlanClients = voiceVlanClients;
            return this;
        }

        /**
         * @param voiceVlanClients CDP/LLDP capable voice clients will be able to use this VLAN. Automatically true when hostMode is &#39;Multi-Domain&#39;.
         * 
         * @return builder
         * 
         */
        public Builder voiceVlanClients(Boolean voiceVlanClients) {
            return voiceVlanClients(Output.of(voiceVlanClients));
        }

        public SwitchAccessPoliciesState build() {
            return $;
        }
    }

}
