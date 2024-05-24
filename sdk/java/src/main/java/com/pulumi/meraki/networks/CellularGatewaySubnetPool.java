// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.CellularGatewaySubnetPoolArgs;
import com.pulumi.meraki.networks.inputs.CellularGatewaySubnetPoolState;
import com.pulumi.meraki.networks.outputs.CellularGatewaySubnetPoolSubnet;
import java.lang.Integer;
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
 * import com.pulumi.meraki.networks.CellularGatewaySubnetPool;
 * import com.pulumi.meraki.networks.CellularGatewaySubnetPoolArgs;
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
 *         var example = new CellularGatewaySubnetPool("example", CellularGatewaySubnetPoolArgs.builder()
 *             .cidr("192.168.0.0/16")
 *             .mask(24)
 *             .networkId("string")
 *             .build());
 * 
 *         ctx.export("merakiNetworksCellularGatewaySubnetPoolExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/cellularGatewaySubnetPool:CellularGatewaySubnetPool example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/cellularGatewaySubnetPool:CellularGatewaySubnetPool")
public class CellularGatewaySubnetPool extends com.pulumi.resources.CustomResource {
    /**
     * CIDR of the pool of subnets. Each MG in this network will automatically pick a subnet from this pool.
     * 
     */
    @Export(name="cidr", refs={String.class}, tree="[0]")
    private Output<String> cidr;

    /**
     * @return CIDR of the pool of subnets. Each MG in this network will automatically pick a subnet from this pool.
     * 
     */
    public Output<String> cidr() {
        return this.cidr;
    }
    @Export(name="deploymentMode", refs={String.class}, tree="[0]")
    private Output<String> deploymentMode;

    public Output<String> deploymentMode() {
        return this.deploymentMode;
    }
    /**
     * Mask used for the subnet of all MGs in  this network.
     * 
     */
    @Export(name="mask", refs={Integer.class}, tree="[0]")
    private Output<Integer> mask;

    /**
     * @return Mask used for the subnet of all MGs in  this network.
     * 
     */
    public Output<Integer> mask() {
        return this.mask;
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
    @Export(name="subnets", refs={List.class,CellularGatewaySubnetPoolSubnet.class}, tree="[0,1]")
    private Output<List<CellularGatewaySubnetPoolSubnet>> subnets;

    public Output<List<CellularGatewaySubnetPoolSubnet>> subnets() {
        return this.subnets;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CellularGatewaySubnetPool(String name) {
        this(name, CellularGatewaySubnetPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CellularGatewaySubnetPool(String name, CellularGatewaySubnetPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CellularGatewaySubnetPool(String name, CellularGatewaySubnetPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/cellularGatewaySubnetPool:CellularGatewaySubnetPool", name, args == null ? CellularGatewaySubnetPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CellularGatewaySubnetPool(String name, Output<String> id, @Nullable CellularGatewaySubnetPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/cellularGatewaySubnetPool:CellularGatewaySubnetPool", name, state, makeResourceOptions(options, id));
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
    public static CellularGatewaySubnetPool get(String name, Output<String> id, @Nullable CellularGatewaySubnetPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CellularGatewaySubnetPool(name, id, state, options);
    }
}
