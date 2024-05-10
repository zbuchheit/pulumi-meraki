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
    public sealed class ApplianceVpnVpnFirewallRulesRule
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
        /// 'allow' or 'deny' traffic specified by this rule
        /// </summary>
        public readonly string? Policy;
        /// <summary>
        /// The type of protocol (must be 'tcp', 'udp', 'icmp', 'icmp6' or 'any')
        /// </summary>
        public readonly string? Protocol;
        /// <summary>
        /// Comma-separated list of source IP address(es) (in IP or CIDR notation), or 'any' (note: FQDN not supported for source addresses)
        /// </summary>
        public readonly string? SrcCidr;
        /// <summary>
        /// Comma-separated list of source port(s) (integer in the range 1-65535), or 'any'
        /// </summary>
        public readonly string? SrcPort;
        /// <summary>
        /// Log this rule to syslog (true or false, boolean value) - only applicable if a syslog has been configured (optional)
        /// </summary>
        public readonly bool? SyslogEnabled;

        [OutputConstructor]
        private ApplianceVpnVpnFirewallRulesRule(
            string? comment,

            string? destCidr,

            string? destPort,

            string? policy,

            string? protocol,

            string? srcCidr,

            string? srcPort,

            bool? syslogEnabled)
        {
            Comment = comment;
            DestCidr = destCidr;
            DestPort = destPort;
            Policy = policy;
            Protocol = protocol;
            SrcCidr = srcCidr;
            SrcPort = srcPort;
            SyslogEnabled = syslogEnabled;
        }
    }
}
