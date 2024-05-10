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
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:networks/switchRoutingMulticast:SwitchRoutingMulticast example "network_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/switchRoutingMulticast:SwitchRoutingMulticast")]
    public partial class SwitchRoutingMulticast : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Default multicast setting for entire network. IGMP snooping and Flood unknown
        ///   multicast traffic settings are enabled by default.
        /// </summary>
        [Output("defaultSettings")]
        public Output<Outputs.SwitchRoutingMulticastDefaultSettings> DefaultSettings { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// Array of paired switches/stacks/profiles and corresponding multicast settings.
        ///   An empty array will clear the multicast settings.
        /// </summary>
        [Output("overrides")]
        public Output<ImmutableArray<Outputs.SwitchRoutingMulticastOverride>> Overrides { get; private set; } = null!;


        /// <summary>
        /// Create a SwitchRoutingMulticast resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SwitchRoutingMulticast(string name, SwitchRoutingMulticastArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/switchRoutingMulticast:SwitchRoutingMulticast", name, args ?? new SwitchRoutingMulticastArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SwitchRoutingMulticast(string name, Input<string> id, SwitchRoutingMulticastState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/switchRoutingMulticast:SwitchRoutingMulticast", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SwitchRoutingMulticast resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SwitchRoutingMulticast Get(string name, Input<string> id, SwitchRoutingMulticastState? state = null, CustomResourceOptions? options = null)
        {
            return new SwitchRoutingMulticast(name, id, state, options);
        }
    }

    public sealed class SwitchRoutingMulticastArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default multicast setting for entire network. IGMP snooping and Flood unknown
        ///   multicast traffic settings are enabled by default.
        /// </summary>
        [Input("defaultSettings")]
        public Input<Inputs.SwitchRoutingMulticastDefaultSettingsArgs>? DefaultSettings { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        [Input("overrides")]
        private InputList<Inputs.SwitchRoutingMulticastOverrideArgs>? _overrides;

        /// <summary>
        /// Array of paired switches/stacks/profiles and corresponding multicast settings.
        ///   An empty array will clear the multicast settings.
        /// </summary>
        public InputList<Inputs.SwitchRoutingMulticastOverrideArgs> Overrides
        {
            get => _overrides ?? (_overrides = new InputList<Inputs.SwitchRoutingMulticastOverrideArgs>());
            set => _overrides = value;
        }

        public SwitchRoutingMulticastArgs()
        {
        }
        public static new SwitchRoutingMulticastArgs Empty => new SwitchRoutingMulticastArgs();
    }

    public sealed class SwitchRoutingMulticastState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default multicast setting for entire network. IGMP snooping and Flood unknown
        ///   multicast traffic settings are enabled by default.
        /// </summary>
        [Input("defaultSettings")]
        public Input<Inputs.SwitchRoutingMulticastDefaultSettingsGetArgs>? DefaultSettings { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        [Input("overrides")]
        private InputList<Inputs.SwitchRoutingMulticastOverrideGetArgs>? _overrides;

        /// <summary>
        /// Array of paired switches/stacks/profiles and corresponding multicast settings.
        ///   An empty array will clear the multicast settings.
        /// </summary>
        public InputList<Inputs.SwitchRoutingMulticastOverrideGetArgs> Overrides
        {
            get => _overrides ?? (_overrides = new InputList<Inputs.SwitchRoutingMulticastOverrideGetArgs>());
            set => _overrides = value;
        }

        public SwitchRoutingMulticastState()
        {
        }
        public static new SwitchRoutingMulticastState Empty => new SwitchRoutingMulticastState();
    }
}
