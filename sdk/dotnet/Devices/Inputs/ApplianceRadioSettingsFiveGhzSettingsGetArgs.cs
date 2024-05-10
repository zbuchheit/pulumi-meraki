// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class ApplianceRadioSettingsFiveGhzSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Manual channel for 5 GHz
        /// </summary>
        [Input("channel")]
        public Input<int>? Channel { get; set; }

        /// <summary>
        /// Manual channel width for 5 GHz
        /// </summary>
        [Input("channelWidth")]
        public Input<int>? ChannelWidth { get; set; }

        /// <summary>
        /// Manual target power for 5 GHz
        /// </summary>
        [Input("targetPower")]
        public Input<int>? TargetPower { get; set; }

        public ApplianceRadioSettingsFiveGhzSettingsGetArgs()
        {
        }
        public static new ApplianceRadioSettingsFiveGhzSettingsGetArgs Empty => new ApplianceRadioSettingsFiveGhzSettingsGetArgs();
    }
}
