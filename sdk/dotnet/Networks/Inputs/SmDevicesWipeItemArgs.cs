// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SmDevicesWipeItemArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Meraki Id of the devices.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public SmDevicesWipeItemArgs()
        {
        }
        public static new SmDevicesWipeItemArgs Empty => new SmDevicesWipeItemArgs();
    }
}
