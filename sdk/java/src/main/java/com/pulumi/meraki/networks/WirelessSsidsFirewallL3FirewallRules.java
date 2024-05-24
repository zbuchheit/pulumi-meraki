// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.WirelessSsidsFirewallL3FirewallRulesArgs;
import com.pulumi.meraki.networks.inputs.WirelessSsidsFirewallL3FirewallRulesState;
import com.pulumi.meraki.networks.outputs.WirelessSsidsFirewallL3FirewallRulesRule;
import com.pulumi.meraki.networks.outputs.WirelessSsidsFirewallL3FirewallRulesRulesResponse;
import java.lang.Boolean;
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
 * import com.pulumi.meraki.networks.WirelessSsidsFirewallL3FirewallRules;
 * import com.pulumi.meraki.networks.WirelessSsidsFirewallL3FirewallRulesArgs;
 * import com.pulumi.meraki.networks.inputs.WirelessSsidsFirewallL3FirewallRulesRuleArgs;
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
 *         var example = new WirelessSsidsFirewallL3FirewallRules("example", WirelessSsidsFirewallL3FirewallRulesArgs.builder()
 *             .allowLanAccess(true)
 *             .networkId("string")
 *             .number("string")
 *             .rules(WirelessSsidsFirewallL3FirewallRulesRuleArgs.builder()
 *                 .comment("Allow TCP traffic to subnet with HTTP servers.")
 *                 .dest_cidr("192.168.1.0/24")
 *                 .dest_port("443")
 *                 .policy("allow")
 *                 .protocol("tcp")
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiNetworksWirelessSsidsFirewallL3FirewallRulesExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/wirelessSsidsFirewallL3FirewallRules:WirelessSsidsFirewallL3FirewallRules example &#34;network_id,number&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/wirelessSsidsFirewallL3FirewallRules:WirelessSsidsFirewallL3FirewallRules")
public class WirelessSsidsFirewallL3FirewallRules extends com.pulumi.resources.CustomResource {
    /**
     * Allow wireless client access to local LAN (boolean value - true allows access and false denies access) (optional)
     * 
     */
    @Export(name="allowLanAccess", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowLanAccess;

    /**
     * @return Allow wireless client access to local LAN (boolean value - true allows access and false denies access) (optional)
     * 
     */
    public Output<Optional<Boolean>> allowLanAccess() {
        return Codegen.optional(this.allowLanAccess);
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
     * number path parameter.
     * 
     */
    @Export(name="number", refs={String.class}, tree="[0]")
    private Output<String> number;

    /**
     * @return number path parameter.
     * 
     */
    public Output<String> number() {
        return this.number;
    }
    /**
     * An ordered array of the firewall rules for this SSID (not including the local LAN access rule or the default rule).
     * 
     */
    @Export(name="rules", refs={List.class,WirelessSsidsFirewallL3FirewallRulesRule.class}, tree="[0,1]")
    private Output<List<WirelessSsidsFirewallL3FirewallRulesRule>> rules;

    /**
     * @return An ordered array of the firewall rules for this SSID (not including the local LAN access rule or the default rule).
     * 
     */
    public Output<List<WirelessSsidsFirewallL3FirewallRulesRule>> rules() {
        return this.rules;
    }
    /**
     * An ordered array of the firewall rules for this SSID (not including the local LAN access rule or the default rule).
     * 
     */
    @Export(name="rulesResponses", refs={List.class,WirelessSsidsFirewallL3FirewallRulesRulesResponse.class}, tree="[0,1]")
    private Output<List<WirelessSsidsFirewallL3FirewallRulesRulesResponse>> rulesResponses;

    /**
     * @return An ordered array of the firewall rules for this SSID (not including the local LAN access rule or the default rule).
     * 
     */
    public Output<List<WirelessSsidsFirewallL3FirewallRulesRulesResponse>> rulesResponses() {
        return this.rulesResponses;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WirelessSsidsFirewallL3FirewallRules(String name) {
        this(name, WirelessSsidsFirewallL3FirewallRulesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WirelessSsidsFirewallL3FirewallRules(String name, WirelessSsidsFirewallL3FirewallRulesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WirelessSsidsFirewallL3FirewallRules(String name, WirelessSsidsFirewallL3FirewallRulesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/wirelessSsidsFirewallL3FirewallRules:WirelessSsidsFirewallL3FirewallRules", name, args == null ? WirelessSsidsFirewallL3FirewallRulesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WirelessSsidsFirewallL3FirewallRules(String name, Output<String> id, @Nullable WirelessSsidsFirewallL3FirewallRulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/wirelessSsidsFirewallL3FirewallRules:WirelessSsidsFirewallL3FirewallRules", name, state, makeResourceOptions(options, id));
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
    public static WirelessSsidsFirewallL3FirewallRules get(String name, Output<String> id, @Nullable WirelessSsidsFirewallL3FirewallRulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WirelessSsidsFirewallL3FirewallRules(name, id, state, options);
    }
}
