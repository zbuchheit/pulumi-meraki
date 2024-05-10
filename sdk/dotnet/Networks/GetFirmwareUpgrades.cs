// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
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
        ///     var example = Meraki.Networks.GetFirmwareUpgrades.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksFirmwareUpgradesExample"] = example.Apply(getFirmwareUpgradesResult =&gt; getFirmwareUpgradesResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetFirmwareUpgradesResult> InvokeAsync(GetFirmwareUpgradesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFirmwareUpgradesResult>("meraki:networks/getFirmwareUpgrades:getFirmwareUpgrades", args ?? new GetFirmwareUpgradesArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetFirmwareUpgrades.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksFirmwareUpgradesExample"] = example.Apply(getFirmwareUpgradesResult =&gt; getFirmwareUpgradesResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetFirmwareUpgradesResult> Invoke(GetFirmwareUpgradesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFirmwareUpgradesResult>("meraki:networks/getFirmwareUpgrades:getFirmwareUpgrades", args ?? new GetFirmwareUpgradesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFirmwareUpgradesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetFirmwareUpgradesArgs()
        {
        }
        public static new GetFirmwareUpgradesArgs Empty => new GetFirmwareUpgradesArgs();
    }

    public sealed class GetFirmwareUpgradesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetFirmwareUpgradesInvokeArgs()
        {
        }
        public static new GetFirmwareUpgradesInvokeArgs Empty => new GetFirmwareUpgradesInvokeArgs();
    }


    [OutputType]
    public sealed class GetFirmwareUpgradesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetFirmwareUpgradesItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetFirmwareUpgradesResult(
            string id,

            Outputs.GetFirmwareUpgradesItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}
