// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class SwitchRoutingOspfV3Area
    {
        /// <summary>
        /// OSPF area ID
        /// </summary>
        public readonly int? AreaId;
        /// <summary>
        /// Name of the OSPF area
        /// </summary>
        public readonly string? AreaName;
        /// <summary>
        /// Area types in OSPF. Must be one of: ["normal", "stub", "nssa"]
        /// </summary>
        public readonly string? AreaType;

        [OutputConstructor]
        private SwitchRoutingOspfV3Area(
            int? areaId,

            string? areaName,

            string? areaType)
        {
            AreaId = areaId;
            AreaName = areaName;
            AreaType = areaType;
        }
    }
}
