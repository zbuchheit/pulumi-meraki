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
 * const example = meraki.networks.getFirmwareUpgradesStagedStages({
 *     networkId: "string",
 * });
 * export const merakiNetworksFirmwareUpgradesStagedStagesExample = example.then(example => example.items);
 * ```
 */
export function getFirmwareUpgradesStagedStages(args: GetFirmwareUpgradesStagedStagesArgs, opts?: pulumi.InvokeOptions): Promise<GetFirmwareUpgradesStagedStagesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getFirmwareUpgradesStagedStages:getFirmwareUpgradesStagedStages", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFirmwareUpgradesStagedStages.
 */
export interface GetFirmwareUpgradesStagedStagesArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getFirmwareUpgradesStagedStages.
 */
export interface GetFirmwareUpgradesStagedStagesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseNetworksGetNetworkFirmwareUpgradesStagedStages
     */
    readonly items: outputs.networks.GetFirmwareUpgradesStagedStagesItem[];
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
 * const example = meraki.networks.getFirmwareUpgradesStagedStages({
 *     networkId: "string",
 * });
 * export const merakiNetworksFirmwareUpgradesStagedStagesExample = example.then(example => example.items);
 * ```
 */
export function getFirmwareUpgradesStagedStagesOutput(args: GetFirmwareUpgradesStagedStagesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFirmwareUpgradesStagedStagesResult> {
    return pulumi.output(args).apply((a: any) => getFirmwareUpgradesStagedStages(a, opts))
}

/**
 * A collection of arguments for invoking getFirmwareUpgradesStagedStages.
 */
export interface GetFirmwareUpgradesStagedStagesOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
