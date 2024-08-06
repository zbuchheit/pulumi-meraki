// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.FirmwareUpgradesStagedGroupsArgs;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedGroupsState;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesStagedGroupsAssignedDevices;
import java.lang.Boolean;
import java.lang.String;
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
 * import com.pulumi.meraki.networks.FirmwareUpgradesStagedGroups;
 * import com.pulumi.meraki.networks.FirmwareUpgradesStagedGroupsArgs;
 * import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedGroupsAssignedDevicesArgs;
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
 *         var example = new FirmwareUpgradesStagedGroups("example", FirmwareUpgradesStagedGroupsArgs.builder()
 *             .assignedDevices(FirmwareUpgradesStagedGroupsAssignedDevicesArgs.builder()
 *                 .devices(FirmwareUpgradesStagedGroupsAssignedDevicesDeviceArgs.builder()
 *                     .name("Device Name")
 *                     .serial("Q234-ABCD-5678")
 *                     .build())
 *                 .switch_stacks(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                 .build())
 *             .description("The description of the group")
 *             .isDefault(false)
 *             .name("My Staged Upgrade Group")
 *             .networkId("string")
 *             .build());
 * 
 *         ctx.export("merakiNetworksFirmwareUpgradesStagedGroupsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/firmwareUpgradesStagedGroups:FirmwareUpgradesStagedGroups example &#34;group_id,network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/firmwareUpgradesStagedGroups:FirmwareUpgradesStagedGroups")
public class FirmwareUpgradesStagedGroups extends com.pulumi.resources.CustomResource {
    /**
     * The devices and Switch Stacks assigned to the Group
     * 
     */
    @Export(name="assignedDevices", refs={FirmwareUpgradesStagedGroupsAssignedDevices.class}, tree="[0]")
    private Output<FirmwareUpgradesStagedGroupsAssignedDevices> assignedDevices;

    /**
     * @return The devices and Switch Stacks assigned to the Group
     * 
     */
    public Output<FirmwareUpgradesStagedGroupsAssignedDevices> assignedDevices() {
        return this.assignedDevices;
    }
    /**
     * Description of the Staged Upgrade Group
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Description of the Staged Upgrade Group
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Id of staged upgrade group
     * 
     */
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output<String> groupId;

    /**
     * @return Id of staged upgrade group
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * Boolean indicating the default Group. Any device that does not have a group explicitly assigned will upgrade with this group
     * 
     */
    @Export(name="isDefault", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isDefault;

    /**
     * @return Boolean indicating the default Group. Any device that does not have a group explicitly assigned will upgrade with this group
     * 
     */
    public Output<Boolean> isDefault() {
        return this.isDefault;
    }
    /**
     * Name of the Staged Upgrade Group
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Staged Upgrade Group
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirmwareUpgradesStagedGroups(String name) {
        this(name, FirmwareUpgradesStagedGroupsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirmwareUpgradesStagedGroups(String name, FirmwareUpgradesStagedGroupsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirmwareUpgradesStagedGroups(String name, FirmwareUpgradesStagedGroupsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/firmwareUpgradesStagedGroups:FirmwareUpgradesStagedGroups", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private FirmwareUpgradesStagedGroups(String name, Output<String> id, @Nullable FirmwareUpgradesStagedGroupsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/firmwareUpgradesStagedGroups:FirmwareUpgradesStagedGroups", name, state, makeResourceOptions(options, id));
    }

    private static FirmwareUpgradesStagedGroupsArgs makeArgs(FirmwareUpgradesStagedGroupsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FirmwareUpgradesStagedGroupsArgs.Empty : args;
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
    public static FirmwareUpgradesStagedGroups get(String name, Output<String> id, @Nullable FirmwareUpgradesStagedGroupsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirmwareUpgradesStagedGroups(name, id, state, options);
    }
}
