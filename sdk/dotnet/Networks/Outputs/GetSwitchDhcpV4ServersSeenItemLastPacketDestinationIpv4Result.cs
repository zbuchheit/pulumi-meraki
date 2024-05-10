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
    public sealed class GetSwitchDhcpV4ServersSeenItemLastPacketDestinationIpv4Result
    {
        /// <summary>
        /// Destination ipv4 address of the packet.
        /// </summary>
        public readonly string Address;

        [OutputConstructor]
        private GetSwitchDhcpV4ServersSeenItemLastPacketDestinationIpv4Result(string address)
        {
            Address = address;
        }
    }
}
