// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceVlansIpv6PrefixAssignmentOriginArgs : global::Pulumi.ResourceArgs
    {
        [Input("interfaces")]
        private InputList<string>? _interfaces;

        /// <summary>
        /// Interfaces associated with the prefix
        /// </summary>
        public InputList<string> Interfaces
        {
            get => _interfaces ?? (_interfaces = new InputList<string>());
            set => _interfaces = value;
        }

        /// <summary>
        /// Type of the origin
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ApplianceVlansIpv6PrefixAssignmentOriginArgs()
        {
        }
        public static new ApplianceVlansIpv6PrefixAssignmentOriginArgs Empty => new ApplianceVlansIpv6PrefixAssignmentOriginArgs();
    }
}
