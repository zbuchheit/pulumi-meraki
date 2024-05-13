// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetSnmp
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
        ///     var example = Meraki.Networks.GetSnmp.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSnmpExample"] = example.Apply(getSnmpResult =&gt; getSnmpResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetSnmpResult> InvokeAsync(GetSnmpArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSnmpResult>("meraki:networks/getSnmp:getSnmp", args ?? new GetSnmpArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetSnmp.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSnmpExample"] = example.Apply(getSnmpResult =&gt; getSnmpResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSnmpResult> Invoke(GetSnmpInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSnmpResult>("meraki:networks/getSnmp:getSnmp", args ?? new GetSnmpInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSnmpArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetSnmpArgs()
        {
        }
        public static new GetSnmpArgs Empty => new GetSnmpArgs();
    }

    public sealed class GetSnmpInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetSnmpInvokeArgs()
        {
        }
        public static new GetSnmpInvokeArgs Empty => new GetSnmpInvokeArgs();
    }


    [OutputType]
    public sealed class GetSnmpResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetSnmpItemResult Item;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetSnmpResult(
            string id,

            Outputs.GetSnmpItemResult item,

            string networkId)
        {
            Id = id;
            Item = item;
            NetworkId = networkId;
        }
    }
}