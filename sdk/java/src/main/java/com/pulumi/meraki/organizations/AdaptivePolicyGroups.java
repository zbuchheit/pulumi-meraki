// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.AdaptivePolicyGroupsArgs;
import com.pulumi.meraki.organizations.inputs.AdaptivePolicyGroupsState;
import com.pulumi.meraki.organizations.outputs.AdaptivePolicyGroupsPolicyObject;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.meraki.organizations.AdaptivePolicyGroups;
 * import com.pulumi.meraki.organizations.AdaptivePolicyGroupsArgs;
 * import com.pulumi.meraki.organizations.inputs.AdaptivePolicyGroupsPolicyObjectArgs;
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
 *         var example = new AdaptivePolicyGroups(&#34;example&#34;, AdaptivePolicyGroupsArgs.builder()        
 *             .description(&#34;Group of XYZ Corp Employees&#34;)
 *             .name(&#34;Employee Group&#34;)
 *             .organizationId(&#34;string&#34;)
 *             .policyObjects(AdaptivePolicyGroupsPolicyObjectArgs.builder()
 *                 .id(&#34;2345&#34;)
 *                 .name(&#34;Example Policy Object&#34;)
 *                 .build())
 *             .sgt(1000)
 *             .build());
 * 
 *         ctx.export(&#34;merakiOrganizationsAdaptivePolicyGroupsExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:organizations/adaptivePolicyGroups:AdaptivePolicyGroups example &#34;id,organization_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:organizations/adaptivePolicyGroups:AdaptivePolicyGroups")
public class AdaptivePolicyGroups extends com.pulumi.resources.CustomResource {
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Description of the group (default: &#34;&#34;)
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Description of the group (default: &#34;&#34;)
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output<String> groupId;

    public Output<String> groupId() {
        return this.groupId;
    }
    @Export(name="isDefaultGroup", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isDefaultGroup;

    public Output<Boolean> isDefaultGroup() {
        return this.isDefaultGroup;
    }
    /**
     * Name of the group
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the group
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * The policy objects that belong to this group; traffic from addresses specified by these policy objects will be tagged with this group&#39;s SGT value if no other tagging scheme is being used (each requires one unique attribute) ()
     * 
     */
    @Export(name="policyObjects", refs={List.class,AdaptivePolicyGroupsPolicyObject.class}, tree="[0,1]")
    private Output<List<AdaptivePolicyGroupsPolicyObject>> policyObjects;

    /**
     * @return The policy objects that belong to this group; traffic from addresses specified by these policy objects will be tagged with this group&#39;s SGT value if no other tagging scheme is being used (each requires one unique attribute) ()
     * 
     */
    public Output<List<AdaptivePolicyGroupsPolicyObject>> policyObjects() {
        return this.policyObjects;
    }
    @Export(name="requiredIpMappings", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> requiredIpMappings;

    public Output<List<String>> requiredIpMappings() {
        return this.requiredIpMappings;
    }
    /**
     * SGT value of the group
     * 
     */
    @Export(name="sgt", refs={Integer.class}, tree="[0]")
    private Output<Integer> sgt;

    /**
     * @return SGT value of the group
     * 
     */
    public Output<Integer> sgt() {
        return this.sgt;
    }
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AdaptivePolicyGroups(String name) {
        this(name, AdaptivePolicyGroupsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AdaptivePolicyGroups(String name, AdaptivePolicyGroupsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AdaptivePolicyGroups(String name, AdaptivePolicyGroupsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/adaptivePolicyGroups:AdaptivePolicyGroups", name, args == null ? AdaptivePolicyGroupsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AdaptivePolicyGroups(String name, Output<String> id, @Nullable AdaptivePolicyGroupsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/adaptivePolicyGroups:AdaptivePolicyGroups", name, state, makeResourceOptions(options, id));
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
    public static AdaptivePolicyGroups get(String name, Output<String> id, @Nullable AdaptivePolicyGroupsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AdaptivePolicyGroups(name, id, state, options);
    }
}
