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
    public sealed class ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan2
    {
        /// <summary>
        /// configured DOWN limit for the uplink (in Kbps).  Null indicated unlimited
        /// </summary>
        public readonly int? LimitDown;
        /// <summary>
        /// configured UP limit for the uplink (in Kbps).  Null indicated unlimited
        /// </summary>
        public readonly int? LimitUp;

        [OutputConstructor]
        private ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan2(
            int? limitDown,

            int? limitUp)
        {
            LimitDown = limitDown;
            LimitUp = limitUp;
        }
    }
}
