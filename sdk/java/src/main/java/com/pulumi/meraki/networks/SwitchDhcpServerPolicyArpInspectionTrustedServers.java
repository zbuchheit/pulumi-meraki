// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SwitchDhcpServerPolicyArpInspectionTrustedServersArgs;
import com.pulumi.meraki.networks.inputs.SwitchDhcpServerPolicyArpInspectionTrustedServersState;
import com.pulumi.meraki.networks.outputs.SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4;
import java.lang.Integer;
import java.lang.String;
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
 * import com.pulumi.meraki.networks.SwitchDhcpServerPolicyArpInspectionTrustedServers;
 * import com.pulumi.meraki.networks.SwitchDhcpServerPolicyArpInspectionTrustedServersArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4Args;
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
 *         var example = new SwitchDhcpServerPolicyArpInspectionTrustedServers(&#34;example&#34;, SwitchDhcpServerPolicyArpInspectionTrustedServersArgs.builder()        
 *             .ipv4(SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4Args.builder()
 *                 .address(&#34;1.2.3.4&#34;)
 *                 .build())
 *             .mac(&#34;00:11:22:33:44:55&#34;)
 *             .networkId(&#34;string&#34;)
 *             .vlan(100)
 *             .build());
 * 
 *         ctx.export(&#34;merakiNetworksSwitchDhcpServerPolicyArpInspectionTrustedServersExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/switchDhcpServerPolicyArpInspectionTrustedServers:SwitchDhcpServerPolicyArpInspectionTrustedServers example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/switchDhcpServerPolicyArpInspectionTrustedServers:SwitchDhcpServerPolicyArpInspectionTrustedServers")
public class SwitchDhcpServerPolicyArpInspectionTrustedServers extends com.pulumi.resources.CustomResource {
    /**
     * IPv4 attributes of the trusted server.
     * 
     */
    @Export(name="ipv4", refs={SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4.class}, tree="[0]")
    private Output<SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4> ipv4;

    /**
     * @return IPv4 attributes of the trusted server.
     * 
     */
    public Output<SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4> ipv4() {
        return this.ipv4;
    }
    /**
     * Mac address of the trusted server.
     * 
     */
    @Export(name="mac", refs={String.class}, tree="[0]")
    private Output<String> mac;

    /**
     * @return Mac address of the trusted server.
     * 
     */
    public Output<String> mac() {
        return this.mac;
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
     * ID of the trusted server.
     * 
     */
    @Export(name="trustedServerId", refs={String.class}, tree="[0]")
    private Output<String> trustedServerId;

    /**
     * @return ID of the trusted server.
     * 
     */
    public Output<String> trustedServerId() {
        return this.trustedServerId;
    }
    /**
     * Vlan ID of the trusted server.
     * 
     */
    @Export(name="vlan", refs={Integer.class}, tree="[0]")
    private Output<Integer> vlan;

    /**
     * @return Vlan ID of the trusted server.
     * 
     */
    public Output<Integer> vlan() {
        return this.vlan;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SwitchDhcpServerPolicyArpInspectionTrustedServers(String name) {
        this(name, SwitchDhcpServerPolicyArpInspectionTrustedServersArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SwitchDhcpServerPolicyArpInspectionTrustedServers(String name, SwitchDhcpServerPolicyArpInspectionTrustedServersArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SwitchDhcpServerPolicyArpInspectionTrustedServers(String name, SwitchDhcpServerPolicyArpInspectionTrustedServersArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchDhcpServerPolicyArpInspectionTrustedServers:SwitchDhcpServerPolicyArpInspectionTrustedServers", name, args == null ? SwitchDhcpServerPolicyArpInspectionTrustedServersArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SwitchDhcpServerPolicyArpInspectionTrustedServers(String name, Output<String> id, @Nullable SwitchDhcpServerPolicyArpInspectionTrustedServersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchDhcpServerPolicyArpInspectionTrustedServers:SwitchDhcpServerPolicyArpInspectionTrustedServers", name, state, makeResourceOptions(options, id));
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
    public static SwitchDhcpServerPolicyArpInspectionTrustedServers get(String name, Output<String> id, @Nullable SwitchDhcpServerPolicyArpInspectionTrustedServersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SwitchDhcpServerPolicyArpInspectionTrustedServers(name, id, state, options);
    }
}
