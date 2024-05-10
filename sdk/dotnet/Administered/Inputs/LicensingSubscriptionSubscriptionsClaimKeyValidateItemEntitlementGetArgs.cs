// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Administered.Inputs
{

    public sealed class LicensingSubscriptionSubscriptionsClaimKeyValidateItemEntitlementGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Seat distribution
        /// </summary>
        [Input("seats")]
        public Input<Inputs.LicensingSubscriptionSubscriptionsClaimKeyValidateItemEntitlementSeatsGetArgs>? Seats { get; set; }

        /// <summary>
        /// SKU of the required product
        /// </summary>
        [Input("sku")]
        public Input<string>? Sku { get; set; }

        public LicensingSubscriptionSubscriptionsClaimKeyValidateItemEntitlementGetArgs()
        {
        }
        public static new LicensingSubscriptionSubscriptionsClaimKeyValidateItemEntitlementGetArgs Empty => new LicensingSubscriptionSubscriptionsClaimKeyValidateItemEntitlementGetArgs();
    }
}
