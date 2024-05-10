// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class LiveToolsPingItemRequestGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of pings to send
        /// </summary>
        [Input("count")]
        public Input<int>? Count { get; set; }

        /// <summary>
        /// Device serial number
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        /// <summary>
        /// IP address or FQDN to ping
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        public LiveToolsPingItemRequestGetArgs()
        {
        }
        public static new LiveToolsPingItemRequestGetArgs Empty => new LiveToolsPingItemRequestGetArgs();
    }
}
