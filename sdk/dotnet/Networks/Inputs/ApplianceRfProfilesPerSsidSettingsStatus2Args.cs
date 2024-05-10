// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceRfProfilesPerSsidSettingsStatus2Args : global::Pulumi.ResourceArgs
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

        public ApplianceRfProfilesPerSsidSettingsStatus2Args()
        {
        }
        public static new ApplianceRfProfilesPerSsidSettingsStatus2Args Empty => new ApplianceRfProfilesPerSsidSettingsStatus2Args();
    }
}
