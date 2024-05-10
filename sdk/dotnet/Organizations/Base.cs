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
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Meraki = Pulumi.Meraki;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Meraki.Organizations.Base("example", new()
    ///     {
    ///         Management = new Meraki.Organizations.Inputs.BaseManagementArgs
    ///         {
    ///             Details = new[]
    ///             {
    ///                 new Meraki.Organizations.Inputs.BaseManagementDetailArgs
    ///                 {
    ///                     Name = "MSP ID",
    ///                     Value = "123456",
    ///                 },
    ///             },
    ///         },
    ///         Name = "My organization",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiOrganizationsExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:organizations/base:base example "organization_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:organizations/base:base")]
    public partial class Base : global::Pulumi.CustomResource
    {
        /// <summary>
        /// API related settings
        /// </summary>
        [Output("api")]
        public Output<Outputs.BaseApi> Api { get; private set; } = null!;

        /// <summary>
        /// Data for this organization
        /// </summary>
        [Output("cloud")]
        public Output<Outputs.BaseCloud> Cloud { get; private set; } = null!;

        /// <summary>
        /// Licensing related settings
        /// </summary>
        [Output("licensing")]
        public Output<Outputs.BaseLicensing> Licensing { get; private set; } = null!;

        /// <summary>
        /// Information about the organization's management system
        /// </summary>
        [Output("management")]
        public Output<Outputs.BaseManagement> Management { get; private set; } = null!;

        /// <summary>
        /// Organization name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// Organization URL
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a Base resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Base(string name, BaseArgs? args = null, CustomResourceOptions? options = null)
            : base("meraki:organizations/base:base", name, args ?? new BaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Base(string name, Input<string> id, BaseState? state = null, CustomResourceOptions? options = null)
            : base("meraki:organizations/base:base", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Base resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Base Get(string name, Input<string> id, BaseState? state = null, CustomResourceOptions? options = null)
        {
            return new Base(name, id, state, options);
        }
    }

    public sealed class BaseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// API related settings
        /// </summary>
        [Input("api")]
        public Input<Inputs.BaseApiArgs>? Api { get; set; }

        /// <summary>
        /// Information about the organization's management system
        /// </summary>
        [Input("management")]
        public Input<Inputs.BaseManagementArgs>? Management { get; set; }

        /// <summary>
        /// Organization name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        public BaseArgs()
        {
        }
        public static new BaseArgs Empty => new BaseArgs();
    }

    public sealed class BaseState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// API related settings
        /// </summary>
        [Input("api")]
        public Input<Inputs.BaseApiGetArgs>? Api { get; set; }

        /// <summary>
        /// Data for this organization
        /// </summary>
        [Input("cloud")]
        public Input<Inputs.BaseCloudGetArgs>? Cloud { get; set; }

        /// <summary>
        /// Licensing related settings
        /// </summary>
        [Input("licensing")]
        public Input<Inputs.BaseLicensingGetArgs>? Licensing { get; set; }

        /// <summary>
        /// Information about the organization's management system
        /// </summary>
        [Input("management")]
        public Input<Inputs.BaseManagementGetArgs>? Management { get; set; }

        /// <summary>
        /// Organization name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// Organization URL
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public BaseState()
        {
        }
        public static new BaseState Empty => new BaseState();
    }
}
