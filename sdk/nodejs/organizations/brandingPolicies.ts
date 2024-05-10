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
 * $ pulumi import meraki:organizations/brandingPolicies:BrandingPolicies example "branding_policy_id,organization_id"
 * ```
 */
export class BrandingPolicies extends pulumi.CustomResource {
    /**
     * Get an existing BrandingPolicies resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BrandingPoliciesState, opts?: pulumi.CustomResourceOptions): BrandingPolicies {
        return new BrandingPolicies(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:organizations/brandingPolicies:BrandingPolicies';

    /**
     * Returns true if the given object is an instance of BrandingPolicies.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BrandingPolicies {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BrandingPolicies.__pulumiType;
    }

    /**
     * Settings for describing which kinds of admins this policy applies to.
     */
    public readonly adminSettings!: pulumi.Output<outputs.organizations.BrandingPoliciesAdminSettings>;
    /**
     * brandingPolicyId path parameter. Branding policy ID
     */
    public readonly brandingPolicyId!: pulumi.Output<string | undefined>;
    /**
     * Properties describing the custom logo attached to the branding policy.
     */
    public readonly customLogo!: pulumi.Output<outputs.organizations.BrandingPoliciesCustomLogo>;
    /**
     * Boolean indicating whether this policy is enabled.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Settings for describing the modifications to various Help page features. Each property in this object accepts one of
     *   'default or inherit' (do not modify functionality), 'hide' (remove the section from Dashboard), or 'show' (always show
     *   the section on Dashboard). Some properties in this object also accept custom HTML used to replace the section on
     *   Dashboard; see the documentation for each property to see the allowed values.
     */
    public readonly helpSettings!: pulumi.Output<outputs.organizations.BrandingPoliciesHelpSettings>;
    /**
     * Name of the Dashboard branding policy.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * organizationId path parameter. Organization ID
     */
    public readonly organizationId!: pulumi.Output<string>;

    /**
     * Create a BrandingPolicies resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BrandingPoliciesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BrandingPoliciesArgs | BrandingPoliciesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BrandingPoliciesState | undefined;
            resourceInputs["adminSettings"] = state ? state.adminSettings : undefined;
            resourceInputs["brandingPolicyId"] = state ? state.brandingPolicyId : undefined;
            resourceInputs["customLogo"] = state ? state.customLogo : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["helpSettings"] = state ? state.helpSettings : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
        } else {
            const args = argsOrState as BrandingPoliciesArgs | undefined;
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            resourceInputs["adminSettings"] = args ? args.adminSettings : undefined;
            resourceInputs["brandingPolicyId"] = args ? args.brandingPolicyId : undefined;
            resourceInputs["customLogo"] = args ? args.customLogo : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["helpSettings"] = args ? args.helpSettings : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BrandingPolicies.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BrandingPolicies resources.
 */
export interface BrandingPoliciesState {
    /**
     * Settings for describing which kinds of admins this policy applies to.
     */
    adminSettings?: pulumi.Input<inputs.organizations.BrandingPoliciesAdminSettings>;
    /**
     * brandingPolicyId path parameter. Branding policy ID
     */
    brandingPolicyId?: pulumi.Input<string>;
    /**
     * Properties describing the custom logo attached to the branding policy.
     */
    customLogo?: pulumi.Input<inputs.organizations.BrandingPoliciesCustomLogo>;
    /**
     * Boolean indicating whether this policy is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Settings for describing the modifications to various Help page features. Each property in this object accepts one of
     *   'default or inherit' (do not modify functionality), 'hide' (remove the section from Dashboard), or 'show' (always show
     *   the section on Dashboard). Some properties in this object also accept custom HTML used to replace the section on
     *   Dashboard; see the documentation for each property to see the allowed values.
     */
    helpSettings?: pulumi.Input<inputs.organizations.BrandingPoliciesHelpSettings>;
    /**
     * Name of the Dashboard branding policy.
     */
    name?: pulumi.Input<string>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BrandingPolicies resource.
 */
export interface BrandingPoliciesArgs {
    /**
     * Settings for describing which kinds of admins this policy applies to.
     */
    adminSettings?: pulumi.Input<inputs.organizations.BrandingPoliciesAdminSettings>;
    /**
     * brandingPolicyId path parameter. Branding policy ID
     */
    brandingPolicyId?: pulumi.Input<string>;
    /**
     * Properties describing the custom logo attached to the branding policy.
     */
    customLogo?: pulumi.Input<inputs.organizations.BrandingPoliciesCustomLogo>;
    /**
     * Boolean indicating whether this policy is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Settings for describing the modifications to various Help page features. Each property in this object accepts one of
     *   'default or inherit' (do not modify functionality), 'hide' (remove the section from Dashboard), or 'show' (always show
     *   the section on Dashboard). Some properties in this object also accept custom HTML used to replace the section on
     *   Dashboard; see the documentation for each property to see the allowed values.
     */
    helpSettings?: pulumi.Input<inputs.organizations.BrandingPoliciesHelpSettings>;
    /**
     * Name of the Dashboard branding policy.
     */
    name?: pulumi.Input<string>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
}
