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
    public sealed class GetVlanProfilesAssignmentsByDeviceItemResult
    {
        /// <summary>
        /// MAC address of the device
        /// </summary>
        public readonly string Mac;
        /// <summary>
        /// Name of the Device
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The product type
        /// </summary>
        public readonly string ProductType;
        /// <summary>
        /// Serial of the Device
        /// </summary>
        public readonly string Serial;
        /// <summary>
        /// The Switch Stack the device belongs to
        /// </summary>
        public readonly Outputs.GetVlanProfilesAssignmentsByDeviceItemStackResult Stack;
        /// <summary>
        /// The VLAN Profile
        /// </summary>
        public readonly Outputs.GetVlanProfilesAssignmentsByDeviceItemVlanProfileResult VlanProfile;

        [OutputConstructor]
        private GetVlanProfilesAssignmentsByDeviceItemResult(
            string mac,

            string name,

            string productType,

            string serial,

            Outputs.GetVlanProfilesAssignmentsByDeviceItemStackResult stack,

            Outputs.GetVlanProfilesAssignmentsByDeviceItemVlanProfileResult vlanProfile)
        {
            Mac = mac;
            Name = name;
            ProductType = productType;
            Serial = serial;
            Stack = stack;
            VlanProfile = vlanProfile;
        }
    }
}