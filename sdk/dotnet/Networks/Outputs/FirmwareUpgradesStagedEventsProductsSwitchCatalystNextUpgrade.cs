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
    public sealed class FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgrade
    {
        /// <summary>
        /// The version to be updated to for switch Catalyst devices
        /// </summary>
        public readonly Outputs.FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeToVersion? ToVersion;

        [OutputConstructor]
        private FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgrade(Outputs.FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeToVersion? toVersion)
        {
            ToVersion = toVersion;
        }
    }
}
