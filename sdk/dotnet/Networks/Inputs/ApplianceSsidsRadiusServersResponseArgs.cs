// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceSsidsRadiusServersResponseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP address of your RADIUS server.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// The UDP port your RADIUS servers listens on for Access-requests.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The RADIUS client shared secret.
        /// </summary>
        [Input("secret")]
        public Input<string>? Secret { get; set; }

        public ApplianceSsidsRadiusServersResponseArgs()
        {
        }
        public static new ApplianceSsidsRadiusServersResponseArgs Empty => new ApplianceSsidsRadiusServersResponseArgs();
    }
}
