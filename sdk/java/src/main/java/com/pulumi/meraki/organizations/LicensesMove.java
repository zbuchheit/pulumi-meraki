// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.LicensesMoveArgs;
import com.pulumi.meraki.organizations.inputs.LicensesMoveState;
import com.pulumi.meraki.organizations.outputs.LicensesMoveItem;
import com.pulumi.meraki.organizations.outputs.LicensesMoveParameters;
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
 * import com.pulumi.meraki.organizations.LicensesMove;
 * import com.pulumi.meraki.organizations.LicensesMoveArgs;
 * import com.pulumi.meraki.organizations.inputs.LicensesMoveParametersArgs;
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
 *         var example = new LicensesMove(&#34;example&#34;, LicensesMoveArgs.builder()        
 *             .organizationId(&#34;string&#34;)
 *             .parameters(LicensesMoveParametersArgs.builder()
 *                 .dest_organization_id(&#34;2930418&#34;)
 *                 .license_ids(                
 *                     &#34;123&#34;,
 *                     &#34;456&#34;)
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;merakiOrganizationsLicensesMoveExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="meraki:organizations/licensesMove:LicensesMove")
public class LicensesMove extends com.pulumi.resources.CustomResource {
    @Export(name="item", refs={LicensesMoveItem.class}, tree="[0]")
    private Output<LicensesMoveItem> item;

    public Output<LicensesMoveItem> item() {
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
    @Export(name="parameters", refs={LicensesMoveParameters.class}, tree="[0]")
    private Output<LicensesMoveParameters> parameters;

    public Output<LicensesMoveParameters> parameters() {
        return this.parameters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LicensesMove(String name) {
        this(name, LicensesMoveArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LicensesMove(String name, LicensesMoveArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LicensesMove(String name, LicensesMoveArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/licensesMove:LicensesMove", name, args == null ? LicensesMoveArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LicensesMove(String name, Output<String> id, @Nullable LicensesMoveState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/licensesMove:LicensesMove", name, state, makeResourceOptions(options, id));
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
    public static LicensesMove get(String name, Output<String> id, @Nullable LicensesMoveState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LicensesMove(name, id, state, options);
    }
}