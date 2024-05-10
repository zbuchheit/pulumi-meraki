// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SwitchStpStpBridgePriorityArgs : global::Pulumi.ResourceArgs
    {
        [Input("stacks")]
        private InputList<string>? _stacks;

        /// <summary>
        /// List of stack IDs
        /// </summary>
        public InputList<string> Stacks
        {
            get => _stacks ?? (_stacks = new InputList<string>());
            set => _stacks = value;
        }

        /// <summary>
        /// STP priority for switch, stacks, or switch profiles
        /// </summary>
        [Input("stpPriority")]
        public Input<int>? StpPriority { get; set; }

        [Input("switchProfiles")]
        private InputList<string>? _switchProfiles;

        /// <summary>
        /// List of switch profile IDs
        /// </summary>
        public InputList<string> SwitchProfiles
        {
            get => _switchProfiles ?? (_switchProfiles = new InputList<string>());
            set => _switchProfiles = value;
        }

        [Input("switches")]
        private InputList<string>? _switches;

        /// <summary>
        /// List of switch serial numbers
        /// </summary>
        public InputList<string> Switches
        {
            get => _switches ?? (_switches = new InputList<string>());
            set => _switches = value;
        }

        public SwitchStpStpBridgePriorityArgs()
        {
        }
        public static new SwitchStpStpBridgePriorityArgs Empty => new SwitchStpStpBridgePriorityArgs();
    }
}
