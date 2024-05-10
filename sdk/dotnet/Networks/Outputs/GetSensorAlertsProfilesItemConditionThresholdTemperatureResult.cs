// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class GetSensorAlertsProfilesItemConditionThresholdTemperatureResult
    {
        /// <summary>
        /// Alerting threshold in degrees Celsius.
        /// </summary>
        public readonly double Celsius;
        /// <summary>
        /// Alerting threshold in degrees Fahrenheit.
        /// </summary>
        public readonly double Fahrenheit;
        /// <summary>
        /// Alerting threshold as a qualitative temperature level.
        /// </summary>
        public readonly string Quality;

        [OutputConstructor]
        private GetSensorAlertsProfilesItemConditionThresholdTemperatureResult(
            double celsius,

            double fahrenheit,

            string quality)
        {
            Celsius = celsius;
            Fahrenheit = fahrenheit;
            Quality = quality;
        }
    }
}
