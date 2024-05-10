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
    public sealed class AdaptivePolicyAclsRule
    {
        /// <summary>
        /// Destination port
        /// </summary>
        public readonly string? DstPort;
        /// <summary>
        /// 'allow' or 'deny' traffic specified by this rule
        /// </summary>
        public readonly string? Policy;
        /// <summary>
        /// The type of protocol
        /// </summary>
        public readonly string? Protocol;
        /// <summary>
        /// Source port
        /// </summary>
        public readonly string? SrcPort;

        [OutputConstructor]
        private AdaptivePolicyAclsRule(
            string? dstPort,

            string? policy,

            string? protocol,

            string? srcPort)
        {
            DstPort = dstPort;
            Policy = policy;
            Protocol = protocol;
            SrcPort = srcPort;
        }
    }
}
