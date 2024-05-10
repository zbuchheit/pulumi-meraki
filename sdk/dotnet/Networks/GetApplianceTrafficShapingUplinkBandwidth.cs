// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetApplianceTrafficShapingUplinkBandwidth
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
        ///     var example = Meraki.Networks.GetApplianceTrafficShapingUplinkBandwidth.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceTrafficShapingUplinkBandwidthExample"] = example.Apply(getApplianceTrafficShapingUplinkBandwidthResult =&gt; getApplianceTrafficShapingUplinkBandwidthResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetApplianceTrafficShapingUplinkBandwidthResult> InvokeAsync(GetApplianceTrafficShapingUplinkBandwidthArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplianceTrafficShapingUplinkBandwidthResult>("meraki:networks/getApplianceTrafficShapingUplinkBandwidth:getApplianceTrafficShapingUplinkBandwidth", args ?? new GetApplianceTrafficShapingUplinkBandwidthArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetApplianceTrafficShapingUplinkBandwidth.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceTrafficShapingUplinkBandwidthExample"] = example.Apply(getApplianceTrafficShapingUplinkBandwidthResult =&gt; getApplianceTrafficShapingUplinkBandwidthResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplianceTrafficShapingUplinkBandwidthResult> Invoke(GetApplianceTrafficShapingUplinkBandwidthInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplianceTrafficShapingUplinkBandwidthResult>("meraki:networks/getApplianceTrafficShapingUplinkBandwidth:getApplianceTrafficShapingUplinkBandwidth", args ?? new GetApplianceTrafficShapingUplinkBandwidthInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplianceTrafficShapingUplinkBandwidthArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetApplianceTrafficShapingUplinkBandwidthArgs()
        {
        }
        public static new GetApplianceTrafficShapingUplinkBandwidthArgs Empty => new GetApplianceTrafficShapingUplinkBandwidthArgs();
    }

    public sealed class GetApplianceTrafficShapingUplinkBandwidthInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetApplianceTrafficShapingUplinkBandwidthInvokeArgs()
        {
        }
        public static new GetApplianceTrafficShapingUplinkBandwidthInvokeArgs Empty => new GetApplianceTrafficShapingUplinkBandwidthInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplianceTrafficShapingUplinkBandwidthResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetApplianceTrafficShapingUplinkBandwidthItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetApplianceTrafficShapingUplinkBandwidthResult(
            string id,

            Outputs.GetApplianceTrafficShapingUplinkBandwidthItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}
