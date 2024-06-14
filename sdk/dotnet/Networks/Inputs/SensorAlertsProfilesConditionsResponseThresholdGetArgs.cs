// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SensorAlertsProfilesConditionsResponseThresholdGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Apparent power threshold. 'draw' must be provided.
        /// </summary>
        [Input("apparentPower")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdApparentPowerGetArgs>? ApparentPower { get; set; }

        /// <summary>
        /// Electrical current threshold. 'level' must be provided.
        /// </summary>
        [Input("current")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdCurrentGetArgs>? Current { get; set; }

        /// <summary>
        /// Door open threshold. 'open' must be provided and set to true.
        /// </summary>
        [Input("door")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdDoorGetArgs>? Door { get; set; }

        /// <summary>
        /// Electrical frequency threshold. 'level' must be provided.
        /// </summary>
        [Input("frequency")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdFrequencyGetArgs>? Frequency { get; set; }

        /// <summary>
        /// Humidity threshold. One of 'relativePercentage' or 'quality' must be provided.
        /// </summary>
        [Input("humidity")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdHumidityGetArgs>? Humidity { get; set; }

        /// <summary>
        /// Indoor air quality score threshold. One of 'score' or 'quality' must be provided.
        /// </summary>
        [Input("indoorAirQuality")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdIndoorAirQualityGetArgs>? IndoorAirQuality { get; set; }

        /// <summary>
        /// Noise threshold. 'ambient' must be provided.
        /// </summary>
        [Input("noise")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdNoiseGetArgs>? Noise { get; set; }

        /// <summary>
        /// PM2.5 concentration threshold. One of 'concentration' or 'quality' must be provided.
        /// </summary>
        [Input("pm25")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdPm25GetArgs>? Pm25 { get; set; }

        /// <summary>
        /// Power factor threshold. 'percentage' must be provided.
        /// </summary>
        [Input("powerFactor")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdPowerFactorGetArgs>? PowerFactor { get; set; }

        /// <summary>
        /// Real power threshold. 'draw' must be provided.
        /// </summary>
        [Input("realPower")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdRealPowerGetArgs>? RealPower { get; set; }

        /// <summary>
        /// Temperature threshold. One of 'celsius', 'fahrenheit', or 'quality' must be provided.
        /// </summary>
        [Input("temperature")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdTemperatureGetArgs>? Temperature { get; set; }

        /// <summary>
        /// TVOC concentration threshold. One of 'concentration' or 'quality' must be provided.
        /// </summary>
        [Input("tvoc")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdTvocGetArgs>? Tvoc { get; set; }

        /// <summary>
        /// Upstream power threshold. 'outageDetected' must be provided and set to true.
        /// </summary>
        [Input("upstreamPower")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdUpstreamPowerGetArgs>? UpstreamPower { get; set; }

        /// <summary>
        /// Voltage threshold. 'level' must be provided.
        /// </summary>
        [Input("voltage")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdVoltageGetArgs>? Voltage { get; set; }

        /// <summary>
        /// Water detection threshold. 'present' must be provided and set to true.
        /// </summary>
        [Input("water")]
        public Input<Inputs.SensorAlertsProfilesConditionsResponseThresholdWaterGetArgs>? Water { get; set; }

        public SensorAlertsProfilesConditionsResponseThresholdGetArgs()
        {
        }
        public static new SensorAlertsProfilesConditionsResponseThresholdGetArgs Empty => new SensorAlertsProfilesConditionsResponseThresholdGetArgs();
    }
}
