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
    public sealed class GetSwitchStacksRoutingInterfacesDhcpItemFixedIpAssignmentResult
    {
        /// <summary>
        /// The IP address of the client which has fixed IP address assigned to it
        /// </summary>
        public readonly string Ip;
        /// <summary>
        /// The MAC address of the client which has fixed IP address
        /// </summary>
        public readonly string Mac;
        /// <summary>
        /// The name of the client which has fixed IP address
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetSwitchStacksRoutingInterfacesDhcpItemFixedIpAssignmentResult(
            string ip,

            string mac,

            string name)
        {
            Ip = ip;
            Mac = mac;
            Name = name;
        }
    }
}
