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
    public sealed class GetWirelessLatencyHistoryItemResult
    {
        /// <summary>
        /// Average latency in milliseconds
        /// </summary>
        public readonly int AvgLatencyMs;
        /// <summary>
        /// The end time of the query range
        /// </summary>
        public readonly string EndTs;
        /// <summary>
        /// The start time of the query range
        /// </summary>
        public readonly string StartTs;

        [OutputConstructor]
        private GetWirelessLatencyHistoryItemResult(
            int avgLatencyMs,

            string endTs,

            string startTs)
        {
            AvgLatencyMs = avgLatencyMs;
            EndTs = endTs;
            StartTs = startTs;
        }
    }
}