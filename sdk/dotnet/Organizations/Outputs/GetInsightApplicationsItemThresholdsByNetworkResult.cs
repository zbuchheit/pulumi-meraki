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
    public sealed class GetInsightApplicationsItemThresholdsByNetworkResult
    {
        /// <summary>
        /// Number of useful information bits delivered over a network per unit of time
        /// </summary>
        public readonly int Goodput;
        /// <summary>
        /// Network identifier
        /// </summary>
        public readonly string NetworkId;
        /// <summary>
        /// Duration of the response, in milliseconds
        /// </summary>
        public readonly int ResponseDuration;

        [OutputConstructor]
        private GetInsightApplicationsItemThresholdsByNetworkResult(
            int goodput,

            string networkId,

            int responseDuration)
        {
            Goodput = goodput;
            NetworkId = networkId;
            ResponseDuration = responseDuration;
        }
    }
}