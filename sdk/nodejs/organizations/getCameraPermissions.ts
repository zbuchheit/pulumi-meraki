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
 * const example = meraki.organizations.getCameraPermissions({
 *     organizationId: "string",
 *     permissionScopeId: "string",
 * });
 * export const merakiOrganizationsCameraPermissionsExample = example.then(example => example.item);
 * ```
 */
export function getCameraPermissions(args: GetCameraPermissionsArgs, opts?: pulumi.InvokeOptions): Promise<GetCameraPermissionsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getCameraPermissions:getCameraPermissions", {
        "organizationId": args.organizationId,
        "permissionScopeId": args.permissionScopeId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCameraPermissions.
 */
export interface GetCameraPermissionsArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: string;
    /**
     * permissionScopeId path parameter. Permission scope ID
     */
    permissionScopeId: string;
}

/**
 * A collection of values returned by getCameraPermissions.
 */
export interface GetCameraPermissionsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.organizations.GetCameraPermissionsItem;
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId: string;
    /**
     * permissionScopeId path parameter. Permission scope ID
     */
    readonly permissionScopeId: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.organizations.getCameraPermissions({
 *     organizationId: "string",
 *     permissionScopeId: "string",
 * });
 * export const merakiOrganizationsCameraPermissionsExample = example.then(example => example.item);
 * ```
 */
export function getCameraPermissionsOutput(args: GetCameraPermissionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCameraPermissionsResult> {
    return pulumi.output(args).apply((a: any) => getCameraPermissions(a, opts))
}

/**
 * A collection of arguments for invoking getCameraPermissions.
 */
export interface GetCameraPermissionsOutputArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
    /**
     * permissionScopeId path parameter. Permission scope ID
     */
    permissionScopeId: pulumi.Input<string>;
}
