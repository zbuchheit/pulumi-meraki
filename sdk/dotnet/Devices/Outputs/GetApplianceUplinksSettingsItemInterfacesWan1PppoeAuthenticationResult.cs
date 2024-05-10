// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class GetApplianceUplinksSettingsItemInterfacesWan1PppoeAuthenticationResult
    {
        /// <summary>
        /// Whether PPPoE authentication is enabled.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Username for PPPoE authentication.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private GetApplianceUplinksSettingsItemInterfacesWan1PppoeAuthenticationResult(
            bool enabled,

            string username)
        {
            Enabled = enabled;
            Username = username;
        }
    }
}
