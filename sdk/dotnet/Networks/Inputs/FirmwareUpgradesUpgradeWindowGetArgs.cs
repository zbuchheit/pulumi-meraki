// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class FirmwareUpgradesUpgradeWindowGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Day of the week
        /// </summary>
        [Input("dayOfWeek")]
        public Input<string>? DayOfWeek { get; set; }

        /// <summary>
        /// Hour of the day
        /// </summary>
        [Input("hourOfDay")]
        public Input<string>? HourOfDay { get; set; }

        public FirmwareUpgradesUpgradeWindowGetArgs()
        {
        }
        public static new FirmwareUpgradesUpgradeWindowGetArgs Empty => new FirmwareUpgradesUpgradeWindowGetArgs();
    }
}
