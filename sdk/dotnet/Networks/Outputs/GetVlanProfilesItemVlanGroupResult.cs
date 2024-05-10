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
    public sealed class GetVlanProfilesItemVlanGroupResult
    {
        /// <summary>
        /// Name of the VLAN, string length must be from 1 to 32 characters
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Comma-separated VLAN IDs or ID ranges
        /// </summary>
        public readonly string VlanIds;

        [OutputConstructor]
        private GetVlanProfilesItemVlanGroupResult(
            string name,

            string vlanIds)
        {
            Name = name;
            VlanIds = vlanIds;
        }
    }
}
