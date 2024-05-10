// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class LicensesRenewSeatsParametersGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the SM license to renew. This license must already be assigned to an SM network
        /// </summary>
        [Input("licenseIdToRenew")]
        public Input<string>? LicenseIdToRenew { get; set; }

        /// <summary>
        /// The SM license to use to renew the seats on 'licenseIdToRenew'. This license must have at least as many seats available as there are seats on 'licenseIdToRenew'
        /// </summary>
        [Input("unusedLicenseId")]
        public Input<string>? UnusedLicenseId { get; set; }

        public LicensesRenewSeatsParametersGetArgs()
        {
        }
        public static new LicensesRenewSeatsParametersGetArgs Empty => new LicensesRenewSeatsParametersGetArgs();
    }
}
