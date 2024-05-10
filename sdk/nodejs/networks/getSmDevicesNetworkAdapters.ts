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
 * const example = meraki.networks.getSmDevicesNetworkAdapters({
 *     deviceId: "string",
 *     networkId: "string",
 * });
 * export const merakiNetworksSmDevicesNetworkAdaptersExample = example.then(example => example.items);
 * ```
 */
export function getSmDevicesNetworkAdapters(args: GetSmDevicesNetworkAdaptersArgs, opts?: pulumi.InvokeOptions): Promise<GetSmDevicesNetworkAdaptersResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getSmDevicesNetworkAdapters:getSmDevicesNetworkAdapters", {
        "deviceId": args.deviceId,
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSmDevicesNetworkAdapters.
 */
export interface GetSmDevicesNetworkAdaptersArgs {
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
 * A collection of values returned by getSmDevicesNetworkAdapters.
 */
export interface GetSmDevicesNetworkAdaptersResult {
    /**
     * deviceId path parameter. Device ID
     */
    readonly deviceId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseSmGetNetworkSmDeviceNetworkAdapters
     */
    readonly items: outputs.networks.GetSmDevicesNetworkAdaptersItem[];
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
 * const example = meraki.networks.getSmDevicesNetworkAdapters({
 *     deviceId: "string",
 *     networkId: "string",
 * });
 * export const merakiNetworksSmDevicesNetworkAdaptersExample = example.then(example => example.items);
 * ```
 */
export function getSmDevicesNetworkAdaptersOutput(args: GetSmDevicesNetworkAdaptersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSmDevicesNetworkAdaptersResult> {
    return pulumi.output(args).apply((a: any) => getSmDevicesNetworkAdapters(a, opts))
}

/**
 * A collection of arguments for invoking getSmDevicesNetworkAdapters.
 */
export interface GetSmDevicesNetworkAdaptersOutputArgs {
    /**
     * deviceId path parameter. Device ID
     */
    deviceId: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
