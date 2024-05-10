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
    public sealed class GetWirelessChannelUtilizationHistoryItemResult
    {
        /// <summary>
        /// The end time of the query range
        /// </summary>
        public readonly string EndTs;
        /// <summary>
        /// The start time of the query range
        /// </summary>
        public readonly string StartTs;
        /// <summary>
        /// Average wifi utilization
        /// </summary>
        public readonly double Utilization80211;
        /// <summary>
        /// Average signal interference
        /// </summary>
        public readonly double UtilizationNon80211;
        /// <summary>
        /// Total channel utilization
        /// </summary>
        public readonly double UtilizationTotal;

        [OutputConstructor]
        private GetWirelessChannelUtilizationHistoryItemResult(
            string endTs,

            string startTs,

            double utilization80211,

            double utilizationNon80211,

            double utilizationTotal)
        {
            EndTs = endTs;
            StartTs = startTs;
            Utilization80211 = utilization80211;
            UtilizationNon80211 = utilizationNon80211;
            UtilizationTotal = utilizationTotal;
        }
    }
}
