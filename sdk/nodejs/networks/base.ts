// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = new meraki.networks.Base("example", {
 *     name: "Main Office",
 *     notes: "Additional description of the network",
 *     organizationId: "string",
 *     productTypes: [
 *         "appliance",
 *         "switch",
 *         "wireless",
 *     ],
 *     tags: [
 *         "tag1",
 *         "tag2",
 *     ],
 *     timeZone: "America/Los_Angeles",
 * });
 * export const merakiNetworksExample = example;
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:networks/base:base example "network_id,organization_id"
 * ```
 */
export class Base extends pulumi.CustomResource {
    /**
     * Get an existing Base resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BaseState, opts?: pulumi.CustomResourceOptions): Base {
        return new Base(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/base:base';

    /**
     * Returns true if the given object is an instance of Base.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Base {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Base.__pulumiType;
    }

    /**
     * Enrollment string for the network
     */
    public readonly enrollmentString!: pulumi.Output<string>;
    /**
     * If the network is bound to a config template
     */
    public /*out*/ readonly isBoundToConfigTemplate!: pulumi.Output<boolean>;
    /**
     * Network name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * Notes for the network
     */
    public readonly notes!: pulumi.Output<string>;
    /**
     * Organization ID
     */
    public readonly organizationId!: pulumi.Output<string>;
    /**
     * List of the product types that the network supports
     */
    public readonly productTypes!: pulumi.Output<string[]>;
    /**
     * Network tags
     */
    public readonly tags!: pulumi.Output<string[]>;
    /**
     * Timezone of the network
     */
    public readonly timeZone!: pulumi.Output<string>;
    /**
     * URL to the network Dashboard UI
     */
    public /*out*/ readonly url!: pulumi.Output<string>;

    /**
     * Create a Base resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BaseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BaseArgs | BaseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BaseState | undefined;
            resourceInputs["enrollmentString"] = state ? state.enrollmentString : undefined;
            resourceInputs["isBoundToConfigTemplate"] = state ? state.isBoundToConfigTemplate : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["notes"] = state ? state.notes : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["productTypes"] = state ? state.productTypes : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["timeZone"] = state ? state.timeZone : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as BaseArgs | undefined;
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            resourceInputs["enrollmentString"] = args ? args.enrollmentString : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["notes"] = args ? args.notes : undefined;
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["productTypes"] = args ? args.productTypes : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["timeZone"] = args ? args.timeZone : undefined;
            resourceInputs["isBoundToConfigTemplate"] = undefined /*out*/;
            resourceInputs["url"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Base.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering base resources.
 */
export interface BaseState {
    /**
     * Enrollment string for the network
     */
    enrollmentString?: pulumi.Input<string>;
    /**
     * If the network is bound to a config template
     */
    isBoundToConfigTemplate?: pulumi.Input<boolean>;
    /**
     * Network name
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * Notes for the network
     */
    notes?: pulumi.Input<string>;
    /**
     * Organization ID
     */
    organizationId?: pulumi.Input<string>;
    /**
     * List of the product types that the network supports
     */
    productTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Network tags
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Timezone of the network
     */
    timeZone?: pulumi.Input<string>;
    /**
     * URL to the network Dashboard UI
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Base resource.
 */
export interface BaseArgs {
    /**
     * Enrollment string for the network
     */
    enrollmentString?: pulumi.Input<string>;
    /**
     * Network name
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * Notes for the network
     */
    notes?: pulumi.Input<string>;
    /**
     * Organization ID
     */
    organizationId: pulumi.Input<string>;
    /**
     * List of the product types that the network supports
     */
    productTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Network tags
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Timezone of the network
     */
    timeZone?: pulumi.Input<string>;
}