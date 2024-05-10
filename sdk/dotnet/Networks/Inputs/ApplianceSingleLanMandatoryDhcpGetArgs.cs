// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceSingleLanMandatoryDhcpGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable Mandatory DHCP on single LAN.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public ApplianceSingleLanMandatoryDhcpGetArgs()
        {
        }
        public static new ApplianceSingleLanMandatoryDhcpGetArgs Empty => new ApplianceSingleLanMandatoryDhcpGetArgs();
    }
}
