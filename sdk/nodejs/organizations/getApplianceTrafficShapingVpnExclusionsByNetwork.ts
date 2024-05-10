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
 * const example = meraki.organizations.getApplianceTrafficShapingVpnExclusionsByNetwork({
 *     endingBefore: "string",
 *     networkIds: ["string"],
 *     organizationId: "string",
 *     perPage: 1,
 *     startingAfter: "string",
 * });
 * export const merakiOrganizationsApplianceTrafficShapingVpnExclusionsByNetworkExample = example.then(example => example.item);
 * ```
 */
export function getApplianceTrafficShapingVpnExclusionsByNetwork(args: GetApplianceTrafficShapingVpnExclusionsByNetworkArgs, opts?: pulumi.InvokeOptions): Promise<GetApplianceTrafficShapingVpnExclusionsByNetworkResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getApplianceTrafficShapingVpnExclusionsByNetwork:getApplianceTrafficShapingVpnExclusionsByNetwork", {
        "endingBefore": args.endingBefore,
        "networkIds": args.networkIds,
        "organizationId": args.organizationId,
        "perPage": args.perPage,
        "startingAfter": args.startingAfter,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceTrafficShapingVpnExclusionsByNetwork.
 */
export interface GetApplianceTrafficShapingVpnExclusionsByNetworkArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: string;
    /**
     * networkIds query parameter. Optional parameter to filter the results by network IDs
     */
    networkIds?: string[];
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
     */
    perPage?: number;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: string;
}

/**
 * A collection of values returned by getApplianceTrafficShapingVpnExclusionsByNetwork.
 */
export interface GetApplianceTrafficShapingVpnExclusionsByNetworkResult {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly endingBefore?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.organizations.GetApplianceTrafficShapingVpnExclusionsByNetworkItem;
    /**
     * networkIds query parameter. Optional parameter to filter the results by network IDs
     */
    readonly networkIds?: string[];
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
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
 * const example = meraki.organizations.getApplianceTrafficShapingVpnExclusionsByNetwork({
 *     endingBefore: "string",
 *     networkIds: ["string"],
 *     organizationId: "string",
 *     perPage: 1,
 *     startingAfter: "string",
 * });
 * export const merakiOrganizationsApplianceTrafficShapingVpnExclusionsByNetworkExample = example.then(example => example.item);
 * ```
 */
export function getApplianceTrafficShapingVpnExclusionsByNetworkOutput(args: GetApplianceTrafficShapingVpnExclusionsByNetworkOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetApplianceTrafficShapingVpnExclusionsByNetworkResult> {
    return pulumi.output(args).apply((a: any) => getApplianceTrafficShapingVpnExclusionsByNetwork(a, opts))
}

/**
 * A collection of arguments for invoking getApplianceTrafficShapingVpnExclusionsByNetwork.
 */
export interface GetApplianceTrafficShapingVpnExclusionsByNetworkOutputArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: pulumi.Input<string>;
    /**
     * networkIds query parameter. Optional parameter to filter the results by network IDs
     */
    networkIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
     */
    perPage?: pulumi.Input<number>;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: pulumi.Input<string>;
}
