// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class ApplianceUplinksSettingsInterfacesWan2SvisIpv4Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IP address and subnet mask when in static mode.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The assignment mode for this SVI. Applies only when PPPoE is disabled.
        /// </summary>
        [Input("assignmentMode")]
        public Input<string>? AssignmentMode { get; set; }

        /// <summary>
        /// Gateway IP address when in static mode.
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// The nameserver settings for this SVI.
        /// </summary>
        [Input("nameservers")]
        public Input<Inputs.ApplianceUplinksSettingsInterfacesWan2SvisIpv4NameserversArgs>? Nameservers { get; set; }

        public ApplianceUplinksSettingsInterfacesWan2SvisIpv4Args()
        {
        }
        public static new ApplianceUplinksSettingsInterfacesWan2SvisIpv4Args Empty => new ApplianceUplinksSettingsInterfacesWan2SvisIpv4Args();
    }
}
