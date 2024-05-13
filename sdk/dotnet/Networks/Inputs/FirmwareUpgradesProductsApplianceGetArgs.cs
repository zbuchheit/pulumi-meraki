// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesProductsApplianceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("availableVersions")]
        private InputList<Inputs.FirmwareUpgradesProductsApplianceAvailableVersionGetArgs>? _availableVersions;

        /// <summary>
        /// Firmware versions available for upgrade
        /// </summary>
        public InputList<Inputs.FirmwareUpgradesProductsApplianceAvailableVersionGetArgs> AvailableVersions
        {
            get => _availableVersions ?? (_availableVersions = new InputList<Inputs.FirmwareUpgradesProductsApplianceAvailableVersionGetArgs>());
            set => _availableVersions = value;
        }

        /// <summary>
        /// Details of the current version on the device
        /// </summary>
        [Input("currentVersion")]
        public Input<Inputs.FirmwareUpgradesProductsApplianceCurrentVersionGetArgs>? CurrentVersion { get; set; }

        /// <summary>
        /// Details of the last firmware upgrade on the device
        /// </summary>
        [Input("lastUpgrade")]
        public Input<Inputs.FirmwareUpgradesProductsApplianceLastUpgradeGetArgs>? LastUpgrade { get; set; }

        /// <summary>
        /// Details of the next firmware upgrade on the device
        /// </summary>
        [Input("nextUpgrade")]
        public Input<Inputs.FirmwareUpgradesProductsApplianceNextUpgradeGetArgs>? NextUpgrade { get; set; }

        /// <summary>
        /// Whether or not the network wants beta firmware
        /// </summary>
        [Input("participateInNextBetaRelease")]
        public Input<bool>? ParticipateInNextBetaRelease { get; set; }

        public FirmwareUpgradesProductsApplianceGetArgs()
        {
        }
        public static new FirmwareUpgradesProductsApplianceGetArgs Empty => new FirmwareUpgradesProductsApplianceGetArgs();
    }
}