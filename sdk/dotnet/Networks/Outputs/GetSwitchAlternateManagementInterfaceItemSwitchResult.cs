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
    public sealed class GetSwitchAlternateManagementInterfaceItemSwitchResult
    {
        /// <summary>
        /// Switch alternative management IP. To remove a prior IP setting, provide an empty string
        /// </summary>
        public readonly string AlternateManagementIp;
        /// <summary>
        /// Switch gateway must be in IP format. Only and must be specified for Polaris switches
        /// </summary>
        public readonly string Gateway;
        /// <summary>
        /// Switch serial number
        /// </summary>
        public readonly string Serial;
        /// <summary>
        /// Switch subnet mask must be in IP format. Only and must be specified for Polaris switches
        /// </summary>
        public readonly string SubnetMask;

        [OutputConstructor]
        private GetSwitchAlternateManagementInterfaceItemSwitchResult(
            string alternateManagementIp,

            string gateway,

            string serial,

            string subnetMask)
        {
            AlternateManagementIp = alternateManagementIp;
            Gateway = gateway;
            Serial = serial;
            SubnetMask = subnetMask;
        }
    }
}
