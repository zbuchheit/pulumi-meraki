// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SensorAlertsProfilesConditionsResponseThresholdTvocGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alerting threshold as TVOC micrograms per cubic meter.
        /// </summary>
        [Input("concentration")]
        public Input<int>? Concentration { get; set; }

        /// <summary>
        /// Alerting threshold as a qualitative TVOC level.
        /// </summary>
        [Input("quality")]
        public Input<string>? Quality { get; set; }

        public SensorAlertsProfilesConditionsResponseThresholdTvocGetArgs()
        {
        }
        public static new SensorAlertsProfilesConditionsResponseThresholdTvocGetArgs Empty => new SensorAlertsProfilesConditionsResponseThresholdTvocGetArgs();
    }
}
