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
 * const example = meraki.networks.getApplianceFirewallPortForwardingRules({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceFirewallPortForwardingRulesExample = example.then(example => example.item);
 * ```
 */
export function getApplianceFirewallPortForwardingRules(args: GetApplianceFirewallPortForwardingRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetApplianceFirewallPortForwardingRulesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getApplianceFirewallPortForwardingRules:getApplianceFirewallPortForwardingRules", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceFirewallPortForwardingRules.
 */
export interface GetApplianceFirewallPortForwardingRulesArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getApplianceFirewallPortForwardingRules.
 */
export interface GetApplianceFirewallPortForwardingRulesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetApplianceFirewallPortForwardingRulesItem;
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
 * const example = meraki.networks.getApplianceFirewallPortForwardingRules({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceFirewallPortForwardingRulesExample = example.then(example => example.item);
 * ```
 */
export function getApplianceFirewallPortForwardingRulesOutput(args: GetApplianceFirewallPortForwardingRulesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetApplianceFirewallPortForwardingRulesResult> {
    return pulumi.output(args).apply((a: any) => getApplianceFirewallPortForwardingRules(a, opts))
}

/**
 * A collection of arguments for invoking getApplianceFirewallPortForwardingRules.
 */
export interface GetApplianceFirewallPortForwardingRulesOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
