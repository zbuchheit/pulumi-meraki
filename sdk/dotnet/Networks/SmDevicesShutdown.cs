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
    /// </summary>
    [MerakiResourceType("meraki:networks/smDevicesShutdown:SmDevicesShutdown")]
    public partial class SmDevicesShutdown : global::Pulumi.CustomResource
    {
        [Output("item")]
        public Output<Outputs.SmDevicesShutdownItem> Item { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        [Output("parameters")]
        public Output<Outputs.SmDevicesShutdownParameters> Parameters { get; private set; } = null!;


        /// <summary>
        /// Create a SmDevicesShutdown resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SmDevicesShutdown(string name, SmDevicesShutdownArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/smDevicesShutdown:SmDevicesShutdown", name, args ?? new SmDevicesShutdownArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SmDevicesShutdown(string name, Input<string> id, SmDevicesShutdownState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/smDevicesShutdown:SmDevicesShutdown", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SmDevicesShutdown resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SmDevicesShutdown Get(string name, Input<string> id, SmDevicesShutdownState? state = null, CustomResourceOptions? options = null)
        {
            return new SmDevicesShutdown(name, id, state, options);
        }
    }

    public sealed class SmDevicesShutdownArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        [Input("parameters", required: true)]
        public Input<Inputs.SmDevicesShutdownParametersArgs> Parameters { get; set; } = null!;

        public SmDevicesShutdownArgs()
        {
        }
        public static new SmDevicesShutdownArgs Empty => new SmDevicesShutdownArgs();
    }

    public sealed class SmDevicesShutdownState : global::Pulumi.ResourceArgs
    {
        [Input("item")]
        public Input<Inputs.SmDevicesShutdownItemGetArgs>? Item { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        [Input("parameters")]
        public Input<Inputs.SmDevicesShutdownParametersGetArgs>? Parameters { get; set; }

        public SmDevicesShutdownState()
        {
        }
        public static new SmDevicesShutdownState Empty => new SmDevicesShutdownState();
    }
}
