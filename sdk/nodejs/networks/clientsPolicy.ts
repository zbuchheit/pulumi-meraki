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
 * const example = new meraki.networks.ClientsPolicy("example", {
 *     clientId: "string",
 *     devicePolicy: "Group policy",
 *     groupPolicyId: "101",
 *     networkId: "string",
 * });
 * export const merakiNetworksClientsPolicyExample = example;
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:networks/clientsPolicy:ClientsPolicy example "client_id,network_id"
 * ```
 */
export class ClientsPolicy extends pulumi.CustomResource {
    /**
     * Get an existing ClientsPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClientsPolicyState, opts?: pulumi.CustomResourceOptions): ClientsPolicy {
        return new ClientsPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/clientsPolicy:ClientsPolicy';

    /**
     * Returns true if the given object is an instance of ClientsPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClientsPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClientsPolicy.__pulumiType;
    }

    /**
     * clientId path parameter. Client ID
     */
    public readonly clientId!: pulumi.Output<string>;
    /**
     * The name of the client's policy
     */
    public readonly devicePolicy!: pulumi.Output<string>;
    /**
     * The group policy identifier of the client
     */
    public readonly groupPolicyId!: pulumi.Output<string>;
    /**
     * The MAC address of the client
     */
    public /*out*/ readonly mac!: pulumi.Output<string>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;

    /**
     * Create a ClientsPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClientsPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClientsPolicyArgs | ClientsPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClientsPolicyState | undefined;
            resourceInputs["clientId"] = state ? state.clientId : undefined;
            resourceInputs["devicePolicy"] = state ? state.devicePolicy : undefined;
            resourceInputs["groupPolicyId"] = state ? state.groupPolicyId : undefined;
            resourceInputs["mac"] = state ? state.mac : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
        } else {
            const args = argsOrState as ClientsPolicyArgs | undefined;
            if ((!args || args.clientId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clientId'");
            }
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["clientId"] = args ? args.clientId : undefined;
            resourceInputs["devicePolicy"] = args ? args.devicePolicy : undefined;
            resourceInputs["groupPolicyId"] = args ? args.groupPolicyId : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["mac"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClientsPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClientsPolicy resources.
 */
export interface ClientsPolicyState {
    /**
     * clientId path parameter. Client ID
     */
    clientId?: pulumi.Input<string>;
    /**
     * The name of the client's policy
     */
    devicePolicy?: pulumi.Input<string>;
    /**
     * The group policy identifier of the client
     */
    groupPolicyId?: pulumi.Input<string>;
    /**
     * The MAC address of the client
     */
    mac?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ClientsPolicy resource.
 */
export interface ClientsPolicyArgs {
    /**
     * clientId path parameter. Client ID
     */
    clientId: pulumi.Input<string>;
    /**
     * The name of the client's policy
     */
    devicePolicy?: pulumi.Input<string>;
    /**
     * The group policy identifier of the client
     */
    groupPolicyId?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}
