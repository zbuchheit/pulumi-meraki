// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 */
export function getApplianceSsids(args?: GetApplianceSsidsArgs, opts?: pulumi.InvokeOptions): Promise<GetApplianceSsidsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getApplianceSsids:getApplianceSsids", {
        "networkId": args.networkId,
        "number": args.number,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceSsids.
 */
export interface GetApplianceSsidsArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId?: string;
    /**
     * number path parameter.
     */
    number?: string;
}

/**
 * A collection of values returned by getApplianceSsids.
 */
export interface GetApplianceSsidsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetApplianceSsidsItem;
    /**
     * Array of ResponseApplianceGetNetworkApplianceSsids
     */
    readonly items: outputs.networks.GetApplianceSsidsItem[];
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId?: string;
    /**
     * number path parameter.
     */
    readonly number?: string;
}
/**
 * ## Example Usage
 */
export function getApplianceSsidsOutput(args?: GetApplianceSsidsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetApplianceSsidsResult> {
    return pulumi.output(args).apply((a: any) => getApplianceSsids(a, opts))
}

/**
 * A collection of arguments for invoking getApplianceSsids.
 */
export interface GetApplianceSsidsOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * number path parameter.
     */
    number?: pulumi.Input<string>;
}
