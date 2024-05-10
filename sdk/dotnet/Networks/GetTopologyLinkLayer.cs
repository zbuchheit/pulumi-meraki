// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetTopologyLinkLayer
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
        ///     var example = Meraki.Networks.GetTopologyLinkLayer.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksTopologyLinkLayerExample"] = example.Apply(getTopologyLinkLayerResult =&gt; getTopologyLinkLayerResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetTopologyLinkLayerResult> InvokeAsync(GetTopologyLinkLayerArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTopologyLinkLayerResult>("meraki:networks/getTopologyLinkLayer:getTopologyLinkLayer", args ?? new GetTopologyLinkLayerArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetTopologyLinkLayer.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksTopologyLinkLayerExample"] = example.Apply(getTopologyLinkLayerResult =&gt; getTopologyLinkLayerResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTopologyLinkLayerResult> Invoke(GetTopologyLinkLayerInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTopologyLinkLayerResult>("meraki:networks/getTopologyLinkLayer:getTopologyLinkLayer", args ?? new GetTopologyLinkLayerInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTopologyLinkLayerArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetTopologyLinkLayerArgs()
        {
        }
        public static new GetTopologyLinkLayerArgs Empty => new GetTopologyLinkLayerArgs();
    }

    public sealed class GetTopologyLinkLayerInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetTopologyLinkLayerInvokeArgs()
        {
        }
        public static new GetTopologyLinkLayerInvokeArgs Empty => new GetTopologyLinkLayerInvokeArgs();
    }


    [OutputType]
    public sealed class GetTopologyLinkLayerResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetTopologyLinkLayerItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetTopologyLinkLayerResult(
            string id,

            Outputs.GetTopologyLinkLayerItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}
