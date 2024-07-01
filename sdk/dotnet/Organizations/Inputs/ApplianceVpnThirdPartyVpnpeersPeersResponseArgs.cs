// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class ApplianceVpnThirdPartyVpnpeersPeersResponseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// [optional] The IKE version to be used for the IPsec VPN peer configuration. Defaults to '1' when omitted.
        /// </summary>
        [Input("ikeVersion")]
        public Input<string>? IkeVersion { get; set; }

        /// <summary>
        /// Custom IPSec policies for the VPN peer. If not included and a preset has not been chosen, the default preset for IPSec policies will be used.
        /// </summary>
        [Input("ipsecPolicies")]
        public Input<Inputs.ApplianceVpnThirdPartyVpnpeersPeersResponseIpsecPoliciesArgs>? IpsecPolicies { get; set; }

        /// <summary>
        /// One of the following available presets: 'default', 'aws', 'azure'. If this is provided, the 'ipsecPolicies' parameter is ignored.
        /// </summary>
        [Input("ipsecPoliciesPreset")]
        public Input<string>? IpsecPoliciesPreset { get; set; }

        /// <summary>
        /// [optional] The local ID is used to identify the MX to the peer. This will apply to all MXs this peer applies to.
        /// </summary>
        [Input("localId")]
        public Input<string>? LocalId { get; set; }

        /// <summary>
        /// The name of the VPN peer
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networkTags")]
        private InputList<string>? _networkTags;

        /// <summary>
        /// A list of network tags that will connect with this peer. Use ['all'] for all networks. Use ['none'] for no networks. If not included, the default is ['all'].
        /// </summary>
        public InputList<string> NetworkTags
        {
            get => _networkTags ?? (_networkTags = new InputList<string>());
            set => _networkTags = value;
        }

        [Input("privateSubnets")]
        private InputList<string>? _privateSubnets;

        /// <summary>
        /// The list of the private subnets of the VPN peer
        /// </summary>
        public InputList<string> PrivateSubnets
        {
            get => _privateSubnets ?? (_privateSubnets = new InputList<string>());
            set => _privateSubnets = value;
        }

        /// <summary>
        /// [optional] The public IP of the VPN peer
        /// </summary>
        [Input("publicIp")]
        public Input<string>? PublicIp { get; set; }

        /// <summary>
        /// [optional] The remote ID is used to identify the connecting VPN peer. This can either be a valid IPv4 Address, FQDN or User FQDN.
        /// </summary>
        [Input("remoteId")]
        public Input<string>? RemoteId { get; set; }

        /// <summary>
        /// The shared secret with the VPN peer
        /// </summary>
        [Input("secret")]
        public Input<string>? Secret { get; set; }

        public ApplianceVpnThirdPartyVpnpeersPeersResponseArgs()
        {
        }
        public static new ApplianceVpnThirdPartyVpnpeersPeersResponseArgs Empty => new ApplianceVpnThirdPartyVpnpeersPeersResponseArgs();
    }
}
