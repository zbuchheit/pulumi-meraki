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
 * $ pulumi import meraki:networks/switchAlternateManagementInterface:SwitchAlternateManagementInterface example "network_id"
 * ```
 */
export class SwitchAlternateManagementInterface extends pulumi.CustomResource {
    /**
     * Get an existing SwitchAlternateManagementInterface resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SwitchAlternateManagementInterfaceState, opts?: pulumi.CustomResourceOptions): SwitchAlternateManagementInterface {
        return new SwitchAlternateManagementInterface(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/switchAlternateManagementInterface:SwitchAlternateManagementInterface';

    /**
     * Returns true if the given object is an instance of SwitchAlternateManagementInterface.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SwitchAlternateManagementInterface {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SwitchAlternateManagementInterface.__pulumiType;
    }

    /**
     * Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
     */
    public readonly protocols!: pulumi.Output<string[]>;
    /**
     * Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
     */
    public readonly switches!: pulumi.Output<outputs.networks.SwitchAlternateManagementInterfaceSwitch[]>;
    /**
     * Alternate management VLAN, must be between 1 and 4094
     */
    public readonly vlanId!: pulumi.Output<number>;

    /**
     * Create a SwitchAlternateManagementInterface resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SwitchAlternateManagementInterfaceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SwitchAlternateManagementInterfaceArgs | SwitchAlternateManagementInterfaceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SwitchAlternateManagementInterfaceState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["protocols"] = state ? state.protocols : undefined;
            resourceInputs["switches"] = state ? state.switches : undefined;
            resourceInputs["vlanId"] = state ? state.vlanId : undefined;
        } else {
            const args = argsOrState as SwitchAlternateManagementInterfaceArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["protocols"] = args ? args.protocols : undefined;
            resourceInputs["switches"] = args ? args.switches : undefined;
            resourceInputs["vlanId"] = args ? args.vlanId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SwitchAlternateManagementInterface.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SwitchAlternateManagementInterface resources.
 */
export interface SwitchAlternateManagementInterfaceState {
    /**
     * Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
     */
    protocols?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
     */
    switches?: pulumi.Input<pulumi.Input<inputs.networks.SwitchAlternateManagementInterfaceSwitch>[]>;
    /**
     * Alternate management VLAN, must be between 1 and 4094
     */
    vlanId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a SwitchAlternateManagementInterface resource.
 */
export interface SwitchAlternateManagementInterfaceArgs {
    /**
     * Boolean value to enable or disable AMI configuration. If enabled, VLAN and protocols must be set
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * Can be one or more of the following values: 'radius', 'snmp' or 'syslog'
     */
    protocols?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Array of switch serial number and IP assignment. If parameter is present, it cannot have empty body. Note: switches parameter is not applicable for template networks, in other words, do not put 'switches' in the body when updating template networks. Also, an empty 'switches' array will remove all previous assignments
     */
    switches?: pulumi.Input<pulumi.Input<inputs.networks.SwitchAlternateManagementInterfaceSwitch>[]>;
    /**
     * Alternate management VLAN, must be between 1 and 4094
     */
    vlanId?: pulumi.Input<number>;
}