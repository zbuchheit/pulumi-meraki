// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class LiveToolsArpTableCallback
    {
        /// <summary>
        /// The webhook receiver used for the callback webhook.
        /// </summary>
        public readonly Outputs.LiveToolsArpTableCallbackHttpServer? HttpServer;
        /// <summary>
        /// The payload template of the webhook used for the callback
        /// </summary>
        public readonly Outputs.LiveToolsArpTableCallbackPayloadTemplate? PayloadTemplate;
        /// <summary>
        /// A shared secret that will be included in the requests sent to the callback URL. It can be used to verify that the request was sent by Meraki. If using this field, please also specify an url.
        /// </summary>
        public readonly string? SharedSecret;
        /// <summary>
        /// The callback URL for the webhook target. If using this field, please also specify a sharedSecret.
        /// </summary>
        public readonly string? Url;

        [OutputConstructor]
        private LiveToolsArpTableCallback(
            Outputs.LiveToolsArpTableCallbackHttpServer? httpServer,

            Outputs.LiveToolsArpTableCallbackPayloadTemplate? payloadTemplate,

            string? sharedSecret,

            string? url)
        {
            HttpServer = httpServer;
            PayloadTemplate = payloadTemplate;
            SharedSecret = sharedSecret;
            Url = url;
        }
    }
}
