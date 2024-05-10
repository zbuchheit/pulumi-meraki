// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class DevicesClaimVmxItemGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Physical address of the device
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        [Input("details")]
        private InputList<Inputs.DevicesClaimVmxItemDetailGetArgs>? _details;

        /// <summary>
        /// Additional device information
        /// </summary>
        public InputList<Inputs.DevicesClaimVmxItemDetailGetArgs> Details
        {
            get => _details ?? (_details = new InputList<Inputs.DevicesClaimVmxItemDetailGetArgs>());
            set => _details = value;
        }

        /// <summary>
        /// Firmware version of the device
        /// </summary>
        [Input("firmware")]
        public Input<string>? Firmware { get; set; }

        /// <summary>
        /// IMEI of the device, if applicable
        /// </summary>
        [Input("imei")]
        public Input<string>? Imei { get; set; }

        /// <summary>
        /// LAN IP address of the device
        /// </summary>
        [Input("lanIp")]
        public Input<string>? LanIp { get; set; }

        /// <summary>
        /// Latitude of the device
        /// </summary>
        [Input("lat")]
        public Input<double>? Lat { get; set; }

        /// <summary>
        /// Longitude of the device
        /// </summary>
        [Input("lng")]
        public Input<double>? Lng { get; set; }

        /// <summary>
        /// MAC address of the device
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        /// <summary>
        /// Model of the device
        /// </summary>
        [Input("model")]
        public Input<string>? Model { get; set; }

        /// <summary>
        /// Name of the device
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of the network the device belongs to
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// Notes for the device, limited to 255 characters
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        /// <summary>
        /// Product type of the device
        /// </summary>
        [Input("productType")]
        public Input<string>? ProductType { get; set; }

        /// <summary>
        /// Serial number of the device
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// List of tags assigned to the device
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public DevicesClaimVmxItemGetArgs()
        {
        }
        public static new DevicesClaimVmxItemGetArgs Empty => new DevicesClaimVmxItemGetArgs();
    }
}
