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
    public sealed class GetSwitchAccessPoliciesItemRadiusResult
    {
        /// <summary>
        /// Critical auth settings for when authentication is rejected by the RADIUS server
        /// </summary>
        public readonly Outputs.GetSwitchAccessPoliciesItemRadiusCriticalAuthResult CriticalAuth;
        /// <summary>
        /// VLAN that clients will be placed on when RADIUS authentication fails. Will be null if hostMode is Multi-Auth
        /// </summary>
        public readonly int FailedAuthVlanId;
        /// <summary>
        /// Re-authentication period in seconds. Will be null if hostMode is Multi-Auth
        /// </summary>
        public readonly int ReAuthenticationInterval;

        [OutputConstructor]
        private GetSwitchAccessPoliciesItemRadiusResult(
            Outputs.GetSwitchAccessPoliciesItemRadiusCriticalAuthResult criticalAuth,

            int failedAuthVlanId,

            int reAuthenticationInterval)
        {
            CriticalAuth = criticalAuth;
            FailedAuthVlanId = failedAuthVlanId;
            ReAuthenticationInterval = reAuthenticationInterval;
        }
    }
}
