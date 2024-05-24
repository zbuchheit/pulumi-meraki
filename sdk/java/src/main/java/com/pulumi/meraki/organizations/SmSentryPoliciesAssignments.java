// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.SmSentryPoliciesAssignmentsArgs;
import com.pulumi.meraki.organizations.inputs.SmSentryPoliciesAssignmentsState;
import com.pulumi.meraki.organizations.outputs.SmSentryPoliciesAssignmentsItem;
import com.pulumi.meraki.organizations.outputs.SmSentryPoliciesAssignmentsParameters;
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
 * import com.pulumi.meraki.organizations.SmSentryPoliciesAssignments;
 * import com.pulumi.meraki.organizations.SmSentryPoliciesAssignmentsArgs;
 * import com.pulumi.meraki.organizations.inputs.SmSentryPoliciesAssignmentsParametersArgs;
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
 *         var example = new SmSentryPoliciesAssignments("example", SmSentryPoliciesAssignmentsArgs.builder()
 *             .organizationId("string")
 *             .parameters(SmSentryPoliciesAssignmentsParametersArgs.builder()
 *                 .items(SmSentryPoliciesAssignmentsParametersItemArgs.builder()
 *                     .networkId("N_24329156")
 *                     .policies(SmSentryPoliciesAssignmentsParametersItemPolicyArgs.builder()
 *                         .groupPolicyId("1284392014819")
 *                         .policyId("1284392014819")
 *                         .scope("withAny")
 *                         .smNetworkId("N_24329156")
 *                         .tags(                        
 *                             "tag1",
 *                             "tag2")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiOrganizationsSmSentryPoliciesAssignmentsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="meraki:organizations/smSentryPoliciesAssignments:SmSentryPoliciesAssignments")
public class SmSentryPoliciesAssignments extends com.pulumi.resources.CustomResource {
    @Export(name="item", refs={SmSentryPoliciesAssignmentsItem.class}, tree="[0]")
    private Output<SmSentryPoliciesAssignmentsItem> item;

    public Output<SmSentryPoliciesAssignmentsItem> item() {
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
    @Export(name="parameters", refs={SmSentryPoliciesAssignmentsParameters.class}, tree="[0]")
    private Output<SmSentryPoliciesAssignmentsParameters> parameters;

    public Output<SmSentryPoliciesAssignmentsParameters> parameters() {
        return this.parameters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SmSentryPoliciesAssignments(String name) {
        this(name, SmSentryPoliciesAssignmentsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SmSentryPoliciesAssignments(String name, SmSentryPoliciesAssignmentsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SmSentryPoliciesAssignments(String name, SmSentryPoliciesAssignmentsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/smSentryPoliciesAssignments:SmSentryPoliciesAssignments", name, args == null ? SmSentryPoliciesAssignmentsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SmSentryPoliciesAssignments(String name, Output<String> id, @Nullable SmSentryPoliciesAssignmentsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/smSentryPoliciesAssignments:SmSentryPoliciesAssignments", name, state, makeResourceOptions(options, id));
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
    public static SmSentryPoliciesAssignments get(String name, Output<String> id, @Nullable SmSentryPoliciesAssignmentsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SmSentryPoliciesAssignments(name, id, state, options);
    }
}
