// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SwitchDhcpServerPolicyArpInspectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable or disable Dynamic ARP Inspection on the network. Default value is false.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("unsupportedModels")]
        private InputList<string>? _unsupportedModels;

        /// <summary>
        /// List of switch models that does not support dynamic ARP inspection
        /// </summary>
        public InputList<string> UnsupportedModels
        {
            get => _unsupportedModels ?? (_unsupportedModels = new InputList<string>());
            set => _unsupportedModels = value;
        }

        public SwitchDhcpServerPolicyArpInspectionArgs()
        {
        }
        public static new SwitchDhcpServerPolicyArpInspectionArgs Empty => new SwitchDhcpServerPolicyArpInspectionArgs();
    }
}
