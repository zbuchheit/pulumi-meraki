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
 * const example = new meraki.devices.ApplianceVmxAuthenticationToken("example", {serial: "string"});
 * export const merakiDevicesApplianceVmxAuthenticationTokenExample = example;
 * ```
 */
export class ApplianceVmxAuthenticationToken extends pulumi.CustomResource {
    /**
     * Get an existing ApplianceVmxAuthenticationToken resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplianceVmxAuthenticationTokenState, opts?: pulumi.CustomResourceOptions): ApplianceVmxAuthenticationToken {
        return new ApplianceVmxAuthenticationToken(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:devices/applianceVmxAuthenticationToken:ApplianceVmxAuthenticationToken';

    /**
     * Returns true if the given object is an instance of ApplianceVmxAuthenticationToken.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplianceVmxAuthenticationToken {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplianceVmxAuthenticationToken.__pulumiType;
    }

    public /*out*/ readonly item!: pulumi.Output<outputs.devices.ApplianceVmxAuthenticationTokenItem>;
    /**
     * serial path parameter.
     */
    public readonly serial!: pulumi.Output<string>;

    /**
     * Create a ApplianceVmxAuthenticationToken resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplianceVmxAuthenticationTokenArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplianceVmxAuthenticationTokenArgs | ApplianceVmxAuthenticationTokenState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplianceVmxAuthenticationTokenState | undefined;
            resourceInputs["item"] = state ? state.item : undefined;
            resourceInputs["serial"] = state ? state.serial : undefined;
        } else {
            const args = argsOrState as ApplianceVmxAuthenticationTokenArgs | undefined;
            if ((!args || args.serial === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serial'");
            }
            resourceInputs["serial"] = args ? args.serial : undefined;
            resourceInputs["item"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApplianceVmxAuthenticationToken.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplianceVmxAuthenticationToken resources.
 */
export interface ApplianceVmxAuthenticationTokenState {
    item?: pulumi.Input<inputs.devices.ApplianceVmxAuthenticationTokenItem>;
    /**
     * serial path parameter.
     */
    serial?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApplianceVmxAuthenticationToken resource.
 */
export interface ApplianceVmxAuthenticationTokenArgs {
    /**
     * serial path parameter.
     */
    serial: pulumi.Input<string>;
}
