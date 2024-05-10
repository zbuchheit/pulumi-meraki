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
    public sealed class GetWirelessSsidsSplashSettingsItemGuestSponsorshipResult
    {
        /// <summary>
        /// Duration in minutes of sponsored guest authorization.
        /// </summary>
        public readonly int DurationInMinutes;
        /// <summary>
        /// Whether or not guests can specify how much time they are requesting.
        /// </summary>
        public readonly bool GuestCanRequestTimeframe;

        [OutputConstructor]
        private GetWirelessSsidsSplashSettingsItemGuestSponsorshipResult(
            int durationInMinutes,

            bool guestCanRequestTimeframe)
        {
            DurationInMinutes = durationInMinutes;
            GuestCanRequestTimeframe = guestCanRequestTimeframe;
        }
    }
}
