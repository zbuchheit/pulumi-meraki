// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class SamlRolesTag
    {
        /// <summary>
        /// The privilege of the SAML administrator on the tag
        /// </summary>
        public readonly string? Access;
        /// <summary>
        /// The name of the tag
        /// </summary>
        public readonly string? Tag;

        [OutputConstructor]
        private SamlRolesTag(
            string? access,

            string? tag)
        {
            Access = access;
            Tag = tag;
        }
    }
}
