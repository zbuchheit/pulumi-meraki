// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    public static class GetSmSentryPoliciesAssignmentsByNetwork
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
        ///     var example = Meraki.Organizations.GetSmSentryPoliciesAssignmentsByNetwork.Invoke(new()
        ///     {
        ///         EndingBefore = "string",
        ///         NetworkIds = new[]
        ///         {
        ///             "string",
        ///         },
        ///         OrganizationId = "string",
        ///         PerPage = 1,
        ///         StartingAfter = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsSmSentryPoliciesAssignmentsByNetworkExample"] = example.Apply(getSmSentryPoliciesAssignmentsByNetworkResult =&gt; getSmSentryPoliciesAssignmentsByNetworkResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetSmSentryPoliciesAssignmentsByNetworkResult> InvokeAsync(GetSmSentryPoliciesAssignmentsByNetworkArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSmSentryPoliciesAssignmentsByNetworkResult>("meraki:organizations/getSmSentryPoliciesAssignmentsByNetwork:getSmSentryPoliciesAssignmentsByNetwork", args ?? new GetSmSentryPoliciesAssignmentsByNetworkArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Organizations.GetSmSentryPoliciesAssignmentsByNetwork.Invoke(new()
        ///     {
        ///         EndingBefore = "string",
        ///         NetworkIds = new[]
        ///         {
        ///             "string",
        ///         },
        ///         OrganizationId = "string",
        ///         PerPage = 1,
        ///         StartingAfter = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsSmSentryPoliciesAssignmentsByNetworkExample"] = example.Apply(getSmSentryPoliciesAssignmentsByNetworkResult =&gt; getSmSentryPoliciesAssignmentsByNetworkResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSmSentryPoliciesAssignmentsByNetworkResult> Invoke(GetSmSentryPoliciesAssignmentsByNetworkInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSmSentryPoliciesAssignmentsByNetworkResult>("meraki:organizations/getSmSentryPoliciesAssignmentsByNetwork:getSmSentryPoliciesAssignmentsByNetwork", args ?? new GetSmSentryPoliciesAssignmentsByNetworkInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSmSentryPoliciesAssignmentsByNetworkArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public string? EndingBefore { get; set; }

        [Input("networkIds")]
        private List<string>? _networkIds;

        /// <summary>
        /// networkIds query parameter. Optional parameter to filter Sentry Policies by Network Id
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
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
        /// </summary>
        [Input("perPage")]
        public int? PerPage { get; set; }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public string? StartingAfter { get; set; }

        public GetSmSentryPoliciesAssignmentsByNetworkArgs()
        {
        }
        public static new GetSmSentryPoliciesAssignmentsByNetworkArgs Empty => new GetSmSentryPoliciesAssignmentsByNetworkArgs();
    }

    public sealed class GetSmSentryPoliciesAssignmentsByNetworkInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public Input<string>? EndingBefore { get; set; }

        [Input("networkIds")]
        private InputList<string>? _networkIds;

        /// <summary>
        /// networkIds query parameter. Optional parameter to filter Sentry Policies by Network Id
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
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
        /// </summary>
        [Input("perPage")]
        public Input<int>? PerPage { get; set; }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public Input<string>? StartingAfter { get; set; }

        public GetSmSentryPoliciesAssignmentsByNetworkInvokeArgs()
        {
        }
        public static new GetSmSentryPoliciesAssignmentsByNetworkInvokeArgs Empty => new GetSmSentryPoliciesAssignmentsByNetworkInvokeArgs();
    }


    [OutputType]
    public sealed class GetSmSentryPoliciesAssignmentsByNetworkResult
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
        /// Array of ResponseSmGetOrganizationSmSentryPoliciesAssignmentsByNetwork
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSmSentryPoliciesAssignmentsByNetworkItemResult> Items;
        /// <summary>
        /// networkIds query parameter. Optional parameter to filter Sentry Policies by Network Id
        /// </summary>
        public readonly ImmutableArray<string> NetworkIds;
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        public readonly string OrganizationId;
        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
        /// </summary>
        public readonly int? PerPage;
        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? StartingAfter;

        [OutputConstructor]
        private GetSmSentryPoliciesAssignmentsByNetworkResult(
            string? endingBefore,

            string id,

            ImmutableArray<Outputs.GetSmSentryPoliciesAssignmentsByNetworkItemResult> items,

            ImmutableArray<string> networkIds,

            string organizationId,

            int? perPage,

            string? startingAfter)
        {
            EndingBefore = endingBefore;
            Id = id;
            Items = items;
            NetworkIds = networkIds;
            OrganizationId = organizationId;
            PerPage = perPage;
            StartingAfter = startingAfter;
        }
    }
}
