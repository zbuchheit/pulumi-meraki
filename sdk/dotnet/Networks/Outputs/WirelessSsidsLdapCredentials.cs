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
    public sealed class WirelessSsidsLdapCredentials
    {
        /// <summary>
        /// The distinguished name of the LDAP user account (example: cn=user,dc=meraki,dc=com).
        /// </summary>
        public readonly string? DistinguishedName;
        /// <summary>
        /// The password of the LDAP user account.
        /// </summary>
        public readonly string? Password;

        [OutputConstructor]
        private WirelessSsidsLdapCredentials(
            string? distinguishedName,

            string? password)
        {
            DistinguishedName = distinguishedName;
            Password = password;
        }
    }
}