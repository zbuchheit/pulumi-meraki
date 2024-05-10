// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsCellularArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// configured DOWN limit for the uplink (in Kbps).  Null indicated unlimited
        /// </summary>
        [Input("limitDown")]
        public Input<int>? LimitDown { get; set; }

        /// <summary>
        /// configured UP limit for the uplink (in Kbps).  Null indicated unlimited
        /// </summary>
        [Input("limitUp")]
        public Input<int>? LimitUp { get; set; }

        public ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsCellularArgs()
        {
        }
        public static new ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsCellularArgs Empty => new ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsCellularArgs();
    }
}
