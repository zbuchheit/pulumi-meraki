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
    public sealed class GetClientsBandwidthUsageHistoryItemResult
    {
        /// <summary>
        /// Downloaded data, in mbps.
        /// </summary>
        public readonly int Downstream;
        /// <summary>
        /// Total bandwidth usage, in mbps.
        /// </summary>
        public readonly int Total;
        /// <summary>
        /// Timestamp for the bandwidth usage snapshot.
        /// </summary>
        public readonly string Ts;
        /// <summary>
        /// Uploaded data, in mbps.
        /// </summary>
        public readonly int Upstream;

        [OutputConstructor]
        private GetClientsBandwidthUsageHistoryItemResult(
            int downstream,

            int total,

            string ts,

            int upstream)
        {
            Downstream = downstream;
            Total = total;
            Ts = ts;
            Upstream = upstream;
        }
    }
}
