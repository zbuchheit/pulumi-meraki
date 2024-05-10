// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class CameraRolesAppliedOnDeviceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Device id.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Network id scope
        /// </summary>
        [Input("inNetworksWithId")]
        public Input<string>? InNetworksWithId { get; set; }

        /// <summary>
        /// Network tag scope
        /// </summary>
        [Input("inNetworksWithTag")]
        public Input<string>? InNetworksWithTag { get; set; }

        [Input("permissionLevel")]
        public Input<string>? PermissionLevel { get; set; }

        [Input("permissionScope")]
        public Input<string>? PermissionScope { get; set; }

        /// <summary>
        /// Permission scope id
        /// </summary>
        [Input("permissionScopeId")]
        public Input<string>? PermissionScopeId { get; set; }

        /// <summary>
        /// Device tag.
        /// </summary>
        [Input("tag")]
        public Input<string>? Tag { get; set; }

        public CameraRolesAppliedOnDeviceGetArgs()
        {
        }
        public static new CameraRolesAppliedOnDeviceGetArgs Empty => new CameraRolesAppliedOnDeviceGetArgs();
    }
}
