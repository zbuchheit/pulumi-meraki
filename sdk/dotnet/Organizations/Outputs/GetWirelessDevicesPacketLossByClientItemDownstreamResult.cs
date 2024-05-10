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
    public sealed class GetWirelessDevicesPacketLossByClientItemDownstreamResult
    {
        /// <summary>
        /// Percentage of lost packets.
        /// </summary>
        public readonly double LossPercentage;
        /// <summary>
        /// Total packets sent by an AP that did not reach the client.
        /// </summary>
        public readonly int Lost;
        /// <summary>
        /// Total packets received by a client.
        /// </summary>
        public readonly int Total;

        [OutputConstructor]
        private GetWirelessDevicesPacketLossByClientItemDownstreamResult(
            double lossPercentage,

            int lost,

            int total)
        {
            LossPercentage = lossPercentage;
            Lost = lost;
            Total = total;
        }
    }
}
