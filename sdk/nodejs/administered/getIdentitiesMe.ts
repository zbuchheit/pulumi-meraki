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
 * const example = meraki.administered.getIdentitiesMe({});
 * export const merakiAdministeredIdentitiesMeExample = example.then(example => example.item);
 * ```
 */
export function getIdentitiesMe(opts?: pulumi.InvokeOptions): Promise<GetIdentitiesMeResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:administered/getIdentitiesMe:getIdentitiesMe", {
    }, opts);
}

/**
 * A collection of values returned by getIdentitiesMe.
 */
export interface GetIdentitiesMeResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.administered.GetIdentitiesMeItem;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.administered.getIdentitiesMe({});
 * export const merakiAdministeredIdentitiesMeExample = example.then(example => example.item);
 * ```
 */
export function getIdentitiesMeOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetIdentitiesMeResult> {
    return pulumi.output(getIdentitiesMe(opts))
}