// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.InventoryOnboardingCloudMonitoringImportsArgs;
import com.pulumi.meraki.organizations.inputs.InventoryOnboardingCloudMonitoringImportsState;
import com.pulumi.meraki.organizations.outputs.InventoryOnboardingCloudMonitoringImportsParameters;
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
 * import com.pulumi.meraki.organizations.InventoryOnboardingCloudMonitoringImports;
 * import com.pulumi.meraki.organizations.InventoryOnboardingCloudMonitoringImportsArgs;
 * import com.pulumi.meraki.organizations.inputs.InventoryOnboardingCloudMonitoringImportsParametersArgs;
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
 *         var example = new InventoryOnboardingCloudMonitoringImports("example", InventoryOnboardingCloudMonitoringImportsArgs.builder()
 *             .organizationId("string")
 *             .parameters(InventoryOnboardingCloudMonitoringImportsParametersArgs.builder()
 *                 .devices(InventoryOnboardingCloudMonitoringImportsParametersDeviceArgs.builder()
 *                     .deviceId("161b2602-a713-4aac-b1eb-d9b55205353d")
 *                     .networkId("1338481")
 *                     .udi("PID:C9200L-24P-4G SN:JAE25220R2K")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiOrganizationsInventoryOnboardingCloudMonitoringImportsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:organizations/inventoryOnboardingCloudMonitoringImports:InventoryOnboardingCloudMonitoringImports example &#34;organization_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:organizations/inventoryOnboardingCloudMonitoringImports:InventoryOnboardingCloudMonitoringImports")
public class InventoryOnboardingCloudMonitoringImports extends com.pulumi.resources.CustomResource {
    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    @Export(name="parameters", refs={InventoryOnboardingCloudMonitoringImportsParameters.class}, tree="[0]")
    private Output<InventoryOnboardingCloudMonitoringImportsParameters> parameters;

    public Output<InventoryOnboardingCloudMonitoringImportsParameters> parameters() {
        return this.parameters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InventoryOnboardingCloudMonitoringImports(String name) {
        this(name, InventoryOnboardingCloudMonitoringImportsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InventoryOnboardingCloudMonitoringImports(String name, InventoryOnboardingCloudMonitoringImportsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InventoryOnboardingCloudMonitoringImports(String name, InventoryOnboardingCloudMonitoringImportsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/inventoryOnboardingCloudMonitoringImports:InventoryOnboardingCloudMonitoringImports", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private InventoryOnboardingCloudMonitoringImports(String name, Output<String> id, @Nullable InventoryOnboardingCloudMonitoringImportsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/inventoryOnboardingCloudMonitoringImports:InventoryOnboardingCloudMonitoringImports", name, state, makeResourceOptions(options, id));
    }

    private static InventoryOnboardingCloudMonitoringImportsArgs makeArgs(InventoryOnboardingCloudMonitoringImportsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InventoryOnboardingCloudMonitoringImportsArgs.Empty : args;
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
    public static InventoryOnboardingCloudMonitoringImports get(String name, Output<String> id, @Nullable InventoryOnboardingCloudMonitoringImportsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InventoryOnboardingCloudMonitoringImports(name, id, state, options);
    }
}
