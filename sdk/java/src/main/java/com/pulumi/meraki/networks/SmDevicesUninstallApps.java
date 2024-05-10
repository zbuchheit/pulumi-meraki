// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SmDevicesUninstallAppsArgs;
import com.pulumi.meraki.networks.inputs.SmDevicesUninstallAppsState;
import com.pulumi.meraki.networks.outputs.SmDevicesUninstallAppsParameters;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ~&gt;Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
 * already existed previously.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.meraki.networks.SmDevicesUninstallApps;
 * import com.pulumi.meraki.networks.SmDevicesUninstallAppsArgs;
 * import com.pulumi.meraki.networks.inputs.SmDevicesUninstallAppsParametersArgs;
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
 *         var example = new SmDevicesUninstallApps(&#34;example&#34;, SmDevicesUninstallAppsArgs.builder()        
 *             .deviceId(&#34;string&#34;)
 *             .networkId(&#34;string&#34;)
 *             .parameters(SmDevicesUninstallAppsParametersArgs.builder()
 *                 .app_ids(                
 *                     &#34;1284392014819&#34;,
 *                     &#34;2983092129865&#34;)
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;merakiNetworksSmDevicesUninstallAppsExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="meraki:networks/smDevicesUninstallApps:SmDevicesUninstallApps")
public class SmDevicesUninstallApps extends com.pulumi.resources.CustomResource {
    /**
     * deviceId path parameter. Device ID
     * 
     */
    @Export(name="deviceId", refs={String.class}, tree="[0]")
    private Output<String> deviceId;

    /**
     * @return deviceId path parameter. Device ID
     * 
     */
    public Output<String> deviceId() {
        return this.deviceId;
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
    @Export(name="parameters", refs={SmDevicesUninstallAppsParameters.class}, tree="[0]")
    private Output<SmDevicesUninstallAppsParameters> parameters;

    public Output<SmDevicesUninstallAppsParameters> parameters() {
        return this.parameters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SmDevicesUninstallApps(String name) {
        this(name, SmDevicesUninstallAppsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SmDevicesUninstallApps(String name, SmDevicesUninstallAppsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SmDevicesUninstallApps(String name, SmDevicesUninstallAppsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/smDevicesUninstallApps:SmDevicesUninstallApps", name, args == null ? SmDevicesUninstallAppsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SmDevicesUninstallApps(String name, Output<String> id, @Nullable SmDevicesUninstallAppsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/smDevicesUninstallApps:SmDevicesUninstallApps", name, state, makeResourceOptions(options, id));
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
    public static SmDevicesUninstallApps get(String name, Output<String> id, @Nullable SmDevicesUninstallAppsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SmDevicesUninstallApps(name, id, state, options);
    }
}
