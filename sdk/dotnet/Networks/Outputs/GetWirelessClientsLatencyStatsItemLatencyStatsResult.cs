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
    public sealed class GetWirelessClientsLatencyStatsItemLatencyStatsResult
    {
        public readonly Outputs.GetWirelessClientsLatencyStatsItemLatencyStatsBackgroundTrafficResult BackgroundTraffic;
        public readonly string BestEffortTraffic;
        public readonly string VideoTraffic;
        public readonly string VoiceTraffic;

        [OutputConstructor]
        private GetWirelessClientsLatencyStatsItemLatencyStatsResult(
            Outputs.GetWirelessClientsLatencyStatsItemLatencyStatsBackgroundTrafficResult backgroundTraffic,

            string bestEffortTraffic,

            string videoTraffic,

            string voiceTraffic)
        {
            BackgroundTraffic = backgroundTraffic;
            BestEffortTraffic = bestEffortTraffic;
            VideoTraffic = videoTraffic;
            VoiceTraffic = voiceTraffic;
        }
    }
}