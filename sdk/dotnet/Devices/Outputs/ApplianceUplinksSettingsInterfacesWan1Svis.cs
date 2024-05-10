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
    public sealed class ApplianceUplinksSettingsInterfacesWan1Svis
    {
        /// <summary>
        /// IPv4 settings for static/dynamic mode.
        /// </summary>
        public readonly Outputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv4? Ipv4;
        /// <summary>
        /// IPv6 settings for static/dynamic mode.
        /// </summary>
        public readonly Outputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv6? Ipv6;

        [OutputConstructor]
        private ApplianceUplinksSettingsInterfacesWan1Svis(
            Outputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv4? ipv4,

            Outputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv6? ipv6)
        {
            Ipv4 = ipv4;
            Ipv6 = ipv6;
        }
    }
}
