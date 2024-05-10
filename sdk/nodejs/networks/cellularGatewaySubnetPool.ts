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
 * const example = new meraki.networks.CellularGatewaySubnetPool("example", {
 *     cidr: "192.168.0.0/16",
 *     mask: 24,
 *     networkId: "string",
 * });
 * export const merakiNetworksCellularGatewaySubnetPoolExample = example;
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:networks/cellularGatewaySubnetPool:CellularGatewaySubnetPool example "network_id"
 * ```
 */
export class CellularGatewaySubnetPool extends pulumi.CustomResource {
    /**
     * Get an existing CellularGatewaySubnetPool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CellularGatewaySubnetPoolState, opts?: pulumi.CustomResourceOptions): CellularGatewaySubnetPool {
        return new CellularGatewaySubnetPool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/cellularGatewaySubnetPool:CellularGatewaySubnetPool';

    /**
     * Returns true if the given object is an instance of CellularGatewaySubnetPool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CellularGatewaySubnetPool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CellularGatewaySubnetPool.__pulumiType;
    }

    /**
     * CIDR of the pool of subnets. Each MG in this network will automatically pick a subnet from this pool.
     */
    public readonly cidr!: pulumi.Output<string>;
    public /*out*/ readonly deploymentMode!: pulumi.Output<string>;
    /**
     * Mask used for the subnet of all MGs in  this network.
     */
    public readonly mask!: pulumi.Output<number>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    public /*out*/ readonly subnets!: pulumi.Output<outputs.networks.CellularGatewaySubnetPoolSubnet[]>;

    /**
     * Create a CellularGatewaySubnetPool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CellularGatewaySubnetPoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CellularGatewaySubnetPoolArgs | CellularGatewaySubnetPoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CellularGatewaySubnetPoolState | undefined;
            resourceInputs["cidr"] = state ? state.cidr : undefined;
            resourceInputs["deploymentMode"] = state ? state.deploymentMode : undefined;
            resourceInputs["mask"] = state ? state.mask : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["subnets"] = state ? state.subnets : undefined;
        } else {
            const args = argsOrState as CellularGatewaySubnetPoolArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["cidr"] = args ? args.cidr : undefined;
            resourceInputs["mask"] = args ? args.mask : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["deploymentMode"] = undefined /*out*/;
            resourceInputs["subnets"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CellularGatewaySubnetPool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CellularGatewaySubnetPool resources.
 */
export interface CellularGatewaySubnetPoolState {
    /**
     * CIDR of the pool of subnets. Each MG in this network will automatically pick a subnet from this pool.
     */
    cidr?: pulumi.Input<string>;
    deploymentMode?: pulumi.Input<string>;
    /**
     * Mask used for the subnet of all MGs in  this network.
     */
    mask?: pulumi.Input<number>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    subnets?: pulumi.Input<pulumi.Input<inputs.networks.CellularGatewaySubnetPoolSubnet>[]>;
}

/**
 * The set of arguments for constructing a CellularGatewaySubnetPool resource.
 */
export interface CellularGatewaySubnetPoolArgs {
    /**
     * CIDR of the pool of subnets. Each MG in this network will automatically pick a subnet from this pool.
     */
    cidr?: pulumi.Input<string>;
    /**
     * Mask used for the subnet of all MGs in  this network.
     */
    mask?: pulumi.Input<number>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
