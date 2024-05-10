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
    public sealed class GetSmVppAccountsItemParsedTokenResult
    {
        /// <summary>
        /// The expiration time of the token
        /// </summary>
        public readonly string ExpiresAt;
        /// <summary>
        /// The hashed token
        /// </summary>
        public readonly string HashedToken;
        /// <summary>
        /// The organization name
        /// </summary>
        public readonly string OrgName;

        [OutputConstructor]
        private GetSmVppAccountsItemParsedTokenResult(
            string expiresAt,

            string hashedToken,

            string orgName)
        {
            ExpiresAt = expiresAt;
            HashedToken = hashedToken;
            OrgName = orgName;
        }
    }
}
