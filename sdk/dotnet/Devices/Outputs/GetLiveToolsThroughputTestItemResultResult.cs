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
    public sealed class GetLiveToolsThroughputTestItemResultResult
    {
        /// <summary>
        /// Shows the speeds (Mbps)
        /// </summary>
        public readonly Outputs.GetLiveToolsThroughputTestItemResultSpeedsResult Speeds;

        [OutputConstructor]
        private GetLiveToolsThroughputTestItemResultResult(Outputs.GetLiveToolsThroughputTestItemResultSpeedsResult speeds)
        {
            Speeds = speeds;
        }
    }
}
