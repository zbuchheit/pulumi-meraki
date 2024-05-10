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
 * const example = meraki.organizations.getApiRequestsOverview({
 *     organizationId: "string",
 *     t0: "string",
 *     t1: "string",
 *     timespan: 1,
 * });
 * export const merakiOrganizationsApiRequestsOverviewExample = example.then(example => example.item);
 * ```
 */
export function getApiRequestsOverview(args: GetApiRequestsOverviewArgs, opts?: pulumi.InvokeOptions): Promise<GetApiRequestsOverviewResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getApiRequestsOverview:getApiRequestsOverview", {
        "organizationId": args.organizationId,
        "t0": args.t0,
        "t1": args.t1,
        "timespan": args.timespan,
    }, opts);
}

/**
 * A collection of arguments for invoking getApiRequestsOverview.
 */
export interface GetApiRequestsOverviewArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: string;
    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     */
    t0?: string;
    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     */
    t1?: string;
    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days.
     */
    timespan?: number;
}

/**
 * A collection of values returned by getApiRequestsOverview.
 */
export interface GetApiRequestsOverviewResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.organizations.GetApiRequestsOverviewItem;
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId: string;
    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     */
    readonly t0?: string;
    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     */
    readonly t1?: string;
    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days.
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
 * const example = meraki.organizations.getApiRequestsOverview({
 *     organizationId: "string",
 *     t0: "string",
 *     t1: "string",
 *     timespan: 1,
 * });
 * export const merakiOrganizationsApiRequestsOverviewExample = example.then(example => example.item);
 * ```
 */
export function getApiRequestsOverviewOutput(args: GetApiRequestsOverviewOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetApiRequestsOverviewResult> {
    return pulumi.output(args).apply((a: any) => getApiRequestsOverview(a, opts))
}

/**
 * A collection of arguments for invoking getApiRequestsOverview.
 */
export interface GetApiRequestsOverviewOutputArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     */
    t0?: pulumi.Input<string>;
    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     */
    t1?: pulumi.Input<string>;
    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days.
     */
    timespan?: pulumi.Input<number>;
}
