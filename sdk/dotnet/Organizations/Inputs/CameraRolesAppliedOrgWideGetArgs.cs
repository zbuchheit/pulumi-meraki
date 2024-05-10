// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class CameraRolesAppliedOrgWideGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("permissionLevel")]
        public Input<string>? PermissionLevel { get; set; }

        [Input("permissionScope")]
        public Input<string>? PermissionScope { get; set; }

        /// <summary>
        /// Permission scope id
        /// </summary>
        [Input("permissionScopeId")]
        public Input<string>? PermissionScopeId { get; set; }

        [Input("tag")]
        public Input<string>? Tag { get; set; }

        public CameraRolesAppliedOrgWideGetArgs()
        {
        }
        public static new CameraRolesAppliedOrgWideGetArgs Empty => new CameraRolesAppliedOrgWideGetArgs();
    }
}
