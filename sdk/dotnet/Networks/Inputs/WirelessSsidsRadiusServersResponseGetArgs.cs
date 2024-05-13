// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsRadiusServersResponseGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Certificate used for authorization for the RADSEC Server
        /// </summary>
        [Input("caCertificate")]
        public Input<string>? CaCertificate { get; set; }

        /// <summary>
        /// IP address of your RADIUS server
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// The ID of the Openroaming Certificate attached to radius server.
        /// </summary>
        [Input("openRoamingCertificateId")]
        public Input<int>? OpenRoamingCertificateId { get; set; }

        /// <summary>
        /// UDP port the RADIUS server listens on for Access-requests
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Use RADSEC (TLS over TCP) to connect to this RADIUS server. Requires radiusProxyEnabled.
        /// </summary>
        [Input("radsecEnabled")]
        public Input<bool>? RadsecEnabled { get; set; }

        /// <summary>
        /// RADIUS client shared secret
        /// </summary>
        [Input("secret")]
        public Input<string>? Secret { get; set; }

        public WirelessSsidsRadiusServersResponseGetArgs()
        {
        }
        public static new WirelessSsidsRadiusServersResponseGetArgs Empty => new WirelessSsidsRadiusServersResponseGetArgs();
    }
}