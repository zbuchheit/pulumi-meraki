// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
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
 * const example = new meraki.networks.ApplianceWarmSpareSwap("example", {networkId: "string"});
 * export const merakiNetworksApplianceWarmSpareSwapExample = example;
 * ```
 */
export class ApplianceWarmSpareSwap extends pulumi.CustomResource {
    /**
     * Get an existing ApplianceWarmSpareSwap resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplianceWarmSpareSwapState, opts?: pulumi.CustomResourceOptions): ApplianceWarmSpareSwap {
        return new ApplianceWarmSpareSwap(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/applianceWarmSpareSwap:ApplianceWarmSpareSwap';

    /**
     * Returns true if the given object is an instance of ApplianceWarmSpareSwap.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplianceWarmSpareSwap {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplianceWarmSpareSwap.__pulumiType;
    }

    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;

    /**
     * Create a ApplianceWarmSpareSwap resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplianceWarmSpareSwapArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplianceWarmSpareSwapArgs | ApplianceWarmSpareSwapState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplianceWarmSpareSwapState | undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
        } else {
            const args = argsOrState as ApplianceWarmSpareSwapArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["networkId"] = args ? args.networkId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApplianceWarmSpareSwap.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplianceWarmSpareSwap resources.
 */
export interface ApplianceWarmSpareSwapState {
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApplianceWarmSpareSwap resource.
 */
export interface ApplianceWarmSpareSwapArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
