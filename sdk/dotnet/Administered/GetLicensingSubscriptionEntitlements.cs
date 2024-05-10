// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Administered
{
    public static class GetLicensingSubscriptionEntitlements
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
        ///     var example = Meraki.Administered.GetLicensingSubscriptionEntitlements.Invoke(new()
        ///     {
        ///         Skuses = new[]
        ///         {
        ///             "string",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiAdministeredLicensingSubscriptionEntitlementsExample"] = example.Apply(getLicensingSubscriptionEntitlementsResult =&gt; getLicensingSubscriptionEntitlementsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetLicensingSubscriptionEntitlementsResult> InvokeAsync(GetLicensingSubscriptionEntitlementsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLicensingSubscriptionEntitlementsResult>("meraki:administered/getLicensingSubscriptionEntitlements:getLicensingSubscriptionEntitlements", args ?? new GetLicensingSubscriptionEntitlementsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Administered.GetLicensingSubscriptionEntitlements.Invoke(new()
        ///     {
        ///         Skuses = new[]
        ///         {
        ///             "string",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiAdministeredLicensingSubscriptionEntitlementsExample"] = example.Apply(getLicensingSubscriptionEntitlementsResult =&gt; getLicensingSubscriptionEntitlementsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetLicensingSubscriptionEntitlementsResult> Invoke(GetLicensingSubscriptionEntitlementsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLicensingSubscriptionEntitlementsResult>("meraki:administered/getLicensingSubscriptionEntitlements:getLicensingSubscriptionEntitlements", args ?? new GetLicensingSubscriptionEntitlementsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLicensingSubscriptionEntitlementsArgs : global::Pulumi.InvokeArgs
    {
        [Input("skuses")]
        private List<string>? _skuses;

        /// <summary>
        /// skus query parameter. Filter to entitlements with the specified SKUs
        /// </summary>
        public List<string> Skuses
        {
            get => _skuses ?? (_skuses = new List<string>());
            set => _skuses = value;
        }

        public GetLicensingSubscriptionEntitlementsArgs()
        {
        }
        public static new GetLicensingSubscriptionEntitlementsArgs Empty => new GetLicensingSubscriptionEntitlementsArgs();
    }

    public sealed class GetLicensingSubscriptionEntitlementsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("skuses")]
        private InputList<string>? _skuses;

        /// <summary>
        /// skus query parameter. Filter to entitlements with the specified SKUs
        /// </summary>
        public InputList<string> Skuses
        {
            get => _skuses ?? (_skuses = new InputList<string>());
            set => _skuses = value;
        }

        public GetLicensingSubscriptionEntitlementsInvokeArgs()
        {
        }
        public static new GetLicensingSubscriptionEntitlementsInvokeArgs Empty => new GetLicensingSubscriptionEntitlementsInvokeArgs();
    }


    [OutputType]
    public sealed class GetLicensingSubscriptionEntitlementsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetLicensingSubscriptionEntitlementsItemResult Item;
        /// <summary>
        /// skus query parameter. Filter to entitlements with the specified SKUs
        /// </summary>
        public readonly ImmutableArray<string> Skuses;

        [OutputConstructor]
        private GetLicensingSubscriptionEntitlementsResult(
            string id,

            Outputs.GetLicensingSubscriptionEntitlementsItemResult item,

            ImmutableArray<string> skuses)
        {
            Id = id;
            Item = item;
            Skuses = skuses;
        }
    }
}
