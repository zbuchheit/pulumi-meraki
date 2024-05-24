// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.ApplianceFirewallFirewalledServicesArgs;
import com.pulumi.meraki.networks.inputs.ApplianceFirewallFirewalledServicesState;
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
 * import com.pulumi.meraki.networks.ApplianceFirewallFirewalledServices;
 * import com.pulumi.meraki.networks.ApplianceFirewallFirewalledServicesArgs;
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
 *         var example = new ApplianceFirewallFirewalledServices("example", ApplianceFirewallFirewalledServicesArgs.builder()
 *             .access("restricted")
 *             .allowedIps("123.123.123.1")
 *             .networkId("string")
 *             .service("string")
 *             .build());
 * 
 *         ctx.export("merakiNetworksApplianceFirewallFirewalledServicesExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/applianceFirewallFirewalledServices:ApplianceFirewallFirewalledServices example &#34;network_id,service&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/applianceFirewallFirewalledServices:ApplianceFirewallFirewalledServices")
public class ApplianceFirewallFirewalledServices extends com.pulumi.resources.CustomResource {
    /**
     * A string indicating the rule for which IPs are allowed to use the specified service
     * 
     */
    @Export(name="access", refs={String.class}, tree="[0]")
    private Output<String> access;

    /**
     * @return A string indicating the rule for which IPs are allowed to use the specified service
     * 
     */
    public Output<String> access() {
        return this.access;
    }
    /**
     * An array of allowed IPs that can access the service
     * 
     */
    @Export(name="allowedIps", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> allowedIps;

    /**
     * @return An array of allowed IPs that can access the service
     * 
     */
    public Output<List<String>> allowedIps() {
        return this.allowedIps;
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
     * Appliance service name
     * 
     */
    @Export(name="service", refs={String.class}, tree="[0]")
    private Output<String> service;

    /**
     * @return Appliance service name
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplianceFirewallFirewalledServices(String name) {
        this(name, ApplianceFirewallFirewalledServicesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplianceFirewallFirewalledServices(String name, ApplianceFirewallFirewalledServicesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplianceFirewallFirewalledServices(String name, ApplianceFirewallFirewalledServicesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceFirewallFirewalledServices:ApplianceFirewallFirewalledServices", name, args == null ? ApplianceFirewallFirewalledServicesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplianceFirewallFirewalledServices(String name, Output<String> id, @Nullable ApplianceFirewallFirewalledServicesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceFirewallFirewalledServices:ApplianceFirewallFirewalledServices", name, state, makeResourceOptions(options, id));
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
    public static ApplianceFirewallFirewalledServices get(String name, Output<String> id, @Nullable ApplianceFirewallFirewalledServicesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplianceFirewallFirewalledServices(name, id, state, options);
    }
}
