// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Administered.Outputs
{

    [OutputType]
    public sealed class LicensingSubscriptionSubscriptionsClaimKeyValidateParameters
    {
        /// <summary>
        /// The subscription's claim key
        /// </summary>
        public readonly string? ClaimKey;

        [OutputConstructor]
        private LicensingSubscriptionSubscriptionsClaimKeyValidateParameters(string? claimKey)
        {
            ClaimKey = claimKey;
        }
    }
}