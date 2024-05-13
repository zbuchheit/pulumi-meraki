// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class ApplianceUplinksSettingsInterfacesWan1SvisArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IPv4 settings for static/dynamic mode.
        /// </summary>
        [Input("ipv4")]
        public Input<Inputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv4Args>? Ipv4 { get; set; }

        /// <summary>
        /// IPv6 settings for static/dynamic mode.
        /// </summary>
        [Input("ipv6")]
        public Input<Inputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv6Args>? Ipv6 { get; set; }

        public ApplianceUplinksSettingsInterfacesWan1SvisArgs()
        {
        }
        public static new ApplianceUplinksSettingsInterfacesWan1SvisArgs Empty => new ApplianceUplinksSettingsInterfacesWan1SvisArgs();
    }
}