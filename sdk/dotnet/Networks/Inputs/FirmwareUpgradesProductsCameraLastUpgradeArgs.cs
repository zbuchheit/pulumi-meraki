// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesProductsCameraLastUpgradeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Details of the version the device upgraded from
        /// </summary>
        [Input("fromVersion")]
        public Input<Inputs.FirmwareUpgradesProductsCameraLastUpgradeFromVersionArgs>? FromVersion { get; set; }

        /// <summary>
        /// Timestamp of the last successful firmware upgrade
        /// </summary>
        [Input("time")]
        public Input<string>? Time { get; set; }

        /// <summary>
        /// Details of the version the device upgraded to
        /// </summary>
        [Input("toVersion")]
        public Input<Inputs.FirmwareUpgradesProductsCameraLastUpgradeToVersionArgs>? ToVersion { get; set; }

        public FirmwareUpgradesProductsCameraLastUpgradeArgs()
        {
        }
        public static new FirmwareUpgradesProductsCameraLastUpgradeArgs Empty => new FirmwareUpgradesProductsCameraLastUpgradeArgs();
    }
}
