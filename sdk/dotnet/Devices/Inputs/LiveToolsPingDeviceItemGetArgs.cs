// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class LiveToolsPingDeviceItemGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Information for callback used to send back results
        /// </summary>
        [Input("callback")]
        public Input<Inputs.LiveToolsPingDeviceItemCallbackGetArgs>? Callback { get; set; }

        /// <summary>
        /// Id to check the status of your ping request.
        /// </summary>
        [Input("pingId")]
        public Input<string>? PingId { get; set; }

        /// <summary>
        /// Ping request parameters
        /// </summary>
        [Input("request")]
        public Input<Inputs.LiveToolsPingDeviceItemRequestGetArgs>? Request { get; set; }

        /// <summary>
        /// Status of the ping request.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// GET this url to check the status of your ping request.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public LiveToolsPingDeviceItemGetArgs()
        {
        }
        public static new LiveToolsPingDeviceItemGetArgs Empty => new LiveToolsPingDeviceItemGetArgs();
    }
}
