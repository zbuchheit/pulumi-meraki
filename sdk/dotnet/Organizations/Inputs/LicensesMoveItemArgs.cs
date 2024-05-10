// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class LicensesMoveItemArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the organization to move the licenses to
        /// </summary>
        [Input("destOrganizationId")]
        public Input<string>? DestOrganizationId { get; set; }

        [Input("licenseIds")]
        private InputList<string>? _licenseIds;

        /// <summary>
        /// A list of IDs of licenses to move to the new organization
        /// </summary>
        public InputList<string> LicenseIds
        {
            get => _licenseIds ?? (_licenseIds = new InputList<string>());
            set => _licenseIds = value;
        }

        public LicensesMoveItemArgs()
        {
        }
        public static new LicensesMoveItemArgs Empty => new LicensesMoveItemArgs();
    }
}
