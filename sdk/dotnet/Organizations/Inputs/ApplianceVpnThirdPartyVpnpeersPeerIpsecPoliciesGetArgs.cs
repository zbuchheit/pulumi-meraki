// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class ApplianceVpnThirdPartyVpnpeersPeerIpsecPoliciesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("childAuthAlgos")]
        private InputList<string>? _childAuthAlgos;

        /// <summary>
        /// This is the authentication algorithms to be used in Phase 2. The value should be an array with one of the following algorithms: 'sha256', 'sha1', 'md5'
        /// </summary>
        public InputList<string> ChildAuthAlgos
        {
            get => _childAuthAlgos ?? (_childAuthAlgos = new InputList<string>());
            set => _childAuthAlgos = value;
        }

        [Input("childCipherAlgos")]
        private InputList<string>? _childCipherAlgos;

        /// <summary>
        /// This is the cipher algorithms to be used in Phase 2. The value should be an array with one or more of the following algorithms: 'aes256', 'aes192', 'aes128', 'tripledes', 'des', 'null'
        /// </summary>
        public InputList<string> ChildCipherAlgos
        {
            get => _childCipherAlgos ?? (_childCipherAlgos = new InputList<string>());
            set => _childCipherAlgos = value;
        }

        /// <summary>
        /// The lifetime of the Phase 2 SA in seconds.
        /// </summary>
        [Input("childLifetime")]
        public Input<int>? ChildLifetime { get; set; }

        [Input("childPfsGroups")]
        private InputList<string>? _childPfsGroups;

        /// <summary>
        /// This is the Diffie-Hellman group to be used for Perfect Forward Secrecy in Phase 2. The value should be an array with one of the following values: 'disabled','group14', 'group5', 'group2', 'group1'
        /// </summary>
        public InputList<string> ChildPfsGroups
        {
            get => _childPfsGroups ?? (_childPfsGroups = new InputList<string>());
            set => _childPfsGroups = value;
        }

        [Input("ikeAuthAlgos")]
        private InputList<string>? _ikeAuthAlgos;

        /// <summary>
        /// This is the authentication algorithm to be used in Phase 1. The value should be an array with one of the following algorithms: 'sha256', 'sha1', 'md5'
        /// </summary>
        public InputList<string> IkeAuthAlgos
        {
            get => _ikeAuthAlgos ?? (_ikeAuthAlgos = new InputList<string>());
            set => _ikeAuthAlgos = value;
        }

        [Input("ikeCipherAlgos")]
        private InputList<string>? _ikeCipherAlgos;

        /// <summary>
        /// This is the cipher algorithm to be used in Phase 1. The value should be an array with one of the following algorithms: 'aes256', 'aes192', 'aes128', 'tripledes', 'des'
        /// </summary>
        public InputList<string> IkeCipherAlgos
        {
            get => _ikeCipherAlgos ?? (_ikeCipherAlgos = new InputList<string>());
            set => _ikeCipherAlgos = value;
        }

        [Input("ikeDiffieHellmanGroups")]
        private InputList<string>? _ikeDiffieHellmanGroups;

        /// <summary>
        /// This is the Diffie-Hellman group to be used in Phase 1. The value should be an array with one of the following algorithms: 'group14', 'group5', 'group2', 'group1'
        /// </summary>
        public InputList<string> IkeDiffieHellmanGroups
        {
            get => _ikeDiffieHellmanGroups ?? (_ikeDiffieHellmanGroups = new InputList<string>());
            set => _ikeDiffieHellmanGroups = value;
        }

        /// <summary>
        /// The lifetime of the Phase 1 SA in seconds.
        /// </summary>
        [Input("ikeLifetime")]
        public Input<int>? IkeLifetime { get; set; }

        [Input("ikePrfAlgos")]
        private InputList<string>? _ikePrfAlgos;

        /// <summary>
        /// [optional] This is the pseudo-random function to be used in IKE_SA. The value should be an array with one of the following algorithms: 'prfsha256', 'prfsha1', 'prfmd5', 'default'. The 'default' option can be used to default to the Authentication algorithm.
        /// </summary>
        public InputList<string> IkePrfAlgos
        {
            get => _ikePrfAlgos ?? (_ikePrfAlgos = new InputList<string>());
            set => _ikePrfAlgos = value;
        }

        public ApplianceVpnThirdPartyVpnpeersPeerIpsecPoliciesGetArgs()
        {
        }
        public static new ApplianceVpnThirdPartyVpnpeersPeerIpsecPoliciesGetArgs Empty => new ApplianceVpnThirdPartyVpnpeersPeerIpsecPoliciesGetArgs();
    }
}
