// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 */
export function getApplianceVlans(args?: GetApplianceVlansArgs, opts?: pulumi.InvokeOptions): Promise<GetApplianceVlansResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getApplianceVlans:getApplianceVlans", {
        "networkId": args.networkId,
        "vlanId": args.vlanId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceVlans.
 */
export interface GetApplianceVlansArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId?: string;
    /**
     * vlanId path parameter. Vlan ID
     */
    vlanId?: string;
}

/**
 * A collection of values returned by getApplianceVlans.
 */
export interface GetApplianceVlansResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetApplianceVlansItem;
    /**
     * Array of ResponseApplianceGetNetworkApplianceVlans
     */
    readonly items: outputs.networks.GetApplianceVlansItem[];
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId?: string;
    /**
     * vlanId path parameter. Vlan ID
     */
    readonly vlanId?: string;
}
/**
 * ## Example Usage
 */
export function getApplianceVlansOutput(args?: GetApplianceVlansOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetApplianceVlansResult> {
    return pulumi.output(args).apply((a: any) => getApplianceVlans(a, opts))
}

/**
 * A collection of arguments for invoking getApplianceVlans.
 */
export interface GetApplianceVlansOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * vlanId path parameter. Vlan ID
     */
    vlanId?: pulumi.Input<string>;
}
