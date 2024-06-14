// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SensorAlertsProfilesConditionsResponseThresholdNoiseAmbientArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alerting threshold as adjusted decibels.
        /// </summary>
        [Input("level")]
        public Input<int>? Level { get; set; }

        /// <summary>
        /// Alerting threshold as a qualitative ambient noise level.
        /// </summary>
        [Input("quality")]
        public Input<string>? Quality { get; set; }

        public SensorAlertsProfilesConditionsResponseThresholdNoiseAmbientArgs()
        {
        }
        public static new SensorAlertsProfilesConditionsResponseThresholdNoiseAmbientArgs Empty => new SensorAlertsProfilesConditionsResponseThresholdNoiseAmbientArgs();
    }
}
