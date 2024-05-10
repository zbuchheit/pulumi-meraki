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
 * const example = meraki.devices.getCellularGatewayPortForwardingRules({
 *     serial: "string",
 * });
 * export const merakiDevicesCellularGatewayPortForwardingRulesExample = example.then(example => example.item);
 * ```
 */
export function getCellularGatewayPortForwardingRules(args: GetCellularGatewayPortForwardingRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetCellularGatewayPortForwardingRulesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:devices/getCellularGatewayPortForwardingRules:getCellularGatewayPortForwardingRules", {
        "serial": args.serial,
    }, opts);
}

/**
 * A collection of arguments for invoking getCellularGatewayPortForwardingRules.
 */
export interface GetCellularGatewayPortForwardingRulesArgs {
    /**
     * serial path parameter.
     */
    serial: string;
}

/**
 * A collection of values returned by getCellularGatewayPortForwardingRules.
 */
export interface GetCellularGatewayPortForwardingRulesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.devices.GetCellularGatewayPortForwardingRulesItem;
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
 * const example = meraki.devices.getCellularGatewayPortForwardingRules({
 *     serial: "string",
 * });
 * export const merakiDevicesCellularGatewayPortForwardingRulesExample = example.then(example => example.item);
 * ```
 */
export function getCellularGatewayPortForwardingRulesOutput(args: GetCellularGatewayPortForwardingRulesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCellularGatewayPortForwardingRulesResult> {
    return pulumi.output(args).apply((a: any) => getCellularGatewayPortForwardingRules(a, opts))
}

/**
 * A collection of arguments for invoking getCellularGatewayPortForwardingRules.
 */
export interface GetCellularGatewayPortForwardingRulesOutputArgs {
    /**
     * serial path parameter.
     */
    serial: pulumi.Input<string>;
}
