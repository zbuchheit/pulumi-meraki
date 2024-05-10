// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessRfProfilesApBandSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Choice between 'dual', '2.4ghz', '5ghz', '6ghz' or 'multi'. Defaults to dual.
        /// </summary>
        [Input("bandOperationMode")]
        public Input<string>? BandOperationMode { get; set; }

        /// <summary>
        /// Steers client to most open band. Can be either true or false. Defaults to true.
        /// </summary>
        [Input("bandSteeringEnabled")]
        public Input<bool>? BandSteeringEnabled { get; set; }

        /// <summary>
        /// Settings related to all bands
        /// </summary>
        [Input("bands")]
        public Input<Inputs.WirelessRfProfilesApBandSettingsBandsArgs>? Bands { get; set; }

        public WirelessRfProfilesApBandSettingsArgs()
        {
        }
        public static new WirelessRfProfilesApBandSettingsArgs Empty => new WirelessRfProfilesApBandSettingsArgs();
    }
}
