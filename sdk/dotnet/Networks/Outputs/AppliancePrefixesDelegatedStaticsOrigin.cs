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
    public sealed class AppliancePrefixesDelegatedStaticsOrigin
    {
        /// <summary>
        /// Uplink provided or independent
        /// </summary>
        public readonly ImmutableArray<string> Interfaces;
        /// <summary>
        /// Origin type
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private AppliancePrefixesDelegatedStaticsOrigin(
            ImmutableArray<string> interfaces,

            string? type)
        {
            Interfaces = interfaces;
            Type = type;
        }
    }
}
