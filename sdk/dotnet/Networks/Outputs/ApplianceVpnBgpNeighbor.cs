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
    public sealed class ApplianceVpnBgpNeighbor
    {
        /// <summary>
        /// When this feature is on, the Meraki device will advertise routes learned from other Autonomous Systems, thereby allowing traffic between Autonomous Systems to transit this AS. When absent, it defaults to false.
        /// </summary>
        public readonly bool? AllowTransit;
        /// <summary>
        /// Authentication settings between BGP peers.
        /// </summary>
        public readonly Outputs.ApplianceVpnBgpNeighborAuthentication? Authentication;
        /// <summary>
        /// The eBGP hold timer in seconds for each neighbor. The eBGP hold timer must be an integer between 12 and 240.
        /// </summary>
        public readonly int? EbgpHoldTimer;
        /// <summary>
        /// Configure this if the neighbor is not adjacent. The eBGP multi-hop must be an integer between 1 and 255.
        /// </summary>
        public readonly int? EbgpMultihop;
        /// <summary>
        /// The IPv4 address of the neighbor
        /// </summary>
        public readonly string? Ip;
        /// <summary>
        /// Information regarding IPv6 address of the neighbor, Required if *ip* is not present.
        /// </summary>
        public readonly Outputs.ApplianceVpnBgpNeighborIpv6? Ipv6;
        /// <summary>
        /// The IPv4 address of the remote BGP peer that will establish a TCP session with the local MX.
        /// </summary>
        public readonly string? NextHopIp;
        /// <summary>
        /// The receive limit is the maximum number of routes that can be received from any BGP peer. The receive limit must be an integer between 0 and 4294967295. When absent, it defaults to 0.
        /// </summary>
        public readonly int? ReceiveLimit;
        /// <summary>
        /// Remote ASN of the neighbor. The remote ASN must be an integer between 1 and 4294967295.
        /// </summary>
        public readonly int? RemoteAsNumber;
        /// <summary>
        /// The output interface for peering with the remote BGP peer. Valid values are: 'wan1', 'wan2' or 'vlan{VLAN ID}'(e.g. 'vlan123').
        /// </summary>
        public readonly string? SourceInterface;
        /// <summary>
        /// Settings for BGP TTL security to protect BGP peering sessions from forged IP attacks.
        /// </summary>
        public readonly Outputs.ApplianceVpnBgpNeighborTtlSecurity? TtlSecurity;

        [OutputConstructor]
        private ApplianceVpnBgpNeighbor(
            bool? allowTransit,

            Outputs.ApplianceVpnBgpNeighborAuthentication? authentication,

            int? ebgpHoldTimer,

            int? ebgpMultihop,

            string? ip,

            Outputs.ApplianceVpnBgpNeighborIpv6? ipv6,

            string? nextHopIp,

            int? receiveLimit,

            int? remoteAsNumber,

            string? sourceInterface,

            Outputs.ApplianceVpnBgpNeighborTtlSecurity? ttlSecurity)
        {
            AllowTransit = allowTransit;
            Authentication = authentication;
            EbgpHoldTimer = ebgpHoldTimer;
            EbgpMultihop = ebgpMultihop;
            Ip = ip;
            Ipv6 = ipv6;
            NextHopIp = nextHopIp;
            ReceiveLimit = receiveLimit;
            RemoteAsNumber = remoteAsNumber;
            SourceInterface = sourceInterface;
            TtlSecurity = ttlSecurity;
        }
    }
}
