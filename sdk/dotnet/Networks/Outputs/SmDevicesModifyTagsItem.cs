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
    public sealed class SmDevicesModifyTagsItem
    {
        /// <summary>
        /// The Meraki Id of the device record.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The device serial.
        /// </summary>
        public readonly string? Serial;
        /// <summary>
        /// An array of tags associated with the device.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// The MAC of the device.
        /// </summary>
        public readonly string? WifiMac;

        [OutputConstructor]
        private SmDevicesModifyTagsItem(
            string? id,

            string? serial,

            ImmutableArray<string> tags,

            string? wifiMac)
        {
            Id = id;
            Serial = serial;
            Tags = tags;
            WifiMac = wifiMac;
        }
    }
}
