// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessSsidsApTagsAndVlanIdGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Array of AP tags
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Numerical identifier that is assigned to the VLAN
        /// </summary>
        [Input("vlanId")]
        public Input<int>? VlanId { get; set; }

        public WirelessSsidsApTagsAndVlanIdGetArgs()
        {
        }
        public static new WirelessSsidsApTagsAndVlanIdGetArgs Empty => new WirelessSsidsApTagsAndVlanIdGetArgs();
    }
}
