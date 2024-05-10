// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.VlanProfilesArgs;
import com.pulumi.meraki.networks.inputs.VlanProfilesState;
import com.pulumi.meraki.networks.outputs.VlanProfilesVlanGroup;
import com.pulumi.meraki.networks.outputs.VlanProfilesVlanName;
import java.lang.Boolean;
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
 * import com.pulumi.meraki.networks.VlanProfiles;
 * import com.pulumi.meraki.networks.VlanProfilesArgs;
 * import com.pulumi.meraki.networks.inputs.VlanProfilesVlanGroupArgs;
 * import com.pulumi.meraki.networks.inputs.VlanProfilesVlanNameArgs;
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
 *         var example = new VlanProfiles(&#34;example&#34;, VlanProfilesArgs.builder()        
 *             .iname(&#34;string&#34;)
 *             .name(&#34;My VLAN profile name&#34;)
 *             .networkId(&#34;string&#34;)
 *             .vlanGroups(VlanProfilesVlanGroupArgs.builder()
 *                 .name(&#34;named-group-1&#34;)
 *                 .vlan_ids(&#34;2,5-7&#34;)
 *                 .build())
 *             .vlanNames(VlanProfilesVlanNameArgs.builder()
 *                 .adaptive_policy_group(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                 .name(&#34;named-1&#34;)
 *                 .vlan_id(&#34;1&#34;)
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;merakiNetworksVlanProfilesExample&#34;, example);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/vlanProfiles:VlanProfiles example &#34;iname,network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/vlanProfiles:VlanProfiles")
public class VlanProfiles extends com.pulumi.resources.CustomResource {
    /**
     * IName of the VLAN profile
     * 
     */
    @Export(name="iname", refs={String.class}, tree="[0]")
    private Output<String> iname;

    /**
     * @return IName of the VLAN profile
     * 
     */
    public Output<String> iname() {
        return this.iname;
    }
    /**
     * Boolean indicating the default VLAN Profile for any device that does not have a profile explicitly assigned
     * 
     */
    @Export(name="isDefault", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isDefault;

    /**
     * @return Boolean indicating the default VLAN Profile for any device that does not have a profile explicitly assigned
     * 
     */
    public Output<Boolean> isDefault() {
        return this.isDefault;
    }
    /**
     * Name of the profile, string length must be from 1 to 255 characters
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the profile, string length must be from 1 to 255 characters
     * 
     */
    public Output<String> name() {
        return this.name;
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
    /**
     * An array of named VLANs
     * 
     */
    @Export(name="vlanGroups", refs={List.class,VlanProfilesVlanGroup.class}, tree="[0,1]")
    private Output<List<VlanProfilesVlanGroup>> vlanGroups;

    /**
     * @return An array of named VLANs
     * 
     */
    public Output<List<VlanProfilesVlanGroup>> vlanGroups() {
        return this.vlanGroups;
    }
    /**
     * An array of named VLANs
     * 
     */
    @Export(name="vlanNames", refs={List.class,VlanProfilesVlanName.class}, tree="[0,1]")
    private Output<List<VlanProfilesVlanName>> vlanNames;

    /**
     * @return An array of named VLANs
     * 
     */
    public Output<List<VlanProfilesVlanName>> vlanNames() {
        return this.vlanNames;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VlanProfiles(String name) {
        this(name, VlanProfilesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VlanProfiles(String name, VlanProfilesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VlanProfiles(String name, VlanProfilesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/vlanProfiles:VlanProfiles", name, args == null ? VlanProfilesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VlanProfiles(String name, Output<String> id, @Nullable VlanProfilesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/vlanProfiles:VlanProfiles", name, state, makeResourceOptions(options, id));
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
    public static VlanProfiles get(String name, Output<String> id, @Nullable VlanProfilesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VlanProfiles(name, id, state, options);
    }
}
