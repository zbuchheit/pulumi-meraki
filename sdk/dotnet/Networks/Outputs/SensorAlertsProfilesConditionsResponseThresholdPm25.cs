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
    public sealed class SensorAlertsProfilesConditionsResponseThresholdPm25
    {
        /// <summary>
        /// Alerting threshold as PM2.5 parts per million.
        /// </summary>
        public readonly int? Concentration;
        /// <summary>
        /// Alerting threshold as a qualitative PM2.5 level.
        /// </summary>
        public readonly string? Quality;

        [OutputConstructor]
        private SensorAlertsProfilesConditionsResponseThresholdPm25(
            int? concentration,

            string? quality)
        {
            Concentration = concentration;
            Quality = quality;
        }
    }
}
