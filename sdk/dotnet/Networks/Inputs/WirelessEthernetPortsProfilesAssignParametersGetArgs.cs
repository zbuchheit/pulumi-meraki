// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class WirelessEthernetPortsProfilesAssignParametersGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AP profile ID
        /// </summary>
        [Input("profileId")]
        public Input<string>? ProfileId { get; set; }

        [Input("serials")]
        private InputList<string>? _serials;

        /// <summary>
        /// List of AP serials
        /// </summary>
        public InputList<string> Serials
        {
            get => _serials ?? (_serials = new InputList<string>());
            set => _serials = value;
        }

        public WirelessEthernetPortsProfilesAssignParametersGetArgs()
        {
        }
        public static new WirelessEthernetPortsProfilesAssignParametersGetArgs Empty => new WirelessEthernetPortsProfilesAssignParametersGetArgs();
    }
}
