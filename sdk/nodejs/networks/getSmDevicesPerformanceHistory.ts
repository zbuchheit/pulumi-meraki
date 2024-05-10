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
 * const example = meraki.networks.getSmDevicesPerformanceHistory({
 *     deviceId: "string",
 *     endingBefore: "string",
 *     networkId: "string",
 *     perPage: 1,
 *     startingAfter: "string",
 * });
 * export const merakiNetworksSmDevicesPerformanceHistoryExample = example.then(example => example.items);
 * ```
 */
export function getSmDevicesPerformanceHistory(args: GetSmDevicesPerformanceHistoryArgs, opts?: pulumi.InvokeOptions): Promise<GetSmDevicesPerformanceHistoryResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getSmDevicesPerformanceHistory:getSmDevicesPerformanceHistory", {
        "deviceId": args.deviceId,
        "endingBefore": args.endingBefore,
        "networkId": args.networkId,
        "perPage": args.perPage,
        "startingAfter": args.startingAfter,
    }, opts);
}

/**
 * A collection of arguments for invoking getSmDevicesPerformanceHistory.
 */
export interface GetSmDevicesPerformanceHistoryArgs {
    /**
     * deviceId path parameter. Device ID
     */
    deviceId: string;
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: string;
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    perPage?: number;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: string;
}

/**
 * A collection of values returned by getSmDevicesPerformanceHistory.
 */
export interface GetSmDevicesPerformanceHistoryResult {
    /**
     * deviceId path parameter. Device ID
     */
    readonly deviceId: string;
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly endingBefore?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseSmGetNetworkSmDevicePerformanceHistory
     */
    readonly items: outputs.networks.GetSmDevicesPerformanceHistoryItem[];
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    readonly perPage?: number;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly startingAfter?: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.networks.getSmDevicesPerformanceHistory({
 *     deviceId: "string",
 *     endingBefore: "string",
 *     networkId: "string",
 *     perPage: 1,
 *     startingAfter: "string",
 * });
 * export const merakiNetworksSmDevicesPerformanceHistoryExample = example.then(example => example.items);
 * ```
 */
export function getSmDevicesPerformanceHistoryOutput(args: GetSmDevicesPerformanceHistoryOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSmDevicesPerformanceHistoryResult> {
    return pulumi.output(args).apply((a: any) => getSmDevicesPerformanceHistory(a, opts))
}

/**
 * A collection of arguments for invoking getSmDevicesPerformanceHistory.
 */
export interface GetSmDevicesPerformanceHistoryOutputArgs {
    /**
     * deviceId path parameter. Device ID
     */
    deviceId: pulumi.Input<string>;
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    perPage?: pulumi.Input<number>;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: pulumi.Input<string>;
}
