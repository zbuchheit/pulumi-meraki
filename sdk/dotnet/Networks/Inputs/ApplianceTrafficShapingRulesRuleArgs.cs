// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceTrafficShapingRulesRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("definitions")]
        private InputList<Inputs.ApplianceTrafficShapingRulesRuleDefinitionArgs>? _definitions;

        /// <summary>
        /// A list of objects describing the definitions of your traffic shaping rule. At least one definition is required.
        /// </summary>
        public InputList<Inputs.ApplianceTrafficShapingRulesRuleDefinitionArgs> Definitions
        {
            get => _definitions ?? (_definitions = new InputList<Inputs.ApplianceTrafficShapingRulesRuleDefinitionArgs>());
            set => _definitions = value;
        }

        /// <summary>
        /// The DSCP tag applied by your rule. null means 'Do not change DSCP tag'.
        /// For a list of possible tag values, use the trafficShaping/dscpTaggingOptions endpoint.
        /// </summary>
        [Input("dscpTagValue")]
        public Input<int>? DscpTagValue { get; set; }

        /// <summary>
        /// An object describing the bandwidth settings for your rule.
        /// </summary>
        [Input("perClientBandwidthLimits")]
        public Input<Inputs.ApplianceTrafficShapingRulesRulePerClientBandwidthLimitsArgs>? PerClientBandwidthLimits { get; set; }

        /// <summary>
        /// A string, indicating the priority level for packets bound to your rule.
        /// Can be 'low', 'normal' or 'high'.
        /// </summary>
        [Input("priority")]
        public Input<string>? Priority { get; set; }

        public ApplianceTrafficShapingRulesRuleArgs()
        {
        }
        public static new ApplianceTrafficShapingRulesRuleArgs Empty => new ApplianceTrafficShapingRulesRuleArgs();
    }
}