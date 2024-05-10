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
    public sealed class GetApplianceRfProfilesItemPerSsidSettingsStatus1Result
    {
        /// <summary>
        /// Band mode of this SSID
        /// </summary>
        public readonly string BandOperationMode;
        /// <summary>
        /// Whether this SSID steers clients to the most open band between 2.4 GHz and 5 GHz.
        /// </summary>
        public readonly bool BandSteeringEnabled;

        [OutputConstructor]
        private GetApplianceRfProfilesItemPerSsidSettingsStatus1Result(
            string bandOperationMode,

            bool bandSteeringEnabled)
        {
            BandOperationMode = bandOperationMode;
            BandSteeringEnabled = bandSteeringEnabled;
        }
    }
}
