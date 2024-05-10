// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 */
export function getNetworks(args?: GetNetworksArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworksResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:index/getNetworks:getNetworks", {
        "configTemplateId": args.configTemplateId,
        "endingBefore": args.endingBefore,
        "isBoundToConfigTemplate": args.isBoundToConfigTemplate,
        "networkId": args.networkId,
        "organizationId": args.organizationId,
        "perPage": args.perPage,
        "startingAfter": args.startingAfter,
        "tags": args.tags,
        "tagsFilterType": args.tagsFilterType,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworks.
 */
export interface GetNetworksArgs {
    /**
     * configTemplateId query parameter. An optional parameter that is the ID of a config template. Will return all networks bound to that template.
     */
    configTemplateId?: string;
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: string;
    /**
     * isBoundToConfigTemplate query parameter. An optional parameter to filter config template bound networks. If configTemplateId is set, this cannot be false.
     */
    isBoundToConfigTemplate?: boolean;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: string;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 100000. Default is 1000.
     */
    perPage?: number;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: string;
    /**
     * tags query parameter. An optional parameter to filter networks by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below).
     */
    tags?: string[];
    /**
     * tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
     */
    tagsFilterType?: string;
}

/**
 * A collection of values returned by getNetworks.
 */
export interface GetNetworksResult {
    /**
     * configTemplateId query parameter. An optional parameter that is the ID of a config template. Will return all networks bound to that template.
     */
    readonly configTemplateId?: string;
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly endingBefore?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * isBoundToConfigTemplate query parameter. An optional parameter to filter config template bound networks. If configTemplateId is set, this cannot be false.
     */
    readonly isBoundToConfigTemplate?: boolean;
    readonly item: outputs.GetNetworksItem;
    /**
     * Array of ResponseOrganizationsGetOrganizationNetworks
     */
    readonly items: outputs.GetNetworksItem[];
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId?: string;
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId?: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 100000. Default is 1000.
     */
    readonly perPage?: number;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly startingAfter?: string;
    /**
     * tags query parameter. An optional parameter to filter networks by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below).
     */
    readonly tags?: string[];
    /**
     * tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
     */
    readonly tagsFilterType?: string;
}
/**
 * ## Example Usage
 */
export function getNetworksOutput(args?: GetNetworksOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworksResult> {
    return pulumi.output(args).apply((a: any) => getNetworks(a, opts))
}

/**
 * A collection of arguments for invoking getNetworks.
 */
export interface GetNetworksOutputArgs {
    /**
     * configTemplateId query parameter. An optional parameter that is the ID of a config template. Will return all networks bound to that template.
     */
    configTemplateId?: pulumi.Input<string>;
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: pulumi.Input<string>;
    /**
     * isBoundToConfigTemplate query parameter. An optional parameter to filter config template bound networks. If configTemplateId is set, this cannot be false.
     */
    isBoundToConfigTemplate?: pulumi.Input<boolean>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: pulumi.Input<string>;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 100000. Default is 1000.
     */
    perPage?: pulumi.Input<number>;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: pulumi.Input<string>;
    /**
     * tags query parameter. An optional parameter to filter networks by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below).
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
     */
    tagsFilterType?: pulumi.Input<string>;
}
