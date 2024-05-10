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
    public sealed class ApplianceFirewallPortForwardingRulesRule
    {
        /// <summary>
        /// An array of ranges of WAN IP addresses that are allowed to make inbound connections on the specified ports or port ranges (or any)
        /// </summary>
        public readonly ImmutableArray<string> AllowedIps;
        /// <summary>
        /// The IP address of the server or device that hosts the internal resource that you wish to make available on the WAN
        /// </summary>
        public readonly string? LanIp;
        /// <summary>
        /// A port or port ranges that will receive the forwarded traffic from the WAN
        /// </summary>
        public readonly string? LocalPort;
        /// <summary>
        /// A descriptive name for the rule
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// TCP or UDP
        /// </summary>
        public readonly string? Protocol;
        /// <summary>
        /// A port or port ranges that will be forwarded to the host on the LAN
        /// </summary>
        public readonly string? PublicPort;
        /// <summary>
        /// The physical WAN interface on which the traffic will arrive ('internet1' or, if available, 'internet2' or 'both')
        /// </summary>
        public readonly string? Uplink;

        [OutputConstructor]
        private ApplianceFirewallPortForwardingRulesRule(
            ImmutableArray<string> allowedIps,

            string? lanIp,

            string? localPort,

            string? name,

            string? protocol,

            string? publicPort,

            string? uplink)
        {
            AllowedIps = allowedIps;
            LanIp = lanIp;
            LocalPort = localPort;
            Name = name;
            Protocol = protocol;
            PublicPort = publicPort;
            Uplink = uplink;
        }
    }
}
