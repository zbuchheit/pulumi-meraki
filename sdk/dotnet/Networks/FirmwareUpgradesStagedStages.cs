// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
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
    ///     var example = new Meraki.Networks.FirmwareUpgradesStagedStages("example", new()
    ///     {
    ///         Jsons = new[]
    ///         {
    ///             new Meraki.Networks.Inputs.FirmwareUpgradesStagedStagesJsonArgs
    ///             {
    ///                 Group = new Meraki.Networks.Inputs.FirmwareUpgradesStagedStagesJsonGroupArgs
    ///                 {
    ///                     Id = "1234",
    ///                 },
    ///             },
    ///         },
    ///         NetworkId = "string",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiNetworksFirmwareUpgradesStagedStagesExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:networks/firmwareUpgradesStagedStages:FirmwareUpgradesStagedStages example "network_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/firmwareUpgradesStagedStages:FirmwareUpgradesStagedStages")]
    public partial class FirmwareUpgradesStagedStages : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Staged Upgrade Group
        /// </summary>
        [Output("group")]
        public Output<Outputs.FirmwareUpgradesStagedStagesGroup> Group { get; private set; } = null!;

        /// <summary>
        /// Array of Staged Upgrade Groups
        /// </summary>
        [Output("jsons")]
        public Output<ImmutableArray<Outputs.FirmwareUpgradesStagedStagesJson>> Jsons { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;


        /// <summary>
        /// Create a FirmwareUpgradesStagedStages resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FirmwareUpgradesStagedStages(string name, FirmwareUpgradesStagedStagesArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/firmwareUpgradesStagedStages:FirmwareUpgradesStagedStages", name, args ?? new FirmwareUpgradesStagedStagesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FirmwareUpgradesStagedStages(string name, Input<string> id, FirmwareUpgradesStagedStagesState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/firmwareUpgradesStagedStages:FirmwareUpgradesStagedStages", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FirmwareUpgradesStagedStages resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FirmwareUpgradesStagedStages Get(string name, Input<string> id, FirmwareUpgradesStagedStagesState? state = null, CustomResourceOptions? options = null)
        {
            return new FirmwareUpgradesStagedStages(name, id, state, options);
        }
    }

    public sealed class FirmwareUpgradesStagedStagesArgs : global::Pulumi.ResourceArgs
    {
        [Input("jsons")]
        private InputList<Inputs.FirmwareUpgradesStagedStagesJsonArgs>? _jsons;

        /// <summary>
        /// Array of Staged Upgrade Groups
        /// </summary>
        public InputList<Inputs.FirmwareUpgradesStagedStagesJsonArgs> Jsons
        {
            get => _jsons ?? (_jsons = new InputList<Inputs.FirmwareUpgradesStagedStagesJsonArgs>());
            set => _jsons = value;
        }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public FirmwareUpgradesStagedStagesArgs()
        {
        }
        public static new FirmwareUpgradesStagedStagesArgs Empty => new FirmwareUpgradesStagedStagesArgs();
    }

    public sealed class FirmwareUpgradesStagedStagesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Staged Upgrade Group
        /// </summary>
        [Input("group")]
        public Input<Inputs.FirmwareUpgradesStagedStagesGroupGetArgs>? Group { get; set; }

        [Input("jsons")]
        private InputList<Inputs.FirmwareUpgradesStagedStagesJsonGetArgs>? _jsons;

        /// <summary>
        /// Array of Staged Upgrade Groups
        /// </summary>
        public InputList<Inputs.FirmwareUpgradesStagedStagesJsonGetArgs> Jsons
        {
            get => _jsons ?? (_jsons = new InputList<Inputs.FirmwareUpgradesStagedStagesJsonGetArgs>());
            set => _jsons = value;
        }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        public FirmwareUpgradesStagedStagesState()
        {
        }
        public static new FirmwareUpgradesStagedStagesState Empty => new FirmwareUpgradesStagedStagesState();
    }
}
