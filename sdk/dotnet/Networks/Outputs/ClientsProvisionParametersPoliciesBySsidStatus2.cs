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
    public sealed class ClientsProvisionParametersPoliciesBySsidStatus2
    {
        /// <summary>
        /// The policy to apply to the specified client. Can be 'Allowed', 'Blocked', 'Normal' or 'Group policy'. Required.
        /// </summary>
        public readonly string? DevicePolicy;
        /// <summary>
        /// The ID of the desired group policy to apply to the client. Required if 'devicePolicy' is set to "Group policy". Otherwise this is ignored.
        /// </summary>
        public readonly string? GroupPolicyId;

        [OutputConstructor]
        private ClientsProvisionParametersPoliciesBySsidStatus2(
            string? devicePolicy,

            string? groupPolicyId)
        {
            DevicePolicy = devicePolicy;
            GroupPolicyId = groupPolicyId;
        }
    }
}
