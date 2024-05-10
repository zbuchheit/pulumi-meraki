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
    public sealed class AlertsSettingsAlert
    {
        /// <summary>
        /// A hash of destinations for this specific alert
        /// </summary>
        public readonly Outputs.AlertsSettingsAlertAlertDestinations? AlertDestinations;
        /// <summary>
        /// A boolean depicting if the alert is turned on or off
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// A hash of specific configuration data for the alert. Only filters specific to the alert will be updated.
        /// </summary>
        public readonly Outputs.AlertsSettingsAlertFilters? Filters;
        /// <summary>
        /// The type of alert
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private AlertsSettingsAlert(
            Outputs.AlertsSettingsAlertAlertDestinations? alertDestinations,

            bool? enabled,

            Outputs.AlertsSettingsAlertFilters? filters,

            string? type)
        {
            AlertDestinations = alertDestinations;
            Enabled = enabled;
            Filters = filters;
            Type = type;
        }
    }
}
