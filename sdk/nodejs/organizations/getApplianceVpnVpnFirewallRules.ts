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
 * const example = meraki.organizations.getApplianceVpnVpnFirewallRules({
 *     organizationId: "string",
 * });
 * export const merakiOrganizationsApplianceVpnVpnFirewallRulesExample = example.then(example => example.item);
 * ```
 */
export function getApplianceVpnVpnFirewallRules(args: GetApplianceVpnVpnFirewallRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetApplianceVpnVpnFirewallRulesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getApplianceVpnVpnFirewallRules:getApplianceVpnVpnFirewallRules", {
        "organizationId": args.organizationId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceVpnVpnFirewallRules.
 */
export interface GetApplianceVpnVpnFirewallRulesArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: string;
}

/**
 * A collection of values returned by getApplianceVpnVpnFirewallRules.
 */
export interface GetApplianceVpnVpnFirewallRulesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.organizations.GetApplianceVpnVpnFirewallRulesItem;
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.organizations.getApplianceVpnVpnFirewallRules({
 *     organizationId: "string",
 * });
 * export const merakiOrganizationsApplianceVpnVpnFirewallRulesExample = example.then(example => example.item);
 * ```
 */
export function getApplianceVpnVpnFirewallRulesOutput(args: GetApplianceVpnVpnFirewallRulesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetApplianceVpnVpnFirewallRulesResult> {
    return pulumi.output(args).apply((a: any) => getApplianceVpnVpnFirewallRules(a, opts))
}

/**
 * A collection of arguments for invoking getApplianceVpnVpnFirewallRules.
 */
export interface GetApplianceVpnVpnFirewallRulesOutputArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
}
