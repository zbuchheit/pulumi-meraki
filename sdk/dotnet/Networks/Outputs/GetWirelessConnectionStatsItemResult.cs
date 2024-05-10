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
    public sealed class GetWirelessConnectionStatsItemResult
    {
        /// <summary>
        /// The number of failed association attempts
        /// </summary>
        public readonly int Assoc;
        /// <summary>
        /// The number of failed authentication attempts
        /// </summary>
        public readonly int Auth;
        /// <summary>
        /// The number of failed DHCP attempts
        /// </summary>
        public readonly int Dhcp;
        /// <summary>
        /// The number of failed DNS attempts
        /// </summary>
        public readonly int Dns;
        /// <summary>
        /// The number of successful connection attempts
        /// </summary>
        public readonly int Success;

        [OutputConstructor]
        private GetWirelessConnectionStatsItemResult(
            int assoc,

            int auth,

            int dhcp,

            int dns,

            int success)
        {
            Assoc = assoc;
            Auth = auth;
            Dhcp = dhcp;
            Dns = dns;
            Success = success;
        }
    }
}
