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
    public sealed class WirelessSsidsVpnSplitTunnelRule
    {
        /// <summary>
        /// Description for this split tunnel rule (optional).
        /// </summary>
        public readonly string? Comment;
        /// <summary>
        /// Destination for this split tunnel rule. IP address, fully-qualified domain names (FQDN) or 'any'.
        /// </summary>
        public readonly string? DestCidr;
        /// <summary>
        /// Destination port for this split tunnel rule, (integer in the range 1-65535), or 'any'.
        /// </summary>
        public readonly string? DestPort;
        /// <summary>
        /// Traffic policy specified for this split tunnel rule, 'allow' or 'deny'.
        /// </summary>
        public readonly string? Policy;
        /// <summary>
        /// Protocol for this split tunnel rule.
        /// </summary>
        public readonly string? Protocol;

        [OutputConstructor]
        private WirelessSsidsVpnSplitTunnelRule(
            string? comment,

            string? destCidr,

            string? destPort,

            string? policy,

            string? protocol)
        {
            Comment = comment;
            DestCidr = destCidr;
            DestPort = destPort;
            Policy = policy;
            Protocol = protocol;
        }
    }
}
