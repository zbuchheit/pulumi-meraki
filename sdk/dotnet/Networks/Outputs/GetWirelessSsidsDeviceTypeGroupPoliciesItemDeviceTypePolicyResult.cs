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
    public sealed class GetWirelessSsidsDeviceTypeGroupPoliciesItemDeviceTypePolicyResult
    {
        public readonly string DevicePolicy;
        public readonly string DeviceType;

        [OutputConstructor]
        private GetWirelessSsidsDeviceTypeGroupPoliciesItemDeviceTypePolicyResult(
            string devicePolicy,

            string deviceType)
        {
            DevicePolicy = devicePolicy;
            DeviceType = deviceType;
        }
    }
}
