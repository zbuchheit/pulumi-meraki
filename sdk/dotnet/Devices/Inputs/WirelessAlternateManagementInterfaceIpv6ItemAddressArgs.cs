// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class WirelessAlternateManagementInterfaceIpv6ItemAddressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP address configured for the alternate management interface
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The type of address assignment. Either static or dynamic.
        /// </summary>
        [Input("assignmentMode")]
        public Input<string>? AssignmentMode { get; set; }

        /// <summary>
        /// The gateway address configured for the alternate managment interface
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// The DNS servers settings for this address.
        /// </summary>
        [Input("nameservers")]
        public Input<Inputs.WirelessAlternateManagementInterfaceIpv6ItemAddressNameserversArgs>? Nameservers { get; set; }

        /// <summary>
        /// The IPv6 prefix of the interface. Required if IPv6 object is included.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// The IP protocol used for the address
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        public WirelessAlternateManagementInterfaceIpv6ItemAddressArgs()
        {
        }
        public static new WirelessAlternateManagementInterfaceIpv6ItemAddressArgs Empty => new WirelessAlternateManagementInterfaceIpv6ItemAddressArgs();
    }
}
