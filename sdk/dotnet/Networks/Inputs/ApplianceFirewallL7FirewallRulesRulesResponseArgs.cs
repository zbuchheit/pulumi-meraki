// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceFirewallL7FirewallRulesRulesResponseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// 'Deny' traffic specified by this rule
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// Type of the L7 rule. One of: 'application', 'applicationCategory', 'host', 'port', 'ipRange'
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The 'value' of what you want to block. Format of 'value' varies depending on type of the rule. The application categories and application ids can be retrieved from the the 'MX L7 application categories' endpoint. The countries follow the two-letter ISO 3166-1 alpha-2 format.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        [Input("valueLists")]
        private InputList<string>? _valueLists;

        /// <summary>
        /// The 'value_list' of what you want to block. Send a list in request
        /// </summary>
        public InputList<string> ValueLists
        {
            get => _valueLists ?? (_valueLists = new InputList<string>());
            set => _valueLists = value;
        }

        /// <summary>
        /// The 'value_obj' of what you want to block. Send a dict in request
        /// </summary>
        [Input("valueObj")]
        public Input<Inputs.ApplianceFirewallL7FirewallRulesRulesResponseValueObjArgs>? ValueObj { get; set; }

        public ApplianceFirewallL7FirewallRulesRulesResponseArgs()
        {
        }
        public static new ApplianceFirewallL7FirewallRulesRulesResponseArgs Empty => new ApplianceFirewallL7FirewallRulesRulesResponseArgs();
    }
}
