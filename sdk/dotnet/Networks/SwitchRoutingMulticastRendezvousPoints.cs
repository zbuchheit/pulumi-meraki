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
    ///     var example = new Meraki.Networks.SwitchRoutingMulticastRendezvousPoints("example", new()
    ///     {
    ///         InterfaceIp = "192.168.1.2",
    ///         MulticastGroup = "Any",
    ///         NetworkId = "string",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiNetworksSwitchRoutingMulticastRendezvousPointsExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:networks/switchRoutingMulticastRendezvousPoints:SwitchRoutingMulticastRendezvousPoints example "network_id,rendezvous_point_id"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:networks/switchRoutingMulticastRendezvousPoints:SwitchRoutingMulticastRendezvousPoints")]
    public partial class SwitchRoutingMulticastRendezvousPoints : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The IP address of the interface where the RP needs to be created.
        /// </summary>
        [Output("interfaceIp")]
        public Output<string> InterfaceIp { get; private set; } = null!;

        [Output("interfaceName")]
        public Output<string> InterfaceName { get; private set; } = null!;

        /// <summary>
        /// 'Any', or the IP address of a multicast group
        /// </summary>
        [Output("multicastGroup")]
        public Output<string> MulticastGroup { get; private set; } = null!;

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// rendezvousPointId path parameter. Rendezvous point ID
        /// </summary>
        [Output("rendezvousPointId")]
        public Output<string> RendezvousPointId { get; private set; } = null!;

        [Output("serial")]
        public Output<string> Serial { get; private set; } = null!;


        /// <summary>
        /// Create a SwitchRoutingMulticastRendezvousPoints resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SwitchRoutingMulticastRendezvousPoints(string name, SwitchRoutingMulticastRendezvousPointsArgs args, CustomResourceOptions? options = null)
            : base("meraki:networks/switchRoutingMulticastRendezvousPoints:SwitchRoutingMulticastRendezvousPoints", name, args ?? new SwitchRoutingMulticastRendezvousPointsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SwitchRoutingMulticastRendezvousPoints(string name, Input<string> id, SwitchRoutingMulticastRendezvousPointsState? state = null, CustomResourceOptions? options = null)
            : base("meraki:networks/switchRoutingMulticastRendezvousPoints:SwitchRoutingMulticastRendezvousPoints", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SwitchRoutingMulticastRendezvousPoints resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SwitchRoutingMulticastRendezvousPoints Get(string name, Input<string> id, SwitchRoutingMulticastRendezvousPointsState? state = null, CustomResourceOptions? options = null)
        {
            return new SwitchRoutingMulticastRendezvousPoints(name, id, state, options);
        }
    }

    public sealed class SwitchRoutingMulticastRendezvousPointsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP address of the interface where the RP needs to be created.
        /// </summary>
        [Input("interfaceIp")]
        public Input<string>? InterfaceIp { get; set; }

        /// <summary>
        /// 'Any', or the IP address of a multicast group
        /// </summary>
        [Input("multicastGroup")]
        public Input<string>? MulticastGroup { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// rendezvousPointId path parameter. Rendezvous point ID
        /// </summary>
        [Input("rendezvousPointId")]
        public Input<string>? RendezvousPointId { get; set; }

        public SwitchRoutingMulticastRendezvousPointsArgs()
        {
        }
        public static new SwitchRoutingMulticastRendezvousPointsArgs Empty => new SwitchRoutingMulticastRendezvousPointsArgs();
    }

    public sealed class SwitchRoutingMulticastRendezvousPointsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP address of the interface where the RP needs to be created.
        /// </summary>
        [Input("interfaceIp")]
        public Input<string>? InterfaceIp { get; set; }

        [Input("interfaceName")]
        public Input<string>? InterfaceName { get; set; }

        /// <summary>
        /// 'Any', or the IP address of a multicast group
        /// </summary>
        [Input("multicastGroup")]
        public Input<string>? MulticastGroup { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// rendezvousPointId path parameter. Rendezvous point ID
        /// </summary>
        [Input("rendezvousPointId")]
        public Input<string>? RendezvousPointId { get; set; }

        [Input("serial")]
        public Input<string>? Serial { get; set; }

        public SwitchRoutingMulticastRendezvousPointsState()
        {
        }
        public static new SwitchRoutingMulticastRendezvousPointsState Empty => new SwitchRoutingMulticastRendezvousPointsState();
    }
}