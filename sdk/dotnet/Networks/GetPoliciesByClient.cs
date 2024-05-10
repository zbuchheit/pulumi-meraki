// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetPoliciesByClient
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
        ///     var example = Meraki.Networks.GetPoliciesByClient.Invoke(new()
        ///     {
        ///         EndingBefore = "string",
        ///         NetworkId = "string",
        ///         PerPage = 1,
        ///         StartingAfter = "string",
        ///         T0 = "string",
        ///         Timespan = 1,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksPoliciesByClientExample"] = example.Apply(getPoliciesByClientResult =&gt; getPoliciesByClientResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetPoliciesByClientResult> InvokeAsync(GetPoliciesByClientArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPoliciesByClientResult>("meraki:networks/getPoliciesByClient:getPoliciesByClient", args ?? new GetPoliciesByClientArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetPoliciesByClient.Invoke(new()
        ///     {
        ///         EndingBefore = "string",
        ///         NetworkId = "string",
        ///         PerPage = 1,
        ///         StartingAfter = "string",
        ///         T0 = "string",
        ///         Timespan = 1,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksPoliciesByClientExample"] = example.Apply(getPoliciesByClientResult =&gt; getPoliciesByClientResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetPoliciesByClientResult> Invoke(GetPoliciesByClientInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPoliciesByClientResult>("meraki:networks/getPoliciesByClient:getPoliciesByClient", args ?? new GetPoliciesByClientInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPoliciesByClientArgs : global::Pulumi.InvokeArgs
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
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
        /// </summary>
        [Input("perPage")]
        public int? PerPage { get; set; }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public string? StartingAfter { get; set; }

        /// <summary>
        /// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
        /// </summary>
        [Input("t0")]
        public string? T0 { get; set; }

        /// <summary>
        /// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameter t0. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
        /// </summary>
        [Input("timespan")]
        public double? Timespan { get; set; }

        public GetPoliciesByClientArgs()
        {
        }
        public static new GetPoliciesByClientArgs Empty => new GetPoliciesByClientArgs();
    }

    public sealed class GetPoliciesByClientInvokeArgs : global::Pulumi.InvokeArgs
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
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
        /// </summary>
        [Input("perPage")]
        public Input<int>? PerPage { get; set; }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public Input<string>? StartingAfter { get; set; }

        /// <summary>
        /// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
        /// </summary>
        [Input("t0")]
        public Input<string>? T0 { get; set; }

        /// <summary>
        /// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameter t0. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
        /// </summary>
        [Input("timespan")]
        public Input<double>? Timespan { get; set; }

        public GetPoliciesByClientInvokeArgs()
        {
        }
        public static new GetPoliciesByClientInvokeArgs Empty => new GetPoliciesByClientInvokeArgs();
    }


    [OutputType]
    public sealed class GetPoliciesByClientResult
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
        /// Array of ResponseNetworksGetNetworkPoliciesByClient
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPoliciesByClientItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;
        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
        /// </summary>
        public readonly int? PerPage;
        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? StartingAfter;
        /// <summary>
        /// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
        /// </summary>
        public readonly string? T0;
        /// <summary>
        /// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameter t0. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
        /// </summary>
        public readonly double? Timespan;

        [OutputConstructor]
        private GetPoliciesByClientResult(
            string? endingBefore,

            string id,

            ImmutableArray<Outputs.GetPoliciesByClientItemResult> items,

            string networkId,

            int? perPage,

            string? startingAfter,

            string? t0,

            double? timespan)
        {
            EndingBefore = endingBefore;
            Id = id;
            Items = items;
            NetworkId = networkId;
            PerPage = perPage;
            StartingAfter = startingAfter;
            T0 = t0;
            Timespan = timespan;
        }
    }
}
