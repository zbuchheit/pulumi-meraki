// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessRfProfilesPerSsidSettingsStatus2GetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Choice between 'dual', '2.4ghz', '5ghz', '6ghz' or 'multi'.
        /// </summary>
        [Input("bandOperationMode")]
        public Input<string>? BandOperationMode { get; set; }

        /// <summary>
        /// Steers client to most open band between 2.4 GHz and 5 GHz. Can be either true or false.
        /// </summary>
        [Input("bandSteeringEnabled")]
        public Input<bool>? BandSteeringEnabled { get; set; }

        /// <summary>
        /// Settings related to all bands
        /// </summary>
        [Input("bands")]
        public Input<Inputs.WirelessRfProfilesPerSsidSettingsStatus2BandsGetArgs>? Bands { get; set; }

        /// <summary>
        /// Sets min bitrate (Mbps) of this SSID. Can be one of '1', '2', '5.5', '6', '9', '11', '12', '18', '24', '36', '48' or '54'.
        /// </summary>
        [Input("minBitrate")]
        public Input<int>? MinBitrate { get; set; }

        /// <summary>
        /// Name of SSID
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public WirelessRfProfilesPerSsidSettingsStatus2GetArgs()
        {
        }
        public static new WirelessRfProfilesPerSsidSettingsStatus2GetArgs Empty => new WirelessRfProfilesPerSsidSettingsStatus2GetArgs();
    }
}
