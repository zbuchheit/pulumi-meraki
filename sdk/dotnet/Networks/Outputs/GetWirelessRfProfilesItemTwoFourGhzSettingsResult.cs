// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class GetWirelessRfProfilesItemTwoFourGhzSettingsResult
    {
        /// <summary>
        /// Determines whether ax radio on 2.4Ghz band is on or off. Can be either true or false. If false, we highly recommend disabling band steering. Defaults to true.
        /// </summary>
        public readonly bool AxEnabled;
        /// <summary>
        /// Sets max power (dBm) of 2.4Ghz band. Can be integer between 2 and 30. Defaults to 30.
        /// </summary>
        public readonly int MaxPower;
        /// <summary>
        /// Sets min bitrate (Mbps) of 2.4Ghz band. Can be one of '1', '2', '5.5', '6', '9', '11', '12', '18', '24', '36', '48' or '54'. Defaults to 11.
        /// </summary>
        public readonly double MinBitrate;
        /// <summary>
        /// Sets min power (dBm) of 2.4Ghz band. Can be integer between 2 and 30. Defaults to 5.
        /// </summary>
        public readonly int MinPower;
        /// <summary>
        /// The RX-SOP level controls the sensitivity of the radio. It is strongly recommended to use RX-SOP only after consulting a wireless expert. RX-SOP can be configured in the range of -65 to -95 (dBm). A value of null will reset this to the default.
        /// </summary>
        public readonly int Rxsop;
        /// <summary>
        /// Sets valid auto channels for 2.4Ghz band. Can be one of '1', '6' or '11'. Defaults to [1, 6, 11].
        /// </summary>
        public readonly ImmutableArray<string> ValidAutoChannels;

        [OutputConstructor]
        private GetWirelessRfProfilesItemTwoFourGhzSettingsResult(
            bool axEnabled,

            int maxPower,

            double minBitrate,

            int minPower,

            int rxsop,

            ImmutableArray<string> validAutoChannels)
        {
            AxEnabled = axEnabled;
            MaxPower = maxPower;
            MinBitrate = minBitrate;
            MinPower = minPower;
            Rxsop = rxsop;
            ValidAutoChannels = validAutoChannels;
        }
    }
}
