// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetDevicesAvailabilitiesItemResult
    {
        /// <summary>
        /// The device MAC address.
        /// </summary>
        public readonly string Mac;
        /// <summary>
        /// The device name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Network info.
        /// </summary>
        public readonly Outputs.GetDevicesAvailabilitiesItemNetworkResult Network;
        /// <summary>
        /// Device product type.
        /// </summary>
        public readonly string ProductType;
        /// <summary>
        /// The device serial number.
        /// </summary>
        public readonly string Serial;
        /// <summary>
        /// Status of the device. Possible values are: online, alerting, offline, dormant.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// List of custom tags for the device.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetDevicesAvailabilitiesItemResult(
            string mac,

            string name,

            Outputs.GetDevicesAvailabilitiesItemNetworkResult network,

            string productType,

            string serial,

            string status,

            ImmutableArray<string> tags)
        {
            Mac = mac;
            Name = name;
            Network = network;
            ProductType = productType;
            Serial = serial;
            Status = status;
            Tags = tags;
        }
    }
}