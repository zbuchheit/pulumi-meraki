// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Administered
{
    public static class GetLicensingSubscriptionSubscriptions
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
        ///     var example = Meraki.Administered.GetLicensingSubscriptionSubscriptions.Invoke(new()
        ///     {
        ///         EndDate = "string",
        ///         EndingBefore = "string",
        ///         OrganizationIds = new[]
        ///         {
        ///             "string",
        ///         },
        ///         PerPage = 1,
        ///         ProductTypes = new[]
        ///         {
        ///             "string",
        ///         },
        ///         StartDate = "string",
        ///         StartingAfter = "string",
        ///         Statuses = new[]
        ///         {
        ///             "string",
        ///         },
        ///         SubscriptionIds = new[]
        ///         {
        ///             "string",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiAdministeredLicensingSubscriptionSubscriptionsExample"] = example.Apply(getLicensingSubscriptionSubscriptionsResult =&gt; getLicensingSubscriptionSubscriptionsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetLicensingSubscriptionSubscriptionsResult> InvokeAsync(GetLicensingSubscriptionSubscriptionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLicensingSubscriptionSubscriptionsResult>("meraki:administered/getLicensingSubscriptionSubscriptions:getLicensingSubscriptionSubscriptions", args ?? new GetLicensingSubscriptionSubscriptionsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Administered.GetLicensingSubscriptionSubscriptions.Invoke(new()
        ///     {
        ///         EndDate = "string",
        ///         EndingBefore = "string",
        ///         OrganizationIds = new[]
        ///         {
        ///             "string",
        ///         },
        ///         PerPage = 1,
        ///         ProductTypes = new[]
        ///         {
        ///             "string",
        ///         },
        ///         StartDate = "string",
        ///         StartingAfter = "string",
        ///         Statuses = new[]
        ///         {
        ///             "string",
        ///         },
        ///         SubscriptionIds = new[]
        ///         {
        ///             "string",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiAdministeredLicensingSubscriptionSubscriptionsExample"] = example.Apply(getLicensingSubscriptionSubscriptionsResult =&gt; getLicensingSubscriptionSubscriptionsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetLicensingSubscriptionSubscriptionsResult> Invoke(GetLicensingSubscriptionSubscriptionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLicensingSubscriptionSubscriptionsResult>("meraki:administered/getLicensingSubscriptionSubscriptions:getLicensingSubscriptionSubscriptions", args ?? new GetLicensingSubscriptionSubscriptionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLicensingSubscriptionSubscriptionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// endDate query parameter. Filter subscriptions by end date, ISO 8601 format. To filter with a range of dates, use 'endDate[
        /// ]=?' in the request. Accepted options include lt, gt, lte, gte.
        /// </summary>
        [Input("endDate")]
        public string? EndDate { get; set; }

        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public string? EndingBefore { get; set; }

        [Input("organizationIds")]
        private List<string>? _organizationIds;

        /// <summary>
        /// organizationIds query parameter. Organizations to get associated subscriptions for
        /// </summary>
        public List<string> OrganizationIds
        {
            get => _organizationIds ?? (_organizationIds = new List<string>());
            set => _organizationIds = value;
        }

        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        [Input("perPage")]
        public int? PerPage { get; set; }

        [Input("productTypes")]
        private List<string>? _productTypes;

        /// <summary>
        /// productTypes query parameter. List of product types that returned subscriptions need to have entitlements for.
        /// </summary>
        public List<string> ProductTypes
        {
            get => _productTypes ?? (_productTypes = new List<string>());
            set => _productTypes = value;
        }

        /// <summary>
        /// startDate query parameter. Filter subscriptions by start date, ISO 8601 format. To filter with a range of dates, use 'startDate[
        /// ]=?' in the request. Accepted options include lt, gt, lte, gte.
        /// </summary>
        [Input("startDate")]
        public string? StartDate { get; set; }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public string? StartingAfter { get; set; }

        [Input("statuses")]
        private List<string>? _statuses;

        /// <summary>
        /// statuses query parameter. List of statuses that returned subscriptions can have
        /// </summary>
        public List<string> Statuses
        {
            get => _statuses ?? (_statuses = new List<string>());
            set => _statuses = value;
        }

        [Input("subscriptionIds")]
        private List<string>? _subscriptionIds;

        /// <summary>
        /// subscriptionIds query parameter. List of subscription ids to fetch
        /// </summary>
        public List<string> SubscriptionIds
        {
            get => _subscriptionIds ?? (_subscriptionIds = new List<string>());
            set => _subscriptionIds = value;
        }

        public GetLicensingSubscriptionSubscriptionsArgs()
        {
        }
        public static new GetLicensingSubscriptionSubscriptionsArgs Empty => new GetLicensingSubscriptionSubscriptionsArgs();
    }

    public sealed class GetLicensingSubscriptionSubscriptionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// endDate query parameter. Filter subscriptions by end date, ISO 8601 format. To filter with a range of dates, use 'endDate[
        /// ]=?' in the request. Accepted options include lt, gt, lte, gte.
        /// </summary>
        [Input("endDate")]
        public Input<string>? EndDate { get; set; }

        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public Input<string>? EndingBefore { get; set; }

        [Input("organizationIds")]
        private InputList<string>? _organizationIds;

        /// <summary>
        /// organizationIds query parameter. Organizations to get associated subscriptions for
        /// </summary>
        public InputList<string> OrganizationIds
        {
            get => _organizationIds ?? (_organizationIds = new InputList<string>());
            set => _organizationIds = value;
        }

        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        [Input("perPage")]
        public Input<int>? PerPage { get; set; }

        [Input("productTypes")]
        private InputList<string>? _productTypes;

        /// <summary>
        /// productTypes query parameter. List of product types that returned subscriptions need to have entitlements for.
        /// </summary>
        public InputList<string> ProductTypes
        {
            get => _productTypes ?? (_productTypes = new InputList<string>());
            set => _productTypes = value;
        }

        /// <summary>
        /// startDate query parameter. Filter subscriptions by start date, ISO 8601 format. To filter with a range of dates, use 'startDate[
        /// ]=?' in the request. Accepted options include lt, gt, lte, gte.
        /// </summary>
        [Input("startDate")]
        public Input<string>? StartDate { get; set; }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public Input<string>? StartingAfter { get; set; }

        [Input("statuses")]
        private InputList<string>? _statuses;

        /// <summary>
        /// statuses query parameter. List of statuses that returned subscriptions can have
        /// </summary>
        public InputList<string> Statuses
        {
            get => _statuses ?? (_statuses = new InputList<string>());
            set => _statuses = value;
        }

        [Input("subscriptionIds")]
        private InputList<string>? _subscriptionIds;

        /// <summary>
        /// subscriptionIds query parameter. List of subscription ids to fetch
        /// </summary>
        public InputList<string> SubscriptionIds
        {
            get => _subscriptionIds ?? (_subscriptionIds = new InputList<string>());
            set => _subscriptionIds = value;
        }

        public GetLicensingSubscriptionSubscriptionsInvokeArgs()
        {
        }
        public static new GetLicensingSubscriptionSubscriptionsInvokeArgs Empty => new GetLicensingSubscriptionSubscriptionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetLicensingSubscriptionSubscriptionsResult
    {
        /// <summary>
        /// endDate query parameter. Filter subscriptions by end date, ISO 8601 format. To filter with a range of dates, use 'endDate[
        /// ]=?' in the request. Accepted options include lt, gt, lte, gte.
        /// </summary>
        public readonly string? EndDate;
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? EndingBefore;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Array of ResponseLicensingGetAdministeredLicensingSubscriptionSubscriptions
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLicensingSubscriptionSubscriptionsItemResult> Items;
        /// <summary>
        /// organizationIds query parameter. Organizations to get associated subscriptions for
        /// </summary>
        public readonly ImmutableArray<string> OrganizationIds;
        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        public readonly int? PerPage;
        /// <summary>
        /// productTypes query parameter. List of product types that returned subscriptions need to have entitlements for.
        /// </summary>
        public readonly ImmutableArray<string> ProductTypes;
        /// <summary>
        /// startDate query parameter. Filter subscriptions by start date, ISO 8601 format. To filter with a range of dates, use 'startDate[
        /// ]=?' in the request. Accepted options include lt, gt, lte, gte.
        /// </summary>
        public readonly string? StartDate;
        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? StartingAfter;
        /// <summary>
        /// statuses query parameter. List of statuses that returned subscriptions can have
        /// </summary>
        public readonly ImmutableArray<string> Statuses;
        /// <summary>
        /// subscriptionIds query parameter. List of subscription ids to fetch
        /// </summary>
        public readonly ImmutableArray<string> SubscriptionIds;

        [OutputConstructor]
        private GetLicensingSubscriptionSubscriptionsResult(
            string? endDate,

            string? endingBefore,

            string id,

            ImmutableArray<Outputs.GetLicensingSubscriptionSubscriptionsItemResult> items,

            ImmutableArray<string> organizationIds,

            int? perPage,

            ImmutableArray<string> productTypes,

            string? startDate,

            string? startingAfter,

            ImmutableArray<string> statuses,

            ImmutableArray<string> subscriptionIds)
        {
            EndDate = endDate;
            EndingBefore = endingBefore;
            Id = id;
            Items = items;
            OrganizationIds = organizationIds;
            PerPage = perPage;
            ProductTypes = productTypes;
            StartDate = startDate;
            StartingAfter = startingAfter;
            Statuses = statuses;
            SubscriptionIds = subscriptionIds;
        }
    }
}
