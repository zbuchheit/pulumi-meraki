// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SwitchDhcpServerPolicyArgs;
import com.pulumi.meraki.networks.inputs.SwitchDhcpServerPolicyState;
import com.pulumi.meraki.networks.outputs.SwitchDhcpServerPolicyAlerts;
import com.pulumi.meraki.networks.outputs.SwitchDhcpServerPolicyArpInspection;
import java.lang.String;
import java.util.List;
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
 * import com.pulumi.meraki.networks.SwitchDhcpServerPolicy;
 * import com.pulumi.meraki.networks.SwitchDhcpServerPolicyArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchDhcpServerPolicyAlertsArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchDhcpServerPolicyAlertsEmailArgs;
 * import com.pulumi.meraki.networks.inputs.SwitchDhcpServerPolicyArpInspectionArgs;
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
 *         var example = new SwitchDhcpServerPolicy("example", SwitchDhcpServerPolicyArgs.builder()
 *             .alerts(SwitchDhcpServerPolicyAlertsArgs.builder()
 *                 .email(SwitchDhcpServerPolicyAlertsEmailArgs.builder()
 *                     .enabled(true)
 *                     .build())
 *                 .build())
 *             .allowedServers(            
 *                 "00:50:56:00:00:01",
 *                 "00:50:56:00:00:02")
 *             .arpInspection(SwitchDhcpServerPolicyArpInspectionArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .blockedServers(            
 *                 "00:50:56:00:00:03",
 *                 "00:50:56:00:00:04")
 *             .defaultPolicy("block")
 *             .networkId("string")
 *             .build());
 * 
 *         ctx.export("merakiNetworksSwitchDhcpServerPolicyExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/switchDhcpServerPolicy:SwitchDhcpServerPolicy example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/switchDhcpServerPolicy:SwitchDhcpServerPolicy")
public class SwitchDhcpServerPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Email alert settings for DHCP servers
     * 
     */
    @Export(name="alerts", refs={SwitchDhcpServerPolicyAlerts.class}, tree="[0]")
    private Output<SwitchDhcpServerPolicyAlerts> alerts;

    /**
     * @return Email alert settings for DHCP servers
     * 
     */
    public Output<SwitchDhcpServerPolicyAlerts> alerts() {
        return this.alerts;
    }
    /**
     * List the MAC addresses of DHCP servers to permit on the network when defaultPolicy is set
     *   to block.An empty array will clear the entries.
     * 
     */
    @Export(name="allowedServers", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> allowedServers;

    /**
     * @return List the MAC addresses of DHCP servers to permit on the network when defaultPolicy is set
     *   to block.An empty array will clear the entries.
     * 
     */
    public Output<List<String>> allowedServers() {
        return this.allowedServers;
    }
    /**
     * Dynamic ARP Inspection settings
     * 
     */
    @Export(name="arpInspection", refs={SwitchDhcpServerPolicyArpInspection.class}, tree="[0]")
    private Output<SwitchDhcpServerPolicyArpInspection> arpInspection;

    /**
     * @return Dynamic ARP Inspection settings
     * 
     */
    public Output<SwitchDhcpServerPolicyArpInspection> arpInspection() {
        return this.arpInspection;
    }
    /**
     * List the MAC addresses of DHCP servers to block on the network when defaultPolicy is set
     *   to allow.An empty array will clear the entries.
     * 
     */
    @Export(name="blockedServers", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> blockedServers;

    /**
     * @return List the MAC addresses of DHCP servers to block on the network when defaultPolicy is set
     *   to allow.An empty array will clear the entries.
     * 
     */
    public Output<List<String>> blockedServers() {
        return this.blockedServers;
    }
    /**
     * &#39;allow&#39; or &#39;block&#39; new DHCP servers. Default value is &#39;allow&#39;.
     * 
     */
    @Export(name="defaultPolicy", refs={String.class}, tree="[0]")
    private Output<String> defaultPolicy;

    /**
     * @return &#39;allow&#39; or &#39;block&#39; new DHCP servers. Default value is &#39;allow&#39;.
     * 
     */
    public Output<String> defaultPolicy() {
        return this.defaultPolicy;
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
    public SwitchDhcpServerPolicy(String name) {
        this(name, SwitchDhcpServerPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SwitchDhcpServerPolicy(String name, SwitchDhcpServerPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SwitchDhcpServerPolicy(String name, SwitchDhcpServerPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchDhcpServerPolicy:SwitchDhcpServerPolicy", name, args == null ? SwitchDhcpServerPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SwitchDhcpServerPolicy(String name, Output<String> id, @Nullable SwitchDhcpServerPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchDhcpServerPolicy:SwitchDhcpServerPolicy", name, state, makeResourceOptions(options, id));
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
    public static SwitchDhcpServerPolicy get(String name, Output<String> id, @Nullable SwitchDhcpServerPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SwitchDhcpServerPolicy(name, id, state, options);
    }
}
