// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsDot11rGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional) Whether 802.11r is adaptive or not.
        /// </summary>
        [Input("adaptive")]
        public Input<bool>? Adaptive { get; set; }

        /// <summary>
        /// Whether 802.11r is enabled or not.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public WirelessSsidsDot11rGetArgs()
        {
        }
        public static new WirelessSsidsDot11rGetArgs Empty => new WirelessSsidsDot11rGetArgs();
    }
}
