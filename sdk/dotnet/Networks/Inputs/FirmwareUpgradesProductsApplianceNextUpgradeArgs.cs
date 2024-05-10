// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesProductsApplianceNextUpgradeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Timestamp of the next scheduled firmware upgrade
        /// </summary>
        [Input("time")]
        public Input<string>? Time { get; set; }

        /// <summary>
        /// Details of the version the device will upgrade to if it exists
        /// </summary>
        [Input("toVersion")]
        public Input<Inputs.FirmwareUpgradesProductsApplianceNextUpgradeToVersionArgs>? ToVersion { get; set; }

        public FirmwareUpgradesProductsApplianceNextUpgradeArgs()
        {
        }
        public static new FirmwareUpgradesProductsApplianceNextUpgradeArgs Empty => new FirmwareUpgradesProductsApplianceNextUpgradeArgs();
    }
}
