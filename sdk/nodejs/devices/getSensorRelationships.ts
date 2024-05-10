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
 * const example = meraki.devices.getSensorRelationships({
 *     serial: "string",
 * });
 * export const merakiDevicesSensorRelationshipsExample = example.then(example => example.item);
 * ```
 */
export function getSensorRelationships(args: GetSensorRelationshipsArgs, opts?: pulumi.InvokeOptions): Promise<GetSensorRelationshipsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:devices/getSensorRelationships:getSensorRelationships", {
        "serial": args.serial,
    }, opts);
}

/**
 * A collection of arguments for invoking getSensorRelationships.
 */
export interface GetSensorRelationshipsArgs {
    /**
     * serial path parameter.
     */
    serial: string;
}

/**
 * A collection of values returned by getSensorRelationships.
 */
export interface GetSensorRelationshipsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.devices.GetSensorRelationshipsItem;
    /**
     * serial path parameter.
     */
    readonly serial: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.devices.getSensorRelationships({
 *     serial: "string",
 * });
 * export const merakiDevicesSensorRelationshipsExample = example.then(example => example.item);
 * ```
 */
export function getSensorRelationshipsOutput(args: GetSensorRelationshipsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSensorRelationshipsResult> {
    return pulumi.output(args).apply((a: any) => getSensorRelationships(a, opts))
}

/**
 * A collection of arguments for invoking getSensorRelationships.
 */
export interface GetSensorRelationshipsOutputArgs {
    /**
     * serial path parameter.
     */
    serial: pulumi.Input<string>;
}
