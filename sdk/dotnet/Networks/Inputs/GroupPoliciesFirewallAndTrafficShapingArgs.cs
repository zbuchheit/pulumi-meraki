// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class GroupPoliciesFirewallAndTrafficShapingArgs : global::Pulumi.ResourceArgs
    {
        [Input("l3FirewallRules")]
        private InputList<Inputs.GroupPoliciesFirewallAndTrafficShapingL3FirewallRuleArgs>? _l3FirewallRules;

        /// <summary>
        /// An ordered array of the L3 firewall rules
        /// </summary>
        public InputList<Inputs.GroupPoliciesFirewallAndTrafficShapingL3FirewallRuleArgs> L3FirewallRules
        {
            get => _l3FirewallRules ?? (_l3FirewallRules = new InputList<Inputs.GroupPoliciesFirewallAndTrafficShapingL3FirewallRuleArgs>());
            set => _l3FirewallRules = value;
        }

        [Input("l7FirewallRules")]
        private InputList<Inputs.GroupPoliciesFirewallAndTrafficShapingL7FirewallRuleArgs>? _l7FirewallRules;

        /// <summary>
        /// An ordered array of L7 firewall rules
        /// </summary>
        public InputList<Inputs.GroupPoliciesFirewallAndTrafficShapingL7FirewallRuleArgs> L7FirewallRules
        {
            get => _l7FirewallRules ?? (_l7FirewallRules = new InputList<Inputs.GroupPoliciesFirewallAndTrafficShapingL7FirewallRuleArgs>());
            set => _l7FirewallRules = value;
        }

        /// <summary>
        /// How firewall and traffic shaping rules are enforced. Can be 'network default', 'ignore' or 'custom'.
        /// </summary>
        [Input("settings")]
        public Input<string>? Settings { get; set; }

        [Input("trafficShapingRules")]
        private InputList<Inputs.GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleArgs>? _trafficShapingRules;

        /// <summary>
        /// An array of traffic shaping rules. Rules are applied in the order that
        /// they are specified in. An empty list (or null) means no rules. Note that
        /// you are allowed a maximum of 8 rules.
        /// </summary>
        public InputList<Inputs.GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleArgs> TrafficShapingRules
        {
            get => _trafficShapingRules ?? (_trafficShapingRules = new InputList<Inputs.GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleArgs>());
            set => _trafficShapingRules = value;
        }

        public GroupPoliciesFirewallAndTrafficShapingArgs()
        {
        }
        public static new GroupPoliciesFirewallAndTrafficShapingArgs Empty => new GroupPoliciesFirewallAndTrafficShapingArgs();
    }
}
