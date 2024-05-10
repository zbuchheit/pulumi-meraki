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
 * const example = meraki.networks.getSmDevicesCerts({
 *     deviceId: "string",
 *     networkId: "string",
 * });
 * export const merakiNetworksSmDevicesCertsExample = example.then(example => example.items);
 * ```
 */
export function getSmDevicesCerts(args: GetSmDevicesCertsArgs, opts?: pulumi.InvokeOptions): Promise<GetSmDevicesCertsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getSmDevicesCerts:getSmDevicesCerts", {
        "deviceId": args.deviceId,
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSmDevicesCerts.
 */
export interface GetSmDevicesCertsArgs {
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
 * A collection of values returned by getSmDevicesCerts.
 */
export interface GetSmDevicesCertsResult {
    /**
     * deviceId path parameter. Device ID
     */
    readonly deviceId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseSmGetNetworkSmDeviceCerts
     */
    readonly items: outputs.networks.GetSmDevicesCertsItem[];
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
 * const example = meraki.networks.getSmDevicesCerts({
 *     deviceId: "string",
 *     networkId: "string",
 * });
 * export const merakiNetworksSmDevicesCertsExample = example.then(example => example.items);
 * ```
 */
export function getSmDevicesCertsOutput(args: GetSmDevicesCertsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSmDevicesCertsResult> {
    return pulumi.output(args).apply((a: any) => getSmDevicesCerts(a, opts))
}

/**
 * A collection of arguments for invoking getSmDevicesCerts.
 */
export interface GetSmDevicesCertsOutputArgs {
    /**
     * deviceId path parameter. Device ID
     */
    deviceId: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
