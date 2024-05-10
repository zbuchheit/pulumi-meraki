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
    public sealed class CameraQualityRetentionProfilesVideoSettingsMV93
    {
        /// <summary>
        /// Quality of the camera. Can be one of 'Standard', 'Enhanced' or 'High'.
        /// </summary>
        public readonly string? Quality;
        /// <summary>
        /// Resolution of the camera. Can be one of '1080x1080' or '2112x2112'.
        /// </summary>
        public readonly string? Resolution;

        [OutputConstructor]
        private CameraQualityRetentionProfilesVideoSettingsMV93(
            string? quality,

            string? resolution)
        {
            Quality = quality;
            Resolution = resolution;
        }
    }
}
