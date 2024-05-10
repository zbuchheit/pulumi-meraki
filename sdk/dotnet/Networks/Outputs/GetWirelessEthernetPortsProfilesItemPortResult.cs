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
    public sealed class GetWirelessEthernetPortsProfilesItemPortResult
    {
        /// <summary>
        /// Enabled
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Number
        /// </summary>
        public readonly int Number;
        /// <summary>
        /// PSK Group number
        /// </summary>
        public readonly string PskGroupId;
        /// <summary>
        /// Ssid number
        /// </summary>
        public readonly int Ssid;

        [OutputConstructor]
        private GetWirelessEthernetPortsProfilesItemPortResult(
            bool enabled,

            string name,

            int number,

            string pskGroupId,

            int ssid)
        {
            Enabled = enabled;
            Name = name;
            Number = number;
            PskGroupId = pskGroupId;
            Ssid = ssid;
        }
    }
}
