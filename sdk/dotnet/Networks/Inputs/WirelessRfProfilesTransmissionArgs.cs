// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessRfProfilesTransmissionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Toggle for radio transmission. When false, radios will not transmit at all.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public WirelessRfProfilesTransmissionArgs()
        {
        }
        public static new WirelessRfProfilesTransmissionArgs Empty => new WirelessRfProfilesTransmissionArgs();
    }
}
