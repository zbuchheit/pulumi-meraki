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
    public sealed class SettingsLocalStatusPageAuthentication
    {
        /// <summary>
        /// Enables / disables the authentication on Local Status page(s).
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The password used for Local Status Page(s). Set this to null to clear the password.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// The username used for Local Status Page(s).
        /// </summary>
        public readonly string? Username;

        [OutputConstructor]
        private SettingsLocalStatusPageAuthentication(
            bool? enabled,

            string? password,

            string? username)
        {
            Enabled = enabled;
            Password = password;
            Username = username;
        }
    }
}
