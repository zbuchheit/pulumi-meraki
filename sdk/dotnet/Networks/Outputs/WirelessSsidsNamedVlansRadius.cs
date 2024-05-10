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
    public sealed class WirelessSsidsNamedVlansRadius
    {
        /// <summary>
        /// Guest VLAN settings. Used to direct traffic to a guest VLAN when none of the RADIUS servers are reachable or a client receives access-reject from the RADIUS server.
        /// </summary>
        public readonly Outputs.WirelessSsidsNamedVlansRadiusGuestVlan? GuestVlan;

        [OutputConstructor]
        private WirelessSsidsNamedVlansRadius(Outputs.WirelessSsidsNamedVlansRadiusGuestVlan? guestVlan)
        {
            GuestVlan = guestVlan;
        }
    }
}
