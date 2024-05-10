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
 * const example = new meraki.devices.WirelessAlternateManagementInterfaceIpv6("example", {
 *     serial: "string",
 *     parameters: {
 *         addresses: [{
 *             address: "2001:db8:3c4d:15::1",
 *             assignmentMode: "static",
 *             gateway: "fe80:db8:c15:c0:d0c::10ca:1d02",
 *             nameservers: {
 *                 addresses: [
 *                     "2001:db8:3c4d:15::1",
 *                     "2001:db8:3c4d:15::1",
 *                 ],
 *             },
 *             prefix: "2001:db8:3c4d:15::/64",
 *             protocol: "ipv6",
 *         }],
 *     },
 * });
 * export const merakiDevicesWirelessAlternateManagementInterfaceIpv6Example = example;
 * ```
 */
export class WirelessAlternateManagementInterfaceIpv6 extends pulumi.CustomResource {
    /**
     * Get an existing WirelessAlternateManagementInterfaceIpv6 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WirelessAlternateManagementInterfaceIpv6State, opts?: pulumi.CustomResourceOptions): WirelessAlternateManagementInterfaceIpv6 {
        return new WirelessAlternateManagementInterfaceIpv6(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:devices/wirelessAlternateManagementInterfaceIpv6:WirelessAlternateManagementInterfaceIpv6';

    /**
     * Returns true if the given object is an instance of WirelessAlternateManagementInterfaceIpv6.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WirelessAlternateManagementInterfaceIpv6 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WirelessAlternateManagementInterfaceIpv6.__pulumiType;
    }

    public /*out*/ readonly item!: pulumi.Output<outputs.devices.WirelessAlternateManagementInterfaceIpv6Item>;
    public readonly parameters!: pulumi.Output<outputs.devices.WirelessAlternateManagementInterfaceIpv6Parameters>;
    /**
     * serial path parameter.
     */
    public readonly serial!: pulumi.Output<string>;

    /**
     * Create a WirelessAlternateManagementInterfaceIpv6 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WirelessAlternateManagementInterfaceIpv6Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WirelessAlternateManagementInterfaceIpv6Args | WirelessAlternateManagementInterfaceIpv6State, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WirelessAlternateManagementInterfaceIpv6State | undefined;
            resourceInputs["item"] = state ? state.item : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["serial"] = state ? state.serial : undefined;
        } else {
            const args = argsOrState as WirelessAlternateManagementInterfaceIpv6Args | undefined;
            if ((!args || args.parameters === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parameters'");
            }
            if ((!args || args.serial === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serial'");
            }
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["serial"] = args ? args.serial : undefined;
            resourceInputs["item"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WirelessAlternateManagementInterfaceIpv6.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WirelessAlternateManagementInterfaceIpv6 resources.
 */
export interface WirelessAlternateManagementInterfaceIpv6State {
    item?: pulumi.Input<inputs.devices.WirelessAlternateManagementInterfaceIpv6Item>;
    parameters?: pulumi.Input<inputs.devices.WirelessAlternateManagementInterfaceIpv6Parameters>;
    /**
     * serial path parameter.
     */
    serial?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WirelessAlternateManagementInterfaceIpv6 resource.
 */
export interface WirelessAlternateManagementInterfaceIpv6Args {
    parameters: pulumi.Input<inputs.devices.WirelessAlternateManagementInterfaceIpv6Parameters>;
    /**
     * serial path parameter.
     */
    serial: pulumi.Input<string>;
}
