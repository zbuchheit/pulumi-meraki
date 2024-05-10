// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetWirelessSettings
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
        ///     var example = Meraki.Networks.GetWirelessSettings.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessSettingsExample"] = example.Apply(getWirelessSettingsResult =&gt; getWirelessSettingsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetWirelessSettingsResult> InvokeAsync(GetWirelessSettingsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWirelessSettingsResult>("meraki:networks/getWirelessSettings:getWirelessSettings", args ?? new GetWirelessSettingsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetWirelessSettings.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessSettingsExample"] = example.Apply(getWirelessSettingsResult =&gt; getWirelessSettingsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetWirelessSettingsResult> Invoke(GetWirelessSettingsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWirelessSettingsResult>("meraki:networks/getWirelessSettings:getWirelessSettings", args ?? new GetWirelessSettingsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWirelessSettingsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetWirelessSettingsArgs()
        {
        }
        public static new GetWirelessSettingsArgs Empty => new GetWirelessSettingsArgs();
    }

    public sealed class GetWirelessSettingsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetWirelessSettingsInvokeArgs()
        {
        }
        public static new GetWirelessSettingsInvokeArgs Empty => new GetWirelessSettingsInvokeArgs();
    }


    [OutputType]
    public sealed class GetWirelessSettingsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetWirelessSettingsItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetWirelessSettingsResult(
            string id,

            Outputs.GetWirelessSettingsItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}
