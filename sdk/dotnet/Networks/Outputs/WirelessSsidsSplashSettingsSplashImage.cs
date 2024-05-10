// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class WirelessSsidsSplashSettingsSplashImage
    {
        /// <summary>
        /// The extension of the image file.
        /// </summary>
        public readonly string? Extension;
        /// <summary>
        /// Properties for setting a new image.
        /// </summary>
        public readonly Outputs.WirelessSsidsSplashSettingsSplashImageImage? Image;
        /// <summary>
        /// The MD5 value of the image file.
        /// </summary>
        public readonly string? Md5;

        [OutputConstructor]
        private WirelessSsidsSplashSettingsSplashImage(
            string? extension,

            Outputs.WirelessSsidsSplashSettingsSplashImageImage? image,

            string? md5)
        {
            Extension = extension;
            Image = image;
            Md5 = md5;
        }
    }
}
