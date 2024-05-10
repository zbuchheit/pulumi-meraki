// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesStagedEventsProductsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Switch network to be updated
        /// </summary>
        [Input("switch")]
        public Input<Inputs.FirmwareUpgradesStagedEventsProductsSwitchArgs>? Switch { get; set; }

        /// <summary>
        /// Version information for the switch network being upgraded
        /// </summary>
        [Input("switchCatalyst")]
        public Input<Inputs.FirmwareUpgradesStagedEventsProductsSwitchCatalystArgs>? SwitchCatalyst { get; set; }

        public FirmwareUpgradesStagedEventsProductsArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsProductsArgs Empty => new FirmwareUpgradesStagedEventsProductsArgs();
    }
}
