// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class LicensesRenewSeatsItemArgs : global::Pulumi.ResourceArgs
    {
        [Input("resultingLicenses")]
        private InputList<Inputs.LicensesRenewSeatsItemResultingLicenseArgs>? _resultingLicenses;

        /// <summary>
        /// Resulting licenses from the move
        /// </summary>
        public InputList<Inputs.LicensesRenewSeatsItemResultingLicenseArgs> ResultingLicenses
        {
            get => _resultingLicenses ?? (_resultingLicenses = new InputList<Inputs.LicensesRenewSeatsItemResultingLicenseArgs>());
            set => _resultingLicenses = value;
        }

        public LicensesRenewSeatsItemArgs()
        {
        }
        public static new LicensesRenewSeatsItemArgs Empty => new LicensesRenewSeatsItemArgs();
    }
}
