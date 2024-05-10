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
    public sealed class WirelessRfProfilesPerSsidSettingsStatus9Bands
    {
        /// <summary>
        /// List of enabled bands. Can include ["2.4", "5", "6", "disabled"
        /// </summary>
        public readonly ImmutableArray<string> Enableds;

        [OutputConstructor]
        private WirelessRfProfilesPerSsidSettingsStatus9Bands(ImmutableArray<string> enableds)
        {
            Enableds = enableds;
        }
    }
}
