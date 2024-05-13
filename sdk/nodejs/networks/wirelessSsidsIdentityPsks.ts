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
 * const example = new meraki.networks.WirelessSsidsIdentityPsks("example", {
 *     expiresAt: "2018-02-11T00:00:00.090210Z",
 *     groupPolicyId: "101",
 *     name: "Sample Identity PSK",
 *     networkId: "string",
 *     number: "string",
 *     passphrase: "secret",
 * });
 * export const merakiNetworksWirelessSsidsIdentityPsksExample = example;
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:networks/wirelessSsidsIdentityPsks:WirelessSsidsIdentityPsks example "identity_psk_id,network_id,number"
 * ```
 */
export class WirelessSsidsIdentityPsks extends pulumi.CustomResource {
    /**
     * Get an existing WirelessSsidsIdentityPsks resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WirelessSsidsIdentityPsksState, opts?: pulumi.CustomResourceOptions): WirelessSsidsIdentityPsks {
        return new WirelessSsidsIdentityPsks(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/wirelessSsidsIdentityPsks:WirelessSsidsIdentityPsks';

    /**
     * Returns true if the given object is an instance of WirelessSsidsIdentityPsks.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WirelessSsidsIdentityPsks {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WirelessSsidsIdentityPsks.__pulumiType;
    }

    /**
     * The email associated with the System's Manager User
     */
    public /*out*/ readonly email!: pulumi.Output<string>;
    /**
     * Timestamp for when the Identity PSK expires, or 'null' to never expire
     */
    public readonly expiresAt!: pulumi.Output<string>;
    /**
     * The group policy to be applied to clients
     */
    public readonly groupPolicyId!: pulumi.Output<string>;
    /**
     * identityPskId path parameter. Identity psk ID
     */
    public readonly identityPskId!: pulumi.Output<string | undefined>;
    /**
     * The name of the Identity PSK
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * number path parameter.
     */
    public readonly number!: pulumi.Output<string>;
    /**
     * The passphrase for client authentication
     */
    public readonly passphrase!: pulumi.Output<string>;
    /**
     * The WiFi Personal Network unique identifier
     */
    public /*out*/ readonly wifiPersonalNetworkId!: pulumi.Output<string>;

    /**
     * Create a WirelessSsidsIdentityPsks resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WirelessSsidsIdentityPsksArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WirelessSsidsIdentityPsksArgs | WirelessSsidsIdentityPsksState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WirelessSsidsIdentityPsksState | undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["expiresAt"] = state ? state.expiresAt : undefined;
            resourceInputs["groupPolicyId"] = state ? state.groupPolicyId : undefined;
            resourceInputs["identityPskId"] = state ? state.identityPskId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["number"] = state ? state.number : undefined;
            resourceInputs["passphrase"] = state ? state.passphrase : undefined;
            resourceInputs["wifiPersonalNetworkId"] = state ? state.wifiPersonalNetworkId : undefined;
        } else {
            const args = argsOrState as WirelessSsidsIdentityPsksArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            if ((!args || args.number === undefined) && !opts.urn) {
                throw new Error("Missing required property 'number'");
            }
            resourceInputs["expiresAt"] = args ? args.expiresAt : undefined;
            resourceInputs["groupPolicyId"] = args ? args.groupPolicyId : undefined;
            resourceInputs["identityPskId"] = args ? args.identityPskId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["number"] = args ? args.number : undefined;
            resourceInputs["passphrase"] = args ? args.passphrase : undefined;
            resourceInputs["email"] = undefined /*out*/;
            resourceInputs["wifiPersonalNetworkId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WirelessSsidsIdentityPsks.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WirelessSsidsIdentityPsks resources.
 */
export interface WirelessSsidsIdentityPsksState {
    /**
     * The email associated with the System's Manager User
     */
    email?: pulumi.Input<string>;
    /**
     * Timestamp for when the Identity PSK expires, or 'null' to never expire
     */
    expiresAt?: pulumi.Input<string>;
    /**
     * The group policy to be applied to clients
     */
    groupPolicyId?: pulumi.Input<string>;
    /**
     * identityPskId path parameter. Identity psk ID
     */
    identityPskId?: pulumi.Input<string>;
    /**
     * The name of the Identity PSK
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * number path parameter.
     */
    number?: pulumi.Input<string>;
    /**
     * The passphrase for client authentication
     */
    passphrase?: pulumi.Input<string>;
    /**
     * The WiFi Personal Network unique identifier
     */
    wifiPersonalNetworkId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WirelessSsidsIdentityPsks resource.
 */
export interface WirelessSsidsIdentityPsksArgs {
    /**
     * Timestamp for when the Identity PSK expires, or 'null' to never expire
     */
    expiresAt?: pulumi.Input<string>;
    /**
     * The group policy to be applied to clients
     */
    groupPolicyId?: pulumi.Input<string>;
    /**
     * identityPskId path parameter. Identity psk ID
     */
    identityPskId?: pulumi.Input<string>;
    /**
     * The name of the Identity PSK
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * number path parameter.
     */
    number: pulumi.Input<string>;
    /**
     * The passphrase for client authentication
     */
    passphrase?: pulumi.Input<string>;
}