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
 * const example = meraki.networks.getWirelessUsageHistory({
 *     apTag: "string",
 *     autoResolution: false,
 *     band: "string",
 *     clientId: "string",
 *     deviceSerial: "string",
 *     networkId: "string",
 *     resolution: 1,
 *     ssid: 1,
 *     t0: "string",
 *     t1: "string",
 *     timespan: 1,
 * });
 * export const merakiNetworksWirelessUsageHistoryExample = example.then(example => example.items);
 * ```
 */
export function getWirelessUsageHistory(args: GetWirelessUsageHistoryArgs, opts?: pulumi.InvokeOptions): Promise<GetWirelessUsageHistoryResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getWirelessUsageHistory:getWirelessUsageHistory", {
        "apTag": args.apTag,
        "autoResolution": args.autoResolution,
        "band": args.band,
        "clientId": args.clientId,
        "deviceSerial": args.deviceSerial,
        "networkId": args.networkId,
        "resolution": args.resolution,
        "ssid": args.ssid,
        "t0": args.t0,
        "t1": args.t1,
        "timespan": args.timespan,
    }, opts);
}

/**
 * A collection of arguments for invoking getWirelessUsageHistory.
 */
export interface GetWirelessUsageHistoryArgs {
    /**
     * apTag query parameter. Filter results by AP tag; either :clientId or :deviceSerial must be jointly specified.
     */
    apTag?: string;
    /**
     * autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the 'resolution' parameter. The default setting is false.
     */
    autoResolution?: boolean;
    /**
     * band query parameter. Filter results by band (either '2.4', '5' or '6').
     */
    band?: string;
    /**
     * clientId query parameter. Filter results by network client to return per-device AP usage over time inner joined by the queried client's connection history.
     */
    clientId?: string;
    /**
     * deviceSerial query parameter. Filter results by device. Requires :band.
     */
    deviceSerial?: string;
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
    /**
     * resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 300, 600, 1200, 3600, 14400, 86400. The default is 86400.
     */
    resolution?: number;
    /**
     * ssid query parameter. Filter results by SSID number.
     */
    ssid?: number;
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
 * A collection of values returned by getWirelessUsageHistory.
 */
export interface GetWirelessUsageHistoryResult {
    /**
     * apTag query parameter. Filter results by AP tag; either :clientId or :deviceSerial must be jointly specified.
     */
    readonly apTag?: string;
    /**
     * autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the 'resolution' parameter. The default setting is false.
     */
    readonly autoResolution?: boolean;
    /**
     * band query parameter. Filter results by band (either '2.4', '5' or '6').
     */
    readonly band?: string;
    /**
     * clientId query parameter. Filter results by network client to return per-device AP usage over time inner joined by the queried client's connection history.
     */
    readonly clientId?: string;
    /**
     * deviceSerial query parameter. Filter results by device. Requires :band.
     */
    readonly deviceSerial?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseWirelessGetNetworkWirelessUsageHistory
     */
    readonly items: outputs.networks.GetWirelessUsageHistoryItem[];
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId: string;
    /**
     * resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 300, 600, 1200, 3600, 14400, 86400. The default is 86400.
     */
    readonly resolution?: number;
    /**
     * ssid query parameter. Filter results by SSID number.
     */
    readonly ssid?: number;
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
 * const example = meraki.networks.getWirelessUsageHistory({
 *     apTag: "string",
 *     autoResolution: false,
 *     band: "string",
 *     clientId: "string",
 *     deviceSerial: "string",
 *     networkId: "string",
 *     resolution: 1,
 *     ssid: 1,
 *     t0: "string",
 *     t1: "string",
 *     timespan: 1,
 * });
 * export const merakiNetworksWirelessUsageHistoryExample = example.then(example => example.items);
 * ```
 */
export function getWirelessUsageHistoryOutput(args: GetWirelessUsageHistoryOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetWirelessUsageHistoryResult> {
    return pulumi.output(args).apply((a: any) => getWirelessUsageHistory(a, opts))
}

/**
 * A collection of arguments for invoking getWirelessUsageHistory.
 */
export interface GetWirelessUsageHistoryOutputArgs {
    /**
     * apTag query parameter. Filter results by AP tag; either :clientId or :deviceSerial must be jointly specified.
     */
    apTag?: pulumi.Input<string>;
    /**
     * autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the 'resolution' parameter. The default setting is false.
     */
    autoResolution?: pulumi.Input<boolean>;
    /**
     * band query parameter. Filter results by band (either '2.4', '5' or '6').
     */
    band?: pulumi.Input<string>;
    /**
     * clientId query parameter. Filter results by network client to return per-device AP usage over time inner joined by the queried client's connection history.
     */
    clientId?: pulumi.Input<string>;
    /**
     * deviceSerial query parameter. Filter results by device. Requires :band.
     */
    deviceSerial?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 300, 600, 1200, 3600, 14400, 86400. The default is 86400.
     */
    resolution?: pulumi.Input<number>;
    /**
     * ssid query parameter. Filter results by SSID number.
     */
    ssid?: pulumi.Input<number>;
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
