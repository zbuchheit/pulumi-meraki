// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SmDevicesMoveItemArgs : global::Pulumi.ResourceArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// The Meraki Ids of the set of devices.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The network to which the devices was moved.
        /// </summary>
        [Input("newNetwork")]
        public Input<string>? NewNetwork { get; set; }

        public SmDevicesMoveItemArgs()
        {
        }
        public static new SmDevicesMoveItemArgs Empty => new SmDevicesMoveItemArgs();
    }
}
