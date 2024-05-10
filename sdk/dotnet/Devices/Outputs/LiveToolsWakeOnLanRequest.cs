// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class LiveToolsWakeOnLanRequest
    {
        /// <summary>
        /// The target's MAC address
        /// </summary>
        public readonly string? Mac;
        /// <summary>
        /// Device serial number
        /// </summary>
        public readonly string? Serial;
        /// <summary>
        /// The target's VLAN (1 to 4094)
        /// </summary>
        public readonly int? VlanId;

        [OutputConstructor]
        private LiveToolsWakeOnLanRequest(
            string? mac,

            string? serial,

            int? vlanId)
        {
            Mac = mac;
            Serial = serial;
            VlanId = vlanId;
        }
    }
}
