// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Administered.Inputs
{

    public sealed class LicensingSubscriptionSubscriptionsClaimKeyValidateItemCountsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of networks bound to this subscription
        /// </summary>
        [Input("networks")]
        public Input<int>? Networks { get; set; }

        /// <summary>
        /// Seat distribution
        /// </summary>
        [Input("seats")]
        public Input<Inputs.LicensingSubscriptionSubscriptionsClaimKeyValidateItemCountsSeatsArgs>? Seats { get; set; }

        public LicensingSubscriptionSubscriptionsClaimKeyValidateItemCountsArgs()
        {
        }
        public static new LicensingSubscriptionSubscriptionsClaimKeyValidateItemCountsArgs Empty => new LicensingSubscriptionSubscriptionsClaimKeyValidateItemCountsArgs();
    }
}
