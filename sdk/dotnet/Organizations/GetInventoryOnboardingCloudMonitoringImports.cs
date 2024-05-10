// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    public static class GetInventoryOnboardingCloudMonitoringImports
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
        ///     var example = Meraki.Organizations.GetInventoryOnboardingCloudMonitoringImports.Invoke(new()
        ///     {
        ///         ImportIds = new[]
        ///         {
        ///             "string",
        ///         },
        ///         OrganizationId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsInventoryOnboardingCloudMonitoringImportsExample"] = example.Apply(getInventoryOnboardingCloudMonitoringImportsResult =&gt; getInventoryOnboardingCloudMonitoringImportsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetInventoryOnboardingCloudMonitoringImportsResult> InvokeAsync(GetInventoryOnboardingCloudMonitoringImportsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInventoryOnboardingCloudMonitoringImportsResult>("meraki:organizations/getInventoryOnboardingCloudMonitoringImports:getInventoryOnboardingCloudMonitoringImports", args ?? new GetInventoryOnboardingCloudMonitoringImportsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Organizations.GetInventoryOnboardingCloudMonitoringImports.Invoke(new()
        ///     {
        ///         ImportIds = new[]
        ///         {
        ///             "string",
        ///         },
        ///         OrganizationId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsInventoryOnboardingCloudMonitoringImportsExample"] = example.Apply(getInventoryOnboardingCloudMonitoringImportsResult =&gt; getInventoryOnboardingCloudMonitoringImportsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetInventoryOnboardingCloudMonitoringImportsResult> Invoke(GetInventoryOnboardingCloudMonitoringImportsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInventoryOnboardingCloudMonitoringImportsResult>("meraki:organizations/getInventoryOnboardingCloudMonitoringImports:getInventoryOnboardingCloudMonitoringImports", args ?? new GetInventoryOnboardingCloudMonitoringImportsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInventoryOnboardingCloudMonitoringImportsArgs : global::Pulumi.InvokeArgs
    {
        [Input("importIds", required: true)]
        private List<string>? _importIds;

        /// <summary>
        /// importIds query parameter. import ids from an imports
        /// </summary>
        public List<string> ImportIds
        {
            get => _importIds ?? (_importIds = new List<string>());
            set => _importIds = value;
        }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public string OrganizationId { get; set; } = null!;

        public GetInventoryOnboardingCloudMonitoringImportsArgs()
        {
        }
        public static new GetInventoryOnboardingCloudMonitoringImportsArgs Empty => new GetInventoryOnboardingCloudMonitoringImportsArgs();
    }

    public sealed class GetInventoryOnboardingCloudMonitoringImportsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("importIds", required: true)]
        private InputList<string>? _importIds;

        /// <summary>
        /// importIds query parameter. import ids from an imports
        /// </summary>
        public InputList<string> ImportIds
        {
            get => _importIds ?? (_importIds = new InputList<string>());
            set => _importIds = value;
        }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        public GetInventoryOnboardingCloudMonitoringImportsInvokeArgs()
        {
        }
        public static new GetInventoryOnboardingCloudMonitoringImportsInvokeArgs Empty => new GetInventoryOnboardingCloudMonitoringImportsInvokeArgs();
    }


    [OutputType]
    public sealed class GetInventoryOnboardingCloudMonitoringImportsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// importIds query parameter. import ids from an imports
        /// </summary>
        public readonly ImmutableArray<string> ImportIds;
        /// <summary>
        /// Array of ResponseOrganizationsGetOrganizationInventoryOnboardingCloudMonitoringImports
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInventoryOnboardingCloudMonitoringImportsItemResult> Items;
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        public readonly string OrganizationId;

        [OutputConstructor]
        private GetInventoryOnboardingCloudMonitoringImportsResult(
            string id,

            ImmutableArray<string> importIds,

            ImmutableArray<Outputs.GetInventoryOnboardingCloudMonitoringImportsItemResult> items,

            string organizationId)
        {
            Id = id;
            ImportIds = importIds;
            Items = items;
            OrganizationId = organizationId;
        }
    }
}
