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
 * const example = meraki.networks.getSmDevicesCellularUsageHistory({
 *     deviceId: "string",
 *     networkId: "string",
 * });
 * export const merakiNetworksSmDevicesCellularUsageHistoryExample = example.then(example => example.items);
 * ```
 */
export function getSmDevicesCellularUsageHistory(args: GetSmDevicesCellularUsageHistoryArgs, opts?: pulumi.InvokeOptions): Promise<GetSmDevicesCellularUsageHistoryResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getSmDevicesCellularUsageHistory:getSmDevicesCellularUsageHistory", {
        "deviceId": args.deviceId,
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSmDevicesCellularUsageHistory.
 */
export interface GetSmDevicesCellularUsageHistoryArgs {
    /**
     * deviceId path parameter. Device ID
     */
    deviceId: string;
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getSmDevicesCellularUsageHistory.
 */
export interface GetSmDevicesCellularUsageHistoryResult {
    /**
     * deviceId path parameter. Device ID
     */
    readonly deviceId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseSmGetNetworkSmDeviceCellularUsageHistory
     */
    readonly items: outputs.networks.GetSmDevicesCellularUsageHistoryItem[];
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
 * const example = meraki.networks.getSmDevicesCellularUsageHistory({
 *     deviceId: "string",
 *     networkId: "string",
 * });
 * export const merakiNetworksSmDevicesCellularUsageHistoryExample = example.then(example => example.items);
 * ```
 */
export function getSmDevicesCellularUsageHistoryOutput(args: GetSmDevicesCellularUsageHistoryOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSmDevicesCellularUsageHistoryResult> {
    return pulumi.output(args).apply((a: any) => getSmDevicesCellularUsageHistory(a, opts))
}

/**
 * A collection of arguments for invoking getSmDevicesCellularUsageHistory.
 */
export interface GetSmDevicesCellularUsageHistoryOutputArgs {
    /**
     * deviceId path parameter. Device ID
     */
    deviceId: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
