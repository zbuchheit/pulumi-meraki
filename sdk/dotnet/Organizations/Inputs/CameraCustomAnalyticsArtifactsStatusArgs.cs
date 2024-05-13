// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class CameraCustomAnalyticsArtifactsStatusArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Status message
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        /// <summary>
        /// Status type
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public CameraCustomAnalyticsArtifactsStatusArgs()
        {
        }
        public static new CameraCustomAnalyticsArtifactsStatusArgs Empty => new CameraCustomAnalyticsArtifactsStatusArgs();
    }
}