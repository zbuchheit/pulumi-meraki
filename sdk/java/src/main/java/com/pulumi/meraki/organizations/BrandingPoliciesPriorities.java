// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.BrandingPoliciesPrioritiesArgs;
import com.pulumi.meraki.organizations.inputs.BrandingPoliciesPrioritiesState;
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
 * import com.pulumi.meraki.organizations.BrandingPoliciesPriorities;
 * import com.pulumi.meraki.organizations.BrandingPoliciesPrioritiesArgs;
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
 *         var example = new BrandingPoliciesPriorities("example", BrandingPoliciesPrioritiesArgs.builder()
 *             .brandingPolicyIds(            
 *                 "123",
 *                 "456",
 *                 "789")
 *             .organizationId("string")
 *             .build());
 * 
 *         ctx.export("merakiOrganizationsBrandingPoliciesPrioritiesExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:organizations/brandingPoliciesPriorities:BrandingPoliciesPriorities example &#34;organization_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:organizations/brandingPoliciesPriorities:BrandingPoliciesPriorities")
public class BrandingPoliciesPriorities extends com.pulumi.resources.CustomResource {
    /**
     * An ordered list of branding policy IDs that determines the priority order of how to apply the policies
     * 
     */
    @Export(name="brandingPolicyIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> brandingPolicyIds;

    /**
     * @return An ordered list of branding policy IDs that determines the priority order of how to apply the policies
     * 
     */
    public Output<List<String>> brandingPolicyIds() {
        return this.brandingPolicyIds;
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

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BrandingPoliciesPriorities(String name) {
        this(name, BrandingPoliciesPrioritiesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BrandingPoliciesPriorities(String name, BrandingPoliciesPrioritiesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BrandingPoliciesPriorities(String name, BrandingPoliciesPrioritiesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/brandingPoliciesPriorities:BrandingPoliciesPriorities", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private BrandingPoliciesPriorities(String name, Output<String> id, @Nullable BrandingPoliciesPrioritiesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/brandingPoliciesPriorities:BrandingPoliciesPriorities", name, state, makeResourceOptions(options, id));
    }

    private static BrandingPoliciesPrioritiesArgs makeArgs(BrandingPoliciesPrioritiesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BrandingPoliciesPrioritiesArgs.Empty : args;
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
    public static BrandingPoliciesPriorities get(String name, Output<String> id, @Nullable BrandingPoliciesPrioritiesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BrandingPoliciesPriorities(name, id, state, options);
    }
}
