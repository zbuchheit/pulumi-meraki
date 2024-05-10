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
    [MerakiResourceType("meraki:networks/smDevicesModifyTags:SmDevicesModifyTags")]
    public partial class SmDevicesModifyTags : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Array of ResponseSmModifyNetworkSmDevicesTags
        /// </summary>
        [Output("items")]
        public Output<ImmutableArray<Outputs.SmDevicesModifyTagsItem>> Items { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        [Output("parameters")]
        public Output<Outputs.SmDevicesModifyTagsParameters> Parameters { get; private set; } = null!;


        /// <summary>
        /// Create a SmDevicesModifyTags resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SmDevicesModifyTags(string name, SmDevicesModifyTagsArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/smDevicesModifyTags:SmDevicesModifyTags", name, args ?? new SmDevicesModifyTagsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SmDevicesModifyTags(string name, Input<string> id, SmDevicesModifyTagsState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/smDevicesModifyTags:SmDevicesModifyTags", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SmDevicesModifyTags resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SmDevicesModifyTags Get(string name, Input<string> id, SmDevicesModifyTagsState? state = null, CustomResourceOptions? options = null)
        {
            return new SmDevicesModifyTags(name, id, state, options);
        }
    }

    public sealed class SmDevicesModifyTagsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        [Input("parameters", required: true)]
        public Input<Inputs.SmDevicesModifyTagsParametersArgs> Parameters { get; set; } = null!;

        public SmDevicesModifyTagsArgs()
        {
        }
        public static new SmDevicesModifyTagsArgs Empty => new SmDevicesModifyTagsArgs();
    }

    public sealed class SmDevicesModifyTagsState : global::Pulumi.ResourceArgs
    {
        [Input("items")]
        private InputList<Inputs.SmDevicesModifyTagsItemGetArgs>? _items;

        /// <summary>
        /// Array of ResponseSmModifyNetworkSmDevicesTags
        /// </summary>
        public InputList<Inputs.SmDevicesModifyTagsItemGetArgs> Items
        {
            get => _items ?? (_items = new InputList<Inputs.SmDevicesModifyTagsItemGetArgs>());
            set => _items = value;
        }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        [Input("parameters")]
        public Input<Inputs.SmDevicesModifyTagsParametersGetArgs>? Parameters { get; set; }

        public SmDevicesModifyTagsState()
        {
        }
        public static new SmDevicesModifyTagsState Empty => new SmDevicesModifyTagsState();
    }
}
