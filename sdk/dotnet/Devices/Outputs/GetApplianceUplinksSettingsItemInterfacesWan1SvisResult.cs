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
    public sealed class GetApplianceUplinksSettingsItemInterfacesWan1SvisResult
    {
        /// <summary>
        /// IPv4 settings for static/dynamic mode.
        /// </summary>
        public readonly Outputs.GetApplianceUplinksSettingsItemInterfacesWan1SvisIpv4Result Ipv4;
        /// <summary>
        /// IPv6 settings for static/dynamic mode.
        /// </summary>
        public readonly Outputs.GetApplianceUplinksSettingsItemInterfacesWan1SvisIpv6Result Ipv6;

        [OutputConstructor]
        private GetApplianceUplinksSettingsItemInterfacesWan1SvisResult(
            Outputs.GetApplianceUplinksSettingsItemInterfacesWan1SvisIpv4Result ipv4,

            Outputs.GetApplianceUplinksSettingsItemInterfacesWan1SvisIpv6Result ipv6)
        {
            Ipv4 = ipv4;
            Ipv6 = ipv6;
        }
    }
}
