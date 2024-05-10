// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetWirelessMeshStatuses
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
        ///     var example = Meraki.Networks.GetWirelessMeshStatuses.Invoke(new()
        ///     {
        ///         EndingBefore = "string",
        ///         NetworkId = "string",
        ///         PerPage = 1,
        ///         StartingAfter = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessMeshStatusesExample"] = example.Apply(getWirelessMeshStatusesResult =&gt; getWirelessMeshStatusesResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetWirelessMeshStatusesResult> InvokeAsync(GetWirelessMeshStatusesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWirelessMeshStatusesResult>("meraki:networks/getWirelessMeshStatuses:getWirelessMeshStatuses", args ?? new GetWirelessMeshStatusesArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetWirelessMeshStatuses.Invoke(new()
        ///     {
        ///         EndingBefore = "string",
        ///         NetworkId = "string",
        ///         PerPage = 1,
        ///         StartingAfter = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessMeshStatusesExample"] = example.Apply(getWirelessMeshStatusesResult =&gt; getWirelessMeshStatusesResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetWirelessMeshStatusesResult> Invoke(GetWirelessMeshStatusesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWirelessMeshStatusesResult>("meraki:networks/getWirelessMeshStatuses:getWirelessMeshStatuses", args ?? new GetWirelessMeshStatusesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWirelessMeshStatusesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public string? EndingBefore { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 500. Default is 50.
        /// </summary>
        [Input("perPage")]
        public int? PerPage { get; set; }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public string? StartingAfter { get; set; }

        public GetWirelessMeshStatusesArgs()
        {
        }
        public static new GetWirelessMeshStatusesArgs Empty => new GetWirelessMeshStatusesArgs();
    }

    public sealed class GetWirelessMeshStatusesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public Input<string>? EndingBefore { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 500. Default is 50.
        /// </summary>
        [Input("perPage")]
        public Input<int>? PerPage { get; set; }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public Input<string>? StartingAfter { get; set; }

        public GetWirelessMeshStatusesInvokeArgs()
        {
        }
        public static new GetWirelessMeshStatusesInvokeArgs Empty => new GetWirelessMeshStatusesInvokeArgs();
    }


    [OutputType]
    public sealed class GetWirelessMeshStatusesResult
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? EndingBefore;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Array of ResponseWirelessGetNetworkWirelessMeshStatuses
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWirelessMeshStatusesItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;
        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 500. Default is 50.
        /// </summary>
        public readonly int? PerPage;
        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? StartingAfter;

        [OutputConstructor]
        private GetWirelessMeshStatusesResult(
            string? endingBefore,

            string id,

            ImmutableArray<Outputs.GetWirelessMeshStatusesItemResult> items,

            string networkId,

            int? perPage,

            string? startingAfter)
        {
            EndingBefore = endingBefore;
            Id = id;
            Items = items;
            NetworkId = networkId;
            PerPage = perPage;
            StartingAfter = startingAfter;
        }
    }
}
