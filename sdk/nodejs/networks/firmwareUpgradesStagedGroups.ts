// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:networks/firmwareUpgradesStagedGroups:FirmwareUpgradesStagedGroups example "group_id,network_id"
 * ```
 */
export class FirmwareUpgradesStagedGroups extends pulumi.CustomResource {
    /**
     * Get an existing FirmwareUpgradesStagedGroups resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FirmwareUpgradesStagedGroupsState, opts?: pulumi.CustomResourceOptions): FirmwareUpgradesStagedGroups {
        return new FirmwareUpgradesStagedGroups(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/firmwareUpgradesStagedGroups:FirmwareUpgradesStagedGroups';

    /**
     * Returns true if the given object is an instance of FirmwareUpgradesStagedGroups.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FirmwareUpgradesStagedGroups {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FirmwareUpgradesStagedGroups.__pulumiType;
    }

    /**
     * The devices and Switch Stacks assigned to the Group
     */
    public readonly assignedDevices!: pulumi.Output<outputs.networks.FirmwareUpgradesStagedGroupsAssignedDevices>;
    /**
     * Description of the Staged Upgrade Group
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Id of staged upgrade group
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * Boolean indicating the default Group. Any device that does not have a group explicitly assigned will upgrade with this group
     */
    public readonly isDefault!: pulumi.Output<boolean>;
    /**
     * Name of the Staged Upgrade Group
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;

    /**
     * Create a FirmwareUpgradesStagedGroups resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FirmwareUpgradesStagedGroupsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FirmwareUpgradesStagedGroupsArgs | FirmwareUpgradesStagedGroupsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FirmwareUpgradesStagedGroupsState | undefined;
            resourceInputs["assignedDevices"] = state ? state.assignedDevices : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["isDefault"] = state ? state.isDefault : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
        } else {
            const args = argsOrState as FirmwareUpgradesStagedGroupsArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["assignedDevices"] = args ? args.assignedDevices : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["isDefault"] = args ? args.isDefault : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FirmwareUpgradesStagedGroups.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FirmwareUpgradesStagedGroups resources.
 */
export interface FirmwareUpgradesStagedGroupsState {
    /**
     * The devices and Switch Stacks assigned to the Group
     */
    assignedDevices?: pulumi.Input<inputs.networks.FirmwareUpgradesStagedGroupsAssignedDevices>;
    /**
     * Description of the Staged Upgrade Group
     */
    description?: pulumi.Input<string>;
    /**
     * Id of staged upgrade group
     */
    groupId?: pulumi.Input<string>;
    /**
     * Boolean indicating the default Group. Any device that does not have a group explicitly assigned will upgrade with this group
     */
    isDefault?: pulumi.Input<boolean>;
    /**
     * Name of the Staged Upgrade Group
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FirmwareUpgradesStagedGroups resource.
 */
export interface FirmwareUpgradesStagedGroupsArgs {
    /**
     * The devices and Switch Stacks assigned to the Group
     */
    assignedDevices?: pulumi.Input<inputs.networks.FirmwareUpgradesStagedGroupsAssignedDevices>;
    /**
     * Description of the Staged Upgrade Group
     */
    description?: pulumi.Input<string>;
    /**
     * Id of staged upgrade group
     */
    groupId?: pulumi.Input<string>;
    /**
     * Boolean indicating the default Group. Any device that does not have a group explicitly assigned will upgrade with this group
     */
    isDefault?: pulumi.Input<boolean>;
    /**
     * Name of the Staged Upgrade Group
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
