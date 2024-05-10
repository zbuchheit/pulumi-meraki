// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class GroupPoliciesFirewallAndTrafficShapingL7FirewallRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The policy applied to matching traffic. Must be 'deny'.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// Type of the L7 Rule. Must be 'application', 'applicationCategory', 'host', 'port' or 'ipRange'
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The 'value' of what you want to block. If 'type' is 'host', 'port' or 'ipRange', 'value' must be a string matching either a hostname (e.g. somewhere.com), a port (e.g. 8080), or an IP range (e.g. 192.1.0.0/16). If 'type' is 'application' or 'applicationCategory', then 'value' must be an object with an ID for the application.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public GroupPoliciesFirewallAndTrafficShapingL7FirewallRuleGetArgs()
        {
        }
        public static new GroupPoliciesFirewallAndTrafficShapingL7FirewallRuleGetArgs Empty => new GroupPoliciesFirewallAndTrafficShapingL7FirewallRuleGetArgs();
    }
}
