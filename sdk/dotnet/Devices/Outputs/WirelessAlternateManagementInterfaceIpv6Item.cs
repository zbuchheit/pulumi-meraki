// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class WirelessAlternateManagementInterfaceIpv6Item
    {
        /// <summary>
        /// configured alternate management interface addresses
        /// </summary>
        public readonly ImmutableArray<Outputs.WirelessAlternateManagementInterfaceIpv6ItemAddress> Addresses;

        [OutputConstructor]
        private WirelessAlternateManagementInterfaceIpv6Item(ImmutableArray<Outputs.WirelessAlternateManagementInterfaceIpv6ItemAddress> addresses)
        {
            Addresses = addresses;
        }
    }
}