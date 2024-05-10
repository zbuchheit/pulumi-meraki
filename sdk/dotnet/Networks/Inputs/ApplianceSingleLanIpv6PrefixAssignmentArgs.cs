// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceSingleLanIpv6PrefixAssignmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Auto assign a /64 prefix from the origin to the single LAN
        /// </summary>
        [Input("autonomous")]
        public Input<bool>? Autonomous { get; set; }

        /// <summary>
        /// The origin of the prefix
        /// </summary>
        [Input("origin")]
        public Input<Inputs.ApplianceSingleLanIpv6PrefixAssignmentOriginArgs>? Origin { get; set; }

        /// <summary>
        /// Manual configuration of the IPv6 Appliance IP
        /// </summary>
        [Input("staticApplianceIp6")]
        public Input<string>? StaticApplianceIp6 { get; set; }

        /// <summary>
        /// Manual configuration of a /64 prefix on the single LAN
        /// </summary>
        [Input("staticPrefix")]
        public Input<string>? StaticPrefix { get; set; }

        public ApplianceSingleLanIpv6PrefixAssignmentArgs()
        {
        }
        public static new ApplianceSingleLanIpv6PrefixAssignmentArgs Empty => new ApplianceSingleLanIpv6PrefixAssignmentArgs();
    }
}
