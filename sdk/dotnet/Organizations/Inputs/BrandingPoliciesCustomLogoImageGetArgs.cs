// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class BrandingPoliciesCustomLogoImageGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The file contents (a base 64 encoded string) of your new logo.
        /// </summary>
        [Input("contents")]
        public Input<string>? Contents { get; set; }

        /// <summary>
        /// The format of the encoded contents.  Supported formats are 'png', 'gif', and jpg'.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// Preview of the image
        /// </summary>
        [Input("preview")]
        public Input<Inputs.BrandingPoliciesCustomLogoImagePreviewGetArgs>? Preview { get; set; }

        public BrandingPoliciesCustomLogoImageGetArgs()
        {
        }
        public static new BrandingPoliciesCustomLogoImageGetArgs Empty => new BrandingPoliciesCustomLogoImageGetArgs();
    }
}
