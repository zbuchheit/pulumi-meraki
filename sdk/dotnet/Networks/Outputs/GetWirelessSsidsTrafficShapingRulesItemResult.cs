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
    public sealed class GetWirelessSsidsTrafficShapingRulesItemResult
    {
        /// <summary>
        /// Whether default traffic shaping rules are enabled (true) or disabled (false). There are 4 default rules, which can be seen on your network's traffic shaping page. Note that default rules count against the rule limit of 8.
        /// </summary>
        public readonly bool DefaultRulesEnabled;
        /// <summary>
        /// An array of traffic shaping rules. Rules are applied in the order that
        /// they are specified in. An empty list (or null) means no rules. Note that
        /// you are allowed a maximum of 8 rules.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWirelessSsidsTrafficShapingRulesItemRuleResult> Rules;
        /// <summary>
        /// Whether traffic shaping rules are applied to clients on your SSID.
        /// </summary>
        public readonly bool TrafficShapingEnabled;

        [OutputConstructor]
        private GetWirelessSsidsTrafficShapingRulesItemResult(
            bool defaultRulesEnabled,

            ImmutableArray<Outputs.GetWirelessSsidsTrafficShapingRulesItemRuleResult> rules,

            bool trafficShapingEnabled)
        {
            DefaultRulesEnabled = defaultRulesEnabled;
            Rules = rules;
            TrafficShapingEnabled = trafficShapingEnabled;
        }
    }
}
