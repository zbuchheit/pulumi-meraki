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
    public sealed class LicensesMoveSeatsParameters
    {
        /// <summary>
        /// The ID of the organization to move the SM seats to
        /// </summary>
        public readonly string? DestOrganizationId;
        /// <summary>
        /// The ID of the SM license to move the seats from
        /// </summary>
        public readonly string? LicenseId;
        /// <summary>
        /// The number of seats to move to the new organization. Must be less than or equal to the total number of seats of the license
        /// </summary>
        public readonly int? SeatCount;

        [OutputConstructor]
        private LicensesMoveSeatsParameters(
            string? destOrganizationId,

            string? licenseId,

            int? seatCount)
        {
            DestOrganizationId = destOrganizationId;
            LicenseId = licenseId;
            SeatCount = seatCount;
        }
    }
}
