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
 * const example = meraki.networks.getVlanProfiles({
 *     iname: "string",
 *     networkId: "string",
 * });
 * export const merakiNetworksVlanProfilesExample = example.then(example => example.item);
 * ```
 */
export function getVlanProfiles(args: GetVlanProfilesArgs, opts?: pulumi.InvokeOptions): Promise<GetVlanProfilesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getVlanProfiles:getVlanProfiles", {
        "iname": args.iname,
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVlanProfiles.
 */
export interface GetVlanProfilesArgs {
    /**
     * iname path parameter.
     */
    iname: string;
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getVlanProfiles.
 */
export interface GetVlanProfilesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * iname path parameter.
     */
    readonly iname: string;
    readonly item: outputs.networks.GetVlanProfilesItem;
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
 * const example = meraki.networks.getVlanProfiles({
 *     iname: "string",
 *     networkId: "string",
 * });
 * export const merakiNetworksVlanProfilesExample = example.then(example => example.item);
 * ```
 */
export function getVlanProfilesOutput(args: GetVlanProfilesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVlanProfilesResult> {
    return pulumi.output(args).apply((a: any) => getVlanProfiles(a, opts))
}

/**
 * A collection of arguments for invoking getVlanProfiles.
 */
export interface GetVlanProfilesOutputArgs {
    /**
     * iname path parameter.
     */
    iname: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
