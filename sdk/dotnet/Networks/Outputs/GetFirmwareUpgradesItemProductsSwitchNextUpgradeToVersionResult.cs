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
    public sealed class GetFirmwareUpgradesItemProductsSwitchNextUpgradeToVersionResult
    {
        /// <summary>
        /// Name of the firmware version
        /// </summary>
        public readonly string Firmware;
        /// <summary>
        /// Firmware version identifier
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Release date of the firmware version
        /// </summary>
        public readonly string ReleaseDate;
        /// <summary>
        /// Release type of the firmware version
        /// </summary>
        public readonly string ReleaseType;
        /// <summary>
        /// Firmware version short name
        /// </summary>
        public readonly string ShortName;

        [OutputConstructor]
        private GetFirmwareUpgradesItemProductsSwitchNextUpgradeToVersionResult(
            string firmware,

            string id,

            string releaseDate,

            string releaseType,

            string shortName)
        {
            Firmware = firmware;
            Id = id;
            ReleaseDate = releaseDate;
            ReleaseType = releaseType;
            ShortName = shortName;
        }
    }
}
