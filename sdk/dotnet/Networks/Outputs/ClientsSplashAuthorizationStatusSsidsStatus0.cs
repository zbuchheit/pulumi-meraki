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
    public sealed class ClientsSplashAuthorizationStatusSsidsStatus0
    {
        public readonly string? AuthorizedAt;
        public readonly string? ExpiresAt;
        /// <summary>
        /// New authorization status for the SSID (true, false).
        /// </summary>
        public readonly bool? IsAuthorized;

        [OutputConstructor]
        private ClientsSplashAuthorizationStatusSsidsStatus0(
            string? authorizedAt,

            string? expiresAt,

            bool? isAuthorized)
        {
            AuthorizedAt = authorizedAt;
            ExpiresAt = expiresAt;
            IsAuthorized = isAuthorized;
        }
    }
}
