// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    public static class GetFirmwareUpgrades
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
        ///     var example = Meraki.Organizations.GetFirmwareUpgrades.Invoke(new()
        ///     {
        ///         EndingBefore = "string",
        ///         OrganizationId = "string",
        ///         PerPage = 1,
        ///         ProductTypes = new[]
        ///         {
        ///             "string",
        ///         },
        ///         StartingAfter = "string",
        ///         Statuses = new[]
        ///         {
        ///             "string",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsFirmwareUpgradesExample"] = example.Apply(getFirmwareUpgradesResult =&gt; getFirmwareUpgradesResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetFirmwareUpgradesResult> InvokeAsync(GetFirmwareUpgradesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFirmwareUpgradesResult>("meraki:organizations/getFirmwareUpgrades:getFirmwareUpgrades", args ?? new GetFirmwareUpgradesArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Organizations.GetFirmwareUpgrades.Invoke(new()
        ///     {
        ///         EndingBefore = "string",
        ///         OrganizationId = "string",
        ///         PerPage = 1,
        ///         ProductTypes = new[]
        ///         {
        ///             "string",
        ///         },
        ///         StartingAfter = "string",
        ///         Statuses = new[]
        ///         {
        ///             "string",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsFirmwareUpgradesExample"] = example.Apply(getFirmwareUpgradesResult =&gt; getFirmwareUpgradesResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetFirmwareUpgradesResult> Invoke(GetFirmwareUpgradesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFirmwareUpgradesResult>("meraki:organizations/getFirmwareUpgrades:getFirmwareUpgrades", args ?? new GetFirmwareUpgradesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFirmwareUpgradesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public string? EndingBefore { get; set; }

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

        [Input("productTypes")]
        private List<string>? _productTypes;

        /// <summary>
        /// productTypes query parameter. Optional parameter to filter the upgrade by product type.
        /// </summary>
        public List<string> ProductTypes
        {
            get => _productTypes ?? (_productTypes = new List<string>());
            set => _productTypes = value;
        }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public string? StartingAfter { get; set; }

        [Input("statuses")]
        private List<string>? _statuses;

        /// <summary>
        /// status query parameter. Optional parameter to filter the upgrade by status.
        /// </summary>
        public List<string> Statuses
        {
            get => _statuses ?? (_statuses = new List<string>());
            set => _statuses = value;
        }

        public GetFirmwareUpgradesArgs()
        {
        }
        public static new GetFirmwareUpgradesArgs Empty => new GetFirmwareUpgradesArgs();
    }

    public sealed class GetFirmwareUpgradesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public Input<string>? EndingBefore { get; set; }

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

        [Input("productTypes")]
        private InputList<string>? _productTypes;

        /// <summary>
        /// productTypes query parameter. Optional parameter to filter the upgrade by product type.
        /// </summary>
        public InputList<string> ProductTypes
        {
            get => _productTypes ?? (_productTypes = new InputList<string>());
            set => _productTypes = value;
        }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public Input<string>? StartingAfter { get; set; }

        [Input("statuses")]
        private InputList<string>? _statuses;

        /// <summary>
        /// status query parameter. Optional parameter to filter the upgrade by status.
        /// </summary>
        public InputList<string> Statuses
        {
            get => _statuses ?? (_statuses = new InputList<string>());
            set => _statuses = value;
        }

        public GetFirmwareUpgradesInvokeArgs()
        {
        }
        public static new GetFirmwareUpgradesInvokeArgs Empty => new GetFirmwareUpgradesInvokeArgs();
    }


    [OutputType]
    public sealed class GetFirmwareUpgradesResult
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
        /// Array of ResponseOrganizationsGetOrganizationFirmwareUpgrades
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirmwareUpgradesItemResult> Items;
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        public readonly string OrganizationId;
        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        public readonly int? PerPage;
        /// <summary>
        /// productTypes query parameter. Optional parameter to filter the upgrade by product type.
        /// </summary>
        public readonly ImmutableArray<string> ProductTypes;
        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? StartingAfter;
        /// <summary>
        /// status query parameter. Optional parameter to filter the upgrade by status.
        /// </summary>
        public readonly ImmutableArray<string> Statuses;

        [OutputConstructor]
        private GetFirmwareUpgradesResult(
            string? endingBefore,

            string id,

            ImmutableArray<Outputs.GetFirmwareUpgradesItemResult> items,

            string organizationId,

            int? perPage,

            ImmutableArray<string> productTypes,

            string? startingAfter,

            ImmutableArray<string> statuses)
        {
            EndingBefore = endingBefore;
            Id = id;
            Items = items;
            OrganizationId = organizationId;
            PerPage = perPage;
            ProductTypes = productTypes;
            StartingAfter = startingAfter;
            Statuses = statuses;
        }
    }
}
