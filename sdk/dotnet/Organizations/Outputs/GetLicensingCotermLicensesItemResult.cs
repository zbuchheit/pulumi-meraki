// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetLicensingCotermLicensesItemResult
    {
        /// <summary>
        /// When the license was claimed into the organization
        /// </summary>
        public readonly string ClaimedAt;
        /// <summary>
        /// The counts of the license by model type
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLicensingCotermLicensesItemCountResult> Counts;
        /// <summary>
        /// The duration (term length) of the license, measured in days
        /// </summary>
        public readonly int Duration;
        /// <summary>
        /// The editions of the license for each relevant product type
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLicensingCotermLicensesItemEditionResult> Editions;
        /// <summary>
        /// Flag to indicate if the license is expired
        /// </summary>
        public readonly bool Expired;
        /// <summary>
        /// Flag to indicated that the license is invalidated
        /// </summary>
        public readonly bool Invalidated;
        /// <summary>
        /// When the license was invalidated. Will be null for active licenses
        /// </summary>
        public readonly string InvalidatedAt;
        /// <summary>
        /// The key of the license
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The operation mode of the license when it was claimed
        /// </summary>
        public readonly string Mode;
        /// <summary>
        /// The ID of the organization that the license is claimed in
        /// </summary>
        public readonly string OrganizationId;
        /// <summary>
        /// When the license's term began (approximately the date when the license was created)
        /// </summary>
        public readonly string StartedAt;

        [OutputConstructor]
        private GetLicensingCotermLicensesItemResult(
            string claimedAt,

            ImmutableArray<Outputs.GetLicensingCotermLicensesItemCountResult> counts,

            int duration,

            ImmutableArray<Outputs.GetLicensingCotermLicensesItemEditionResult> editions,

            bool expired,

            bool invalidated,

            string invalidatedAt,

            string key,

            string mode,

            string organizationId,

            string startedAt)
        {
            ClaimedAt = claimedAt;
            Counts = counts;
            Duration = duration;
            Editions = editions;
            Expired = expired;
            Invalidated = invalidated;
            InvalidatedAt = invalidatedAt;
            Key = key;
            Mode = mode;
            OrganizationId = organizationId;
            StartedAt = startedAt;
        }
    }
}
