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
 * $ pulumi import meraki:networks/alertsSettings:AlertsSettings example "network_id"
 * ```
 */
export class AlertsSettings extends pulumi.CustomResource {
    /**
     * Get an existing AlertsSettings resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlertsSettingsState, opts?: pulumi.CustomResourceOptions): AlertsSettings {
        return new AlertsSettings(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/alertsSettings:AlertsSettings';

    /**
     * Returns true if the given object is an instance of AlertsSettings.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AlertsSettings {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AlertsSettings.__pulumiType;
    }

    /**
     * Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
     */
    public readonly alerts!: pulumi.Output<outputs.networks.AlertsSettingsAlert[] | undefined>;
    /**
     * Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
     */
    public /*out*/ readonly alertsResponses!: pulumi.Output<outputs.networks.AlertsSettingsAlertsResponse[]>;
    /**
     * The network-wide destinations for all alerts on the network.
     */
    public readonly defaultDestinations!: pulumi.Output<outputs.networks.AlertsSettingsDefaultDestinations>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;

    /**
     * Create a AlertsSettings resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlertsSettingsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlertsSettingsArgs | AlertsSettingsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlertsSettingsState | undefined;
            resourceInputs["alerts"] = state ? state.alerts : undefined;
            resourceInputs["alertsResponses"] = state ? state.alertsResponses : undefined;
            resourceInputs["defaultDestinations"] = state ? state.defaultDestinations : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
        } else {
            const args = argsOrState as AlertsSettingsArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["alerts"] = args ? args.alerts : undefined;
            resourceInputs["defaultDestinations"] = args ? args.defaultDestinations : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["alertsResponses"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AlertsSettings.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlertsSettings resources.
 */
export interface AlertsSettingsState {
    /**
     * Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
     */
    alerts?: pulumi.Input<pulumi.Input<inputs.networks.AlertsSettingsAlert>[]>;
    /**
     * Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
     */
    alertsResponses?: pulumi.Input<pulumi.Input<inputs.networks.AlertsSettingsAlertsResponse>[]>;
    /**
     * The network-wide destinations for all alerts on the network.
     */
    defaultDestinations?: pulumi.Input<inputs.networks.AlertsSettingsDefaultDestinations>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AlertsSettings resource.
 */
export interface AlertsSettingsArgs {
    /**
     * Alert-specific configuration for each type. Only alerts that pertain to the network can be updated.
     */
    alerts?: pulumi.Input<pulumi.Input<inputs.networks.AlertsSettingsAlert>[]>;
    /**
     * The network-wide destinations for all alerts on the network.
     */
    defaultDestinations?: pulumi.Input<inputs.networks.AlertsSettingsDefaultDestinations>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}