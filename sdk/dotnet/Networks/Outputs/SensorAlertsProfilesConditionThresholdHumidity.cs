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
    public sealed class SensorAlertsProfilesConditionThresholdHumidity
    {
        /// <summary>
        /// Alerting threshold as a qualitative humidity level.
        /// </summary>
        public readonly string? Quality;
        /// <summary>
        /// Alerting threshold in %RH.
        /// </summary>
        public readonly int? RelativePercentage;

        [OutputConstructor]
        private SensorAlertsProfilesConditionThresholdHumidity(
            string? quality,

            int? relativePercentage)
        {
            Quality = quality;
            RelativePercentage = relativePercentage;
        }
    }
}
