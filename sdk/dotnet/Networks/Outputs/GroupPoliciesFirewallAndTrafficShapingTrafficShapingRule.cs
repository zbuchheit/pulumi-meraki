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
    public sealed class GroupPoliciesFirewallAndTrafficShapingTrafficShapingRule
    {
        /// <summary>
        /// A list of objects describing the definitions of your traffic shaping rule. At least one definition is required.
        /// </summary>
        public readonly ImmutableArray<Outputs.GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleDefinition> Definitions;
        /// <summary>
        /// The DSCP tag applied by your rule. null means 'Do not change DSCP tag'.
        /// For a list of possible tag values, use the trafficShaping/dscpTaggingOptions endpoint.
        /// </summary>
        public readonly int? DscpTagValue;
        /// <summary>
        /// The PCP tag applied by your rule. Can be 0 (lowest priority) through 7 (highest priority).
        /// null means 'Do not set PCP tag'.
        /// </summary>
        public readonly int? PcpTagValue;
        /// <summary>
        /// An object describing the bandwidth settings for your rule.
        /// </summary>
        public readonly Outputs.GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits? PerClientBandwidthLimits;
        /// <summary>
        /// A string, indicating the priority level for packets bound to your rule.
        /// Can be 'low', 'normal' or 'high'.
        /// </summary>
        public readonly string? Priority;

        [OutputConstructor]
        private GroupPoliciesFirewallAndTrafficShapingTrafficShapingRule(
            ImmutableArray<Outputs.GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleDefinition> definitions,

            int? dscpTagValue,

            int? pcpTagValue,

            Outputs.GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits? perClientBandwidthLimits,

            string? priority)
        {
            Definitions = definitions;
            DscpTagValue = dscpTagValue;
            PcpTagValue = pcpTagValue;
            PerClientBandwidthLimits = perClientBandwidthLimits;
            Priority = priority;
        }
    }
}
