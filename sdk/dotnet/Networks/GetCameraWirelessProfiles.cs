// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetCameraWirelessProfiles
    {
        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Task<GetCameraWirelessProfilesResult> InvokeAsync(GetCameraWirelessProfilesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCameraWirelessProfilesResult>("meraki:networks/getCameraWirelessProfiles:getCameraWirelessProfiles", args ?? new GetCameraWirelessProfilesArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetCameraWirelessProfilesResult> Invoke(GetCameraWirelessProfilesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCameraWirelessProfilesResult>("meraki:networks/getCameraWirelessProfiles:getCameraWirelessProfiles", args ?? new GetCameraWirelessProfilesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCameraWirelessProfilesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public string? NetworkId { get; set; }

        /// <summary>
        /// wirelessProfileId path parameter. Wireless profile ID
        /// </summary>
        [Input("wirelessProfileId")]
        public string? WirelessProfileId { get; set; }

        public GetCameraWirelessProfilesArgs()
        {
        }
        public static new GetCameraWirelessProfilesArgs Empty => new GetCameraWirelessProfilesArgs();
    }

    public sealed class GetCameraWirelessProfilesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// wirelessProfileId path parameter. Wireless profile ID
        /// </summary>
        [Input("wirelessProfileId")]
        public Input<string>? WirelessProfileId { get; set; }

        public GetCameraWirelessProfilesInvokeArgs()
        {
        }
        public static new GetCameraWirelessProfilesInvokeArgs Empty => new GetCameraWirelessProfilesInvokeArgs();
    }


    [OutputType]
    public sealed class GetCameraWirelessProfilesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetCameraWirelessProfilesItemResult Item;
        /// <summary>
        /// Array of ResponseCameraGetNetworkCameraWirelessProfiles
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCameraWirelessProfilesItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string? NetworkId;
        /// <summary>
        /// wirelessProfileId path parameter. Wireless profile ID
        /// </summary>
        public readonly string? WirelessProfileId;

        [OutputConstructor]
        private GetCameraWirelessProfilesResult(
            string id,

            Outputs.GetCameraWirelessProfilesItemResult item,

            ImmutableArray<Outputs.GetCameraWirelessProfilesItemResult> items,

            string? networkId,

            string? wirelessProfileId)
        {
            Id = id;
            Item = item;
            Items = items;
            NetworkId = networkId;
            WirelessProfileId = wirelessProfileId;
        }
    }
}
