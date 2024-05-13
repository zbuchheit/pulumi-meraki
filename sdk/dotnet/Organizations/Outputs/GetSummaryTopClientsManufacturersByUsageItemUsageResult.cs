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
    public sealed class GetSummaryTopClientsManufacturersByUsageItemUsageResult
    {
        /// <summary>
        /// Downstream data usage by client
        /// </summary>
        public readonly double Downstream;
        /// <summary>
        /// Total data usage by client
        /// </summary>
        public readonly double Total;
        /// <summary>
        /// Upstream data usage by client
        /// </summary>
        public readonly double Upstream;

        [OutputConstructor]
        private GetSummaryTopClientsManufacturersByUsageItemUsageResult(
            double downstream,

            double total,

            double upstream)
        {
            Downstream = downstream;
            Total = total;
            Upstream = upstream;
        }
    }
}