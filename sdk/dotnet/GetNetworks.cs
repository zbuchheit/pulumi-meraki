// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki
{
    public static class GetNetworks
    {
        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Task<GetNetworksResult> InvokeAsync(GetNetworksArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworksResult>("meraki:index/getNetworks:getNetworks", args ?? new GetNetworksArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetNetworksResult> Invoke(GetNetworksInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworksResult>("meraki:index/getNetworks:getNetworks", args ?? new GetNetworksInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworksArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// configTemplateId query parameter. An optional parameter that is the ID of a config template. Will return all networks bound to that template.
        /// </summary>
        [Input("configTemplateId")]
        public string? ConfigTemplateId { get; set; }

        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public string? EndingBefore { get; set; }

        /// <summary>
        /// isBoundToConfigTemplate query parameter. An optional parameter to filter config template bound networks. If configTemplateId is set, this cannot be false.
        /// </summary>
        [Input("isBoundToConfigTemplate")]
        public bool? IsBoundToConfigTemplate { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public string? NetworkId { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public string? OrganizationId { get; set; }

        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 100000. Default is 1000.
        /// </summary>
        [Input("perPage")]
        public int? PerPage { get; set; }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public string? StartingAfter { get; set; }

        [Input("tags")]
        private List<string>? _tags;

        /// <summary>
        /// tags query parameter. An optional parameter to filter networks by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below).
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        /// <summary>
        /// tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
        /// </summary>
        [Input("tagsFilterType")]
        public string? TagsFilterType { get; set; }

        public GetNetworksArgs()
        {
        }
        public static new GetNetworksArgs Empty => new GetNetworksArgs();
    }

    public sealed class GetNetworksInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// configTemplateId query parameter. An optional parameter that is the ID of a config template. Will return all networks bound to that template.
        /// </summary>
        [Input("configTemplateId")]
        public Input<string>? ConfigTemplateId { get; set; }

        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public Input<string>? EndingBefore { get; set; }

        /// <summary>
        /// isBoundToConfigTemplate query parameter. An optional parameter to filter config template bound networks. If configTemplateId is set, this cannot be false.
        /// </summary>
        [Input("isBoundToConfigTemplate")]
        public Input<bool>? IsBoundToConfigTemplate { get; set; }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 100000. Default is 1000.
        /// </summary>
        [Input("perPage")]
        public Input<int>? PerPage { get; set; }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public Input<string>? StartingAfter { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// tags query parameter. An optional parameter to filter networks by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below).
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
        /// </summary>
        [Input("tagsFilterType")]
        public Input<string>? TagsFilterType { get; set; }

        public GetNetworksInvokeArgs()
        {
        }
        public static new GetNetworksInvokeArgs Empty => new GetNetworksInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworksResult
    {
        /// <summary>
        /// configTemplateId query parameter. An optional parameter that is the ID of a config template. Will return all networks bound to that template.
        /// </summary>
        public readonly string? ConfigTemplateId;
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? EndingBefore;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// isBoundToConfigTemplate query parameter. An optional parameter to filter config template bound networks. If configTemplateId is set, this cannot be false.
        /// </summary>
        public readonly bool? IsBoundToConfigTemplate;
        public readonly Outputs.GetNetworksItemResult Item;
        /// <summary>
        /// Array of ResponseOrganizationsGetOrganizationNetworks
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworksItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string? NetworkId;
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        public readonly string? OrganizationId;
        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 100000. Default is 1000.
        /// </summary>
        public readonly int? PerPage;
        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? StartingAfter;
        /// <summary>
        /// tags query parameter. An optional parameter to filter networks by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below).
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
        /// </summary>
        public readonly string? TagsFilterType;

        [OutputConstructor]
        private GetNetworksResult(
            string? configTemplateId,

            string? endingBefore,

            string id,

            bool? isBoundToConfigTemplate,

            Outputs.GetNetworksItemResult item,

            ImmutableArray<Outputs.GetNetworksItemResult> items,

            string? networkId,

            string? organizationId,

            int? perPage,

            string? startingAfter,

            ImmutableArray<string> tags,

            string? tagsFilterType)
        {
            ConfigTemplateId = configTemplateId;
            EndingBefore = endingBefore;
            Id = id;
            IsBoundToConfigTemplate = isBoundToConfigTemplate;
            Item = item;
            Items = items;
            NetworkId = networkId;
            OrganizationId = organizationId;
            PerPage = perPage;
            StartingAfter = startingAfter;
            Tags = tags;
            TagsFilterType = tagsFilterType;
        }
    }
}
