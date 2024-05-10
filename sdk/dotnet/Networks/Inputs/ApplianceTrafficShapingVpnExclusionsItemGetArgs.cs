// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceTrafficShapingVpnExclusionsItemGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("customs")]
        private InputList<Inputs.ApplianceTrafficShapingVpnExclusionsItemCustomGetArgs>? _customs;

        /// <summary>
        /// Custom VPN exclusion rules.
        /// </summary>
        public InputList<Inputs.ApplianceTrafficShapingVpnExclusionsItemCustomGetArgs> Customs
        {
            get => _customs ?? (_customs = new InputList<Inputs.ApplianceTrafficShapingVpnExclusionsItemCustomGetArgs>());
            set => _customs = value;
        }

        [Input("majorApplications")]
        private InputList<Inputs.ApplianceTrafficShapingVpnExclusionsItemMajorApplicationGetArgs>? _majorApplications;

        /// <summary>
        /// Major Application based VPN exclusion rules.
        /// </summary>
        public InputList<Inputs.ApplianceTrafficShapingVpnExclusionsItemMajorApplicationGetArgs> MajorApplications
        {
            get => _majorApplications ?? (_majorApplications = new InputList<Inputs.ApplianceTrafficShapingVpnExclusionsItemMajorApplicationGetArgs>());
            set => _majorApplications = value;
        }

        /// <summary>
        /// ID of the network whose VPN exclusion rules are returned.
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// Name of the network whose VPN exclusion rules are returned.
        /// </summary>
        [Input("networkName")]
        public Input<string>? NetworkName { get; set; }

        public ApplianceTrafficShapingVpnExclusionsItemGetArgs()
        {
        }
        public static new ApplianceTrafficShapingVpnExclusionsItemGetArgs Empty => new ApplianceTrafficShapingVpnExclusionsItemGetArgs();
    }
}
