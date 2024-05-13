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
    public sealed class GetFirmwareUpgradesStagedEventsItemProductsSwitchNextUpgradeResult
    {
        /// <summary>
        /// Details of the version the device will upgrade to
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesStagedEventsItemProductsSwitchNextUpgradeToVersionResult ToVersion;

        [OutputConstructor]
        private GetFirmwareUpgradesStagedEventsItemProductsSwitchNextUpgradeResult(Outputs.GetFirmwareUpgradesStagedEventsItemProductsSwitchNextUpgradeToVersionResult toVersion)
        {
            ToVersion = toVersion;
        }
    }
}