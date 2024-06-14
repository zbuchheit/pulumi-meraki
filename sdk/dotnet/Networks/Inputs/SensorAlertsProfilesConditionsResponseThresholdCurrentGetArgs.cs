// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SensorAlertsProfilesConditionsResponseThresholdCurrentGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alerting threshold in amps. Must be between 0 and 15.
        /// </summary>
        [Input("draw")]
        public Input<double>? Draw { get; set; }

        public SensorAlertsProfilesConditionsResponseThresholdCurrentGetArgs()
        {
        }
        public static new SensorAlertsProfilesConditionsResponseThresholdCurrentGetArgs Empty => new SensorAlertsProfilesConditionsResponseThresholdCurrentGetArgs();
    }
}
