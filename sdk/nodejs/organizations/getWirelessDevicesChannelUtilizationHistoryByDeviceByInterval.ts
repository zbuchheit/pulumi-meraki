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
 * const example = meraki.organizations.getWirelessDevicesChannelUtilizationHistoryByDeviceByInterval({
 *     endingBefore: "string",
 *     interval: 1,
 *     networkIds: ["string"],
 *     organizationId: "string",
 *     perPage: 1,
 *     serials: ["string"],
 *     startingAfter: "string",
 *     t0: "string",
 *     t1: "string",
 *     timespan: 1,
 * });
 * export const merakiOrganizationsWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalExample = example.then(example => example.items);
 * ```
 */
export function getWirelessDevicesChannelUtilizationHistoryByDeviceByInterval(args: GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalArgs, opts?: pulumi.InvokeOptions): Promise<GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getWirelessDevicesChannelUtilizationHistoryByDeviceByInterval:getWirelessDevicesChannelUtilizationHistoryByDeviceByInterval", {
        "endingBefore": args.endingBefore,
        "interval": args.interval,
        "networkIds": args.networkIds,
        "organizationId": args.organizationId,
        "perPage": args.perPage,
        "serials": args.serials,
        "startingAfter": args.startingAfter,
        "t0": args.t0,
        "t1": args.t1,
        "timespan": args.timespan,
    }, opts);
}

/**
 * A collection of arguments for invoking getWirelessDevicesChannelUtilizationHistoryByDeviceByInterval.
 */
export interface GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: string;
    /**
     * interval query parameter. The time interval in seconds for returned data. The valid intervals are: 300, 600, 3600, 7200, 14400, 21600. The default is 3600.
     */
    interval?: number;
    /**
     * networkIds query parameter. Filter results by network.
     */
    networkIds?: string[];
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    perPage?: number;
    /**
     * serials query parameter. Filter results by device.
     */
    serials?: string[];
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: string;
    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     */
    t0?: string;
    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     */
    t1?: string;
    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
     */
    timespan?: number;
}

/**
 * A collection of values returned by getWirelessDevicesChannelUtilizationHistoryByDeviceByInterval.
 */
export interface GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalResult {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly endingBefore?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * interval query parameter. The time interval in seconds for returned data. The valid intervals are: 300, 600, 3600, 7200, 14400, 21600. The default is 3600.
     */
    readonly interval?: number;
    /**
     * Array of ResponseWirelessGetOrganizationWirelessDevicesChannelUtilizationHistoryByDeviceByInterval
     */
    readonly items: outputs.organizations.GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalItem[];
    /**
     * networkIds query parameter. Filter results by network.
     */
    readonly networkIds?: string[];
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    readonly perPage?: number;
    /**
     * serials query parameter. Filter results by device.
     */
    readonly serials?: string[];
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly startingAfter?: string;
    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     */
    readonly t0?: string;
    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     */
    readonly t1?: string;
    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
     */
    readonly timespan?: number;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.organizations.getWirelessDevicesChannelUtilizationHistoryByDeviceByInterval({
 *     endingBefore: "string",
 *     interval: 1,
 *     networkIds: ["string"],
 *     organizationId: "string",
 *     perPage: 1,
 *     serials: ["string"],
 *     startingAfter: "string",
 *     t0: "string",
 *     t1: "string",
 *     timespan: 1,
 * });
 * export const merakiOrganizationsWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalExample = example.then(example => example.items);
 * ```
 */
export function getWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalOutput(args: GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalResult> {
    return pulumi.output(args).apply((a: any) => getWirelessDevicesChannelUtilizationHistoryByDeviceByInterval(a, opts))
}

/**
 * A collection of arguments for invoking getWirelessDevicesChannelUtilizationHistoryByDeviceByInterval.
 */
export interface GetWirelessDevicesChannelUtilizationHistoryByDeviceByIntervalOutputArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: pulumi.Input<string>;
    /**
     * interval query parameter. The time interval in seconds for returned data. The valid intervals are: 300, 600, 3600, 7200, 14400, 21600. The default is 3600.
     */
    interval?: pulumi.Input<number>;
    /**
     * networkIds query parameter. Filter results by network.
     */
    networkIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    perPage?: pulumi.Input<number>;
    /**
     * serials query parameter. Filter results by device.
     */
    serials?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: pulumi.Input<string>;
    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     */
    t0?: pulumi.Input<string>;
    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     */
    t1?: pulumi.Input<string>;
    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
     */
    timespan?: pulumi.Input<number>;
}
