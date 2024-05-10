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
 * $ pulumi import meraki:networks/applianceSingleLan:ApplianceSingleLan example "network_id"
 * ```
 */
export class ApplianceSingleLan extends pulumi.CustomResource {
    /**
     * Get an existing ApplianceSingleLan resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplianceSingleLanState, opts?: pulumi.CustomResourceOptions): ApplianceSingleLan {
        return new ApplianceSingleLan(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/applianceSingleLan:ApplianceSingleLan';

    /**
     * Returns true if the given object is an instance of ApplianceSingleLan.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplianceSingleLan {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplianceSingleLan.__pulumiType;
    }

    /**
     * The local IP of the appliance on the single LAN
     */
    public readonly applianceIp!: pulumi.Output<string>;
    /**
     * IPv6 configuration on the single LAN
     */
    public readonly ipv6!: pulumi.Output<outputs.networks.ApplianceSingleLanIpv6>;
    /**
     * Mandatory DHCP will enforce that clients connecting to this single LAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won't be able to associate. Only available on firmware versions 17.0 and above
     */
    public readonly mandatoryDhcp!: pulumi.Output<outputs.networks.ApplianceSingleLanMandatoryDhcp>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * The subnet of the single LAN
     */
    public readonly subnet!: pulumi.Output<string>;

    /**
     * Create a ApplianceSingleLan resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplianceSingleLanArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplianceSingleLanArgs | ApplianceSingleLanState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplianceSingleLanState | undefined;
            resourceInputs["applianceIp"] = state ? state.applianceIp : undefined;
            resourceInputs["ipv6"] = state ? state.ipv6 : undefined;
            resourceInputs["mandatoryDhcp"] = state ? state.mandatoryDhcp : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["subnet"] = state ? state.subnet : undefined;
        } else {
            const args = argsOrState as ApplianceSingleLanArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["applianceIp"] = args ? args.applianceIp : undefined;
            resourceInputs["ipv6"] = args ? args.ipv6 : undefined;
            resourceInputs["mandatoryDhcp"] = args ? args.mandatoryDhcp : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["subnet"] = args ? args.subnet : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApplianceSingleLan.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplianceSingleLan resources.
 */
export interface ApplianceSingleLanState {
    /**
     * The local IP of the appliance on the single LAN
     */
    applianceIp?: pulumi.Input<string>;
    /**
     * IPv6 configuration on the single LAN
     */
    ipv6?: pulumi.Input<inputs.networks.ApplianceSingleLanIpv6>;
    /**
     * Mandatory DHCP will enforce that clients connecting to this single LAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won't be able to associate. Only available on firmware versions 17.0 and above
     */
    mandatoryDhcp?: pulumi.Input<inputs.networks.ApplianceSingleLanMandatoryDhcp>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * The subnet of the single LAN
     */
    subnet?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApplianceSingleLan resource.
 */
export interface ApplianceSingleLanArgs {
    /**
     * The local IP of the appliance on the single LAN
     */
    applianceIp?: pulumi.Input<string>;
    /**
     * IPv6 configuration on the single LAN
     */
    ipv6?: pulumi.Input<inputs.networks.ApplianceSingleLanIpv6>;
    /**
     * Mandatory DHCP will enforce that clients connecting to this single LAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won't be able to associate. Only available on firmware versions 17.0 and above
     */
    mandatoryDhcp?: pulumi.Input<inputs.networks.ApplianceSingleLanMandatoryDhcp>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * The subnet of the single LAN
     */
    subnet?: pulumi.Input<string>;
}
