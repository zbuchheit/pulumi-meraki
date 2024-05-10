// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessAlternateManagementInterfaceAccessPointGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Wireless alternate management interface device IP. Provide an empty string to remove alternate management IP assignment
        /// </summary>
        [Input("alternateManagementIp")]
        public Input<string>? AlternateManagementIp { get; set; }

        /// <summary>
        /// Primary DNS must be in IP format
        /// </summary>
        [Input("dns1")]
        public Input<string>? Dns1 { get; set; }

        /// <summary>
        /// Optional secondary DNS must be in IP format
        /// </summary>
        [Input("dns2")]
        public Input<string>? Dns2 { get; set; }

        /// <summary>
        /// Gateway must be in IP format
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// Serial number of access point to be configured with alternate management IP
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        /// <summary>
        /// Subnet mask must be in IP format
        /// </summary>
        [Input("subnetMask")]
        public Input<string>? SubnetMask { get; set; }

        public WirelessAlternateManagementInterfaceAccessPointGetArgs()
        {
        }
        public static new WirelessAlternateManagementInterfaceAccessPointGetArgs Empty => new WirelessAlternateManagementInterfaceAccessPointGetArgs();
    }
}
