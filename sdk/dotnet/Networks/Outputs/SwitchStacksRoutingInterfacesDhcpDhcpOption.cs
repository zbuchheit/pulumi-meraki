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
    public sealed class SwitchStacksRoutingInterfacesDhcpDhcpOption
    {
        /// <summary>
        /// The code for DHCP option which should be from 2 to 254
        /// </summary>
        public readonly string? Code;
        /// <summary>
        /// The type of the DHCP option which should be one of ('text', 'ip', 'integer' or 'hex')
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// The value of the DHCP option
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private SwitchStacksRoutingInterfacesDhcpDhcpOption(
            string? code,

            string? type,

            string? value)
        {
            Code = code;
            Type = type;
            Value = value;
        }
    }
}
