// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class AlertsSettingsAlertsResponseGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A hash of destinations for this specific alert
        /// </summary>
        [Input("alertDestinations")]
        public Input<Inputs.AlertsSettingsAlertsResponseAlertDestinationsGetArgs>? AlertDestinations { get; set; }

        /// <summary>
        /// A boolean depicting if the alert is turned on or off
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// A hash of specific configuration data for the alert. Only filters specific to the alert will be updated.
        /// </summary>
        [Input("filters")]
        public Input<Inputs.AlertsSettingsAlertsResponseFiltersGetArgs>? Filters { get; set; }

        /// <summary>
        /// The type of alert
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public AlertsSettingsAlertsResponseGetArgs()
        {
        }
        public static new AlertsSettingsAlertsResponseGetArgs Empty => new AlertsSettingsAlertsResponseGetArgs();
    }
}
