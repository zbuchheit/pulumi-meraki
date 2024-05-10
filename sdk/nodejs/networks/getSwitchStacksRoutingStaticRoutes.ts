// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 */
export function getSwitchStacksRoutingStaticRoutes(args?: GetSwitchStacksRoutingStaticRoutesArgs, opts?: pulumi.InvokeOptions): Promise<GetSwitchStacksRoutingStaticRoutesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getSwitchStacksRoutingStaticRoutes:getSwitchStacksRoutingStaticRoutes", {
        "networkId": args.networkId,
        "staticRouteId": args.staticRouteId,
        "switchStackId": args.switchStackId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSwitchStacksRoutingStaticRoutes.
 */
export interface GetSwitchStacksRoutingStaticRoutesArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId?: string;
    /**
     * staticRouteId path parameter. Static route ID
     */
    staticRouteId?: string;
    /**
     * switchStackId path parameter. Switch stack ID
     */
    switchStackId?: string;
}

/**
 * A collection of values returned by getSwitchStacksRoutingStaticRoutes.
 */
export interface GetSwitchStacksRoutingStaticRoutesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetSwitchStacksRoutingStaticRoutesItem;
    /**
     * Array of ResponseSwitchGetNetworkSwitchStackRoutingStaticRoutes
     */
    readonly items: outputs.networks.GetSwitchStacksRoutingStaticRoutesItem[];
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId?: string;
    /**
     * staticRouteId path parameter. Static route ID
     */
    readonly staticRouteId?: string;
    /**
     * switchStackId path parameter. Switch stack ID
     */
    readonly switchStackId?: string;
}
/**
 * ## Example Usage
 */
export function getSwitchStacksRoutingStaticRoutesOutput(args?: GetSwitchStacksRoutingStaticRoutesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSwitchStacksRoutingStaticRoutesResult> {
    return pulumi.output(args).apply((a: any) => getSwitchStacksRoutingStaticRoutes(a, opts))
}

/**
 * A collection of arguments for invoking getSwitchStacksRoutingStaticRoutes.
 */
export interface GetSwitchStacksRoutingStaticRoutesOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * staticRouteId path parameter. Static route ID
     */
    staticRouteId?: pulumi.Input<string>;
    /**
     * switchStackId path parameter. Switch stack ID
     */
    switchStackId?: pulumi.Input<string>;
}
