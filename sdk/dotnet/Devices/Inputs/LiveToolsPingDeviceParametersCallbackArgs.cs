// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class LiveToolsPingDeviceParametersCallbackArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The webhook receiver used for the callback webhook.
        /// </summary>
        [Input("httpServer")]
        public Input<Inputs.LiveToolsPingDeviceParametersCallbackHttpServerArgs>? HttpServer { get; set; }

        /// <summary>
        /// The payload template of the webhook used for the callback
        /// </summary>
        [Input("payloadTemplate")]
        public Input<Inputs.LiveToolsPingDeviceParametersCallbackPayloadTemplateArgs>? PayloadTemplate { get; set; }

        /// <summary>
        /// A shared secret that will be included in the requests sent to the callback URL. It can be used to verify that the request was sent by Meraki. If using this field, please also specify an url.
        /// </summary>
        [Input("sharedSecret")]
        public Input<string>? SharedSecret { get; set; }

        /// <summary>
        /// The callback URL for the webhook target. If using this field, please also specify a sharedSecret.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public LiveToolsPingDeviceParametersCallbackArgs()
        {
        }
        public static new LiveToolsPingDeviceParametersCallbackArgs Empty => new LiveToolsPingDeviceParametersCallbackArgs();
    }
}
