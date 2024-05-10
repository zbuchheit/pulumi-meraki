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
    public sealed class GetPoliciesByClientItemResult
    {
        /// <summary>
        /// Assigned policies
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPoliciesByClientItemAssignedResult> Assigneds;
        /// <summary>
        /// ID of client
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// Name of client
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetPoliciesByClientItemResult(
            ImmutableArray<Outputs.GetPoliciesByClientItemAssignedResult> assigneds,

            string clientId,

            string name)
        {
            Assigneds = assigneds;
            ClientId = clientId;
            Name = name;
        }
    }
}
