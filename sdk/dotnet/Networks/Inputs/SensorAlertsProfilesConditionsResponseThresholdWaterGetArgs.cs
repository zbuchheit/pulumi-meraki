// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SensorAlertsProfilesConditionsResponseThresholdWaterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alerting threshold for a water detection event. Must be set to true.
        /// </summary>
        [Input("present")]
        public Input<bool>? Present { get; set; }

        public SensorAlertsProfilesConditionsResponseThresholdWaterGetArgs()
        {
        }
        public static new SensorAlertsProfilesConditionsResponseThresholdWaterGetArgs Empty => new SensorAlertsProfilesConditionsResponseThresholdWaterGetArgs();
    }
}
