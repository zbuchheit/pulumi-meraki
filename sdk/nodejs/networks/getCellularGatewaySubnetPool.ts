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
 * const example = meraki.networks.getCellularGatewaySubnetPool({
 *     networkId: "string",
 * });
 * export const merakiNetworksCellularGatewaySubnetPoolExample = example.then(example => example.item);
 * ```
 */
export function getCellularGatewaySubnetPool(args: GetCellularGatewaySubnetPoolArgs, opts?: pulumi.InvokeOptions): Promise<GetCellularGatewaySubnetPoolResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getCellularGatewaySubnetPool:getCellularGatewaySubnetPool", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCellularGatewaySubnetPool.
 */
export interface GetCellularGatewaySubnetPoolArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getCellularGatewaySubnetPool.
 */
export interface GetCellularGatewaySubnetPoolResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetCellularGatewaySubnetPoolItem;
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.networks.getCellularGatewaySubnetPool({
 *     networkId: "string",
 * });
 * export const merakiNetworksCellularGatewaySubnetPoolExample = example.then(example => example.item);
 * ```
 */
export function getCellularGatewaySubnetPoolOutput(args: GetCellularGatewaySubnetPoolOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCellularGatewaySubnetPoolResult> {
    return pulumi.output(args).apply((a: any) => getCellularGatewaySubnetPool(a, opts))
}

/**
 * A collection of arguments for invoking getCellularGatewaySubnetPool.
 */
export interface GetCellularGatewaySubnetPoolOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
