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
    public sealed class GetAlertsSettingsItemAlertResult
    {
        public readonly Outputs.GetAlertsSettingsItemAlertAlertDestinationsResult AlertDestinations;
        public readonly bool Enabled;
        public readonly Outputs.GetAlertsSettingsItemAlertFiltersResult Filters;
        public readonly string Type;

        [OutputConstructor]
        private GetAlertsSettingsItemAlertResult(
            Outputs.GetAlertsSettingsItemAlertAlertDestinationsResult alertDestinations,

            bool enabled,

            Outputs.GetAlertsSettingsItemAlertFiltersResult filters,

            string type)
        {
            AlertDestinations = alertDestinations;
            Enabled = enabled;
            Filters = filters;
            Type = type;
        }
    }
}