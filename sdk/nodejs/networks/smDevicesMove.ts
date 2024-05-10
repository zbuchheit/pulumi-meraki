// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ~>Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
 * already existed previously.
 */
export class SmDevicesMove extends pulumi.CustomResource {
    /**
     * Get an existing SmDevicesMove resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SmDevicesMoveState, opts?: pulumi.CustomResourceOptions): SmDevicesMove {
        return new SmDevicesMove(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/smDevicesMove:SmDevicesMove';

    /**
     * Returns true if the given object is an instance of SmDevicesMove.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SmDevicesMove {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SmDevicesMove.__pulumiType;
    }

    public /*out*/ readonly item!: pulumi.Output<outputs.networks.SmDevicesMoveItem>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    public readonly parameters!: pulumi.Output<outputs.networks.SmDevicesMoveParameters>;

    /**
     * Create a SmDevicesMove resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SmDevicesMoveArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SmDevicesMoveArgs | SmDevicesMoveState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SmDevicesMoveState | undefined;
            resourceInputs["item"] = state ? state.item : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
        } else {
            const args = argsOrState as SmDevicesMoveArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            if ((!args || args.parameters === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parameters'");
            }
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["item"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SmDevicesMove.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SmDevicesMove resources.
 */
export interface SmDevicesMoveState {
    item?: pulumi.Input<inputs.networks.SmDevicesMoveItem>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    parameters?: pulumi.Input<inputs.networks.SmDevicesMoveParameters>;
}

/**
 * The set of arguments for constructing a SmDevicesMove resource.
 */
export interface SmDevicesMoveArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    parameters: pulumi.Input<inputs.networks.SmDevicesMoveParameters>;
}
