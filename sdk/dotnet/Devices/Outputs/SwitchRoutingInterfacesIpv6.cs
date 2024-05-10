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
    public sealed class SwitchRoutingInterfacesIpv6
    {
        /// <summary>
        /// IPv6 address
        /// </summary>
        public readonly string? Address;
        /// <summary>
        /// Assignment mode
        /// </summary>
        public readonly string? AssignmentMode;
        /// <summary>
        /// IPv6 gateway
        /// </summary>
        public readonly string? Gateway;
        /// <summary>
        /// IPv6 subnet
        /// </summary>
        public readonly string? Prefix;

        [OutputConstructor]
        private SwitchRoutingInterfacesIpv6(
            string? address,

            string? assignmentMode,

            string? gateway,

            string? prefix)
        {
            Address = address;
            AssignmentMode = assignmentMode;
            Gateway = gateway;
            Prefix = prefix;
        }
    }
}
