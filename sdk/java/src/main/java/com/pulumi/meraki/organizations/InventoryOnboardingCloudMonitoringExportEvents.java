// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.InventoryOnboardingCloudMonitoringExportEventsArgs;
import com.pulumi.meraki.organizations.inputs.InventoryOnboardingCloudMonitoringExportEventsState;
import com.pulumi.meraki.organizations.outputs.InventoryOnboardingCloudMonitoringExportEventsParameters;
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
 * import com.pulumi.meraki.organizations.InventoryOnboardingCloudMonitoringExportEvents;
 * import com.pulumi.meraki.organizations.InventoryOnboardingCloudMonitoringExportEventsArgs;
 * import com.pulumi.meraki.organizations.inputs.InventoryOnboardingCloudMonitoringExportEventsParametersArgs;
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
 *         var example = new InventoryOnboardingCloudMonitoringExportEvents("example", InventoryOnboardingCloudMonitoringExportEventsArgs.builder()
 *             .organizationId("string")
 *             .parameters(InventoryOnboardingCloudMonitoringExportEventsParametersArgs.builder()
 *                 .log_event("download")
 *                 .request("r=cb")
 *                 .target_os("mac")
 *                 .timestamp(1526087474)
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiOrganizationsInventoryOnboardingCloudMonitoringExportEventsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="meraki:organizations/inventoryOnboardingCloudMonitoringExportEvents:InventoryOnboardingCloudMonitoringExportEvents")
public class InventoryOnboardingCloudMonitoringExportEvents extends com.pulumi.resources.CustomResource {
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
    @Export(name="parameters", refs={InventoryOnboardingCloudMonitoringExportEventsParameters.class}, tree="[0]")
    private Output<InventoryOnboardingCloudMonitoringExportEventsParameters> parameters;

    public Output<InventoryOnboardingCloudMonitoringExportEventsParameters> parameters() {
        return this.parameters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InventoryOnboardingCloudMonitoringExportEvents(String name) {
        this(name, InventoryOnboardingCloudMonitoringExportEventsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InventoryOnboardingCloudMonitoringExportEvents(String name, InventoryOnboardingCloudMonitoringExportEventsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InventoryOnboardingCloudMonitoringExportEvents(String name, InventoryOnboardingCloudMonitoringExportEventsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/inventoryOnboardingCloudMonitoringExportEvents:InventoryOnboardingCloudMonitoringExportEvents", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private InventoryOnboardingCloudMonitoringExportEvents(String name, Output<String> id, @Nullable InventoryOnboardingCloudMonitoringExportEventsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/inventoryOnboardingCloudMonitoringExportEvents:InventoryOnboardingCloudMonitoringExportEvents", name, state, makeResourceOptions(options, id));
    }

    private static InventoryOnboardingCloudMonitoringExportEventsArgs makeArgs(InventoryOnboardingCloudMonitoringExportEventsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InventoryOnboardingCloudMonitoringExportEventsArgs.Empty : args;
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
    public static InventoryOnboardingCloudMonitoringExportEvents get(String name, Output<String> id, @Nullable InventoryOnboardingCloudMonitoringExportEventsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InventoryOnboardingCloudMonitoringExportEvents(name, id, state, options);
    }
}
