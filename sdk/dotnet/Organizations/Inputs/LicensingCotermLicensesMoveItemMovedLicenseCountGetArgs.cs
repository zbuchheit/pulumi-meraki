// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class LicensingCotermLicensesMoveItemMovedLicenseCountGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of counts the license contains of this model
        /// </summary>
        [Input("count")]
        public Input<int>? Count { get; set; }

        /// <summary>
        /// The license model type
        /// </summary>
        [Input("model")]
        public Input<string>? Model { get; set; }

        public LicensingCotermLicensesMoveItemMovedLicenseCountGetArgs()
        {
        }
        public static new LicensingCotermLicensesMoveItemMovedLicenseCountGetArgs Empty => new LicensingCotermLicensesMoveItemMovedLicenseCountGetArgs();
    }
}
