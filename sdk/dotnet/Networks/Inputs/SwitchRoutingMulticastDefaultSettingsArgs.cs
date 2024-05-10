// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SwitchRoutingMulticastDefaultSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Flood unknown multicast traffic enabled for the entire network
        /// </summary>
        [Input("floodUnknownMulticastTrafficEnabled")]
        public Input<bool>? FloodUnknownMulticastTrafficEnabled { get; set; }

        /// <summary>
        /// IGMP snooping enabled for the entire network
        /// </summary>
        [Input("igmpSnoopingEnabled")]
        public Input<bool>? IgmpSnoopingEnabled { get; set; }

        public SwitchRoutingMulticastDefaultSettingsArgs()
        {
        }
        public static new SwitchRoutingMulticastDefaultSettingsArgs Empty => new SwitchRoutingMulticastDefaultSettingsArgs();
    }
}
