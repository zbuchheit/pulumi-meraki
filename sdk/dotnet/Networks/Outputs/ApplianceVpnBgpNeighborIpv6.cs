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
    public sealed class ApplianceVpnBgpNeighborIpv6
    {
        /// <summary>
        /// The IPv6 address of the neighbor.
        /// </summary>
        public readonly string? Address;

        [OutputConstructor]
        private ApplianceVpnBgpNeighborIpv6(string? address)
        {
            Address = address;
        }
    }
}
