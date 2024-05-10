// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeToVersionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Id of the Version being upgraded to
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Firmware version short name
        /// </summary>
        [Input("shortName")]
        public Input<string>? ShortName { get; set; }

        public FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeToVersionGetArgs()
        {
        }
        public static new FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeToVersionGetArgs Empty => new FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeToVersionGetArgs();
    }
}
