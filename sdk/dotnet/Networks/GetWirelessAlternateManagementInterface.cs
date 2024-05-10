// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetWirelessAlternateManagementInterface
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
        ///     var example = Meraki.Networks.GetWirelessAlternateManagementInterface.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessAlternateManagementInterfaceExample"] = example.Apply(getWirelessAlternateManagementInterfaceResult =&gt; getWirelessAlternateManagementInterfaceResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetWirelessAlternateManagementInterfaceResult> InvokeAsync(GetWirelessAlternateManagementInterfaceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWirelessAlternateManagementInterfaceResult>("meraki:networks/getWirelessAlternateManagementInterface:getWirelessAlternateManagementInterface", args ?? new GetWirelessAlternateManagementInterfaceArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetWirelessAlternateManagementInterface.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksWirelessAlternateManagementInterfaceExample"] = example.Apply(getWirelessAlternateManagementInterfaceResult =&gt; getWirelessAlternateManagementInterfaceResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetWirelessAlternateManagementInterfaceResult> Invoke(GetWirelessAlternateManagementInterfaceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWirelessAlternateManagementInterfaceResult>("meraki:networks/getWirelessAlternateManagementInterface:getWirelessAlternateManagementInterface", args ?? new GetWirelessAlternateManagementInterfaceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWirelessAlternateManagementInterfaceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetWirelessAlternateManagementInterfaceArgs()
        {
        }
        public static new GetWirelessAlternateManagementInterfaceArgs Empty => new GetWirelessAlternateManagementInterfaceArgs();
    }

    public sealed class GetWirelessAlternateManagementInterfaceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetWirelessAlternateManagementInterfaceInvokeArgs()
        {
        }
        public static new GetWirelessAlternateManagementInterfaceInvokeArgs Empty => new GetWirelessAlternateManagementInterfaceInvokeArgs();
    }


    [OutputType]
    public sealed class GetWirelessAlternateManagementInterfaceResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetWirelessAlternateManagementInterfaceItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetWirelessAlternateManagementInterfaceResult(
            string id,

            Outputs.GetWirelessAlternateManagementInterfaceItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}
