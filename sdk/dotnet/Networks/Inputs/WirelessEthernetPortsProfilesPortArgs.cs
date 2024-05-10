// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessEthernetPortsProfilesPortArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enabled
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Number
        /// </summary>
        [Input("number")]
        public Input<int>? Number { get; set; }

        /// <summary>
        /// PSK Group number
        /// </summary>
        [Input("pskGroupId")]
        public Input<string>? PskGroupId { get; set; }

        /// <summary>
        /// Ssid number
        /// </summary>
        [Input("ssid")]
        public Input<int>? Ssid { get; set; }

        public WirelessEthernetPortsProfilesPortArgs()
        {
        }
        public static new WirelessEthernetPortsProfilesPortArgs Empty => new WirelessEthernetPortsProfilesPortArgs();
    }
}
