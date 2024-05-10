// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ~>Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
 * already existed previously.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = new meraki.networks.FirmwareUpgradesStagedEventsDefer("example", {networkId: "string"});
 * export const merakiNetworksFirmwareUpgradesStagedEventsDeferExample = example;
 * ```
 */
export class FirmwareUpgradesStagedEventsDefer extends pulumi.CustomResource {
    /**
     * Get an existing FirmwareUpgradesStagedEventsDefer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FirmwareUpgradesStagedEventsDeferState, opts?: pulumi.CustomResourceOptions): FirmwareUpgradesStagedEventsDefer {
        return new FirmwareUpgradesStagedEventsDefer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/firmwareUpgradesStagedEventsDefer:FirmwareUpgradesStagedEventsDefer';

    /**
     * Returns true if the given object is an instance of FirmwareUpgradesStagedEventsDefer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FirmwareUpgradesStagedEventsDefer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FirmwareUpgradesStagedEventsDefer.__pulumiType;
    }

    public /*out*/ readonly item!: pulumi.Output<outputs.networks.FirmwareUpgradesStagedEventsDeferItem>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;

    /**
     * Create a FirmwareUpgradesStagedEventsDefer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FirmwareUpgradesStagedEventsDeferArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FirmwareUpgradesStagedEventsDeferArgs | FirmwareUpgradesStagedEventsDeferState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FirmwareUpgradesStagedEventsDeferState | undefined;
            resourceInputs["item"] = state ? state.item : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
        } else {
            const args = argsOrState as FirmwareUpgradesStagedEventsDeferArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["item"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FirmwareUpgradesStagedEventsDefer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FirmwareUpgradesStagedEventsDefer resources.
 */
export interface FirmwareUpgradesStagedEventsDeferState {
    item?: pulumi.Input<inputs.networks.FirmwareUpgradesStagedEventsDeferItem>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FirmwareUpgradesStagedEventsDefer resource.
 */
export interface FirmwareUpgradesStagedEventsDeferArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
