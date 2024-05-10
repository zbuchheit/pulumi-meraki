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
    /// ~&gt;Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
    /// already existed previously.
    /// 
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
    ///     var example = new Meraki.Networks.FirmwareUpgradesStagedEventsRollbacks("example", new()
    ///     {
    ///         NetworkId = "string",
    ///         Parameters = new Meraki.Networks.Inputs.FirmwareUpgradesStagedEventsRollbacksParametersArgs
    ///         {
    ///             Reasons = new[]
    ///             {
    ///                 new Meraki.Networks.Inputs.FirmwareUpgradesStagedEventsRollbacksParametersReasonArgs
    ///                 {
    ///                     Category = "performance",
    ///                     Comment = "Network was slower with the upgrade",
    ///                 },
    ///             },
    ///             Stages = new[]
    ///             {
    ///                 new Meraki.Networks.Inputs.FirmwareUpgradesStagedEventsRollbacksParametersStageArgs
    ///                 {
    ///                     Group = new Meraki.Networks.Inputs.FirmwareUpgradesStagedEventsRollbacksParametersStageGroupArgs
    ///                     {
    ///                         Id = "1234",
    ///                     },
    ///                     Milestones = new Meraki.Networks.Inputs.FirmwareUpgradesStagedEventsRollbacksParametersStageMilestonesArgs
    ///                     {
    ///                         ScheduledFor = "2018-02-11T00:00:00Z",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiNetworksFirmwareUpgradesStagedEventsRollbacksExample"] = example,
    ///     };
    /// });
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/firmwareUpgradesStagedEventsRollbacks:FirmwareUpgradesStagedEventsRollbacks")]
    public partial class FirmwareUpgradesStagedEventsRollbacks : global::Pulumi.CustomResource
    {
        [Output("item")]
        public Output<Outputs.FirmwareUpgradesStagedEventsRollbacksItem> Item { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        [Output("parameters")]
        public Output<Outputs.FirmwareUpgradesStagedEventsRollbacksParameters> Parameters { get; private set; } = null!;


        /// <summary>
        /// Create a FirmwareUpgradesStagedEventsRollbacks resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FirmwareUpgradesStagedEventsRollbacks(string name, FirmwareUpgradesStagedEventsRollbacksArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/firmwareUpgradesStagedEventsRollbacks:FirmwareUpgradesStagedEventsRollbacks", name, args ?? new FirmwareUpgradesStagedEventsRollbacksArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FirmwareUpgradesStagedEventsRollbacks(string name, Input<string> id, FirmwareUpgradesStagedEventsRollbacksState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/firmwareUpgradesStagedEventsRollbacks:FirmwareUpgradesStagedEventsRollbacks", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FirmwareUpgradesStagedEventsRollbacks resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FirmwareUpgradesStagedEventsRollbacks Get(string name, Input<string> id, FirmwareUpgradesStagedEventsRollbacksState? state = null, CustomResourceOptions? options = null)
        {
            return new FirmwareUpgradesStagedEventsRollbacks(name, id, state, options);
        }
    }

    public sealed class FirmwareUpgradesStagedEventsRollbacksArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        [Input("parameters", required: true)]
        public Input<Inputs.FirmwareUpgradesStagedEventsRollbacksParametersArgs> Parameters { get; set; } = null!;

        public FirmwareUpgradesStagedEventsRollbacksArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsRollbacksArgs Empty => new FirmwareUpgradesStagedEventsRollbacksArgs();
    }

    public sealed class FirmwareUpgradesStagedEventsRollbacksState : global::Pulumi.ResourceArgs
    {
        [Input("item")]
        public Input<Inputs.FirmwareUpgradesStagedEventsRollbacksItemGetArgs>? Item { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        [Input("parameters")]
        public Input<Inputs.FirmwareUpgradesStagedEventsRollbacksParametersGetArgs>? Parameters { get; set; }

        public FirmwareUpgradesStagedEventsRollbacksState()
        {
        }
        public static new FirmwareUpgradesStagedEventsRollbacksState Empty => new FirmwareUpgradesStagedEventsRollbacksState();
    }
}
