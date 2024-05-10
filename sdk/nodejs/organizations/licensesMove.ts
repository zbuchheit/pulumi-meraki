// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ~>Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
 * already existed previously.
 */
export class LicensesMove extends pulumi.CustomResource {
    /**
     * Get an existing LicensesMove resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LicensesMoveState, opts?: pulumi.CustomResourceOptions): LicensesMove {
        return new LicensesMove(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:organizations/licensesMove:LicensesMove';

    /**
     * Returns true if the given object is an instance of LicensesMove.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LicensesMove {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LicensesMove.__pulumiType;
    }

    public /*out*/ readonly item!: pulumi.Output<outputs.organizations.LicensesMoveItem>;
    /**
     * organizationId path parameter. Organization ID
     */
    public readonly organizationId!: pulumi.Output<string>;
    public readonly parameters!: pulumi.Output<outputs.organizations.LicensesMoveParameters>;

    /**
     * Create a LicensesMove resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LicensesMoveArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LicensesMoveArgs | LicensesMoveState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LicensesMoveState | undefined;
            resourceInputs["item"] = state ? state.item : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
        } else {
            const args = argsOrState as LicensesMoveArgs | undefined;
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            if ((!args || args.parameters === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parameters'");
            }
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["item"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LicensesMove.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LicensesMove resources.
 */
export interface LicensesMoveState {
    item?: pulumi.Input<inputs.organizations.LicensesMoveItem>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: pulumi.Input<string>;
    parameters?: pulumi.Input<inputs.organizations.LicensesMoveParameters>;
}

/**
 * The set of arguments for constructing a LicensesMove resource.
 */
export interface LicensesMoveArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
    parameters: pulumi.Input<inputs.organizations.LicensesMoveParameters>;
}
