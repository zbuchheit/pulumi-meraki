// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceFirewallCellularFirewallRulesRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the rule (optional)
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Comma-separated list of destination IP address(es) (in IP or CIDR notation), fully-qualified domain names (FQDN) or 'any'
        /// </summary>
        [Input("destCidr")]
        public Input<string>? DestCidr { get; set; }

        /// <summary>
        /// Comma-separated list of destination port(s) (integer in the range 1-65535), or 'any'
        /// </summary>
        [Input("destPort")]
        public Input<string>? DestPort { get; set; }

        /// <summary>
        /// 'allow' or 'deny' traffic specified by this rule
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// The type of protocol (must be 'tcp', 'udp', 'icmp', 'icmp6' or 'any')
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Comma-separated list of source IP address(es) (in IP or CIDR notation), or 'any' (note: FQDN not supported for source addresses)
        /// </summary>
        [Input("srcCidr")]
        public Input<string>? SrcCidr { get; set; }

        /// <summary>
        /// Comma-separated list of source port(s) (integer in the range 1-65535), or 'any'
        /// </summary>
        [Input("srcPort")]
        public Input<string>? SrcPort { get; set; }

        /// <summary>
        /// Log this rule to syslog (true or false, boolean value) - only applicable if a syslog has been configured (optional)
        /// </summary>
        [Input("syslogEnabled")]
        public Input<bool>? SyslogEnabled { get; set; }

        public ApplianceFirewallCellularFirewallRulesRuleGetArgs()
        {
        }
        public static new ApplianceFirewallCellularFirewallRulesRuleGetArgs Empty => new ApplianceFirewallCellularFirewallRulesRuleGetArgs();
    }
}
