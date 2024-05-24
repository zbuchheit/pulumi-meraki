// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.ApplianceSingleLanArgs;
import com.pulumi.meraki.networks.inputs.ApplianceSingleLanState;
import com.pulumi.meraki.networks.outputs.ApplianceSingleLanIpv6;
import com.pulumi.meraki.networks.outputs.ApplianceSingleLanMandatoryDhcp;
import java.lang.String;
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
 * import com.pulumi.meraki.networks.ApplianceSingleLan;
 * import com.pulumi.meraki.networks.ApplianceSingleLanArgs;
 * import com.pulumi.meraki.networks.inputs.ApplianceSingleLanIpv6Args;
 * import com.pulumi.meraki.networks.inputs.ApplianceSingleLanMandatoryDhcpArgs;
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
 *         var example = new ApplianceSingleLan("example", ApplianceSingleLanArgs.builder()
 *             .applianceIp("string")
 *             .ipv6(ApplianceSingleLanIpv6Args.builder()
 *                 .enabled(false)
 *                 .prefix_assignments(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                 .build())
 *             .mandatoryDhcp(ApplianceSingleLanMandatoryDhcpArgs.builder()
 *                 .enabled(false)
 *                 .build())
 *             .networkId("string")
 *             .subnet("string")
 *             .build());
 * 
 *         ctx.export("merakiNetworksApplianceSingleLanExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/applianceSingleLan:ApplianceSingleLan example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/applianceSingleLan:ApplianceSingleLan")
public class ApplianceSingleLan extends com.pulumi.resources.CustomResource {
    /**
     * The local IP of the appliance on the single LAN
     * 
     */
    @Export(name="applianceIp", refs={String.class}, tree="[0]")
    private Output<String> applianceIp;

    /**
     * @return The local IP of the appliance on the single LAN
     * 
     */
    public Output<String> applianceIp() {
        return this.applianceIp;
    }
    /**
     * IPv6 configuration on the single LAN
     * 
     */
    @Export(name="ipv6", refs={ApplianceSingleLanIpv6.class}, tree="[0]")
    private Output<ApplianceSingleLanIpv6> ipv6;

    /**
     * @return IPv6 configuration on the single LAN
     * 
     */
    public Output<ApplianceSingleLanIpv6> ipv6() {
        return this.ipv6;
    }
    /**
     * Mandatory DHCP will enforce that clients connecting to this single LAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won&#39;t be able to associate. Only available on firmware versions 17.0 and above
     * 
     */
    @Export(name="mandatoryDhcp", refs={ApplianceSingleLanMandatoryDhcp.class}, tree="[0]")
    private Output<ApplianceSingleLanMandatoryDhcp> mandatoryDhcp;

    /**
     * @return Mandatory DHCP will enforce that clients connecting to this single LAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won&#39;t be able to associate. Only available on firmware versions 17.0 and above
     * 
     */
    public Output<ApplianceSingleLanMandatoryDhcp> mandatoryDhcp() {
        return this.mandatoryDhcp;
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
     * The subnet of the single LAN
     * 
     */
    @Export(name="subnet", refs={String.class}, tree="[0]")
    private Output<String> subnet;

    /**
     * @return The subnet of the single LAN
     * 
     */
    public Output<String> subnet() {
        return this.subnet;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplianceSingleLan(String name) {
        this(name, ApplianceSingleLanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplianceSingleLan(String name, ApplianceSingleLanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplianceSingleLan(String name, ApplianceSingleLanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceSingleLan:ApplianceSingleLan", name, args == null ? ApplianceSingleLanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplianceSingleLan(String name, Output<String> id, @Nullable ApplianceSingleLanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceSingleLan:ApplianceSingleLan", name, state, makeResourceOptions(options, id));
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
    public static ApplianceSingleLan get(String name, Output<String> id, @Nullable ApplianceSingleLanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplianceSingleLan(name, id, state, options);
    }
}
