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
 * const example = meraki.organizations.getSensorReadingsLatest({
 *     endingBefore: "string",
 *     metrics: ["string"],
 *     networkIds: ["string"],
 *     organizationId: "string",
 *     perPage: 1,
 *     serials: ["string"],
 *     startingAfter: "string",
 * });
 * export const merakiOrganizationsSensorReadingsLatestExample = example.then(example => example.items);
 * ```
 */
export function getSensorReadingsLatest(args: GetSensorReadingsLatestArgs, opts?: pulumi.InvokeOptions): Promise<GetSensorReadingsLatestResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getSensorReadingsLatest:getSensorReadingsLatest", {
        "endingBefore": args.endingBefore,
        "metrics": args.metrics,
        "networkIds": args.networkIds,
        "organizationId": args.organizationId,
        "perPage": args.perPage,
        "serials": args.serials,
        "startingAfter": args.startingAfter,
    }, opts);
}

/**
 * A collection of arguments for invoking getSensorReadingsLatest.
 */
export interface GetSensorReadingsLatestArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: string;
    /**
     * metrics query parameter. Types of sensor readings to retrieve. If no metrics are supplied, all available types of readings will be retrieved. Allowed values are apparentPower, battery, button, co2, current, door, downstreamPower, frequency, humidity, indoorAirQuality, noise, pm25, powerFactor, realPower, remoteLockoutSwitch, temperature, tvoc, voltage, and water.
     */
    metrics?: string[];
    /**
     * networkIds query parameter. Optional parameter to filter readings by network.
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
     * serials query parameter. Optional parameter to filter readings by sensor.
     */
    serials?: string[];
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: string;
}

/**
 * A collection of values returned by getSensorReadingsLatest.
 */
export interface GetSensorReadingsLatestResult {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly endingBefore?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseSensorGetOrganizationSensorReadingsLatest
     */
    readonly items: outputs.organizations.GetSensorReadingsLatestItem[];
    /**
     * metrics query parameter. Types of sensor readings to retrieve. If no metrics are supplied, all available types of readings will be retrieved. Allowed values are apparentPower, battery, button, co2, current, door, downstreamPower, frequency, humidity, indoorAirQuality, noise, pm25, powerFactor, realPower, remoteLockoutSwitch, temperature, tvoc, voltage, and water.
     */
    readonly metrics?: string[];
    /**
     * networkIds query parameter. Optional parameter to filter readings by network.
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
     * serials query parameter. Optional parameter to filter readings by sensor.
     */
    readonly serials?: string[];
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
 * const example = meraki.organizations.getSensorReadingsLatest({
 *     endingBefore: "string",
 *     metrics: ["string"],
 *     networkIds: ["string"],
 *     organizationId: "string",
 *     perPage: 1,
 *     serials: ["string"],
 *     startingAfter: "string",
 * });
 * export const merakiOrganizationsSensorReadingsLatestExample = example.then(example => example.items);
 * ```
 */
export function getSensorReadingsLatestOutput(args: GetSensorReadingsLatestOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSensorReadingsLatestResult> {
    return pulumi.output(args).apply((a: any) => getSensorReadingsLatest(a, opts))
}

/**
 * A collection of arguments for invoking getSensorReadingsLatest.
 */
export interface GetSensorReadingsLatestOutputArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: pulumi.Input<string>;
    /**
     * metrics query parameter. Types of sensor readings to retrieve. If no metrics are supplied, all available types of readings will be retrieved. Allowed values are apparentPower, battery, button, co2, current, door, downstreamPower, frequency, humidity, indoorAirQuality, noise, pm25, powerFactor, realPower, remoteLockoutSwitch, temperature, tvoc, voltage, and water.
     */
    metrics?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * networkIds query parameter. Optional parameter to filter readings by network.
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
     * serials query parameter. Optional parameter to filter readings by sensor.
     */
    serials?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: pulumi.Input<string>;
}
