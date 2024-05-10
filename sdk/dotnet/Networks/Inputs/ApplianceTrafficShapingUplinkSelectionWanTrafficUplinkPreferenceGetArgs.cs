// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Preferred uplink for uplink preference rule. Must be one of: 'wan1' or 'wan2'
        /// </summary>
        [Input("preferredUplink")]
        public Input<string>? PreferredUplink { get; set; }

        [Input("trafficFilters")]
        private InputList<Inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterGetArgs>? _trafficFilters;

        /// <summary>
        /// Traffic filters
        /// </summary>
        public InputList<Inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterGetArgs> TrafficFilters
        {
            get => _trafficFilters ?? (_trafficFilters = new InputList<Inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterGetArgs>());
            set => _trafficFilters = value;
        }

        public ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceGetArgs()
        {
        }
        public static new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceGetArgs Empty => new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceGetArgs();
    }
}
