// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class LicensingCotermLicensesMoveParametersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Destination data for the license move
        /// </summary>
        [Input("destination")]
        public Input<Inputs.LicensingCotermLicensesMoveParametersDestinationArgs>? Destination { get; set; }

        [Input("licenses")]
        private InputList<Inputs.LicensingCotermLicensesMoveParametersLicenseArgs>? _licenses;

        /// <summary>
        /// The list of licenses to move
        /// </summary>
        public InputList<Inputs.LicensingCotermLicensesMoveParametersLicenseArgs> Licenses
        {
            get => _licenses ?? (_licenses = new InputList<Inputs.LicensingCotermLicensesMoveParametersLicenseArgs>());
            set => _licenses = value;
        }

        public LicensingCotermLicensesMoveParametersArgs()
        {
        }
        public static new LicensingCotermLicensesMoveParametersArgs Empty => new LicensingCotermLicensesMoveParametersArgs();
    }
}
