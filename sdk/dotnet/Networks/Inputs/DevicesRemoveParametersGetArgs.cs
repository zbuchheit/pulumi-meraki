// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class DevicesRemoveParametersGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The serial of a device
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        public DevicesRemoveParametersGetArgs()
        {
        }
        public static new DevicesRemoveParametersGetArgs Empty => new DevicesRemoveParametersGetArgs();
    }
}
