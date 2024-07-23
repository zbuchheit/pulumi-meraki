// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class SwitchRoutingOspfV3AreaGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// OSPF area ID
        /// </summary>
        [Input("areaId")]
        public Input<int>? AreaId { get; set; }

        /// <summary>
        /// Name of the OSPF area
        /// </summary>
        [Input("areaName")]
        public Input<string>? AreaName { get; set; }

        /// <summary>
        /// Area types in OSPF. Must be one of: ["normal", "stub", "nssa"]
        /// </summary>
        [Input("areaType")]
        public Input<string>? AreaType { get; set; }

        public SwitchRoutingOspfV3AreaGetArgs()
        {
        }
        public static new SwitchRoutingOspfV3AreaGetArgs Empty => new SwitchRoutingOspfV3AreaGetArgs();
    }
}
