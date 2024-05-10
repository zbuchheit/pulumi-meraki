// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    public static class GetCellularGatewayUplinkStatuses
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
        ///     var example = Meraki.Organizations.GetCellularGatewayUplinkStatuses.Invoke(new()
        ///     {
        ///         EndingBefore = "string",
        ///         Iccids = new[]
        ///         {
        ///             "string",
        ///         },
        ///         NetworkIds = new[]
        ///         {
        ///             "string",
        ///         },
        ///         OrganizationId = "string",
        ///         PerPage = 1,
        ///         Serials = new[]
        ///         {
        ///             "string",
        ///         },
        ///         StartingAfter = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsCellularGatewayUplinkStatusesExample"] = example.Apply(getCellularGatewayUplinkStatusesResult =&gt; getCellularGatewayUplinkStatusesResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetCellularGatewayUplinkStatusesResult> InvokeAsync(GetCellularGatewayUplinkStatusesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCellularGatewayUplinkStatusesResult>("meraki:organizations/getCellularGatewayUplinkStatuses:getCellularGatewayUplinkStatuses", args ?? new GetCellularGatewayUplinkStatusesArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Organizations.GetCellularGatewayUplinkStatuses.Invoke(new()
        ///     {
        ///         EndingBefore = "string",
        ///         Iccids = new[]
        ///         {
        ///             "string",
        ///         },
        ///         NetworkIds = new[]
        ///         {
        ///             "string",
        ///         },
        ///         OrganizationId = "string",
        ///         PerPage = 1,
        ///         Serials = new[]
        ///         {
        ///             "string",
        ///         },
        ///         StartingAfter = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsCellularGatewayUplinkStatusesExample"] = example.Apply(getCellularGatewayUplinkStatusesResult =&gt; getCellularGatewayUplinkStatusesResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetCellularGatewayUplinkStatusesResult> Invoke(GetCellularGatewayUplinkStatusesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCellularGatewayUplinkStatusesResult>("meraki:organizations/getCellularGatewayUplinkStatuses:getCellularGatewayUplinkStatuses", args ?? new GetCellularGatewayUplinkStatusesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCellularGatewayUplinkStatusesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public string? EndingBefore { get; set; }

        [Input("iccids")]
        private List<string>? _iccids;

        /// <summary>
        /// iccids query parameter. A list of ICCIDs. The returned devices will be filtered to only include these ICCIDs.
        /// </summary>
        public List<string> Iccids
        {
            get => _iccids ?? (_iccids = new List<string>());
            set => _iccids = value;
        }

        [Input("networkIds")]
        private List<string>? _networkIds;

        /// <summary>
        /// networkIds query parameter. A list of network IDs. The returned devices will be filtered to only include these networks.
        /// </summary>
        public List<string> NetworkIds
        {
            get => _networkIds ?? (_networkIds = new List<string>());
            set => _networkIds = value;
        }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public string OrganizationId { get; set; } = null!;

        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        [Input("perPage")]
        public int? PerPage { get; set; }

        [Input("serials")]
        private List<string>? _serials;

        /// <summary>
        /// serials query parameter. A list of serial numbers. The returned devices will be filtered to only include these serials.
        /// </summary>
        public List<string> Serials
        {
            get => _serials ?? (_serials = new List<string>());
            set => _serials = value;
        }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public string? StartingAfter { get; set; }

        public GetCellularGatewayUplinkStatusesArgs()
        {
        }
        public static new GetCellularGatewayUplinkStatusesArgs Empty => new GetCellularGatewayUplinkStatusesArgs();
    }

    public sealed class GetCellularGatewayUplinkStatusesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public Input<string>? EndingBefore { get; set; }

        [Input("iccids")]
        private InputList<string>? _iccids;

        /// <summary>
        /// iccids query parameter. A list of ICCIDs. The returned devices will be filtered to only include these ICCIDs.
        /// </summary>
        public InputList<string> Iccids
        {
            get => _iccids ?? (_iccids = new InputList<string>());
            set => _iccids = value;
        }

        [Input("networkIds")]
        private InputList<string>? _networkIds;

        /// <summary>
        /// networkIds query parameter. A list of network IDs. The returned devices will be filtered to only include these networks.
        /// </summary>
        public InputList<string> NetworkIds
        {
            get => _networkIds ?? (_networkIds = new InputList<string>());
            set => _networkIds = value;
        }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        [Input("perPage")]
        public Input<int>? PerPage { get; set; }

        [Input("serials")]
        private InputList<string>? _serials;

        /// <summary>
        /// serials query parameter. A list of serial numbers. The returned devices will be filtered to only include these serials.
        /// </summary>
        public InputList<string> Serials
        {
            get => _serials ?? (_serials = new InputList<string>());
            set => _serials = value;
        }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public Input<string>? StartingAfter { get; set; }

        public GetCellularGatewayUplinkStatusesInvokeArgs()
        {
        }
        public static new GetCellularGatewayUplinkStatusesInvokeArgs Empty => new GetCellularGatewayUplinkStatusesInvokeArgs();
    }


    [OutputType]
    public sealed class GetCellularGatewayUplinkStatusesResult
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? EndingBefore;
        /// <summary>
        /// iccids query parameter. A list of ICCIDs. The returned devices will be filtered to only include these ICCIDs.
        /// </summary>
        public readonly ImmutableArray<string> Iccids;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Array of ResponseCellularGatewayGetOrganizationCellularGatewayUplinkStatuses
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCellularGatewayUplinkStatusesItemResult> Items;
        /// <summary>
        /// networkIds query parameter. A list of network IDs. The returned devices will be filtered to only include these networks.
        /// </summary>
        public readonly ImmutableArray<string> NetworkIds;
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        public readonly string OrganizationId;
        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        public readonly int? PerPage;
        /// <summary>
        /// serials query parameter. A list of serial numbers. The returned devices will be filtered to only include these serials.
        /// </summary>
        public readonly ImmutableArray<string> Serials;
        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? StartingAfter;

        [OutputConstructor]
        private GetCellularGatewayUplinkStatusesResult(
            string? endingBefore,

            ImmutableArray<string> iccids,

            string id,

            ImmutableArray<Outputs.GetCellularGatewayUplinkStatusesItemResult> items,

            ImmutableArray<string> networkIds,

            string organizationId,

            int? perPage,

            ImmutableArray<string> serials,

            string? startingAfter)
        {
            EndingBefore = endingBefore;
            Iccids = iccids;
            Id = id;
            Items = items;
            NetworkIds = networkIds;
            OrganizationId = organizationId;
            PerPage = perPage;
            Serials = serials;
            StartingAfter = startingAfter;
        }
    }
}
