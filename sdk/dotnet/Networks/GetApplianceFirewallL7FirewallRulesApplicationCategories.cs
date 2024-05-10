// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetApplianceFirewallL7FirewallRulesApplicationCategories
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
        ///     var example = Meraki.Networks.GetApplianceFirewallL7FirewallRulesApplicationCategories.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceFirewallL7FirewallRulesApplicationCategoriesExample"] = example.Apply(getApplianceFirewallL7FirewallRulesApplicationCategoriesResult =&gt; getApplianceFirewallL7FirewallRulesApplicationCategoriesResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetApplianceFirewallL7FirewallRulesApplicationCategoriesResult> InvokeAsync(GetApplianceFirewallL7FirewallRulesApplicationCategoriesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplianceFirewallL7FirewallRulesApplicationCategoriesResult>("meraki:networks/getApplianceFirewallL7FirewallRulesApplicationCategories:getApplianceFirewallL7FirewallRulesApplicationCategories", args ?? new GetApplianceFirewallL7FirewallRulesApplicationCategoriesArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetApplianceFirewallL7FirewallRulesApplicationCategories.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksApplianceFirewallL7FirewallRulesApplicationCategoriesExample"] = example.Apply(getApplianceFirewallL7FirewallRulesApplicationCategoriesResult =&gt; getApplianceFirewallL7FirewallRulesApplicationCategoriesResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetApplianceFirewallL7FirewallRulesApplicationCategoriesResult> Invoke(GetApplianceFirewallL7FirewallRulesApplicationCategoriesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplianceFirewallL7FirewallRulesApplicationCategoriesResult>("meraki:networks/getApplianceFirewallL7FirewallRulesApplicationCategories:getApplianceFirewallL7FirewallRulesApplicationCategories", args ?? new GetApplianceFirewallL7FirewallRulesApplicationCategoriesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplianceFirewallL7FirewallRulesApplicationCategoriesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetApplianceFirewallL7FirewallRulesApplicationCategoriesArgs()
        {
        }
        public static new GetApplianceFirewallL7FirewallRulesApplicationCategoriesArgs Empty => new GetApplianceFirewallL7FirewallRulesApplicationCategoriesArgs();
    }

    public sealed class GetApplianceFirewallL7FirewallRulesApplicationCategoriesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetApplianceFirewallL7FirewallRulesApplicationCategoriesInvokeArgs()
        {
        }
        public static new GetApplianceFirewallL7FirewallRulesApplicationCategoriesInvokeArgs Empty => new GetApplianceFirewallL7FirewallRulesApplicationCategoriesInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplianceFirewallL7FirewallRulesApplicationCategoriesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetApplianceFirewallL7FirewallRulesApplicationCategoriesResult(
            string id,

            Outputs.GetApplianceFirewallL7FirewallRulesApplicationCategoriesItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}
