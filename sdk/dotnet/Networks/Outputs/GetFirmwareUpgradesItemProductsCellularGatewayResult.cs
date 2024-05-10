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
    public sealed class GetFirmwareUpgradesItemProductsCellularGatewayResult
    {
        /// <summary>
        /// Firmware versions available for upgrade
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirmwareUpgradesItemProductsCellularGatewayAvailableVersionResult> AvailableVersions;
        /// <summary>
        /// Details of the current version on the device
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsCellularGatewayCurrentVersionResult CurrentVersion;
        /// <summary>
        /// Details of the last firmware upgrade on the device
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsCellularGatewayLastUpgradeResult LastUpgrade;
        /// <summary>
        /// Details of the next firmware upgrade on the device
        /// </summary>
        public readonly Outputs.GetFirmwareUpgradesItemProductsCellularGatewayNextUpgradeResult NextUpgrade;
        /// <summary>
        /// Whether or not the network wants beta firmware
        /// </summary>
        public readonly bool ParticipateInNextBetaRelease;

        [OutputConstructor]
        private GetFirmwareUpgradesItemProductsCellularGatewayResult(
            ImmutableArray<Outputs.GetFirmwareUpgradesItemProductsCellularGatewayAvailableVersionResult> availableVersions,

            Outputs.GetFirmwareUpgradesItemProductsCellularGatewayCurrentVersionResult currentVersion,

            Outputs.GetFirmwareUpgradesItemProductsCellularGatewayLastUpgradeResult lastUpgrade,

            Outputs.GetFirmwareUpgradesItemProductsCellularGatewayNextUpgradeResult nextUpgrade,

            bool participateInNextBetaRelease)
        {
            AvailableVersions = availableVersions;
            CurrentVersion = currentVersion;
            LastUpgrade = lastUpgrade;
            NextUpgrade = nextUpgrade;
            ParticipateInNextBetaRelease = participateInNextBetaRelease;
        }
    }
}
