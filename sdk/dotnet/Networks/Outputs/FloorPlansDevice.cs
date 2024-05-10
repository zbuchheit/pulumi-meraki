// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class FloorPlansDevice
    {
        /// <summary>
        /// Physical address of the device
        /// </summary>
        public readonly string? Address;
        /// <summary>
        /// Additional device information
        /// </summary>
        public readonly ImmutableArray<Outputs.FloorPlansDeviceDetail> Details;
        /// <summary>
        /// Firmware version of the device
        /// </summary>
        public readonly string? Firmware;
        /// <summary>
        /// IMEI of the device, if applicable
        /// </summary>
        public readonly string? Imei;
        /// <summary>
        /// LAN IP address of the device
        /// </summary>
        public readonly string? LanIp;
        /// <summary>
        /// Latitude of the device
        /// </summary>
        public readonly double? Lat;
        /// <summary>
        /// Longitude of the device
        /// </summary>
        public readonly double? Lng;
        /// <summary>
        /// MAC address of the device
        /// </summary>
        public readonly string? Mac;
        /// <summary>
        /// Model of the device
        /// </summary>
        public readonly string? Model;
        /// <summary>
        /// Name of the device
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// ID of the network the device belongs to
        /// </summary>
        public readonly string? NetworkId;
        /// <summary>
        /// Notes for the device, limited to 255 characters
        /// </summary>
        public readonly string? Notes;
        /// <summary>
        /// Product type of the device
        /// </summary>
        public readonly string? ProductType;
        /// <summary>
        /// Serial number of the device
        /// </summary>
        public readonly string? Serial;
        /// <summary>
        /// List of tags assigned to the device
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private FloorPlansDevice(
            string? address,

            ImmutableArray<Outputs.FloorPlansDeviceDetail> details,

            string? firmware,

            string? imei,

            string? lanIp,

            double? lat,

            double? lng,

            string? mac,

            string? model,

            string? name,

            string? networkId,

            string? notes,

            string? productType,

            string? serial,

            ImmutableArray<string> tags)
        {
            Address = address;
            Details = details;
            Firmware = firmware;
            Imei = imei;
            LanIp = lanIp;
            Lat = lat;
            Lng = lng;
            Mac = mac;
            Model = model;
            Name = name;
            NetworkId = networkId;
            Notes = notes;
            ProductType = productType;
            Serial = serial;
            Tags = tags;
        }
    }
}
