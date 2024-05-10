// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SwitchAccessControlListsArgs;
import com.pulumi.meraki.networks.inputs.SwitchAccessControlListsState;
import com.pulumi.meraki.networks.outputs.SwitchAccessControlListsRule;
import com.pulumi.meraki.networks.outputs.SwitchAccessControlListsRulesResponse;
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
 * import com.pulumi.meraki.networks.SwitchAccessControlLists;
 * import com.pulumi.meraki.networks.SwitchAccessControlListsArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchAccessControlListsRuleArgs;
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
 *         var example = new SwitchAccessControlLists(&#34;example&#34;, SwitchAccessControlListsArgs.builder()        
 *             .networkId(&#34;string&#34;)
 *             .rules(SwitchAccessControlListsRuleArgs.builder()
 *                 .comment(&#34;Deny SSH&#34;)
 *                 .dst_cidr(&#34;172.16.30/24&#34;)
 *                 .dst_port(&#34;22&#34;)
 *                 .ip_version(&#34;ipv4&#34;)
 *                 .policy(&#34;deny&#34;)
 *                 .protocol(&#34;tcp&#34;)
 *                 .src_cidr(&#34;10.1.10.0/24&#34;)
 *                 .src_port(&#34;any&#34;)
 *                 .vlan(&#34;10&#34;)
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;merakiNetworksSwitchAccessControlListsExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/switchAccessControlLists:SwitchAccessControlLists example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/switchAccessControlLists:SwitchAccessControlLists")
public class SwitchAccessControlLists extends com.pulumi.resources.CustomResource {
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
     * An ordered array of the access control list rules
     * 
     */
    @Export(name="rules", refs={List.class,SwitchAccessControlListsRule.class}, tree="[0,1]")
    private Output<List<SwitchAccessControlListsRule>> rules;

    /**
     * @return An ordered array of the access control list rules
     * 
     */
    public Output<List<SwitchAccessControlListsRule>> rules() {
        return this.rules;
    }
    /**
     * An ordered array of the access control list rules
     * 
     */
    @Export(name="rulesResponses", refs={List.class,SwitchAccessControlListsRulesResponse.class}, tree="[0,1]")
    private Output<List<SwitchAccessControlListsRulesResponse>> rulesResponses;

    /**
     * @return An ordered array of the access control list rules
     * 
     */
    public Output<List<SwitchAccessControlListsRulesResponse>> rulesResponses() {
        return this.rulesResponses;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SwitchAccessControlLists(String name) {
        this(name, SwitchAccessControlListsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SwitchAccessControlLists(String name, SwitchAccessControlListsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SwitchAccessControlLists(String name, SwitchAccessControlListsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchAccessControlLists:SwitchAccessControlLists", name, args == null ? SwitchAccessControlListsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SwitchAccessControlLists(String name, Output<String> id, @Nullable SwitchAccessControlListsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchAccessControlLists:SwitchAccessControlLists", name, state, makeResourceOptions(options, id));
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
    public static SwitchAccessControlLists get(String name, Output<String> id, @Nullable SwitchAccessControlListsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SwitchAccessControlLists(name, id, state, options);
    }
}
