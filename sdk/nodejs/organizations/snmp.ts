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
 * const example = new meraki.organizations.Snmp("example", {
 *     organizationId: "string",
 *     peerIps: ["123.123.123.1"],
 *     v2cEnabled: false,
 *     v3AuthMode: "SHA",
 *     v3AuthPass: "password",
 *     v3Enabled: true,
 *     v3PrivMode: "AES128",
 *     v3PrivPass: "password",
 * });
 * export const merakiOrganizationsSnmpExample = example;
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:organizations/snmp:Snmp example "organization_id"
 * ```
 */
export class Snmp extends pulumi.CustomResource {
    /**
     * Get an existing Snmp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnmpState, opts?: pulumi.CustomResourceOptions): Snmp {
        return new Snmp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:organizations/snmp:Snmp';

    /**
     * Returns true if the given object is an instance of Snmp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Snmp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Snmp.__pulumiType;
    }

    /**
     * The hostname of the SNMP server.
     */
    public /*out*/ readonly hostname!: pulumi.Output<string>;
    /**
     * organizationId path parameter. Organization ID
     */
    public readonly organizationId!: pulumi.Output<string>;
    /**
     * The list of IPv4 addresses that are allowed to access the SNMP server.
     */
    public readonly peerIps!: pulumi.Output<string[]>;
    /**
     * The port of the SNMP server.
     */
    public /*out*/ readonly port!: pulumi.Output<number>;
    /**
     * The community string for SNMP version 2c, if enabled.
     */
    public /*out*/ readonly v2CommunityString!: pulumi.Output<string>;
    /**
     * Boolean indicating whether SNMP version 2c is enabled for the organization.
     */
    public readonly v2cEnabled!: pulumi.Output<boolean>;
    /**
     * The SNMP version 3 authentication mode. Can be either 'MD5' or 'SHA'.
     */
    public readonly v3AuthMode!: pulumi.Output<string>;
    /**
     * The SNMP version 3 authentication password. Must be at least 8 characters if specified.
     */
    public readonly v3AuthPass!: pulumi.Output<string>;
    /**
     * Boolean indicating whether SNMP version 3 is enabled for the organization.
     */
    public readonly v3Enabled!: pulumi.Output<boolean>;
    /**
     * The SNMP version 3 privacy mode. Can be either 'DES' or 'AES128'.
     */
    public readonly v3PrivMode!: pulumi.Output<string>;
    /**
     * The SNMP version 3 privacy password. Must be at least 8 characters if specified.
     */
    public readonly v3PrivPass!: pulumi.Output<string>;
    /**
     * The user for SNMP version 3, if enabled.
     */
    public /*out*/ readonly v3User!: pulumi.Output<string>;

    /**
     * Create a Snmp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SnmpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SnmpArgs | SnmpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SnmpState | undefined;
            resourceInputs["hostname"] = state ? state.hostname : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["peerIps"] = state ? state.peerIps : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["v2CommunityString"] = state ? state.v2CommunityString : undefined;
            resourceInputs["v2cEnabled"] = state ? state.v2cEnabled : undefined;
            resourceInputs["v3AuthMode"] = state ? state.v3AuthMode : undefined;
            resourceInputs["v3AuthPass"] = state ? state.v3AuthPass : undefined;
            resourceInputs["v3Enabled"] = state ? state.v3Enabled : undefined;
            resourceInputs["v3PrivMode"] = state ? state.v3PrivMode : undefined;
            resourceInputs["v3PrivPass"] = state ? state.v3PrivPass : undefined;
            resourceInputs["v3User"] = state ? state.v3User : undefined;
        } else {
            const args = argsOrState as SnmpArgs | undefined;
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["peerIps"] = args ? args.peerIps : undefined;
            resourceInputs["v2cEnabled"] = args ? args.v2cEnabled : undefined;
            resourceInputs["v3AuthMode"] = args ? args.v3AuthMode : undefined;
            resourceInputs["v3AuthPass"] = args ? args.v3AuthPass : undefined;
            resourceInputs["v3Enabled"] = args ? args.v3Enabled : undefined;
            resourceInputs["v3PrivMode"] = args ? args.v3PrivMode : undefined;
            resourceInputs["v3PrivPass"] = args ? args.v3PrivPass : undefined;
            resourceInputs["hostname"] = undefined /*out*/;
            resourceInputs["port"] = undefined /*out*/;
            resourceInputs["v2CommunityString"] = undefined /*out*/;
            resourceInputs["v3User"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Snmp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Snmp resources.
 */
export interface SnmpState {
    /**
     * The hostname of the SNMP server.
     */
    hostname?: pulumi.Input<string>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: pulumi.Input<string>;
    /**
     * The list of IPv4 addresses that are allowed to access the SNMP server.
     */
    peerIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The port of the SNMP server.
     */
    port?: pulumi.Input<number>;
    /**
     * The community string for SNMP version 2c, if enabled.
     */
    v2CommunityString?: pulumi.Input<string>;
    /**
     * Boolean indicating whether SNMP version 2c is enabled for the organization.
     */
    v2cEnabled?: pulumi.Input<boolean>;
    /**
     * The SNMP version 3 authentication mode. Can be either 'MD5' or 'SHA'.
     */
    v3AuthMode?: pulumi.Input<string>;
    /**
     * The SNMP version 3 authentication password. Must be at least 8 characters if specified.
     */
    v3AuthPass?: pulumi.Input<string>;
    /**
     * Boolean indicating whether SNMP version 3 is enabled for the organization.
     */
    v3Enabled?: pulumi.Input<boolean>;
    /**
     * The SNMP version 3 privacy mode. Can be either 'DES' or 'AES128'.
     */
    v3PrivMode?: pulumi.Input<string>;
    /**
     * The SNMP version 3 privacy password. Must be at least 8 characters if specified.
     */
    v3PrivPass?: pulumi.Input<string>;
    /**
     * The user for SNMP version 3, if enabled.
     */
    v3User?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Snmp resource.
 */
export interface SnmpArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
    /**
     * The list of IPv4 addresses that are allowed to access the SNMP server.
     */
    peerIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Boolean indicating whether SNMP version 2c is enabled for the organization.
     */
    v2cEnabled?: pulumi.Input<boolean>;
    /**
     * The SNMP version 3 authentication mode. Can be either 'MD5' or 'SHA'.
     */
    v3AuthMode?: pulumi.Input<string>;
    /**
     * The SNMP version 3 authentication password. Must be at least 8 characters if specified.
     */
    v3AuthPass?: pulumi.Input<string>;
    /**
     * Boolean indicating whether SNMP version 3 is enabled for the organization.
     */
    v3Enabled?: pulumi.Input<boolean>;
    /**
     * The SNMP version 3 privacy mode. Can be either 'DES' or 'AES128'.
     */
    v3PrivMode?: pulumi.Input<string>;
    /**
     * The SNMP version 3 privacy password. Must be at least 8 characters if specified.
     */
    v3PrivPass?: pulumi.Input<string>;
}
