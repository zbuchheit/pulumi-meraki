// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.ApplianceFirewallInboundFirewallRulesArgs;
import com.pulumi.meraki.networks.inputs.ApplianceFirewallInboundFirewallRulesState;
import com.pulumi.meraki.networks.outputs.ApplianceFirewallInboundFirewallRulesRule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.meraki.networks.ApplianceFirewallInboundFirewallRules;
 * import com.pulumi.meraki.networks.ApplianceFirewallInboundFirewallRulesArgs;
 * import com.pulumi.meraki.networks.inputs.ApplianceFirewallInboundFirewallRulesRuleArgs;
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
 *         var example = new ApplianceFirewallInboundFirewallRules(&#34;example&#34;, ApplianceFirewallInboundFirewallRulesArgs.builder()        
 *             .networkId(&#34;string&#34;)
 *             .rules(ApplianceFirewallInboundFirewallRulesRuleArgs.builder()
 *                 .comment(&#34;Allow TCP traffic to subnet with HTTP servers.&#34;)
 *                 .dest_cidr(&#34;192.168.1.0/24&#34;)
 *                 .dest_port(&#34;443&#34;)
 *                 .policy(&#34;allow&#34;)
 *                 .protocol(&#34;tcp&#34;)
 *                 .src_cidr(&#34;Any&#34;)
 *                 .src_port(&#34;Any&#34;)
 *                 .syslog_enabled(false)
 *                 .build())
 *             .syslogDefaultRule(true)
 *             .build());
 * 
 *         ctx.export(&#34;merakiNetworksApplianceFirewallInboundFirewallRulesExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/applianceFirewallInboundFirewallRules:ApplianceFirewallInboundFirewallRules example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/applianceFirewallInboundFirewallRules:ApplianceFirewallInboundFirewallRules")
public class ApplianceFirewallInboundFirewallRules extends com.pulumi.resources.CustomResource {
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
    @Export(name="rules", refs={List.class,ApplianceFirewallInboundFirewallRulesRule.class}, tree="[0,1]")
    private Output<List<ApplianceFirewallInboundFirewallRulesRule>> rules;

    /**
     * @return An ordered array of the firewall rules (not including the default rule)
     * 
     */
    public Output<List<ApplianceFirewallInboundFirewallRulesRule>> rules() {
        return this.rules;
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
    public ApplianceFirewallInboundFirewallRules(String name) {
        this(name, ApplianceFirewallInboundFirewallRulesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplianceFirewallInboundFirewallRules(String name, ApplianceFirewallInboundFirewallRulesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplianceFirewallInboundFirewallRules(String name, ApplianceFirewallInboundFirewallRulesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceFirewallInboundFirewallRules:ApplianceFirewallInboundFirewallRules", name, args == null ? ApplianceFirewallInboundFirewallRulesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplianceFirewallInboundFirewallRules(String name, Output<String> id, @Nullable ApplianceFirewallInboundFirewallRulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceFirewallInboundFirewallRules:ApplianceFirewallInboundFirewallRules", name, state, makeResourceOptions(options, id));
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
    public static ApplianceFirewallInboundFirewallRules get(String name, Output<String> id, @Nullable ApplianceFirewallInboundFirewallRulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplianceFirewallInboundFirewallRules(name, id, state, options);
    }
}
