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
    public sealed class GetApplianceFirewallCellularFirewallRulesItemResult
    {
        public readonly ImmutableArray<Outputs.GetApplianceFirewallCellularFirewallRulesItemRuleResult> Rules;

        [OutputConstructor]
        private GetApplianceFirewallCellularFirewallRulesItemResult(ImmutableArray<Outputs.GetApplianceFirewallCellularFirewallRulesItemRuleResult> rules)
        {
            Rules = rules;
        }
    }
}