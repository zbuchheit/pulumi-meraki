// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSettingsNamedVlansPoolDhcpMonitoringArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The duration in minutes that devices will refrain from using dirty VLANs before adding them back to the pool.
        /// </summary>
        [Input("duration")]
        public Input<int>? Duration { get; set; }

        /// <summary>
        /// Whether or not devices using named VLAN pools should remove dirty VLANs from the pool, thereby preventing clients from being assigned to VLANs where they would be unable to obtain an IP address via DHCP
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public WirelessSettingsNamedVlansPoolDhcpMonitoringArgs()
        {
        }
        public static new WirelessSettingsNamedVlansPoolDhcpMonitoringArgs Empty => new WirelessSettingsNamedVlansPoolDhcpMonitoringArgs();
    }
}
