// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.InventoryClaimArgs;
import com.pulumi.meraki.organizations.inputs.InventoryClaimState;
import com.pulumi.meraki.organizations.outputs.InventoryClaimItem;
import com.pulumi.meraki.organizations.outputs.InventoryClaimParameters;
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
 * import com.pulumi.meraki.organizations.InventoryClaim;
 * import com.pulumi.meraki.organizations.InventoryClaimArgs;
 * import com.pulumi.meraki.organizations.inputs.InventoryClaimParametersArgs;
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
 *         var example = new InventoryClaim("example", InventoryClaimArgs.builder()
 *             .organizationId("string")
 *             .parameters(InventoryClaimParametersArgs.builder()
 *                 .licenses(InventoryClaimParametersLicenseArgs.builder()
 *                     .key("Z2XXXXXXXXXX")
 *                     .mode("addDevices")
 *                     .build())
 *                 .orders("4CXXXXXXX")
 *                 .serials("Q234-ABCD-5678")
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiOrganizationsInventoryClaimExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="meraki:organizations/inventoryClaim:InventoryClaim")
public class InventoryClaim extends com.pulumi.resources.CustomResource {
    @Export(name="item", refs={InventoryClaimItem.class}, tree="[0]")
    private Output<InventoryClaimItem> item;

    public Output<InventoryClaimItem> item() {
        return this.item;
    }
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
    @Export(name="parameters", refs={InventoryClaimParameters.class}, tree="[0]")
    private Output<InventoryClaimParameters> parameters;

    public Output<InventoryClaimParameters> parameters() {
        return this.parameters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InventoryClaim(String name) {
        this(name, InventoryClaimArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InventoryClaim(String name, InventoryClaimArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InventoryClaim(String name, InventoryClaimArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/inventoryClaim:InventoryClaim", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private InventoryClaim(String name, Output<String> id, @Nullable InventoryClaimState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/inventoryClaim:InventoryClaim", name, state, makeResourceOptions(options, id));
    }

    private static InventoryClaimArgs makeArgs(InventoryClaimArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InventoryClaimArgs.Empty : args;
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
    public static InventoryClaim get(String name, Output<String> id, @Nullable InventoryClaimState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InventoryClaim(name, id, state, options);
    }
}
