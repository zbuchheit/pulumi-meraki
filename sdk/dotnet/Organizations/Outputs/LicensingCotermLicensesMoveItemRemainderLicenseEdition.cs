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
    public sealed class LicensingCotermLicensesMoveItemRemainderLicenseEdition
    {
        /// <summary>
        /// The name of the license edition
        /// </summary>
        public readonly string? Edition;
        /// <summary>
        /// The product type of the license edition
        /// </summary>
        public readonly string? ProductType;

        [OutputConstructor]
        private LicensingCotermLicensesMoveItemRemainderLicenseEdition(
            string? edition,

            string? productType)
        {
            Edition = edition;
            ProductType = productType;
        }
    }
}
