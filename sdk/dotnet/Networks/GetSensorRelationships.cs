// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetSensorRelationships
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
        ///     var example = Meraki.Networks.GetSensorRelationships.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSensorRelationshipsExample"] = example.Apply(getSensorRelationshipsResult =&gt; getSensorRelationshipsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetSensorRelationshipsResult> InvokeAsync(GetSensorRelationshipsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSensorRelationshipsResult>("meraki:networks/getSensorRelationships:getSensorRelationships", args ?? new GetSensorRelationshipsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetSensorRelationships.Invoke(new()
        ///     {
        ///         NetworkId = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSensorRelationshipsExample"] = example.Apply(getSensorRelationshipsResult =&gt; getSensorRelationshipsResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSensorRelationshipsResult> Invoke(GetSensorRelationshipsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSensorRelationshipsResult>("meraki:networks/getSensorRelationships:getSensorRelationships", args ?? new GetSensorRelationshipsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSensorRelationshipsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        public GetSensorRelationshipsArgs()
        {
        }
        public static new GetSensorRelationshipsArgs Empty => new GetSensorRelationshipsArgs();
    }

    public sealed class GetSensorRelationshipsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        public GetSensorRelationshipsInvokeArgs()
        {
        }
        public static new GetSensorRelationshipsInvokeArgs Empty => new GetSensorRelationshipsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSensorRelationshipsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Array of ResponseSensorGetNetworkSensorRelationships
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSensorRelationshipsItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;

        [OutputConstructor]
        private GetSensorRelationshipsResult(
            string id,

            ImmutableArray<Outputs.GetSensorRelationshipsItemResult> items,

            string networkId)
        {
            Id = id;
            Items = items;
            NetworkId = networkId;
        }
    }
}
