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
    public sealed class SensorAlertsProfilesConditionsResponseThreshold
    {
        /// <summary>
        /// Apparent power threshold. 'draw' must be provided.
        /// </summary>
        public readonly Outputs.SensorAlertsProfilesConditionsResponseThresholdApparentPower? ApparentPower;
        /// <summary>
        /// Electrical current threshold. 'level' must be provided.
        /// </summary>
        public readonly Outputs.SensorAlertsProfilesConditionsResponseThresholdCurrent? Current;
        /// <summary>
        /// Door open threshold. 'open' must be provided and set to true.
        /// </summary>
        public readonly Outputs.SensorAlertsProfilesConditionsResponseThresholdDoor? Door;
        /// <summary>
        /// Electrical frequency threshold. 'level' must be provided.
        /// </summary>
        public readonly Outputs.SensorAlertsProfilesConditionsResponseThresholdFrequency? Frequency;
        /// <summary>
        /// Humidity threshold. One of 'relativePercentage' or 'quality' must be provided.
        /// </summary>
        public readonly Outputs.SensorAlertsProfilesConditionsResponseThresholdHumidity? Humidity;
        /// <summary>
        /// Indoor air quality score threshold. One of 'score' or 'quality' must be provided.
        /// </summary>
        public readonly Outputs.SensorAlertsProfilesConditionsResponseThresholdIndoorAirQuality? IndoorAirQuality;
        /// <summary>
        /// Noise threshold. 'ambient' must be provided.
        /// </summary>
        public readonly Outputs.SensorAlertsProfilesConditionsResponseThresholdNoise? Noise;
        /// <summary>
        /// PM2.5 concentration threshold. One of 'concentration' or 'quality' must be provided.
        /// </summary>
        public readonly Outputs.SensorAlertsProfilesConditionsResponseThresholdPm25? Pm25;
        /// <summary>
        /// Power factor threshold. 'percentage' must be provided.
        /// </summary>
        public readonly Outputs.SensorAlertsProfilesConditionsResponseThresholdPowerFactor? PowerFactor;
        /// <summary>
        /// Real power threshold. 'draw' must be provided.
        /// </summary>
        public readonly Outputs.SensorAlertsProfilesConditionsResponseThresholdRealPower? RealPower;
        /// <summary>
        /// Temperature threshold. One of 'celsius', 'fahrenheit', or 'quality' must be provided.
        /// </summary>
        public readonly Outputs.SensorAlertsProfilesConditionsResponseThresholdTemperature? Temperature;
        /// <summary>
        /// TVOC concentration threshold. One of 'concentration' or 'quality' must be provided.
        /// </summary>
        public readonly Outputs.SensorAlertsProfilesConditionsResponseThresholdTvoc? Tvoc;
        /// <summary>
        /// Upstream power threshold. 'outageDetected' must be provided and set to true.
        /// </summary>
        public readonly Outputs.SensorAlertsProfilesConditionsResponseThresholdUpstreamPower? UpstreamPower;
        /// <summary>
        /// Voltage threshold. 'level' must be provided.
        /// </summary>
        public readonly Outputs.SensorAlertsProfilesConditionsResponseThresholdVoltage? Voltage;
        /// <summary>
        /// Water detection threshold. 'present' must be provided and set to true.
        /// </summary>
        public readonly Outputs.SensorAlertsProfilesConditionsResponseThresholdWater? Water;

        [OutputConstructor]
        private SensorAlertsProfilesConditionsResponseThreshold(
            Outputs.SensorAlertsProfilesConditionsResponseThresholdApparentPower? apparentPower,

            Outputs.SensorAlertsProfilesConditionsResponseThresholdCurrent? current,

            Outputs.SensorAlertsProfilesConditionsResponseThresholdDoor? door,

            Outputs.SensorAlertsProfilesConditionsResponseThresholdFrequency? frequency,

            Outputs.SensorAlertsProfilesConditionsResponseThresholdHumidity? humidity,

            Outputs.SensorAlertsProfilesConditionsResponseThresholdIndoorAirQuality? indoorAirQuality,

            Outputs.SensorAlertsProfilesConditionsResponseThresholdNoise? noise,

            Outputs.SensorAlertsProfilesConditionsResponseThresholdPm25? pm25,

            Outputs.SensorAlertsProfilesConditionsResponseThresholdPowerFactor? powerFactor,

            Outputs.SensorAlertsProfilesConditionsResponseThresholdRealPower? realPower,

            Outputs.SensorAlertsProfilesConditionsResponseThresholdTemperature? temperature,

            Outputs.SensorAlertsProfilesConditionsResponseThresholdTvoc? tvoc,

            Outputs.SensorAlertsProfilesConditionsResponseThresholdUpstreamPower? upstreamPower,

            Outputs.SensorAlertsProfilesConditionsResponseThresholdVoltage? voltage,

            Outputs.SensorAlertsProfilesConditionsResponseThresholdWater? water)
        {
            ApparentPower = apparentPower;
            Current = current;
            Door = door;
            Frequency = frequency;
            Humidity = humidity;
            IndoorAirQuality = indoorAirQuality;
            Noise = noise;
            Pm25 = pm25;
            PowerFactor = powerFactor;
            RealPower = realPower;
            Temperature = temperature;
            Tvoc = tvoc;
            UpstreamPower = upstreamPower;
            Voltage = voltage;
            Water = water;
        }
    }
}
