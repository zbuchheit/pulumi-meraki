// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class ApplianceUplinksSettingsInterfacesWan2SvisArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IPv4 settings for static/dynamic mode.
        /// </summary>
        [Input("ipv4")]
        public Input<Inputs.ApplianceUplinksSettingsInterfacesWan2SvisIpv4Args>? Ipv4 { get; set; }

        /// <summary>
        /// IPv6 settings for static/dynamic mode.
        /// </summary>
        [Input("ipv6")]
        public Input<Inputs.ApplianceUplinksSettingsInterfacesWan2SvisIpv6Args>? Ipv6 { get; set; }

        public ApplianceUplinksSettingsInterfacesWan2SvisArgs()
        {
        }
        public static new ApplianceUplinksSettingsInterfacesWan2SvisArgs Empty => new ApplianceUplinksSettingsInterfacesWan2SvisArgs();
    }
}