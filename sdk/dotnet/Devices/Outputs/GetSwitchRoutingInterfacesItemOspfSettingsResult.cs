// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class GetSwitchRoutingInterfacesItemOspfSettingsResult
    {
        /// <summary>
        /// Area id
        /// </summary>
        public readonly string Area;
        /// <summary>
        /// OSPF Cost
        /// </summary>
        public readonly int Cost;
        /// <summary>
        /// Disable sending Hello packets on this interface's IPv4 area
        /// </summary>
        public readonly bool IsPassiveEnabled;

        [OutputConstructor]
        private GetSwitchRoutingInterfacesItemOspfSettingsResult(
            string area,

            int cost,

            bool isPassiveEnabled)
        {
            Area = area;
            Cost = cost;
            IsPassiveEnabled = isPassiveEnabled;
        }
    }
}
