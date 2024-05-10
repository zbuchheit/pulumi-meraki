// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class LiveToolsArpTableCallbackHttpServerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The webhook receiver ID that will receive information. If specifying this, please leave the url and sharedSecret fields blank.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public LiveToolsArpTableCallbackHttpServerArgs()
        {
        }
        public static new LiveToolsArpTableCallbackHttpServerArgs Empty => new LiveToolsArpTableCallbackHttpServerArgs();
    }
}
