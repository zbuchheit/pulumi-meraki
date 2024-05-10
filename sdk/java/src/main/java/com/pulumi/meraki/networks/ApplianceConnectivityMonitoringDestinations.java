// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.ApplianceConnectivityMonitoringDestinationsArgs;
import com.pulumi.meraki.networks.inputs.ApplianceConnectivityMonitoringDestinationsState;
import com.pulumi.meraki.networks.outputs.ApplianceConnectivityMonitoringDestinationsDestination;
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
 * import com.pulumi.meraki.networks.ApplianceConnectivityMonitoringDestinations;
 * import com.pulumi.meraki.networks.ApplianceConnectivityMonitoringDestinationsArgs;
 * import com.pulumi.meraki.networks.inputs.ApplianceConnectivityMonitoringDestinationsDestinationArgs;
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
 *         var example = new ApplianceConnectivityMonitoringDestinations(&#34;example&#34;, ApplianceConnectivityMonitoringDestinationsArgs.builder()        
 *             .destinations(ApplianceConnectivityMonitoringDestinationsDestinationArgs.builder()
 *                 .default_(false)
 *                 .description(&#34;Google&#34;)
 *                 .ip(&#34;8.8.8.8&#34;)
 *                 .build())
 *             .networkId(&#34;string&#34;)
 *             .build());
 * 
 *         ctx.export(&#34;merakiNetworksApplianceConnectivityMonitoringDestinationsExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/applianceConnectivityMonitoringDestinations:ApplianceConnectivityMonitoringDestinations example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/applianceConnectivityMonitoringDestinations:ApplianceConnectivityMonitoringDestinations")
public class ApplianceConnectivityMonitoringDestinations extends com.pulumi.resources.CustomResource {
    /**
     * The list of connectivity monitoring destinations
     * 
     */
    @Export(name="destinations", refs={List.class,ApplianceConnectivityMonitoringDestinationsDestination.class}, tree="[0,1]")
    private Output<List<ApplianceConnectivityMonitoringDestinationsDestination>> destinations;

    /**
     * @return The list of connectivity monitoring destinations
     * 
     */
    public Output<List<ApplianceConnectivityMonitoringDestinationsDestination>> destinations() {
        return this.destinations;
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
    public ApplianceConnectivityMonitoringDestinations(String name) {
        this(name, ApplianceConnectivityMonitoringDestinationsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplianceConnectivityMonitoringDestinations(String name, ApplianceConnectivityMonitoringDestinationsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplianceConnectivityMonitoringDestinations(String name, ApplianceConnectivityMonitoringDestinationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceConnectivityMonitoringDestinations:ApplianceConnectivityMonitoringDestinations", name, args == null ? ApplianceConnectivityMonitoringDestinationsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplianceConnectivityMonitoringDestinations(String name, Output<String> id, @Nullable ApplianceConnectivityMonitoringDestinationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceConnectivityMonitoringDestinations:ApplianceConnectivityMonitoringDestinations", name, state, makeResourceOptions(options, id));
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
    public static ApplianceConnectivityMonitoringDestinations get(String name, Output<String> id, @Nullable ApplianceConnectivityMonitoringDestinationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplianceConnectivityMonitoringDestinations(name, id, state, options);
    }
}
