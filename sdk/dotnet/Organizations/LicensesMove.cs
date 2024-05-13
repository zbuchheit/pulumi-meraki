// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    /// <summary>
    /// ~&gt;Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
    /// already existed previously.
    /// </summary>
    [MerakiResourceType("meraki:organizations/licensesMove:LicensesMove")]
    public partial class LicensesMove : global::Pulumi.CustomResource
    {
        [Output("item")]
        public Output<Outputs.LicensesMoveItem> Item { get; private set; } = null!;

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        [Output("parameters")]
        public Output<Outputs.LicensesMoveParameters> Parameters { get; private set; } = null!;


        /// <summary>
        /// Create a LicensesMove resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LicensesMove(string name, LicensesMoveArgs args, CustomResourceOptions? options = null)
            : base("meraki:organizations/licensesMove:LicensesMove", name, args ?? new LicensesMoveArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LicensesMove(string name, Input<string> id, LicensesMoveState? state = null, CustomResourceOptions? options = null)
            : base("meraki:organizations/licensesMove:LicensesMove", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-meraki",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LicensesMove resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LicensesMove Get(string name, Input<string> id, LicensesMoveState? state = null, CustomResourceOptions? options = null)
        {
            return new LicensesMove(name, id, state, options);
        }
    }

    public sealed class LicensesMoveArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        [Input("parameters", required: true)]
        public Input<Inputs.LicensesMoveParametersArgs> Parameters { get; set; } = null!;

        public LicensesMoveArgs()
        {
        }
        public static new LicensesMoveArgs Empty => new LicensesMoveArgs();
    }

    public sealed class LicensesMoveState : global::Pulumi.ResourceArgs
    {
        [Input("item")]
        public Input<Inputs.LicensesMoveItemGetArgs>? Item { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        [Input("parameters")]
        public Input<Inputs.LicensesMoveParametersGetArgs>? Parameters { get; set; }

        public LicensesMoveState()
        {
        }
        public static new LicensesMoveState Empty => new LicensesMoveState();
    }
}