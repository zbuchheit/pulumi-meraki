// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Administered.Outputs
{

    [OutputType]
    public sealed class GetIdentitiesMeItemAuthenticationApiResult
    {
        /// <summary>
        /// API key
        /// </summary>
        public readonly Outputs.GetIdentitiesMeItemAuthenticationApiKeyResult Key;

        [OutputConstructor]
        private GetIdentitiesMeItemAuthenticationApiResult(Outputs.GetIdentitiesMeItemAuthenticationApiKeyResult key)
        {
            Key = key;
        }
    }
}
