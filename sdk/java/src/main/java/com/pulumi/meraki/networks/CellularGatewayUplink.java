// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.CellularGatewayUplinkArgs;
import com.pulumi.meraki.networks.inputs.CellularGatewayUplinkState;
import com.pulumi.meraki.networks.outputs.CellularGatewayUplinkBandwidthLimits;
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
 * import com.pulumi.meraki.networks.CellularGatewayUplink;
 * import com.pulumi.meraki.networks.CellularGatewayUplinkArgs;
 * import com.pulumi.meraki.networks.inputs.CellularGatewayUplinkBandwidthLimitsArgs;
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
 *         var example = new CellularGatewayUplink("example", CellularGatewayUplinkArgs.builder()
 *             .bandwidthLimits(CellularGatewayUplinkBandwidthLimitsArgs.builder()
 *                 .limit_down(1000000)
 *                 .limit_up(1000000)
 *                 .build())
 *             .networkId("string")
 *             .build());
 * 
 *         ctx.export("merakiNetworksCellularGatewayUplinkExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/cellularGatewayUplink:CellularGatewayUplink example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/cellularGatewayUplink:CellularGatewayUplink")
public class CellularGatewayUplink extends com.pulumi.resources.CustomResource {
    /**
     * The bandwidth settings for the &#39;cellular&#39; uplink
     * 
     */
    @Export(name="bandwidthLimits", refs={CellularGatewayUplinkBandwidthLimits.class}, tree="[0]")
    private Output<CellularGatewayUplinkBandwidthLimits> bandwidthLimits;

    /**
     * @return The bandwidth settings for the &#39;cellular&#39; uplink
     * 
     */
    public Output<CellularGatewayUplinkBandwidthLimits> bandwidthLimits() {
        return this.bandwidthLimits;
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
    public CellularGatewayUplink(String name) {
        this(name, CellularGatewayUplinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CellularGatewayUplink(String name, CellularGatewayUplinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CellularGatewayUplink(String name, CellularGatewayUplinkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/cellularGatewayUplink:CellularGatewayUplink", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private CellularGatewayUplink(String name, Output<String> id, @Nullable CellularGatewayUplinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/cellularGatewayUplink:CellularGatewayUplink", name, state, makeResourceOptions(options, id));
    }

    private static CellularGatewayUplinkArgs makeArgs(CellularGatewayUplinkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CellularGatewayUplinkArgs.Empty : args;
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
    public static CellularGatewayUplink get(String name, Output<String> id, @Nullable CellularGatewayUplinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CellularGatewayUplink(name, id, state, options);
    }
}
