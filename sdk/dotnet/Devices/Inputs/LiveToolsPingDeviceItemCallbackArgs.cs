// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class LiveToolsPingDeviceItemCallbackArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the callback. To check the status of the callback, use this ID in a request to /webhooks/callbacks/statuses/{id}
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The status of the callback
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The callback URL for the webhook target. This was either provided in the original request or comes from a configured webhook receiver
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public LiveToolsPingDeviceItemCallbackArgs()
        {
        }
        public static new LiveToolsPingDeviceItemCallbackArgs Empty => new LiveToolsPingDeviceItemCallbackArgs();
    }
}
