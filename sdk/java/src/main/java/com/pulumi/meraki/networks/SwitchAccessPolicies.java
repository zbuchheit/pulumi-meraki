// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SwitchAccessPoliciesArgs;
import com.pulumi.meraki.networks.inputs.SwitchAccessPoliciesState;
import com.pulumi.meraki.networks.outputs.SwitchAccessPoliciesCounts;
import com.pulumi.meraki.networks.outputs.SwitchAccessPoliciesDot1x;
import com.pulumi.meraki.networks.outputs.SwitchAccessPoliciesRadius;
import com.pulumi.meraki.networks.outputs.SwitchAccessPoliciesRadiusAccountingServer;
import com.pulumi.meraki.networks.outputs.SwitchAccessPoliciesRadiusAccountingServersResponse;
import com.pulumi.meraki.networks.outputs.SwitchAccessPoliciesRadiusServer;
import com.pulumi.meraki.networks.outputs.SwitchAccessPoliciesRadiusServersResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.meraki.networks.SwitchAccessPolicies;
 * import com.pulumi.meraki.networks.SwitchAccessPoliciesArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchAccessPoliciesDot1xArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchAccessPoliciesRadiusArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchAccessPoliciesRadiusAccountingServerArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchAccessPoliciesRadiusServerArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new SwitchAccessPolicies("example", SwitchAccessPoliciesArgs.builder()
 *             .accessPolicyType("Hybrid authentication")
 *             .dot1x(SwitchAccessPoliciesDot1xArgs.builder()
 *                 .control_direction("inbound")
 *                 .build())
 *             .guestPortBouncing(false)
 *             .guestVlanId(100)
 *             .hostMode("Single-Host")
 *             .increaseAccessSpeed(false)
 *             .name("Access policy #1")
 *             .networkId("string")
 *             .radius(SwitchAccessPoliciesRadiusArgs.builder()
 *                 .critical_auth(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                 .failed_auth_vlan_id(100)
 *                 .re_authentication_interval(120)
 *                 .build())
 *             .radiusAccountingEnabled(true)
 *             .radiusAccountingServers(SwitchAccessPoliciesRadiusAccountingServerArgs.builder()
 *                 .host("1.2.3.4")
 *                 .port(22)
 *                 .secret("secret")
 *                 .build())
 *             .radiusCoaSupportEnabled(false)
 *             .radiusGroupAttribute("11")
 *             .radiusServers(SwitchAccessPoliciesRadiusServerArgs.builder()
 *                 .host("1.2.3.4")
 *                 .port(22)
 *                 .secret("secret")
 *                 .build())
 *             .radiusTestingEnabled(false)
 *             .urlRedirectWalledGardenEnabled(true)
 *             .urlRedirectWalledGardenRanges("192.168.1.0/24")
 *             .voiceVlanClients(true)
 *             .build());
 * 
 *         ctx.export("merakiNetworksSwitchAccessPoliciesExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/switchAccessPolicies:SwitchAccessPolicies example &#34;access_policy_number,network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/switchAccessPolicies:SwitchAccessPolicies")
public class SwitchAccessPolicies extends com.pulumi.resources.CustomResource {
    /**
     * accessPolicyNumber path parameter. Access policy number
     * 
     */
    @Export(name="accessPolicyNumber", refs={String.class}, tree="[0]")
    private Output<String> accessPolicyNumber;

    /**
     * @return accessPolicyNumber path parameter. Access policy number
     * 
     */
    public Output<String> accessPolicyNumber() {
        return this.accessPolicyNumber;
    }
    /**
     * Access Type of the policy. Automatically &#39;Hybrid authentication&#39; when hostMode is &#39;Multi-Domain&#39;.
     * 
     */
    @Export(name="accessPolicyType", refs={String.class}, tree="[0]")
    private Output<String> accessPolicyType;

    /**
     * @return Access Type of the policy. Automatically &#39;Hybrid authentication&#39; when hostMode is &#39;Multi-Domain&#39;.
     * 
     */
    public Output<String> accessPolicyType() {
        return this.accessPolicyType;
    }
    /**
     * Counts associated with the access policy
     * 
     */
    @Export(name="counts", refs={SwitchAccessPoliciesCounts.class}, tree="[0]")
    private Output<SwitchAccessPoliciesCounts> counts;

    /**
     * @return Counts associated with the access policy
     * 
     */
    public Output<SwitchAccessPoliciesCounts> counts() {
        return this.counts;
    }
    /**
     * 802.1x Settings
     * 
     */
    @Export(name="dot1x", refs={SwitchAccessPoliciesDot1x.class}, tree="[0]")
    private Output<SwitchAccessPoliciesDot1x> dot1x;

    /**
     * @return 802.1x Settings
     * 
     */
    public Output<SwitchAccessPoliciesDot1x> dot1x() {
        return this.dot1x;
    }
    /**
     * If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
     * 
     */
    @Export(name="guestPortBouncing", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> guestPortBouncing;

    /**
     * @return If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
     * 
     */
    public Output<Boolean> guestPortBouncing() {
        return this.guestPortBouncing;
    }
    /**
     * ID for the guest VLAN allow unauthorized devices access to limited network resources
     * 
     */
    @Export(name="guestVlanId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> guestVlanId;

    /**
     * @return ID for the guest VLAN allow unauthorized devices access to limited network resources
     * 
     */
    public Output<Optional<Integer>> guestVlanId() {
        return Codegen.optional(this.guestVlanId);
    }
    /**
     * Choose the Host Mode for the access policy.
     * 
     */
    @Export(name="hostMode", refs={String.class}, tree="[0]")
    private Output<String> hostMode;

    /**
     * @return Choose the Host Mode for the access policy.
     * 
     */
    public Output<String> hostMode() {
        return this.hostMode;
    }
    /**
     * Enabling this option will make switches execute 802.1X and MAC-bypass authentication simultaneously so that clients authenticate faster. Only required when accessPolicyType is &#39;Hybrid Authentication.
     * 
     */
    @Export(name="increaseAccessSpeed", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> increaseAccessSpeed;

    /**
     * @return Enabling this option will make switches execute 802.1X and MAC-bypass authentication simultaneously so that clients authenticate faster. Only required when accessPolicyType is &#39;Hybrid Authentication.
     * 
     */
    public Output<Boolean> increaseAccessSpeed() {
        return this.increaseAccessSpeed;
    }
    /**
     * Name of the access policy
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the access policy
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * networkId path parameter. Network ID
     * 
     */
    @Export(name="networkId", refs={String.class}, tree="[0]")
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }
    /**
     * Object for RADIUS Settings
     * 
     */
    @Export(name="radius", refs={SwitchAccessPoliciesRadius.class}, tree="[0]")
    private Output<SwitchAccessPoliciesRadius> radius;

    /**
     * @return Object for RADIUS Settings
     * 
     */
    public Output<SwitchAccessPoliciesRadius> radius() {
        return this.radius;
    }
    /**
     * Enable to send start, interim-update and stop messages to a configured RADIUS accounting server for tracking connected clients
     * 
     */
    @Export(name="radiusAccountingEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> radiusAccountingEnabled;

    /**
     * @return Enable to send start, interim-update and stop messages to a configured RADIUS accounting server for tracking connected clients
     * 
     */
    public Output<Boolean> radiusAccountingEnabled() {
        return this.radiusAccountingEnabled;
    }
    /**
     * List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
     * 
     */
    @Export(name="radiusAccountingServers", refs={List.class,SwitchAccessPoliciesRadiusAccountingServer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SwitchAccessPoliciesRadiusAccountingServer>> radiusAccountingServers;

    /**
     * @return List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
     * 
     */
    public Output<Optional<List<SwitchAccessPoliciesRadiusAccountingServer>>> radiusAccountingServers() {
        return Codegen.optional(this.radiusAccountingServers);
    }
    /**
     * List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
     * 
     */
    @Export(name="radiusAccountingServersResponses", refs={List.class,SwitchAccessPoliciesRadiusAccountingServersResponse.class}, tree="[0,1]")
    private Output<List<SwitchAccessPoliciesRadiusAccountingServersResponse>> radiusAccountingServersResponses;

    /**
     * @return List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
     * 
     */
    public Output<List<SwitchAccessPoliciesRadiusAccountingServersResponse>> radiusAccountingServersResponses() {
        return this.radiusAccountingServersResponses;
    }
    /**
     * Change of authentication for RADIUS re-authentication and disconnection
     * 
     */
    @Export(name="radiusCoaSupportEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> radiusCoaSupportEnabled;

    /**
     * @return Change of authentication for RADIUS re-authentication and disconnection
     * 
     */
    public Output<Boolean> radiusCoaSupportEnabled() {
        return this.radiusCoaSupportEnabled;
    }
    /**
     * Acceptable values are *&#34;&#34;* for None, or *&#34;11&#34;* for Group Policies ACL
     * 
     */
    @Export(name="radiusGroupAttribute", refs={String.class}, tree="[0]")
    private Output<String> radiusGroupAttribute;

    /**
     * @return Acceptable values are *&#34;&#34;* for None, or *&#34;11&#34;* for Group Policies ACL
     * 
     */
    public Output<String> radiusGroupAttribute() {
        return this.radiusGroupAttribute;
    }
    /**
     * List of RADIUS servers to require connecting devices to authenticate against before granting network access
     * 
     */
    @Export(name="radiusServers", refs={List.class,SwitchAccessPoliciesRadiusServer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SwitchAccessPoliciesRadiusServer>> radiusServers;

    /**
     * @return List of RADIUS servers to require connecting devices to authenticate against before granting network access
     * 
     */
    public Output<Optional<List<SwitchAccessPoliciesRadiusServer>>> radiusServers() {
        return Codegen.optional(this.radiusServers);
    }
    /**
     * List of RADIUS servers to require connecting devices to authenticate against before granting network access
     * 
     */
    @Export(name="radiusServersResponses", refs={List.class,SwitchAccessPoliciesRadiusServersResponse.class}, tree="[0,1]")
    private Output<List<SwitchAccessPoliciesRadiusServersResponse>> radiusServersResponses;

    /**
     * @return List of RADIUS servers to require connecting devices to authenticate against before granting network access
     * 
     */
    public Output<List<SwitchAccessPoliciesRadiusServersResponse>> radiusServersResponses() {
        return this.radiusServersResponses;
    }
    /**
     * If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
     * 
     */
    @Export(name="radiusTestingEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> radiusTestingEnabled;

    /**
     * @return If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
     * 
     */
    public Output<Boolean> radiusTestingEnabled() {
        return this.radiusTestingEnabled;
    }
    /**
     * Enable to restrict access for clients to a response_objectific set of IP addresses or hostnames prior to authentication
     * 
     */
    @Export(name="urlRedirectWalledGardenEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> urlRedirectWalledGardenEnabled;

    /**
     * @return Enable to restrict access for clients to a response_objectific set of IP addresses or hostnames prior to authentication
     * 
     */
    public Output<Boolean> urlRedirectWalledGardenEnabled() {
        return this.urlRedirectWalledGardenEnabled;
    }
    /**
     * IP address ranges, in CIDR notation, to restrict access for clients to a specific set of IP addresses or hostnames prior to authentication
     * 
     */
    @Export(name="urlRedirectWalledGardenRanges", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> urlRedirectWalledGardenRanges;

    /**
     * @return IP address ranges, in CIDR notation, to restrict access for clients to a specific set of IP addresses or hostnames prior to authentication
     * 
     */
    public Output<Optional<List<String>>> urlRedirectWalledGardenRanges() {
        return Codegen.optional(this.urlRedirectWalledGardenRanges);
    }
    /**
     * CDP/LLDP capable voice clients will be able to use this VLAN. Automatically true when hostMode is &#39;Multi-Domain&#39;.
     * 
     */
    @Export(name="voiceVlanClients", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> voiceVlanClients;

    /**
     * @return CDP/LLDP capable voice clients will be able to use this VLAN. Automatically true when hostMode is &#39;Multi-Domain&#39;.
     * 
     */
    public Output<Boolean> voiceVlanClients() {
        return this.voiceVlanClients;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SwitchAccessPolicies(String name) {
        this(name, SwitchAccessPoliciesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SwitchAccessPolicies(String name, SwitchAccessPoliciesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SwitchAccessPolicies(String name, SwitchAccessPoliciesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchAccessPolicies:SwitchAccessPolicies", name, args == null ? SwitchAccessPoliciesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SwitchAccessPolicies(String name, Output<String> id, @Nullable SwitchAccessPoliciesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchAccessPolicies:SwitchAccessPolicies", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SwitchAccessPolicies get(String name, Output<String> id, @Nullable SwitchAccessPoliciesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SwitchAccessPolicies(name, id, state, options);
    }
}
