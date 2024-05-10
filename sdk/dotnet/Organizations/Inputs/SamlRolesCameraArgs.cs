// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class SamlRolesCameraArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Camera access ability
        /// </summary>
        [Input("access")]
        public Input<string>? Access { get; set; }

        /// <summary>
        /// Whether or not SAML administrator has org-wide access
        /// </summary>
        [Input("orgWide")]
        public Input<bool>? OrgWide { get; set; }

        public SamlRolesCameraArgs()
        {
        }
        public static new SamlRolesCameraArgs Empty => new SamlRolesCameraArgs();
    }
}
