// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.PolicyObjectsGroupsArgs;
import com.pulumi.meraki.organizations.inputs.PolicyObjectsGroupsState;
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
 * import com.pulumi.meraki.organizations.PolicyObjectsGroups;
 * import com.pulumi.meraki.organizations.PolicyObjectsGroupsArgs;
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
 *         var example = new PolicyObjectsGroups("example", PolicyObjectsGroupsArgs.builder()
 *             .category("NetworkObjectGroup")
 *             .name("Web Servers - Datacenter 10")
 *             .objectIds(100)
 *             .organizationId("string")
 *             .build());
 * 
 *         ctx.export("merakiOrganizationsPolicyObjectsGroupsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:organizations/policyObjectsGroups:PolicyObjectsGroups example &#34;organization_id,policy_object_group_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:organizations/policyObjectsGroups:PolicyObjectsGroups")
public class PolicyObjectsGroups extends com.pulumi.resources.CustomResource {
    /**
     * Category of a policy object group (one of: NetworkObjectGroup, GeoLocationGroup, PortObjectGroup, ApplicationGroup)
     * 
     */
    @Export(name="category", refs={String.class}, tree="[0]")
    private Output<String> category;

    /**
     * @return Category of a policy object group (one of: NetworkObjectGroup, GeoLocationGroup, PortObjectGroup, ApplicationGroup)
     * 
     */
    public Output<String> category() {
        return this.category;
    }
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * A name for the group of network addresses, unique within the organization (alphanumeric, space, dash, or underscore characters only)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A name for the group of network addresses, unique within the organization (alphanumeric, space, dash, or underscore characters only)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="networkIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> networkIds;

    public Output<List<String>> networkIds() {
        return this.networkIds;
    }
    /**
     * A list of Policy Object ID&#39;s that this NetworkObjectGroup should be associated to (note: these ID&#39;s will replace the existing associated Policy Objects)
     * 
     */
    @Export(name="objectIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> objectIds;

    /**
     * @return A list of Policy Object ID&#39;s that this NetworkObjectGroup should be associated to (note: these ID&#39;s will replace the existing associated Policy Objects)
     * 
     */
    public Output<List<String>> objectIds() {
        return this.objectIds;
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
     * policyObjectGroupId path parameter. Policy object group ID
     * 
     */
    @Export(name="policyObjectGroupId", refs={String.class}, tree="[0]")
    private Output<String> policyObjectGroupId;

    /**
     * @return policyObjectGroupId path parameter. Policy object group ID
     * 
     */
    public Output<String> policyObjectGroupId() {
        return this.policyObjectGroupId;
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
    public PolicyObjectsGroups(String name) {
        this(name, PolicyObjectsGroupsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyObjectsGroups(String name, PolicyObjectsGroupsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyObjectsGroups(String name, PolicyObjectsGroupsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/policyObjectsGroups:PolicyObjectsGroups", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private PolicyObjectsGroups(String name, Output<String> id, @Nullable PolicyObjectsGroupsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/policyObjectsGroups:PolicyObjectsGroups", name, state, makeResourceOptions(options, id));
    }

    private static PolicyObjectsGroupsArgs makeArgs(PolicyObjectsGroupsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PolicyObjectsGroupsArgs.Empty : args;
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
    public static PolicyObjectsGroups get(String name, Output<String> id, @Nullable PolicyObjectsGroupsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PolicyObjectsGroups(name, id, state, options);
    }
}
