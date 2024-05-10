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
    public sealed class GetSwitchDhcpServerPolicyArpInspectionTrustedServersItemResult
    {
        /// <summary>
        /// IPv4 attributes of the trusted server.
        /// </summary>
        public readonly Outputs.GetSwitchDhcpServerPolicyArpInspectionTrustedServersItemIpv4Result Ipv4;
        /// <summary>
        /// Mac address of the trusted server.
        /// </summary>
        public readonly string Mac;
        /// <summary>
        /// ID of the trusted server.
        /// </summary>
        public readonly string TrustedServerId;
        /// <summary>
        /// Vlan ID of the trusted server.
        /// </summary>
        public readonly int Vlan;

        [OutputConstructor]
        private GetSwitchDhcpServerPolicyArpInspectionTrustedServersItemResult(
            Outputs.GetSwitchDhcpServerPolicyArpInspectionTrustedServersItemIpv4Result ipv4,

            string mac,

            string trustedServerId,

            int vlan)
        {
            Ipv4 = ipv4;
            Mac = mac;
            TrustedServerId = trustedServerId;
            Vlan = vlan;
        }
    }
}
