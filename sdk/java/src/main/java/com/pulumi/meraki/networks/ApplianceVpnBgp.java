// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.ApplianceVpnBgpArgs;
import com.pulumi.meraki.networks.inputs.ApplianceVpnBgpState;
import com.pulumi.meraki.networks.outputs.ApplianceVpnBgpNeighbor;
import java.lang.Boolean;
import java.lang.Integer;
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
 * import com.pulumi.meraki.networks.ApplianceVpnBgp;
 * import com.pulumi.meraki.networks.ApplianceVpnBgpArgs;
 * import com.pulumi.meraki.networks.inputs.ApplianceVpnBgpNeighborArgs;
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
 *         var example = new ApplianceVpnBgp(&#34;example&#34;, ApplianceVpnBgpArgs.builder()        
 *             .asNumber(64515)
 *             .enabled(true)
 *             .ibgpHoldTimer(120)
 *             .neighbors(ApplianceVpnBgpNeighborArgs.builder()
 *                 .allow_transit(true)
 *                 .ebgp_hold_timer(180)
 *                 .ebgp_multihop(2)
 *                 .ip(&#34;10.10.10.22&#34;)
 *                 .receive_limit(120)
 *                 .remote_as_number(64343)
 *                 .build())
 *             .networkId(&#34;string&#34;)
 *             .build());
 * 
 *         ctx.export(&#34;merakiNetworksApplianceVpnBgpExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/applianceVpnBgp:ApplianceVpnBgp example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/applianceVpnBgp:ApplianceVpnBgp")
public class ApplianceVpnBgp extends com.pulumi.resources.CustomResource {
    /**
     * An Autonomous System Number (ASN) is required if you are to run BGP and peer with another BGP Speaker outside of the Auto VPN domain. This ASN will be applied to the entire Auto VPN domain. The entire 4-byte ASN range is supported. So, the ASN must be an integer between 1 and 4294967295. When absent, this field is not updated. If no value exists then it defaults to 64512.
     * 
     */
    @Export(name="asNumber", refs={Integer.class}, tree="[0]")
    private Output<Integer> asNumber;

    /**
     * @return An Autonomous System Number (ASN) is required if you are to run BGP and peer with another BGP Speaker outside of the Auto VPN domain. This ASN will be applied to the entire Auto VPN domain. The entire 4-byte ASN range is supported. So, the ASN must be an integer between 1 and 4294967295. When absent, this field is not updated. If no value exists then it defaults to 64512.
     * 
     */
    public Output<Integer> asNumber() {
        return this.asNumber;
    }
    /**
     * Boolean value to enable or disable the BGP configuration. When BGP is enabled, the asNumber (ASN) will be autopopulated with the preconfigured ASN at other Hubs or a default value if there is no ASN configured.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Boolean value to enable or disable the BGP configuration. When BGP is enabled, the asNumber (ASN) will be autopopulated with the preconfigured ASN at other Hubs or a default value if there is no ASN configured.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The iBGP holdtimer in seconds. The iBGP holdtimer must be an integer between 12 and 240. When absent, this field is not updated. If no value exists then it defaults to 240.
     * 
     */
    @Export(name="ibgpHoldTimer", refs={Integer.class}, tree="[0]")
    private Output<Integer> ibgpHoldTimer;

    /**
     * @return The iBGP holdtimer in seconds. The iBGP holdtimer must be an integer between 12 and 240. When absent, this field is not updated. If no value exists then it defaults to 240.
     * 
     */
    public Output<Integer> ibgpHoldTimer() {
        return this.ibgpHoldTimer;
    }
    /**
     * List of BGP neighbors. This list replaces the existing set of neighbors. When absent, this field is not updated.
     * 
     */
    @Export(name="neighbors", refs={List.class,ApplianceVpnBgpNeighbor.class}, tree="[0,1]")
    private Output<List<ApplianceVpnBgpNeighbor>> neighbors;

    /**
     * @return List of BGP neighbors. This list replaces the existing set of neighbors. When absent, this field is not updated.
     * 
     */
    public Output<List<ApplianceVpnBgpNeighbor>> neighbors() {
        return this.neighbors;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplianceVpnBgp(String name) {
        this(name, ApplianceVpnBgpArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplianceVpnBgp(String name, ApplianceVpnBgpArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplianceVpnBgp(String name, ApplianceVpnBgpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceVpnBgp:ApplianceVpnBgp", name, args == null ? ApplianceVpnBgpArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplianceVpnBgp(String name, Output<String> id, @Nullable ApplianceVpnBgpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceVpnBgp:ApplianceVpnBgp", name, state, makeResourceOptions(options, id));
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
    public static ApplianceVpnBgp get(String name, Output<String> id, @Nullable ApplianceVpnBgpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplianceVpnBgp(name, id, state, options);
    }
}