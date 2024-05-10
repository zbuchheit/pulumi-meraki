// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesProductsSensorLastUpgradeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Details of the version the device upgraded from
        /// </summary>
        [Input("fromVersion")]
        public Input<Inputs.FirmwareUpgradesProductsSensorLastUpgradeFromVersionArgs>? FromVersion { get; set; }

        /// <summary>
        /// Timestamp of the last successful firmware upgrade
        /// </summary>
        [Input("time")]
        public Input<string>? Time { get; set; }

        /// <summary>
        /// Details of the version the device upgraded to
        /// </summary>
        [Input("toVersion")]
        public Input<Inputs.FirmwareUpgradesProductsSensorLastUpgradeToVersionArgs>? ToVersion { get; set; }

        public FirmwareUpgradesProductsSensorLastUpgradeArgs()
        {
        }
        public static new FirmwareUpgradesProductsSensorLastUpgradeArgs Empty => new FirmwareUpgradesProductsSensorLastUpgradeArgs();
    }
}
