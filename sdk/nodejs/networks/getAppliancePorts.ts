// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 */
export function getAppliancePorts(args?: GetAppliancePortsArgs, opts?: pulumi.InvokeOptions): Promise<GetAppliancePortsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getAppliancePorts:getAppliancePorts", {
        "networkId": args.networkId,
        "portId": args.portId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppliancePorts.
 */
export interface GetAppliancePortsArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId?: string;
    /**
     * portId path parameter. Port ID
     */
    portId?: string;
}

/**
 * A collection of values returned by getAppliancePorts.
 */
export interface GetAppliancePortsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetAppliancePortsItem;
    /**
     * Array of ResponseApplianceGetNetworkAppliancePorts
     */
    readonly items: outputs.networks.GetAppliancePortsItem[];
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId?: string;
    /**
     * portId path parameter. Port ID
     */
    readonly portId?: string;
}
/**
 * ## Example Usage
 */
export function getAppliancePortsOutput(args?: GetAppliancePortsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAppliancePortsResult> {
    return pulumi.output(args).apply((a: any) => getAppliancePorts(a, opts))
}

/**
 * A collection of arguments for invoking getAppliancePorts.
 */
export interface GetAppliancePortsOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * portId path parameter. Port ID
     */
    portId?: pulumi.Input<string>;
}