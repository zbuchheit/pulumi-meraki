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
    public sealed class GetApplianceFirewallL7FirewallRulesItemResult
    {
        public readonly ImmutableArray<Outputs.GetApplianceFirewallL7FirewallRulesItemRuleResult> Rules;

        [OutputConstructor]
        private GetApplianceFirewallL7FirewallRulesItemResult(ImmutableArray<Outputs.GetApplianceFirewallL7FirewallRulesItemRuleResult> rules)
        {
            Rules = rules;
        }
    }
}
