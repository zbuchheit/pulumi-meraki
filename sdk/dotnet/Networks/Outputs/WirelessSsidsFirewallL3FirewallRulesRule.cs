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
    public sealed class WirelessSsidsFirewallL3FirewallRulesRule
    {
        /// <summary>
        /// Description of the rule (optional)
        /// </summary>
        public readonly string? Comment;
        /// <summary>
        /// Comma-separated list of destination IP address(es) (in IP or CIDR notation), fully-qualified domain names (FQDN) or 'any'
        /// </summary>
        public readonly string? DestCidr;
        /// <summary>
        /// Comma-separated list of destination port(s) (integer in the range 1-65535), or 'any'
        /// </summary>
        public readonly string? DestPort;
        /// <summary>
        /// Ip Ver
        /// </summary>
        public readonly string? IpVer;
        /// <summary>
        /// 'allow' or 'deny' traffic specified by this rule
        /// </summary>
        public readonly string? Policy;
        /// <summary>
        /// The type of protocol (must be 'tcp', 'udp', 'icmp', 'icmp6' or 'any')
        /// </summary>
        public readonly string? Protocol;

        [OutputConstructor]
        private WirelessSsidsFirewallL3FirewallRulesRule(
            string? comment,

            string? destCidr,

            string? destPort,

            string? ipVer,

            string? policy,

            string? protocol)
        {
            Comment = comment;
            DestCidr = destCidr;
            DestPort = destPort;
            IpVer = ipVer;
            Policy = policy;
            Protocol = protocol;
        }
    }
}
