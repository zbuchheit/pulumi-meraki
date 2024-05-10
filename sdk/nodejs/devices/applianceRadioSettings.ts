// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ~>Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
 * already existed previously.
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:devices/applianceRadioSettings:ApplianceRadioSettings example "serial"
 * ```
 */
export class ApplianceRadioSettings extends pulumi.CustomResource {
    /**
     * Get an existing ApplianceRadioSettings resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplianceRadioSettingsState, opts?: pulumi.CustomResourceOptions): ApplianceRadioSettings {
        return new ApplianceRadioSettings(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:devices/applianceRadioSettings:ApplianceRadioSettings';

    /**
     * Returns true if the given object is an instance of ApplianceRadioSettings.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplianceRadioSettings {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplianceRadioSettings.__pulumiType;
    }

    /**
     * Manual radio settings for 5 GHz
     */
    public readonly fiveGhzSettings!: pulumi.Output<outputs.devices.ApplianceRadioSettingsFiveGhzSettings>;
    /**
     * RF Profile ID
     */
    public readonly rfProfileId!: pulumi.Output<string>;
    /**
     * The device serial
     */
    public readonly serial!: pulumi.Output<string>;
    /**
     * Manual radio settings for 2.4 GHz
     */
    public readonly twoFourGhzSettings!: pulumi.Output<outputs.devices.ApplianceRadioSettingsTwoFourGhzSettings>;

    /**
     * Create a ApplianceRadioSettings resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplianceRadioSettingsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplianceRadioSettingsArgs | ApplianceRadioSettingsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplianceRadioSettingsState | undefined;
            resourceInputs["fiveGhzSettings"] = state ? state.fiveGhzSettings : undefined;
            resourceInputs["rfProfileId"] = state ? state.rfProfileId : undefined;
            resourceInputs["serial"] = state ? state.serial : undefined;
            resourceInputs["twoFourGhzSettings"] = state ? state.twoFourGhzSettings : undefined;
        } else {
            const args = argsOrState as ApplianceRadioSettingsArgs | undefined;
            if ((!args || args.serial === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serial'");
            }
            resourceInputs["fiveGhzSettings"] = args ? args.fiveGhzSettings : undefined;
            resourceInputs["rfProfileId"] = args ? args.rfProfileId : undefined;
            resourceInputs["serial"] = args ? args.serial : undefined;
            resourceInputs["twoFourGhzSettings"] = args ? args.twoFourGhzSettings : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApplianceRadioSettings.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplianceRadioSettings resources.
 */
export interface ApplianceRadioSettingsState {
    /**
     * Manual radio settings for 5 GHz
     */
    fiveGhzSettings?: pulumi.Input<inputs.devices.ApplianceRadioSettingsFiveGhzSettings>;
    /**
     * RF Profile ID
     */
    rfProfileId?: pulumi.Input<string>;
    /**
     * The device serial
     */
    serial?: pulumi.Input<string>;
    /**
     * Manual radio settings for 2.4 GHz
     */
    twoFourGhzSettings?: pulumi.Input<inputs.devices.ApplianceRadioSettingsTwoFourGhzSettings>;
}

/**
 * The set of arguments for constructing a ApplianceRadioSettings resource.
 */
export interface ApplianceRadioSettingsArgs {
    /**
     * Manual radio settings for 5 GHz
     */
    fiveGhzSettings?: pulumi.Input<inputs.devices.ApplianceRadioSettingsFiveGhzSettings>;
    /**
     * RF Profile ID
     */
    rfProfileId?: pulumi.Input<string>;
    /**
     * The device serial
     */
    serial: pulumi.Input<string>;
    /**
     * Manual radio settings for 2.4 GHz
     */
    twoFourGhzSettings?: pulumi.Input<inputs.devices.ApplianceRadioSettingsTwoFourGhzSettings>;
}
