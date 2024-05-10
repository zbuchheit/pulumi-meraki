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
    public sealed class LicensingSubscriptionSubscriptionsClaimKeyValidateItemEntitlementSeats
    {
        /// <summary>
        /// Number of seats in use
        /// </summary>
        public readonly int? Assigned;
        /// <summary>
        /// Number of seats available for use
        /// </summary>
        public readonly int? Available;
        /// <summary>
        /// Total number of seats provided by this subscription for this sku
        /// </summary>
        public readonly int? Limit;

        [OutputConstructor]
        private LicensingSubscriptionSubscriptionsClaimKeyValidateItemEntitlementSeats(
            int? assigned,

            int? available,

            int? limit)
        {
            Assigned = assigned;
            Available = available;
            Limit = limit;
        }
    }
}
