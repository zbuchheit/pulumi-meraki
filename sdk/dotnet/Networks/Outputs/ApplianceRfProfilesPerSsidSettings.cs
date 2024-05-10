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
    public sealed class ApplianceRfProfilesPerSsidSettings
    {
        /// <summary>
        /// Settings for SSID 1.
        /// </summary>
        public readonly Outputs.ApplianceRfProfilesPerSsidSettingsStatus1? Status1;
        /// <summary>
        /// Settings for SSID 2.
        /// </summary>
        public readonly Outputs.ApplianceRfProfilesPerSsidSettingsStatus2? Status2;
        /// <summary>
        /// Settings for SSID 3.
        /// </summary>
        public readonly Outputs.ApplianceRfProfilesPerSsidSettingsStatus3? Status3;
        /// <summary>
        /// Settings for SSID 4.
        /// </summary>
        public readonly Outputs.ApplianceRfProfilesPerSsidSettingsStatus4? Status4;

        [OutputConstructor]
        private ApplianceRfProfilesPerSsidSettings(
            Outputs.ApplianceRfProfilesPerSsidSettingsStatus1? status1,

            Outputs.ApplianceRfProfilesPerSsidSettingsStatus2? status2,

            Outputs.ApplianceRfProfilesPerSsidSettingsStatus3? status3,

            Outputs.ApplianceRfProfilesPerSsidSettingsStatus4? status4)
        {
            Status1 = status1;
            Status2 = status2;
            Status3 = status3;
            Status4 = status4;
        }
    }
}
