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
 * const example = meraki.organizations.getCameraBoundariesLinesByDevice({
 *     organizationId: "string",
 *     serials: ["string"],
 * });
 * export const merakiOrganizationsCameraBoundariesLinesByDeviceExample = example.then(example => example.items);
 * ```
 */
export function getCameraBoundariesLinesByDevice(args: GetCameraBoundariesLinesByDeviceArgs, opts?: pulumi.InvokeOptions): Promise<GetCameraBoundariesLinesByDeviceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getCameraBoundariesLinesByDevice:getCameraBoundariesLinesByDevice", {
        "organizationId": args.organizationId,
        "serials": args.serials,
    }, opts);
}

/**
 * A collection of arguments for invoking getCameraBoundariesLinesByDevice.
 */
export interface GetCameraBoundariesLinesByDeviceArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: string;
    /**
     * serials query parameter. A list of serial numbers. The returned cameras will be filtered to only include these serials.
     */
    serials?: string[];
}

/**
 * A collection of values returned by getCameraBoundariesLinesByDevice.
 */
export interface GetCameraBoundariesLinesByDeviceResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseCameraGetOrganizationCameraBoundariesLinesByDevice
     */
    readonly items: outputs.organizations.GetCameraBoundariesLinesByDeviceItem[];
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId: string;
    /**
     * serials query parameter. A list of serial numbers. The returned cameras will be filtered to only include these serials.
     */
    readonly serials?: string[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.organizations.getCameraBoundariesLinesByDevice({
 *     organizationId: "string",
 *     serials: ["string"],
 * });
 * export const merakiOrganizationsCameraBoundariesLinesByDeviceExample = example.then(example => example.items);
 * ```
 */
export function getCameraBoundariesLinesByDeviceOutput(args: GetCameraBoundariesLinesByDeviceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCameraBoundariesLinesByDeviceResult> {
    return pulumi.output(args).apply((a: any) => getCameraBoundariesLinesByDevice(a, opts))
}

/**
 * A collection of arguments for invoking getCameraBoundariesLinesByDevice.
 */
export interface GetCameraBoundariesLinesByDeviceOutputArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
    /**
     * serials query parameter. A list of serial numbers. The returned cameras will be filtered to only include these serials.
     */
    serials?: pulumi.Input<pulumi.Input<string>[]>;
}
