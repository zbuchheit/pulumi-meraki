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
    public sealed class ApplianceSingleLanIpv6PrefixAssignmentOrigin
    {
        /// <summary>
        /// Interfaces associated with the prefix
        /// </summary>
        public readonly ImmutableArray<string> Interfaces;
        /// <summary>
        /// Type of the origin
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private ApplianceSingleLanIpv6PrefixAssignmentOrigin(
            ImmutableArray<string> interfaces,

            string? type)
        {
            Interfaces = interfaces;
            Type = type;
        }
    }
}
