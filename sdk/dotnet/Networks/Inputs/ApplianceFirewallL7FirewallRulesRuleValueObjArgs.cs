// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceFirewallL7FirewallRulesRuleValueObjArgs : global::Pulumi.ResourceArgs
    {
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public ApplianceFirewallL7FirewallRulesRuleValueObjArgs()
        {
        }
        public static new ApplianceFirewallL7FirewallRulesRuleValueObjArgs Empty => new ApplianceFirewallL7FirewallRulesRuleValueObjArgs();
    }
}
