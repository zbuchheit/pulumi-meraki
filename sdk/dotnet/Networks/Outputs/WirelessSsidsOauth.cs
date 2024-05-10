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
    public sealed class WirelessSsidsOauth
    {
        /// <summary>
        /// (Optional) The list of domains allowed access to the network.
        /// </summary>
        public readonly ImmutableArray<string> AllowedDomains;

        [OutputConstructor]
        private WirelessSsidsOauth(ImmutableArray<string> allowedDomains)
        {
            AllowedDomains = allowedDomains;
        }
    }
}
