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
 * $ pulumi import meraki:networks/applianceTrafficShapingRules:ApplianceTrafficShapingRules example "network_id"
 * ```
 */
export class ApplianceTrafficShapingRules extends pulumi.CustomResource {
    /**
     * Get an existing ApplianceTrafficShapingRules resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplianceTrafficShapingRulesState, opts?: pulumi.CustomResourceOptions): ApplianceTrafficShapingRules {
        return new ApplianceTrafficShapingRules(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/applianceTrafficShapingRules:ApplianceTrafficShapingRules';

    /**
     * Returns true if the given object is an instance of ApplianceTrafficShapingRules.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplianceTrafficShapingRules {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplianceTrafficShapingRules.__pulumiType;
    }

    /**
     * Whether default traffic shaping rules are enabled (true) or disabled (false). There are 4 default rules, which can be seen on your network's traffic shaping page. Note that default rules count against the rule limit of 8.
     */
    public readonly defaultRulesEnabled!: pulumi.Output<boolean>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * An array of traffic shaping rules. Rules are applied in the order that
     * they are specified in. An empty list (or null) means no rules. Note that
     * you are allowed a maximum of 8 rules.
     */
    public readonly rules!: pulumi.Output<outputs.networks.ApplianceTrafficShapingRulesRule[]>;

    /**
     * Create a ApplianceTrafficShapingRules resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplianceTrafficShapingRulesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplianceTrafficShapingRulesArgs | ApplianceTrafficShapingRulesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplianceTrafficShapingRulesState | undefined;
            resourceInputs["defaultRulesEnabled"] = state ? state.defaultRulesEnabled : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
        } else {
            const args = argsOrState as ApplianceTrafficShapingRulesArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["defaultRulesEnabled"] = args ? args.defaultRulesEnabled : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApplianceTrafficShapingRules.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplianceTrafficShapingRules resources.
 */
export interface ApplianceTrafficShapingRulesState {
    /**
     * Whether default traffic shaping rules are enabled (true) or disabled (false). There are 4 default rules, which can be seen on your network's traffic shaping page. Note that default rules count against the rule limit of 8.
     */
    defaultRulesEnabled?: pulumi.Input<boolean>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * An array of traffic shaping rules. Rules are applied in the order that
     * they are specified in. An empty list (or null) means no rules. Note that
     * you are allowed a maximum of 8 rules.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.networks.ApplianceTrafficShapingRulesRule>[]>;
}

/**
 * The set of arguments for constructing a ApplianceTrafficShapingRules resource.
 */
export interface ApplianceTrafficShapingRulesArgs {
    /**
     * Whether default traffic shaping rules are enabled (true) or disabled (false). There are 4 default rules, which can be seen on your network's traffic shaping page. Note that default rules count against the rule limit of 8.
     */
    defaultRulesEnabled?: pulumi.Input<boolean>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * An array of traffic shaping rules. Rules are applied in the order that
     * they are specified in. An empty list (or null) means no rules. Note that
     * you are allowed a maximum of 8 rules.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.networks.ApplianceTrafficShapingRulesRule>[]>;
}
