// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetAppliancePorts
    {
        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Task<GetAppliancePortsResult> InvokeAsync(GetAppliancePortsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAppliancePortsResult>("meraki:networks/getAppliancePorts:getAppliancePorts", args ?? new GetAppliancePortsArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetAppliancePortsResult> Invoke(GetAppliancePortsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAppliancePortsResult>("meraki:networks/getAppliancePorts:getAppliancePorts", args ?? new GetAppliancePortsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAppliancePortsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public string? NetworkId { get; set; }

        /// <summary>
        /// portId path parameter. Port ID
        /// </summary>
        [Input("portId")]
        public string? PortId { get; set; }

        public GetAppliancePortsArgs()
        {
        }
        public static new GetAppliancePortsArgs Empty => new GetAppliancePortsArgs();
    }

    public sealed class GetAppliancePortsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// portId path parameter. Port ID
        /// </summary>
        [Input("portId")]
        public Input<string>? PortId { get; set; }

        public GetAppliancePortsInvokeArgs()
        {
        }
        public static new GetAppliancePortsInvokeArgs Empty => new GetAppliancePortsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAppliancePortsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetAppliancePortsItemResult Item;
        /// <summary>
        /// Array of ResponseApplianceGetNetworkAppliancePorts
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAppliancePortsItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string? NetworkId;
        /// <summary>
        /// portId path parameter. Port ID
        /// </summary>
        public readonly string? PortId;

        [OutputConstructor]
        private GetAppliancePortsResult(
            string id,

            Outputs.GetAppliancePortsItemResult item,

            ImmutableArray<Outputs.GetAppliancePortsItemResult> items,

            string? networkId,

            string? portId)
        {
            Id = id;
            Item = item;
            Items = items;
            NetworkId = networkId;
            PortId = portId;
        }
    }
}
