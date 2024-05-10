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
    public sealed class GetSwitchDhcpV4ServersSeenItemIpv4Result
    {
        /// <summary>
        /// IPv4 address of the server.
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// IPv4 gateway address of the server.
        /// </summary>
        public readonly string Gateway;
        /// <summary>
        /// Subnet of the server.
        /// </summary>
        public readonly string Subnet;

        [OutputConstructor]
        private GetSwitchDhcpV4ServersSeenItemIpv4Result(
            string address,

            string gateway,

            string subnet)
        {
            Address = address;
            Gateway = gateway;
            Subnet = subnet;
        }
    }
}
