// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class GetApplianceRadioSettingsItemFiveGhzSettingsResult
    {
        /// <summary>
        /// Manual channel for 5 GHz
        /// </summary>
        public readonly int Channel;
        /// <summary>
        /// Manual channel width for 5 GHz
        /// </summary>
        public readonly int ChannelWidth;
        /// <summary>
        /// Manual target power for 5 GHz
        /// </summary>
        public readonly int TargetPower;

        [OutputConstructor]
        private GetApplianceRadioSettingsItemFiveGhzSettingsResult(
            int channel,

            int channelWidth,

            int targetPower)
        {
            Channel = channel;
            ChannelWidth = channelWidth;
            TargetPower = targetPower;
        }
    }
}
