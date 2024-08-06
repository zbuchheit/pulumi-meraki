// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SmDevicesInstallAppsArgs;
import com.pulumi.meraki.networks.inputs.SmDevicesInstallAppsState;
import com.pulumi.meraki.networks.outputs.SmDevicesInstallAppsParameters;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ~&gt;Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
 * already existed previously.
 * 
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
 * import com.pulumi.meraki.networks.SmDevicesInstallApps;
 * import com.pulumi.meraki.networks.SmDevicesInstallAppsArgs;
 * import com.pulumi.meraki.networks.inputs.SmDevicesInstallAppsParametersArgs;
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
 *         var example = new SmDevicesInstallApps("example", SmDevicesInstallAppsArgs.builder()
 *             .deviceId("string")
 *             .networkId("string")
 *             .parameters(SmDevicesInstallAppsParametersArgs.builder()
 *                 .app_ids(                
 *                     "1284392014819",
 *                     "2983092129865")
 *                 .force(false)
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiNetworksSmDevicesInstallAppsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="meraki:networks/smDevicesInstallApps:SmDevicesInstallApps")
public class SmDevicesInstallApps extends com.pulumi.resources.CustomResource {
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
    @Export(name="parameters", refs={SmDevicesInstallAppsParameters.class}, tree="[0]")
    private Output<SmDevicesInstallAppsParameters> parameters;

    public Output<SmDevicesInstallAppsParameters> parameters() {
        return this.parameters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SmDevicesInstallApps(String name) {
        this(name, SmDevicesInstallAppsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SmDevicesInstallApps(String name, SmDevicesInstallAppsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SmDevicesInstallApps(String name, SmDevicesInstallAppsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/smDevicesInstallApps:SmDevicesInstallApps", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private SmDevicesInstallApps(String name, Output<String> id, @Nullable SmDevicesInstallAppsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/smDevicesInstallApps:SmDevicesInstallApps", name, state, makeResourceOptions(options, id));
    }

    private static SmDevicesInstallAppsArgs makeArgs(SmDevicesInstallAppsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SmDevicesInstallAppsArgs.Empty : args;
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
    public static SmDevicesInstallApps get(String name, Output<String> id, @Nullable SmDevicesInstallAppsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SmDevicesInstallApps(name, id, state, options);
    }
}
