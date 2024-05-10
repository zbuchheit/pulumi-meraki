// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class LicensesRenewSeatsItemGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("resultingLicenses")]
        private InputList<Inputs.LicensesRenewSeatsItemResultingLicenseGetArgs>? _resultingLicenses;

        /// <summary>
        /// Resulting licenses from the move
        /// </summary>
        public InputList<Inputs.LicensesRenewSeatsItemResultingLicenseGetArgs> ResultingLicenses
        {
            get => _resultingLicenses ?? (_resultingLicenses = new InputList<Inputs.LicensesRenewSeatsItemResultingLicenseGetArgs>());
            set => _resultingLicenses = value;
        }

        public LicensesRenewSeatsItemGetArgs()
        {
        }
        public static new LicensesRenewSeatsItemGetArgs Empty => new LicensesRenewSeatsItemGetArgs();
    }
}
