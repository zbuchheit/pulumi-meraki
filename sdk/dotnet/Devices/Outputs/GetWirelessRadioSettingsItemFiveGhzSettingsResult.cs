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
    public sealed class GetWirelessRadioSettingsItemFiveGhzSettingsResult
    {
        public readonly int Channel;
        public readonly string ChannelWidth;
        public readonly int TargetPower;

        [OutputConstructor]
        private GetWirelessRadioSettingsItemFiveGhzSettingsResult(
            int channel,

            string channelWidth,

            int targetPower)
        {
            Channel = channel;
            ChannelWidth = channelWidth;
            TargetPower = targetPower;
        }
    }
}
