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
    public sealed class GetSensorAlertsProfilesItemConditionThresholdUpstreamPowerResult
    {
        /// <summary>
        /// Alerting threshold for an upstream power event. Must be set to true.
        /// </summary>
        public readonly bool OutageDetected;

        [OutputConstructor]
        private GetSensorAlertsProfilesItemConditionThresholdUpstreamPowerResult(bool outageDetected)
        {
            OutageDetected = outageDetected;
        }
    }
}
