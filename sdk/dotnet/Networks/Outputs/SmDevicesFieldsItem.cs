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
    public sealed class SmDevicesFieldsItem
    {
        /// <summary>
        /// The Meraki Id of the device record.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The name of the device.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Notes associated with the device.
        /// </summary>
        public readonly string? Notes;
        /// <summary>
        /// The device serial.
        /// </summary>
        public readonly string? Serial;
        /// <summary>
        /// The MAC of the device.
        /// </summary>
        public readonly string? WifiMac;

        [OutputConstructor]
        private SmDevicesFieldsItem(
            string? id,

            string? name,

            string? notes,

            string? serial,

            string? wifiMac)
        {
            Id = id;
            Name = name;
            Notes = notes;
            Serial = serial;
            WifiMac = wifiMac;
        }
    }
}
