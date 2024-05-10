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
    public sealed class GetApplianceVpnThirdPartyVpnpeersItemPeerResult
    {
        /// <summary>
        /// [optional] The IKE version to be used for the IPsec VPN peer configuration. Defaults to '1' when omitted.
        /// </summary>
        public readonly string IkeVersion;
        /// <summary>
        /// Custom IPSec policies for the VPN peer. If not included and a preset has not been chosen, the default preset for IPSec policies will be used.
        /// </summary>
        public readonly Outputs.GetApplianceVpnThirdPartyVpnpeersItemPeerIpsecPoliciesResult IpsecPolicies;
        /// <summary>
        /// One of the following available presets: 'default', 'aws', 'azure'. If this is provided, the 'ipsecPolicies' parameter is ignored.
        /// </summary>
        public readonly string IpsecPoliciesPreset;
        /// <summary>
        /// [optional] The local ID is used to identify the MX to the peer. This will apply to all MXs this peer applies to.
        /// </summary>
        public readonly string LocalId;
        /// <summary>
        /// The name of the VPN peer
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A list of network tags that will connect with this peer. Use ['all'] for all networks. Use ['none'] for no networks. If not included, the default is ['all'].
        /// </summary>
        public readonly ImmutableArray<string> NetworkTags;
        /// <summary>
        /// The list of the private subnets of the VPN peer
        /// </summary>
        public readonly ImmutableArray<string> PrivateSubnets;
        /// <summary>
        /// [optional] The public IP of the VPN peer
        /// </summary>
        public readonly string PublicIp;
        /// <summary>
        /// [optional] The remote ID is used to identify the connecting VPN peer. This can either be a valid IPv4 Address, FQDN or User FQDN.
        /// </summary>
        public readonly string RemoteId;
        /// <summary>
        /// The shared secret with the VPN peer
        /// </summary>
        public readonly string Secret;

        [OutputConstructor]
        private GetApplianceVpnThirdPartyVpnpeersItemPeerResult(
            string ikeVersion,

            Outputs.GetApplianceVpnThirdPartyVpnpeersItemPeerIpsecPoliciesResult ipsecPolicies,

            string ipsecPoliciesPreset,

            string localId,

            string name,

            ImmutableArray<string> networkTags,

            ImmutableArray<string> privateSubnets,

            string publicIp,

            string remoteId,

            string secret)
        {
            IkeVersion = ikeVersion;
            IpsecPolicies = ipsecPolicies;
            IpsecPoliciesPreset = ipsecPoliciesPreset;
            LocalId = localId;
            Name = name;
            NetworkTags = networkTags;
            PrivateSubnets = privateSubnets;
            PublicIp = publicIp;
            RemoteId = remoteId;
            Secret = secret;
        }
    }
}
