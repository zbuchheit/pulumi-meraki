// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class AdminsNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Admin's level of access to the network
        /// </summary>
        [Input("access")]
        public Input<string>? Access { get; set; }

        /// <summary>
        /// Network ID
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public AdminsNetworkArgs()
        {
        }
        public static new AdminsNetworkArgs Empty => new AdminsNetworkArgs();
    }
}
