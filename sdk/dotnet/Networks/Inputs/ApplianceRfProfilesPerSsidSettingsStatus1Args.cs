// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceRfProfilesPerSsidSettingsStatus1Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Band mode of this SSID
        /// </summary>
        [Input("bandOperationMode")]
        public Input<string>? BandOperationMode { get; set; }

        /// <summary>
        /// Whether this SSID steers clients to the most open band between 2.4 GHz and 5 GHz.
        /// </summary>
        [Input("bandSteeringEnabled")]
        public Input<bool>? BandSteeringEnabled { get; set; }

        public ApplianceRfProfilesPerSsidSettingsStatus1Args()
        {
        }
        public static new ApplianceRfProfilesPerSsidSettingsStatus1Args Empty => new ApplianceRfProfilesPerSsidSettingsStatus1Args();
    }
}
