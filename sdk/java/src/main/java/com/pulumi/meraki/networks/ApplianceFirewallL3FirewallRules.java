// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.ApplianceFirewallL3FirewallRulesArgs;
import com.pulumi.meraki.networks.inputs.ApplianceFirewallL3FirewallRulesState;
import com.pulumi.meraki.networks.outputs.ApplianceFirewallL3FirewallRulesRule;
import com.pulumi.meraki.networks.outputs.ApplianceFirewallL3FirewallRulesRulesResponse;
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
 * import com.pulumi.meraki.networks.ApplianceFirewallL3FirewallRules;
 * import com.pulumi.meraki.networks.ApplianceFirewallL3FirewallRulesArgs;
 * import com.pulumi.meraki.networks.inputs.ApplianceFirewallL3FirewallRulesRuleArgs;
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
 *         var example = new ApplianceFirewallL3FirewallRules("example", ApplianceFirewallL3FirewallRulesArgs.builder()
 *             .networkId("string")
 *             .rules(ApplianceFirewallL3FirewallRulesRuleArgs.builder()
 *                 .comment("Allow TCP traffic to subnet with HTTP servers.")
 *                 .dest_cidr("192.168.1.0/24")
 *                 .dest_port("443")
 *                 .policy("allow")
 *                 .protocol("tcp")
 *                 .src_cidr("Any")
 *                 .src_port("Any")
 *                 .syslog_enabled(false)
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiNetworksApplianceFirewallL3FirewallRulesExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/applianceFirewallL3FirewallRules:ApplianceFirewallL3FirewallRules example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/applianceFirewallL3FirewallRules:ApplianceFirewallL3FirewallRules")
public class ApplianceFirewallL3FirewallRules extends com.pulumi.resources.CustomResource {
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
     * An ordered array of the firewall rules (not including the default rule)
     * 
     */
    @Export(name="rules", refs={List.class,ApplianceFirewallL3FirewallRulesRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ApplianceFirewallL3FirewallRulesRule>> rules;

    /**
     * @return An ordered array of the firewall rules (not including the default rule)
     * 
     */
    public Output<Optional<List<ApplianceFirewallL3FirewallRulesRule>>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * An ordered array of the firewall rules (not including the default rule)
     * 
     */
    @Export(name="rulesResponses", refs={List.class,ApplianceFirewallL3FirewallRulesRulesResponse.class}, tree="[0,1]")
    private Output<List<ApplianceFirewallL3FirewallRulesRulesResponse>> rulesResponses;

    /**
     * @return An ordered array of the firewall rules (not including the default rule)
     * 
     */
    public Output<List<ApplianceFirewallL3FirewallRulesRulesResponse>> rulesResponses() {
        return this.rulesResponses;
    }
    /**
     * Log the special default rule (boolean value - enable only if you&#39;ve configured a syslog server) (optional)
     * 
     */
    @Export(name="syslogDefaultRule", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> syslogDefaultRule;

    /**
     * @return Log the special default rule (boolean value - enable only if you&#39;ve configured a syslog server) (optional)
     * 
     */
    public Output<Boolean> syslogDefaultRule() {
        return this.syslogDefaultRule;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplianceFirewallL3FirewallRules(String name) {
        this(name, ApplianceFirewallL3FirewallRulesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplianceFirewallL3FirewallRules(String name, ApplianceFirewallL3FirewallRulesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplianceFirewallL3FirewallRules(String name, ApplianceFirewallL3FirewallRulesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceFirewallL3FirewallRules:ApplianceFirewallL3FirewallRules", name, args == null ? ApplianceFirewallL3FirewallRulesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplianceFirewallL3FirewallRules(String name, Output<String> id, @Nullable ApplianceFirewallL3FirewallRulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceFirewallL3FirewallRules:ApplianceFirewallL3FirewallRules", name, state, makeResourceOptions(options, id));
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
    public static ApplianceFirewallL3FirewallRules get(String name, Output<String> id, @Nullable ApplianceFirewallL3FirewallRulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplianceFirewallL3FirewallRules(name, id, state, options);
    }
}
