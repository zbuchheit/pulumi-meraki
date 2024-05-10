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
    public sealed class AdaptivePolicyPoliciesAcl
    {
        /// <summary>
        /// The ID of the adaptive policy ACL
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The name of the adaptive policy ACL
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private AdaptivePolicyPoliciesAcl(
            string? id,

            string? name)
        {
            Id = id;
            Name = name;
        }
    }
}
