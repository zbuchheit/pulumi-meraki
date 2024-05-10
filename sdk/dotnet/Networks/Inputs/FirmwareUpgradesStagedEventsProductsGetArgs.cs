// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesStagedEventsProductsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Switch network to be updated
        /// </summary>
        [Input("switch")]
        public Input<Inputs.FirmwareUpgradesStagedEventsProductsSwitchGetArgs>? Switch { get; set; }

        /// <summary>
        /// Version information for the switch network being upgraded
        /// </summary>
        [Input("switchCatalyst")]
        public Input<Inputs.FirmwareUpgradesStagedEventsProductsSwitchCatalystGetArgs>? SwitchCatalyst { get; set; }

        public FirmwareUpgradesStagedEventsProductsGetArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsProductsGetArgs Empty => new FirmwareUpgradesStagedEventsProductsGetArgs();
    }
}
