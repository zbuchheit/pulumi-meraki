// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:networks/switchAccessPolicies:SwitchAccessPolicies example "access_policy_number,network_id"
 * ```
 */
export class SwitchAccessPolicies extends pulumi.CustomResource {
    /**
     * Get an existing SwitchAccessPolicies resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SwitchAccessPoliciesState, opts?: pulumi.CustomResourceOptions): SwitchAccessPolicies {
        return new SwitchAccessPolicies(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/switchAccessPolicies:SwitchAccessPolicies';

    /**
     * Returns true if the given object is an instance of SwitchAccessPolicies.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SwitchAccessPolicies {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SwitchAccessPolicies.__pulumiType;
    }

    /**
     * accessPolicyNumber path parameter. Access policy number
     */
    public readonly accessPolicyNumber!: pulumi.Output<string>;
    /**
     * Access Type of the policy. Automatically 'Hybrid authentication' when hostMode is 'Multi-Domain'.
     */
    public readonly accessPolicyType!: pulumi.Output<string>;
    /**
     * Counts associated with the access policy
     */
    public /*out*/ readonly counts!: pulumi.Output<outputs.networks.SwitchAccessPoliciesCounts>;
    /**
     * 802.1x Settings
     */
    public readonly dot1x!: pulumi.Output<outputs.networks.SwitchAccessPoliciesDot1x>;
    /**
     * If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
     */
    public readonly guestPortBouncing!: pulumi.Output<boolean>;
    /**
     * ID for the guest VLAN allow unauthorized devices access to limited network resources
     */
    public readonly guestVlanId!: pulumi.Output<number>;
    /**
     * Choose the Host Mode for the access policy.
     */
    public readonly hostMode!: pulumi.Output<string>;
    /**
     * Enabling this option will make switches execute 802.1X and MAC-bypass authentication simultaneously so that clients authenticate faster. Only required when accessPolicyType is 'Hybrid Authentication.
     */
    public readonly increaseAccessSpeed!: pulumi.Output<boolean>;
    /**
     * Name of the access policy
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * Object for RADIUS Settings
     */
    public readonly radius!: pulumi.Output<outputs.networks.SwitchAccessPoliciesRadius>;
    /**
     * Enable to send start, interim-update and stop messages to a configured RADIUS accounting server for tracking connected clients
     */
    public readonly radiusAccountingEnabled!: pulumi.Output<boolean>;
    /**
     * List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
     */
    public readonly radiusAccountingServers!: pulumi.Output<outputs.networks.SwitchAccessPoliciesRadiusAccountingServer[]>;
    /**
     * Change of authentication for RADIUS re-authentication and disconnection
     */
    public readonly radiusCoaSupportEnabled!: pulumi.Output<boolean>;
    /**
     * Acceptable values are *""* for None, or *"11"* for Group Policies ACL
     */
    public readonly radiusGroupAttribute!: pulumi.Output<string>;
    /**
     * List of RADIUS servers to require connecting devices to authenticate against before granting network access
     */
    public readonly radiusServers!: pulumi.Output<outputs.networks.SwitchAccessPoliciesRadiusServer[]>;
    /**
     * If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
     */
    public readonly radiusTestingEnabled!: pulumi.Output<boolean>;
    /**
     * Enable to restrict access for clients to a responseObjectific set of IP addresses or hostnames prior to authentication
     */
    public readonly urlRedirectWalledGardenEnabled!: pulumi.Output<boolean>;
    /**
     * IP address ranges, in CIDR notation, to restrict access for clients to a specific set of IP addresses or hostnames prior to authentication
     */
    public readonly urlRedirectWalledGardenRanges!: pulumi.Output<string[]>;
    /**
     * CDP/LLDP capable voice clients will be able to use this VLAN. Automatically true when hostMode is 'Multi-Domain'.
     */
    public readonly voiceVlanClients!: pulumi.Output<boolean>;

    /**
     * Create a SwitchAccessPolicies resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SwitchAccessPoliciesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SwitchAccessPoliciesArgs | SwitchAccessPoliciesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SwitchAccessPoliciesState | undefined;
            resourceInputs["accessPolicyNumber"] = state ? state.accessPolicyNumber : undefined;
            resourceInputs["accessPolicyType"] = state ? state.accessPolicyType : undefined;
            resourceInputs["counts"] = state ? state.counts : undefined;
            resourceInputs["dot1x"] = state ? state.dot1x : undefined;
            resourceInputs["guestPortBouncing"] = state ? state.guestPortBouncing : undefined;
            resourceInputs["guestVlanId"] = state ? state.guestVlanId : undefined;
            resourceInputs["hostMode"] = state ? state.hostMode : undefined;
            resourceInputs["increaseAccessSpeed"] = state ? state.increaseAccessSpeed : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["radius"] = state ? state.radius : undefined;
            resourceInputs["radiusAccountingEnabled"] = state ? state.radiusAccountingEnabled : undefined;
            resourceInputs["radiusAccountingServers"] = state ? state.radiusAccountingServers : undefined;
            resourceInputs["radiusCoaSupportEnabled"] = state ? state.radiusCoaSupportEnabled : undefined;
            resourceInputs["radiusGroupAttribute"] = state ? state.radiusGroupAttribute : undefined;
            resourceInputs["radiusServers"] = state ? state.radiusServers : undefined;
            resourceInputs["radiusTestingEnabled"] = state ? state.radiusTestingEnabled : undefined;
            resourceInputs["urlRedirectWalledGardenEnabled"] = state ? state.urlRedirectWalledGardenEnabled : undefined;
            resourceInputs["urlRedirectWalledGardenRanges"] = state ? state.urlRedirectWalledGardenRanges : undefined;
            resourceInputs["voiceVlanClients"] = state ? state.voiceVlanClients : undefined;
        } else {
            const args = argsOrState as SwitchAccessPoliciesArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["accessPolicyNumber"] = args ? args.accessPolicyNumber : undefined;
            resourceInputs["accessPolicyType"] = args ? args.accessPolicyType : undefined;
            resourceInputs["dot1x"] = args ? args.dot1x : undefined;
            resourceInputs["guestPortBouncing"] = args ? args.guestPortBouncing : undefined;
            resourceInputs["guestVlanId"] = args ? args.guestVlanId : undefined;
            resourceInputs["hostMode"] = args ? args.hostMode : undefined;
            resourceInputs["increaseAccessSpeed"] = args ? args.increaseAccessSpeed : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["radius"] = args ? args.radius : undefined;
            resourceInputs["radiusAccountingEnabled"] = args ? args.radiusAccountingEnabled : undefined;
            resourceInputs["radiusAccountingServers"] = args ? args.radiusAccountingServers : undefined;
            resourceInputs["radiusCoaSupportEnabled"] = args ? args.radiusCoaSupportEnabled : undefined;
            resourceInputs["radiusGroupAttribute"] = args ? args.radiusGroupAttribute : undefined;
            resourceInputs["radiusServers"] = args ? args.radiusServers : undefined;
            resourceInputs["radiusTestingEnabled"] = args ? args.radiusTestingEnabled : undefined;
            resourceInputs["urlRedirectWalledGardenEnabled"] = args ? args.urlRedirectWalledGardenEnabled : undefined;
            resourceInputs["urlRedirectWalledGardenRanges"] = args ? args.urlRedirectWalledGardenRanges : undefined;
            resourceInputs["voiceVlanClients"] = args ? args.voiceVlanClients : undefined;
            resourceInputs["counts"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SwitchAccessPolicies.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SwitchAccessPolicies resources.
 */
export interface SwitchAccessPoliciesState {
    /**
     * accessPolicyNumber path parameter. Access policy number
     */
    accessPolicyNumber?: pulumi.Input<string>;
    /**
     * Access Type of the policy. Automatically 'Hybrid authentication' when hostMode is 'Multi-Domain'.
     */
    accessPolicyType?: pulumi.Input<string>;
    /**
     * Counts associated with the access policy
     */
    counts?: pulumi.Input<inputs.networks.SwitchAccessPoliciesCounts>;
    /**
     * 802.1x Settings
     */
    dot1x?: pulumi.Input<inputs.networks.SwitchAccessPoliciesDot1x>;
    /**
     * If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
     */
    guestPortBouncing?: pulumi.Input<boolean>;
    /**
     * ID for the guest VLAN allow unauthorized devices access to limited network resources
     */
    guestVlanId?: pulumi.Input<number>;
    /**
     * Choose the Host Mode for the access policy.
     */
    hostMode?: pulumi.Input<string>;
    /**
     * Enabling this option will make switches execute 802.1X and MAC-bypass authentication simultaneously so that clients authenticate faster. Only required when accessPolicyType is 'Hybrid Authentication.
     */
    increaseAccessSpeed?: pulumi.Input<boolean>;
    /**
     * Name of the access policy
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * Object for RADIUS Settings
     */
    radius?: pulumi.Input<inputs.networks.SwitchAccessPoliciesRadius>;
    /**
     * Enable to send start, interim-update and stop messages to a configured RADIUS accounting server for tracking connected clients
     */
    radiusAccountingEnabled?: pulumi.Input<boolean>;
    /**
     * List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
     */
    radiusAccountingServers?: pulumi.Input<pulumi.Input<inputs.networks.SwitchAccessPoliciesRadiusAccountingServer>[]>;
    /**
     * Change of authentication for RADIUS re-authentication and disconnection
     */
    radiusCoaSupportEnabled?: pulumi.Input<boolean>;
    /**
     * Acceptable values are *""* for None, or *"11"* for Group Policies ACL
     */
    radiusGroupAttribute?: pulumi.Input<string>;
    /**
     * List of RADIUS servers to require connecting devices to authenticate against before granting network access
     */
    radiusServers?: pulumi.Input<pulumi.Input<inputs.networks.SwitchAccessPoliciesRadiusServer>[]>;
    /**
     * If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
     */
    radiusTestingEnabled?: pulumi.Input<boolean>;
    /**
     * Enable to restrict access for clients to a responseObjectific set of IP addresses or hostnames prior to authentication
     */
    urlRedirectWalledGardenEnabled?: pulumi.Input<boolean>;
    /**
     * IP address ranges, in CIDR notation, to restrict access for clients to a specific set of IP addresses or hostnames prior to authentication
     */
    urlRedirectWalledGardenRanges?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * CDP/LLDP capable voice clients will be able to use this VLAN. Automatically true when hostMode is 'Multi-Domain'.
     */
    voiceVlanClients?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a SwitchAccessPolicies resource.
 */
export interface SwitchAccessPoliciesArgs {
    /**
     * accessPolicyNumber path parameter. Access policy number
     */
    accessPolicyNumber?: pulumi.Input<string>;
    /**
     * Access Type of the policy. Automatically 'Hybrid authentication' when hostMode is 'Multi-Domain'.
     */
    accessPolicyType?: pulumi.Input<string>;
    /**
     * 802.1x Settings
     */
    dot1x?: pulumi.Input<inputs.networks.SwitchAccessPoliciesDot1x>;
    /**
     * If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
     */
    guestPortBouncing?: pulumi.Input<boolean>;
    /**
     * ID for the guest VLAN allow unauthorized devices access to limited network resources
     */
    guestVlanId?: pulumi.Input<number>;
    /**
     * Choose the Host Mode for the access policy.
     */
    hostMode?: pulumi.Input<string>;
    /**
     * Enabling this option will make switches execute 802.1X and MAC-bypass authentication simultaneously so that clients authenticate faster. Only required when accessPolicyType is 'Hybrid Authentication.
     */
    increaseAccessSpeed?: pulumi.Input<boolean>;
    /**
     * Name of the access policy
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * Object for RADIUS Settings
     */
    radius?: pulumi.Input<inputs.networks.SwitchAccessPoliciesRadius>;
    /**
     * Enable to send start, interim-update and stop messages to a configured RADIUS accounting server for tracking connected clients
     */
    radiusAccountingEnabled?: pulumi.Input<boolean>;
    /**
     * List of RADIUS accounting servers to require connecting devices to authenticate against before granting network access
     */
    radiusAccountingServers?: pulumi.Input<pulumi.Input<inputs.networks.SwitchAccessPoliciesRadiusAccountingServer>[]>;
    /**
     * Change of authentication for RADIUS re-authentication and disconnection
     */
    radiusCoaSupportEnabled?: pulumi.Input<boolean>;
    /**
     * Acceptable values are *""* for None, or *"11"* for Group Policies ACL
     */
    radiusGroupAttribute?: pulumi.Input<string>;
    /**
     * List of RADIUS servers to require connecting devices to authenticate against before granting network access
     */
    radiusServers?: pulumi.Input<pulumi.Input<inputs.networks.SwitchAccessPoliciesRadiusServer>[]>;
    /**
     * If enabled, Meraki devices will periodically send access-request messages to these RADIUS servers
     */
    radiusTestingEnabled?: pulumi.Input<boolean>;
    /**
     * Enable to restrict access for clients to a responseObjectific set of IP addresses or hostnames prior to authentication
     */
    urlRedirectWalledGardenEnabled?: pulumi.Input<boolean>;
    /**
     * IP address ranges, in CIDR notation, to restrict access for clients to a specific set of IP addresses or hostnames prior to authentication
     */
    urlRedirectWalledGardenRanges?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * CDP/LLDP capable voice clients will be able to use this VLAN. Automatically true when hostMode is 'Multi-Domain'.
     */
    voiceVlanClients?: pulumi.Input<boolean>;
}
