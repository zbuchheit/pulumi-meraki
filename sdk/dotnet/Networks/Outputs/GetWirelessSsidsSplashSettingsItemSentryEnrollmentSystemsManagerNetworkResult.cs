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
    public sealed class GetWirelessSsidsSplashSettingsItemSentryEnrollmentSystemsManagerNetworkResult
    {
        /// <summary>
        /// The network ID of the Systems Manager network.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetWirelessSsidsSplashSettingsItemSentryEnrollmentSystemsManagerNetworkResult(string id)
        {
            Id = id;
        }
    }
}
