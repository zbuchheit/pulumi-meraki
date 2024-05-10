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
    public sealed class FirmwareUpgradesProductsSwitchNextUpgrade
    {
        /// <summary>
        /// Timestamp of the next scheduled firmware upgrade
        /// </summary>
        public readonly string? Time;
        /// <summary>
        /// Details of the version the device will upgrade to if it exists
        /// </summary>
        public readonly Outputs.FirmwareUpgradesProductsSwitchNextUpgradeToVersion? ToVersion;

        [OutputConstructor]
        private FirmwareUpgradesProductsSwitchNextUpgrade(
            string? time,

            Outputs.FirmwareUpgradesProductsSwitchNextUpgradeToVersion? toVersion)
        {
            Time = time;
            ToVersion = toVersion;
        }
    }
}
