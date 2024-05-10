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
    public sealed class WirelessRfProfilesPerSsidSettingsStatus7
    {
        /// <summary>
        /// Choice between 'dual', '2.4ghz', '5ghz', '6ghz' or 'multi'.
        /// </summary>
        public readonly string? BandOperationMode;
        /// <summary>
        /// Steers client to most open band between 2.4 GHz and 5 GHz. Can be either true or false.
        /// </summary>
        public readonly bool? BandSteeringEnabled;
        /// <summary>
        /// Settings related to all bands
        /// </summary>
        public readonly Outputs.WirelessRfProfilesPerSsidSettingsStatus7Bands? Bands;
        /// <summary>
        /// Sets min bitrate (Mbps) of this SSID. Can be one of '1', '2', '5.5', '6', '9', '11', '12', '18', '24', '36', '48' or '54'.
        /// </summary>
        public readonly int? MinBitrate;
        /// <summary>
        /// Name of SSID
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private WirelessRfProfilesPerSsidSettingsStatus7(
            string? bandOperationMode,

            bool? bandSteeringEnabled,

            Outputs.WirelessRfProfilesPerSsidSettingsStatus7Bands? bands,

            int? minBitrate,

            string? name)
        {
            BandOperationMode = bandOperationMode;
            BandSteeringEnabled = bandSteeringEnabled;
            Bands = bands;
            MinBitrate = minBitrate;
            Name = name;
        }
    }
}
