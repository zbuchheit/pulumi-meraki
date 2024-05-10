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
 * const example = meraki.administered.getLicensingSubscriptionSubscriptions({
 *     endDate: "string",
 *     endingBefore: "string",
 *     organizationIds: ["string"],
 *     perPage: 1,
 *     productTypes: ["string"],
 *     startDate: "string",
 *     startingAfter: "string",
 *     statuses: ["string"],
 *     subscriptionIds: ["string"],
 * });
 * export const merakiAdministeredLicensingSubscriptionSubscriptionsExample = example.then(example => example.items);
 * ```
 */
export function getLicensingSubscriptionSubscriptions(args?: GetLicensingSubscriptionSubscriptionsArgs, opts?: pulumi.InvokeOptions): Promise<GetLicensingSubscriptionSubscriptionsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:administered/getLicensingSubscriptionSubscriptions:getLicensingSubscriptionSubscriptions", {
        "endDate": args.endDate,
        "endingBefore": args.endingBefore,
        "organizationIds": args.organizationIds,
        "perPage": args.perPage,
        "productTypes": args.productTypes,
        "startDate": args.startDate,
        "startingAfter": args.startingAfter,
        "statuses": args.statuses,
        "subscriptionIds": args.subscriptionIds,
    }, opts);
}

/**
 * A collection of arguments for invoking getLicensingSubscriptionSubscriptions.
 */
export interface GetLicensingSubscriptionSubscriptionsArgs {
    /**
     * endDate query parameter. Filter subscriptions by end date, ISO 8601 format. To filter with a range of dates, use 'endDate[
     * ]=?' in the request. Accepted options include lt, gt, lte, gte.
     */
    endDate?: string;
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: string;
    /**
     * organizationIds query parameter. Organizations to get associated subscriptions for
     */
    organizationIds?: string[];
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    perPage?: number;
    /**
     * productTypes query parameter. List of product types that returned subscriptions need to have entitlements for.
     */
    productTypes?: string[];
    /**
     * startDate query parameter. Filter subscriptions by start date, ISO 8601 format. To filter with a range of dates, use 'startDate[
     * ]=?' in the request. Accepted options include lt, gt, lte, gte.
     */
    startDate?: string;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: string;
    /**
     * statuses query parameter. List of statuses that returned subscriptions can have
     */
    statuses?: string[];
    /**
     * subscriptionIds query parameter. List of subscription ids to fetch
     */
    subscriptionIds?: string[];
}

/**
 * A collection of values returned by getLicensingSubscriptionSubscriptions.
 */
export interface GetLicensingSubscriptionSubscriptionsResult {
    /**
     * endDate query parameter. Filter subscriptions by end date, ISO 8601 format. To filter with a range of dates, use 'endDate[
     * ]=?' in the request. Accepted options include lt, gt, lte, gte.
     */
    readonly endDate?: string;
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly endingBefore?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseLicensingGetAdministeredLicensingSubscriptionSubscriptions
     */
    readonly items: outputs.administered.GetLicensingSubscriptionSubscriptionsItem[];
    /**
     * organizationIds query parameter. Organizations to get associated subscriptions for
     */
    readonly organizationIds?: string[];
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    readonly perPage?: number;
    /**
     * productTypes query parameter. List of product types that returned subscriptions need to have entitlements for.
     */
    readonly productTypes?: string[];
    /**
     * startDate query parameter. Filter subscriptions by start date, ISO 8601 format. To filter with a range of dates, use 'startDate[
     * ]=?' in the request. Accepted options include lt, gt, lte, gte.
     */
    readonly startDate?: string;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly startingAfter?: string;
    /**
     * statuses query parameter. List of statuses that returned subscriptions can have
     */
    readonly statuses?: string[];
    /**
     * subscriptionIds query parameter. List of subscription ids to fetch
     */
    readonly subscriptionIds?: string[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.administered.getLicensingSubscriptionSubscriptions({
 *     endDate: "string",
 *     endingBefore: "string",
 *     organizationIds: ["string"],
 *     perPage: 1,
 *     productTypes: ["string"],
 *     startDate: "string",
 *     startingAfter: "string",
 *     statuses: ["string"],
 *     subscriptionIds: ["string"],
 * });
 * export const merakiAdministeredLicensingSubscriptionSubscriptionsExample = example.then(example => example.items);
 * ```
 */
export function getLicensingSubscriptionSubscriptionsOutput(args?: GetLicensingSubscriptionSubscriptionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLicensingSubscriptionSubscriptionsResult> {
    return pulumi.output(args).apply((a: any) => getLicensingSubscriptionSubscriptions(a, opts))
}

/**
 * A collection of arguments for invoking getLicensingSubscriptionSubscriptions.
 */
export interface GetLicensingSubscriptionSubscriptionsOutputArgs {
    /**
     * endDate query parameter. Filter subscriptions by end date, ISO 8601 format. To filter with a range of dates, use 'endDate[
     * ]=?' in the request. Accepted options include lt, gt, lte, gte.
     */
    endDate?: pulumi.Input<string>;
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: pulumi.Input<string>;
    /**
     * organizationIds query parameter. Organizations to get associated subscriptions for
     */
    organizationIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    perPage?: pulumi.Input<number>;
    /**
     * productTypes query parameter. List of product types that returned subscriptions need to have entitlements for.
     */
    productTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * startDate query parameter. Filter subscriptions by start date, ISO 8601 format. To filter with a range of dates, use 'startDate[
     * ]=?' in the request. Accepted options include lt, gt, lte, gte.
     */
    startDate?: pulumi.Input<string>;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: pulumi.Input<string>;
    /**
     * statuses query parameter. List of statuses that returned subscriptions can have
     */
    statuses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * subscriptionIds query parameter. List of subscription ids to fetch
     */
    subscriptionIds?: pulumi.Input<pulumi.Input<string>[]>;
}
