// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceVpnSiteToSiteVpnHubGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The network ID of the hub.
        /// </summary>
        [Input("hubId")]
        public Input<string>? HubId { get; set; }

        /// <summary>
        /// Indicates whether default route traffic should be sent to this hub.
        /// </summary>
        [Input("useDefaultRoute")]
        public Input<bool>? UseDefaultRoute { get; set; }

        public ApplianceVpnSiteToSiteVpnHubGetArgs()
        {
        }
        public static new ApplianceVpnSiteToSiteVpnHubGetArgs Empty => new ApplianceVpnSiteToSiteVpnHubGetArgs();
    }
}
