// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.EarlyAccessFeaturesOptInsArgs;
import com.pulumi.meraki.organizations.inputs.EarlyAccessFeaturesOptInsState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
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
 * import com.pulumi.meraki.organizations.EarlyAccessFeaturesOptIns;
 * import com.pulumi.meraki.organizations.EarlyAccessFeaturesOptInsArgs;
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
 *         var example = new EarlyAccessFeaturesOptIns("example", EarlyAccessFeaturesOptInsArgs.builder()
 *             .limitScopeToNetworks("N_12345")
 *             .organizationId("string")
 *             .shortName("has_magnetic_beta")
 *             .build());
 * 
 *         ctx.export("merakiOrganizationsEarlyAccessFeaturesOptInsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:organizations/earlyAccessFeaturesOptIns:EarlyAccessFeaturesOptIns example &#34;opt_in_id,organization_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:organizations/earlyAccessFeaturesOptIns:EarlyAccessFeaturesOptIns")
public class EarlyAccessFeaturesOptIns extends com.pulumi.resources.CustomResource {
    /**
     * Time when Early Access Feature was created
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Time when Early Access Feature was created
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Networks assigned to the Early Access Feature
     * 
     */
    @Export(name="limitScopeToNetworks", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> limitScopeToNetworks;

    /**
     * @return Networks assigned to the Early Access Feature
     * 
     */
    public Output<List<String>> limitScopeToNetworks() {
        return this.limitScopeToNetworks;
    }
    /**
     * optInId path parameter. Opt in ID
     * 
     */
    @Export(name="optInId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> optInId;

    /**
     * @return optInId path parameter. Opt in ID
     * 
     */
    public Output<Optional<String>> optInId() {
        return Codegen.optional(this.optInId);
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
     * Name of Early Access Feature
     * 
     */
    @Export(name="shortName", refs={String.class}, tree="[0]")
    private Output<String> shortName;

    /**
     * @return Name of Early Access Feature
     * 
     */
    public Output<String> shortName() {
        return this.shortName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EarlyAccessFeaturesOptIns(String name) {
        this(name, EarlyAccessFeaturesOptInsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EarlyAccessFeaturesOptIns(String name, EarlyAccessFeaturesOptInsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EarlyAccessFeaturesOptIns(String name, EarlyAccessFeaturesOptInsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/earlyAccessFeaturesOptIns:EarlyAccessFeaturesOptIns", name, args == null ? EarlyAccessFeaturesOptInsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EarlyAccessFeaturesOptIns(String name, Output<String> id, @Nullable EarlyAccessFeaturesOptInsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/earlyAccessFeaturesOptIns:EarlyAccessFeaturesOptIns", name, state, makeResourceOptions(options, id));
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
    public static EarlyAccessFeaturesOptIns get(String name, Output<String> id, @Nullable EarlyAccessFeaturesOptInsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EarlyAccessFeaturesOptIns(name, id, state, options);
    }
}
