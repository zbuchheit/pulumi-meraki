// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The bandwidth limits object, specifying the upload ('limitUp') and download ('limitDown') speed in Kbps. These are only enforced if 'settings' is set to 'custom'.
        /// </summary>
        [Input("bandwidthLimits")]
        public Input<Inputs.ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsBandwidthLimitsGetArgs>? BandwidthLimits { get; set; }

        /// <summary>
        /// How bandwidth limits are applied by your rule. Can be one of 'network default', 'ignore' or 'custom'.
        /// </summary>
        [Input("settings")]
        public Input<string>? Settings { get; set; }

        public ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsGetArgs()
        {
        }
        public static new ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsGetArgs Empty => new ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsGetArgs();
    }
}
