// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Inputs
{

    public sealed class LiveToolsArpTableRequestArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Device serial number
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        public LiveToolsArpTableRequestArgs()
        {
        }
        public static new LiveToolsArpTableRequestArgs Empty => new LiveToolsArpTableRequestArgs();
    }
}
