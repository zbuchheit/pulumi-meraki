// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class LiveToolsArpTableCallbackPayloadTemplateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the payload template. Defaults to 'wpt_00005' for the Callback (included) template.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public LiveToolsArpTableCallbackPayloadTemplateGetArgs()
        {
        }
        public static new LiveToolsArpTableCallbackPayloadTemplateGetArgs Empty => new LiveToolsArpTableCallbackPayloadTemplateGetArgs();
    }
}
