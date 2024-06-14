// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SensorAlertsProfilesConditionsResponseThresholdUpstreamPowerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alerting threshold for an upstream power event. Must be set to true.
        /// </summary>
        [Input("outageDetected")]
        public Input<bool>? OutageDetected { get; set; }

        public SensorAlertsProfilesConditionsResponseThresholdUpstreamPowerArgs()
        {
        }
        public static new SensorAlertsProfilesConditionsResponseThresholdUpstreamPowerArgs Empty => new SensorAlertsProfilesConditionsResponseThresholdUpstreamPowerArgs();
    }
}
