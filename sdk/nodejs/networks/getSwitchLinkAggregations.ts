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
 * const example = meraki.networks.getSwitchLinkAggregations({
 *     networkId: "string",
 * });
 * export const merakiNetworksSwitchLinkAggregationsExample = example.then(example => example.items);
 * ```
 */
export function getSwitchLinkAggregations(args: GetSwitchLinkAggregationsArgs, opts?: pulumi.InvokeOptions): Promise<GetSwitchLinkAggregationsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getSwitchLinkAggregations:getSwitchLinkAggregations", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSwitchLinkAggregations.
 */
export interface GetSwitchLinkAggregationsArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getSwitchLinkAggregations.
 */
export interface GetSwitchLinkAggregationsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseSwitchGetNetworkSwitchLinkAggregations
     */
    readonly items: outputs.networks.GetSwitchLinkAggregationsItem[];
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
 * const example = meraki.networks.getSwitchLinkAggregations({
 *     networkId: "string",
 * });
 * export const merakiNetworksSwitchLinkAggregationsExample = example.then(example => example.items);
 * ```
 */
export function getSwitchLinkAggregationsOutput(args: GetSwitchLinkAggregationsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSwitchLinkAggregationsResult> {
    return pulumi.output(args).apply((a: any) => getSwitchLinkAggregations(a, opts))
}

/**
 * A collection of arguments for invoking getSwitchLinkAggregations.
 */
export interface GetSwitchLinkAggregationsOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
