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
    public sealed class GetApplianceVpnThirdPartyVpnpeersItemPeerIpsecPoliciesResult
    {
        /// <summary>
        /// This is the authentication algorithms to be used in Phase 2. The value should be an array with one of the following algorithms: 'sha256', 'sha1', 'md5'
        /// </summary>
        public readonly ImmutableArray<string> ChildAuthAlgos;
        /// <summary>
        /// This is the cipher algorithms to be used in Phase 2. The value should be an array with one or more of the following algorithms: 'aes256', 'aes192', 'aes128', 'tripledes', 'des', 'null'
        /// </summary>
        public readonly ImmutableArray<string> ChildCipherAlgos;
        /// <summary>
        /// The lifetime of the Phase 2 SA in seconds.
        /// </summary>
        public readonly int ChildLifetime;
        /// <summary>
        /// This is the Diffie-Hellman group to be used for Perfect Forward Secrecy in Phase 2. The value should be an array with one of the following values: 'disabled','group14', 'group5', 'group2', 'group1'
        /// </summary>
        public readonly ImmutableArray<string> ChildPfsGroups;
        /// <summary>
        /// This is the authentication algorithm to be used in Phase 1. The value should be an array with one of the following algorithms: 'sha256', 'sha1', 'md5'
        /// </summary>
        public readonly ImmutableArray<string> IkeAuthAlgos;
        /// <summary>
        /// This is the cipher algorithm to be used in Phase 1. The value should be an array with one of the following algorithms: 'aes256', 'aes192', 'aes128', 'tripledes', 'des'
        /// </summary>
        public readonly ImmutableArray<string> IkeCipherAlgos;
        /// <summary>
        /// This is the Diffie-Hellman group to be used in Phase 1. The value should be an array with one of the following algorithms: 'group14', 'group5', 'group2', 'group1'
        /// </summary>
        public readonly ImmutableArray<string> IkeDiffieHellmanGroups;
        /// <summary>
        /// The lifetime of the Phase 1 SA in seconds.
        /// </summary>
        public readonly int IkeLifetime;
        /// <summary>
        /// [optional] This is the pseudo-random function to be used in IKE_SA. The value should be an array with one of the following algorithms: 'prfsha256', 'prfsha1', 'prfmd5', 'default'. The 'default' option can be used to default to the Authentication algorithm.
        /// </summary>
        public readonly ImmutableArray<string> IkePrfAlgos;

        [OutputConstructor]
        private GetApplianceVpnThirdPartyVpnpeersItemPeerIpsecPoliciesResult(
            ImmutableArray<string> childAuthAlgos,

            ImmutableArray<string> childCipherAlgos,

            int childLifetime,

            ImmutableArray<string> childPfsGroups,

            ImmutableArray<string> ikeAuthAlgos,

            ImmutableArray<string> ikeCipherAlgos,

            ImmutableArray<string> ikeDiffieHellmanGroups,

            int ikeLifetime,

            ImmutableArray<string> ikePrfAlgos)
        {
            ChildAuthAlgos = childAuthAlgos;
            ChildCipherAlgos = childCipherAlgos;
            ChildLifetime = childLifetime;
            ChildPfsGroups = childPfsGroups;
            IkeAuthAlgos = ikeAuthAlgos;
            IkeCipherAlgos = ikeCipherAlgos;
            IkeDiffieHellmanGroups = ikeDiffieHellmanGroups;
            IkeLifetime = ikeLifetime;
            IkePrfAlgos = ikePrfAlgos;
        }
    }
}
