// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SwitchRoutingMulticastRendezvousPointsArgs;
import com.pulumi.meraki.networks.inputs.SwitchRoutingMulticastRendezvousPointsState;
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
 * import com.pulumi.meraki.networks.SwitchRoutingMulticastRendezvousPoints;
 * import com.pulumi.meraki.networks.SwitchRoutingMulticastRendezvousPointsArgs;
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
 *         var example = new SwitchRoutingMulticastRendezvousPoints("example", SwitchRoutingMulticastRendezvousPointsArgs.builder()
 *             .interfaceIp("192.168.1.2")
 *             .multicastGroup("Any")
 *             .networkId("string")
 *             .build());
 * 
 *         ctx.export("merakiNetworksSwitchRoutingMulticastRendezvousPointsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/switchRoutingMulticastRendezvousPoints:SwitchRoutingMulticastRendezvousPoints example &#34;network_id,rendezvous_point_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/switchRoutingMulticastRendezvousPoints:SwitchRoutingMulticastRendezvousPoints")
public class SwitchRoutingMulticastRendezvousPoints extends com.pulumi.resources.CustomResource {
    /**
     * The IP address of the interface where the RP needs to be created.
     * 
     */
    @Export(name="interfaceIp", refs={String.class}, tree="[0]")
    private Output<String> interfaceIp;

    /**
     * @return The IP address of the interface where the RP needs to be created.
     * 
     */
    public Output<String> interfaceIp() {
        return this.interfaceIp;
    }
    @Export(name="interfaceName", refs={String.class}, tree="[0]")
    private Output<String> interfaceName;

    public Output<String> interfaceName() {
        return this.interfaceName;
    }
    /**
     * &#39;Any&#39;, or the IP address of a multicast group
     * 
     */
    @Export(name="multicastGroup", refs={String.class}, tree="[0]")
    private Output<String> multicastGroup;

    /**
     * @return &#39;Any&#39;, or the IP address of a multicast group
     * 
     */
    public Output<String> multicastGroup() {
        return this.multicastGroup;
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
     * rendezvousPointId path parameter. Rendezvous point ID
     * 
     */
    @Export(name="rendezvousPointId", refs={String.class}, tree="[0]")
    private Output<String> rendezvousPointId;

    /**
     * @return rendezvousPointId path parameter. Rendezvous point ID
     * 
     */
    public Output<String> rendezvousPointId() {
        return this.rendezvousPointId;
    }
    @Export(name="serial", refs={String.class}, tree="[0]")
    private Output<String> serial;

    public Output<String> serial() {
        return this.serial;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SwitchRoutingMulticastRendezvousPoints(String name) {
        this(name, SwitchRoutingMulticastRendezvousPointsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SwitchRoutingMulticastRendezvousPoints(String name, SwitchRoutingMulticastRendezvousPointsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SwitchRoutingMulticastRendezvousPoints(String name, SwitchRoutingMulticastRendezvousPointsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchRoutingMulticastRendezvousPoints:SwitchRoutingMulticastRendezvousPoints", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private SwitchRoutingMulticastRendezvousPoints(String name, Output<String> id, @Nullable SwitchRoutingMulticastRendezvousPointsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchRoutingMulticastRendezvousPoints:SwitchRoutingMulticastRendezvousPoints", name, state, makeResourceOptions(options, id));
    }

    private static SwitchRoutingMulticastRendezvousPointsArgs makeArgs(SwitchRoutingMulticastRendezvousPointsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SwitchRoutingMulticastRendezvousPointsArgs.Empty : args;
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
    public static SwitchRoutingMulticastRendezvousPoints get(String name, Output<String> id, @Nullable SwitchRoutingMulticastRendezvousPointsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SwitchRoutingMulticastRendezvousPoints(name, id, state, options);
    }
}
