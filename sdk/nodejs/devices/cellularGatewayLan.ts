// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = new meraki.devices.CellularGatewayLan("example", {
 *     fixedIpAssignments: [{
 *         ip: "192.168.0.10",
 *         mac: "0b:00:00:00:00:ac",
 *         name: "server 1",
 *     }],
 *     reservedIpRanges: [{
 *         comment: "A reserved IP range",
 *         end: "192.168.1.1",
 *         start: "192.168.1.0",
 *     }],
 *     serial: "string",
 * });
 * export const merakiDevicesCellularGatewayLanExample = example;
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:devices/cellularGatewayLan:CellularGatewayLan example "serial"
 * ```
 */
export class CellularGatewayLan extends pulumi.CustomResource {
    /**
     * Get an existing CellularGatewayLan resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CellularGatewayLanState, opts?: pulumi.CustomResourceOptions): CellularGatewayLan {
        return new CellularGatewayLan(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:devices/cellularGatewayLan:CellularGatewayLan';

    /**
     * Returns true if the given object is an instance of CellularGatewayLan.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CellularGatewayLan {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CellularGatewayLan.__pulumiType;
    }

    /**
     * Lan IP of the MG
     */
    public /*out*/ readonly deviceLanIp!: pulumi.Output<string>;
    /**
     * Name of the MG.
     */
    public /*out*/ readonly deviceName!: pulumi.Output<string>;
    /**
     * Subnet configuration of the MG.
     */
    public /*out*/ readonly deviceSubnet!: pulumi.Output<string>;
    /**
     * list of all fixed IP assignments for a single MG
     */
    public readonly fixedIpAssignments!: pulumi.Output<outputs.devices.CellularGatewayLanFixedIpAssignment[]>;
    /**
     * list of all reserved IP ranges for a single MG
     */
    public readonly reservedIpRanges!: pulumi.Output<outputs.devices.CellularGatewayLanReservedIpRange[]>;
    /**
     * serial path parameter.
     */
    public readonly serial!: pulumi.Output<string>;

    /**
     * Create a CellularGatewayLan resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CellularGatewayLanArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CellularGatewayLanArgs | CellularGatewayLanState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CellularGatewayLanState | undefined;
            resourceInputs["deviceLanIp"] = state ? state.deviceLanIp : undefined;
            resourceInputs["deviceName"] = state ? state.deviceName : undefined;
            resourceInputs["deviceSubnet"] = state ? state.deviceSubnet : undefined;
            resourceInputs["fixedIpAssignments"] = state ? state.fixedIpAssignments : undefined;
            resourceInputs["reservedIpRanges"] = state ? state.reservedIpRanges : undefined;
            resourceInputs["serial"] = state ? state.serial : undefined;
        } else {
            const args = argsOrState as CellularGatewayLanArgs | undefined;
            if ((!args || args.serial === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serial'");
            }
            resourceInputs["fixedIpAssignments"] = args ? args.fixedIpAssignments : undefined;
            resourceInputs["reservedIpRanges"] = args ? args.reservedIpRanges : undefined;
            resourceInputs["serial"] = args ? args.serial : undefined;
            resourceInputs["deviceLanIp"] = undefined /*out*/;
            resourceInputs["deviceName"] = undefined /*out*/;
            resourceInputs["deviceSubnet"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CellularGatewayLan.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CellularGatewayLan resources.
 */
export interface CellularGatewayLanState {
    /**
     * Lan IP of the MG
     */
    deviceLanIp?: pulumi.Input<string>;
    /**
     * Name of the MG.
     */
    deviceName?: pulumi.Input<string>;
    /**
     * Subnet configuration of the MG.
     */
    deviceSubnet?: pulumi.Input<string>;
    /**
     * list of all fixed IP assignments for a single MG
     */
    fixedIpAssignments?: pulumi.Input<pulumi.Input<inputs.devices.CellularGatewayLanFixedIpAssignment>[]>;
    /**
     * list of all reserved IP ranges for a single MG
     */
    reservedIpRanges?: pulumi.Input<pulumi.Input<inputs.devices.CellularGatewayLanReservedIpRange>[]>;
    /**
     * serial path parameter.
     */
    serial?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CellularGatewayLan resource.
 */
export interface CellularGatewayLanArgs {
    /**
     * list of all fixed IP assignments for a single MG
     */
    fixedIpAssignments?: pulumi.Input<pulumi.Input<inputs.devices.CellularGatewayLanFixedIpAssignment>[]>;
    /**
     * list of all reserved IP ranges for a single MG
     */
    reservedIpRanges?: pulumi.Input<pulumi.Input<inputs.devices.CellularGatewayLanReservedIpRange>[]>;
    /**
     * serial path parameter.
     */
    serial: pulumi.Input<string>;
}
