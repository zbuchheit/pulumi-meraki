// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The code for DHCP option which should be from 2 to 254
        /// </summary>
        [Input("code")]
        public Input<string>? Code { get; set; }

        /// <summary>
        /// The type of the DHCP option which should be one of ('text', 'ip', 'integer' or 'hex')
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The value of the DHCP option
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs()
        {
        }
        public static new SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs Empty => new SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs();
    }
}
