// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SensorAlertsProfilesConditionsResponseThresholdTemperatureGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alerting threshold in degrees Celsius.
        /// </summary>
        [Input("celsius")]
        public Input<double>? Celsius { get; set; }

        /// <summary>
        /// Alerting threshold in degrees Fahrenheit.
        /// </summary>
        [Input("fahrenheit")]
        public Input<double>? Fahrenheit { get; set; }

        /// <summary>
        /// Alerting threshold as a qualitative temperature level.
        /// </summary>
        [Input("quality")]
        public Input<string>? Quality { get; set; }

        public SensorAlertsProfilesConditionsResponseThresholdTemperatureGetArgs()
        {
        }
        public static new SensorAlertsProfilesConditionsResponseThresholdTemperatureGetArgs Empty => new SensorAlertsProfilesConditionsResponseThresholdTemperatureGetArgs();
    }
}
