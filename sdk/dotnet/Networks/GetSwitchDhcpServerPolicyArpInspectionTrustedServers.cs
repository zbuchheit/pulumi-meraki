// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetSwitchDhcpServerPolicyArpInspectionTrustedServers
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
        ///     var example = Meraki.Networks.GetSwitchDhcpServerPolicyArpInspectionTrustedServers.Invoke(new()
        ///     {
        ///         EndingBefore = "string",
        ///         NetworkId = "string",
        ///         PerPage = 1,
        ///         StartingAfter = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSwitchDhcpServerPolicyArpInspectionTrustedServersExample"] = example.Apply(getSwitchDhcpServerPolicyArpInspectionTrustedServersResult =&gt; getSwitchDhcpServerPolicyArpInspectionTrustedServersResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetSwitchDhcpServerPolicyArpInspectionTrustedServersResult> InvokeAsync(GetSwitchDhcpServerPolicyArpInspectionTrustedServersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSwitchDhcpServerPolicyArpInspectionTrustedServersResult>("meraki:networks/getSwitchDhcpServerPolicyArpInspectionTrustedServers:getSwitchDhcpServerPolicyArpInspectionTrustedServers", args ?? new GetSwitchDhcpServerPolicyArpInspectionTrustedServersArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetSwitchDhcpServerPolicyArpInspectionTrustedServers.Invoke(new()
        ///     {
        ///         EndingBefore = "string",
        ///         NetworkId = "string",
        ///         PerPage = 1,
        ///         StartingAfter = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSwitchDhcpServerPolicyArpInspectionTrustedServersExample"] = example.Apply(getSwitchDhcpServerPolicyArpInspectionTrustedServersResult =&gt; getSwitchDhcpServerPolicyArpInspectionTrustedServersResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSwitchDhcpServerPolicyArpInspectionTrustedServersResult> Invoke(GetSwitchDhcpServerPolicyArpInspectionTrustedServersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSwitchDhcpServerPolicyArpInspectionTrustedServersResult>("meraki:networks/getSwitchDhcpServerPolicyArpInspectionTrustedServers:getSwitchDhcpServerPolicyArpInspectionTrustedServers", args ?? new GetSwitchDhcpServerPolicyArpInspectionTrustedServersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSwitchDhcpServerPolicyArpInspectionTrustedServersArgs : global::Pulumi.InvokeArgs
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
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        [Input("perPage")]
        public int? PerPage { get; set; }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public string? StartingAfter { get; set; }

        public GetSwitchDhcpServerPolicyArpInspectionTrustedServersArgs()
        {
        }
        public static new GetSwitchDhcpServerPolicyArpInspectionTrustedServersArgs Empty => new GetSwitchDhcpServerPolicyArpInspectionTrustedServersArgs();
    }

    public sealed class GetSwitchDhcpServerPolicyArpInspectionTrustedServersInvokeArgs : global::Pulumi.InvokeArgs
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
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        [Input("perPage")]
        public Input<int>? PerPage { get; set; }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public Input<string>? StartingAfter { get; set; }

        public GetSwitchDhcpServerPolicyArpInspectionTrustedServersInvokeArgs()
        {
        }
        public static new GetSwitchDhcpServerPolicyArpInspectionTrustedServersInvokeArgs Empty => new GetSwitchDhcpServerPolicyArpInspectionTrustedServersInvokeArgs();
    }


    [OutputType]
    public sealed class GetSwitchDhcpServerPolicyArpInspectionTrustedServersResult
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
        /// Array of ResponseSwitchGetNetworkSwitchDhcpServerPolicyArpInspectionTrustedServers
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSwitchDhcpServerPolicyArpInspectionTrustedServersItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;
        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        public readonly int? PerPage;
        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? StartingAfter;

        [OutputConstructor]
        private GetSwitchDhcpServerPolicyArpInspectionTrustedServersResult(
            string? endingBefore,

            string id,

            ImmutableArray<Outputs.GetSwitchDhcpServerPolicyArpInspectionTrustedServersItemResult> items,

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
